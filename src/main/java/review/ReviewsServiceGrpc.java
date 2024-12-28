package review;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.46.0)",
    comments = "Source: review.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ReviewsServiceGrpc {

  private ReviewsServiceGrpc() {}

  public static final String SERVICE_NAME = "review.ReviewsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<review.Review.CreateReviewRequest,
      review.Review.CreateReviewResponse> getCreateReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateReview",
      requestType = review.Review.CreateReviewRequest.class,
      responseType = review.Review.CreateReviewResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<review.Review.CreateReviewRequest,
      review.Review.CreateReviewResponse> getCreateReviewMethod() {
    io.grpc.MethodDescriptor<review.Review.CreateReviewRequest, review.Review.CreateReviewResponse> getCreateReviewMethod;
    if ((getCreateReviewMethod = ReviewsServiceGrpc.getCreateReviewMethod) == null) {
      synchronized (ReviewsServiceGrpc.class) {
        if ((getCreateReviewMethod = ReviewsServiceGrpc.getCreateReviewMethod) == null) {
          ReviewsServiceGrpc.getCreateReviewMethod = getCreateReviewMethod =
              io.grpc.MethodDescriptor.<review.Review.CreateReviewRequest, review.Review.CreateReviewResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  review.Review.CreateReviewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  review.Review.CreateReviewResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReviewsServiceMethodDescriptorSupplier("CreateReview"))
              .build();
        }
      }
    }
    return getCreateReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<review.Review.ReadReviewRequest,
      review.Review.CreateReviewResponse> getReadReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadReview",
      requestType = review.Review.ReadReviewRequest.class,
      responseType = review.Review.CreateReviewResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<review.Review.ReadReviewRequest,
      review.Review.CreateReviewResponse> getReadReviewMethod() {
    io.grpc.MethodDescriptor<review.Review.ReadReviewRequest, review.Review.CreateReviewResponse> getReadReviewMethod;
    if ((getReadReviewMethod = ReviewsServiceGrpc.getReadReviewMethod) == null) {
      synchronized (ReviewsServiceGrpc.class) {
        if ((getReadReviewMethod = ReviewsServiceGrpc.getReadReviewMethod) == null) {
          ReviewsServiceGrpc.getReadReviewMethod = getReadReviewMethod =
              io.grpc.MethodDescriptor.<review.Review.ReadReviewRequest, review.Review.CreateReviewResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  review.Review.ReadReviewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  review.Review.CreateReviewResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReviewsServiceMethodDescriptorSupplier("ReadReview"))
              .build();
        }
      }
    }
    return getReadReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<review.Review.DeleteReviewRequest,
      review.Review.EmptyResponse> getDeleteReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteReview",
      requestType = review.Review.DeleteReviewRequest.class,
      responseType = review.Review.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<review.Review.DeleteReviewRequest,
      review.Review.EmptyResponse> getDeleteReviewMethod() {
    io.grpc.MethodDescriptor<review.Review.DeleteReviewRequest, review.Review.EmptyResponse> getDeleteReviewMethod;
    if ((getDeleteReviewMethod = ReviewsServiceGrpc.getDeleteReviewMethod) == null) {
      synchronized (ReviewsServiceGrpc.class) {
        if ((getDeleteReviewMethod = ReviewsServiceGrpc.getDeleteReviewMethod) == null) {
          ReviewsServiceGrpc.getDeleteReviewMethod = getDeleteReviewMethod =
              io.grpc.MethodDescriptor.<review.Review.DeleteReviewRequest, review.Review.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  review.Review.DeleteReviewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  review.Review.EmptyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReviewsServiceMethodDescriptorSupplier("DeleteReview"))
              .build();
        }
      }
    }
    return getDeleteReviewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReviewsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReviewsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReviewsServiceStub>() {
        @java.lang.Override
        public ReviewsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReviewsServiceStub(channel, callOptions);
        }
      };
    return ReviewsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReviewsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReviewsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReviewsServiceBlockingStub>() {
        @java.lang.Override
        public ReviewsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReviewsServiceBlockingStub(channel, callOptions);
        }
      };
    return ReviewsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReviewsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReviewsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReviewsServiceFutureStub>() {
        @java.lang.Override
        public ReviewsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReviewsServiceFutureStub(channel, callOptions);
        }
      };
    return ReviewsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ReviewsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createReview(review.Review.CreateReviewRequest request,
        io.grpc.stub.StreamObserver<review.Review.CreateReviewResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateReviewMethod(), responseObserver);
    }

    /**
     */
    public void readReview(review.Review.ReadReviewRequest request,
        io.grpc.stub.StreamObserver<review.Review.CreateReviewResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadReviewMethod(), responseObserver);
    }

    /**
     */
    public void deleteReview(review.Review.DeleteReviewRequest request,
        io.grpc.stub.StreamObserver<review.Review.EmptyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteReviewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateReviewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                review.Review.CreateReviewRequest,
                review.Review.CreateReviewResponse>(
                  this, METHODID_CREATE_REVIEW)))
          .addMethod(
            getReadReviewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                review.Review.ReadReviewRequest,
                review.Review.CreateReviewResponse>(
                  this, METHODID_READ_REVIEW)))
          .addMethod(
            getDeleteReviewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                review.Review.DeleteReviewRequest,
                review.Review.EmptyResponse>(
                  this, METHODID_DELETE_REVIEW)))
          .build();
    }
  }

  /**
   */
  public static final class ReviewsServiceStub extends io.grpc.stub.AbstractAsyncStub<ReviewsServiceStub> {
    private ReviewsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReviewsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReviewsServiceStub(channel, callOptions);
    }

    /**
     */
    public void createReview(review.Review.CreateReviewRequest request,
        io.grpc.stub.StreamObserver<review.Review.CreateReviewResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readReview(review.Review.ReadReviewRequest request,
        io.grpc.stub.StreamObserver<review.Review.CreateReviewResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteReview(review.Review.DeleteReviewRequest request,
        io.grpc.stub.StreamObserver<review.Review.EmptyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteReviewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ReviewsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ReviewsServiceBlockingStub> {
    private ReviewsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReviewsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReviewsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public review.Review.CreateReviewResponse createReview(review.Review.CreateReviewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateReviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public review.Review.CreateReviewResponse readReview(review.Review.ReadReviewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadReviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public review.Review.EmptyResponse deleteReview(review.Review.DeleteReviewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteReviewMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ReviewsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ReviewsServiceFutureStub> {
    private ReviewsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReviewsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReviewsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<review.Review.CreateReviewResponse> createReview(
        review.Review.CreateReviewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateReviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<review.Review.CreateReviewResponse> readReview(
        review.Review.ReadReviewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadReviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<review.Review.EmptyResponse> deleteReview(
        review.Review.DeleteReviewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteReviewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_REVIEW = 0;
  private static final int METHODID_READ_REVIEW = 1;
  private static final int METHODID_DELETE_REVIEW = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReviewsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReviewsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_REVIEW:
          serviceImpl.createReview((review.Review.CreateReviewRequest) request,
              (io.grpc.stub.StreamObserver<review.Review.CreateReviewResponse>) responseObserver);
          break;
        case METHODID_READ_REVIEW:
          serviceImpl.readReview((review.Review.ReadReviewRequest) request,
              (io.grpc.stub.StreamObserver<review.Review.CreateReviewResponse>) responseObserver);
          break;
        case METHODID_DELETE_REVIEW:
          serviceImpl.deleteReview((review.Review.DeleteReviewRequest) request,
              (io.grpc.stub.StreamObserver<review.Review.EmptyResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ReviewsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReviewsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return review.Review.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReviewsService");
    }
  }

  private static final class ReviewsServiceFileDescriptorSupplier
      extends ReviewsServiceBaseDescriptorSupplier {
    ReviewsServiceFileDescriptorSupplier() {}
  }

  private static final class ReviewsServiceMethodDescriptorSupplier
      extends ReviewsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReviewsServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ReviewsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReviewsServiceFileDescriptorSupplier())
              .addMethod(getCreateReviewMethod())
              .addMethod(getReadReviewMethod())
              .addMethod(getDeleteReviewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
