package review;

import io.grpc.stub.StreamObserver;
import review.Review.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import auth.Auth.GetUserIdRequest;
import auth.Auth.GetUserIdResponse;
import auth.AuthServiceGrpc;

public class ReviewService extends ReviewsServiceGrpc.ReviewsServiceImplBase {

    @Override
    public void createReview(CreateReviewRequest request, StreamObserver<CreateReviewResponse> responseObserver) {
        String review = request.getNewReview();
        String token = request.getToken();


        String target = "localhost:8080";
        ManagedChannel channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();

        AuthServiceGrpc.AuthServiceBlockingStub stub = AuthServiceGrpc.newBlockingStub(channel);

        GetUserIdRequest requestUserId = GetUserIdRequest.newBuilder()
                .setToken(token)
                .build();

        int userId = 0;

        try {

            GetUserIdResponse response = stub.getUserId(requestUserId);
            System.out.println("User Id: " + response.getUser());
            userId = (int) response.getUser();
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
        } finally {
            channel.shutdown();
        }

        int subjectId = 456;

        CreateReviewResponse response = CreateReviewResponse.newBuilder()
                .setUserId(userId)
                .setSubjectId(subjectId)
                .setText(review)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();


    }

    @Override
    public void readReview(ReadReviewRequest request, StreamObserver<CreateReviewResponse> responseObserver) {
        String review = request.getReadReview();

        int userId = 789;
        int subjectId = 101;


        CreateReviewResponse response = CreateReviewResponse.newBuilder()
                .setUserId(userId)
                .setSubjectId(subjectId)
                .setText("Текст")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();


    }

    @Override
    public void deleteReview(DeleteReviewRequest request, StreamObserver<EmptyResponse> responseObserver) {
        String review = request.getDeleteReview();
        String token = request.getToken();

        responseObserver.onNext(EmptyResponse.newBuilder().build());
        responseObserver.onCompleted();

    }

}
