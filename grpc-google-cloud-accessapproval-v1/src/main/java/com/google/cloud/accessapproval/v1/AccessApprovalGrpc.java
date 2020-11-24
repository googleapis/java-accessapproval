/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.accessapproval.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/accessapproval/v1/accessapproval.proto")
public final class AccessApprovalGrpc {

  private AccessApprovalGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.accessapproval.v1.AccessApproval";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.accessapproval.v1.ListApprovalRequestsMessage,
          com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse>
      getListApprovalRequestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListApprovalRequests",
      requestType = com.google.cloud.accessapproval.v1.ListApprovalRequestsMessage.class,
      responseType = com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.accessapproval.v1.ListApprovalRequestsMessage,
          com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse>
      getListApprovalRequestsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.accessapproval.v1.ListApprovalRequestsMessage,
            com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse>
        getListApprovalRequestsMethod;
    if ((getListApprovalRequestsMethod = AccessApprovalGrpc.getListApprovalRequestsMethod)
        == null) {
      synchronized (AccessApprovalGrpc.class) {
        if ((getListApprovalRequestsMethod = AccessApprovalGrpc.getListApprovalRequestsMethod)
            == null) {
          AccessApprovalGrpc.getListApprovalRequestsMethod =
              getListApprovalRequestsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.accessapproval.v1.ListApprovalRequestsMessage,
                          com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ListApprovalRequests"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.accessapproval.v1.ListApprovalRequestsMessage
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new AccessApprovalMethodDescriptorSupplier("ListApprovalRequests"))
                      .build();
        }
      }
    }
    return getListApprovalRequestsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.accessapproval.v1.GetApprovalRequestMessage,
          com.google.cloud.accessapproval.v1.ApprovalRequest>
      getGetApprovalRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetApprovalRequest",
      requestType = com.google.cloud.accessapproval.v1.GetApprovalRequestMessage.class,
      responseType = com.google.cloud.accessapproval.v1.ApprovalRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.accessapproval.v1.GetApprovalRequestMessage,
          com.google.cloud.accessapproval.v1.ApprovalRequest>
      getGetApprovalRequestMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.accessapproval.v1.GetApprovalRequestMessage,
            com.google.cloud.accessapproval.v1.ApprovalRequest>
        getGetApprovalRequestMethod;
    if ((getGetApprovalRequestMethod = AccessApprovalGrpc.getGetApprovalRequestMethod) == null) {
      synchronized (AccessApprovalGrpc.class) {
        if ((getGetApprovalRequestMethod = AccessApprovalGrpc.getGetApprovalRequestMethod)
            == null) {
          AccessApprovalGrpc.getGetApprovalRequestMethod =
              getGetApprovalRequestMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.accessapproval.v1.GetApprovalRequestMessage,
                          com.google.cloud.accessapproval.v1.ApprovalRequest>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetApprovalRequest"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.accessapproval.v1.GetApprovalRequestMessage
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.accessapproval.v1.ApprovalRequest
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new AccessApprovalMethodDescriptorSupplier("GetApprovalRequest"))
                      .build();
        }
      }
    }
    return getGetApprovalRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.accessapproval.v1.ApproveApprovalRequestMessage,
          com.google.cloud.accessapproval.v1.ApprovalRequest>
      getApproveApprovalRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveApprovalRequest",
      requestType = com.google.cloud.accessapproval.v1.ApproveApprovalRequestMessage.class,
      responseType = com.google.cloud.accessapproval.v1.ApprovalRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.accessapproval.v1.ApproveApprovalRequestMessage,
          com.google.cloud.accessapproval.v1.ApprovalRequest>
      getApproveApprovalRequestMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.accessapproval.v1.ApproveApprovalRequestMessage,
            com.google.cloud.accessapproval.v1.ApprovalRequest>
        getApproveApprovalRequestMethod;
    if ((getApproveApprovalRequestMethod = AccessApprovalGrpc.getApproveApprovalRequestMethod)
        == null) {
      synchronized (AccessApprovalGrpc.class) {
        if ((getApproveApprovalRequestMethod = AccessApprovalGrpc.getApproveApprovalRequestMethod)
            == null) {
          AccessApprovalGrpc.getApproveApprovalRequestMethod =
              getApproveApprovalRequestMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.accessapproval.v1.ApproveApprovalRequestMessage,
                          com.google.cloud.accessapproval.v1.ApprovalRequest>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ApproveApprovalRequest"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.accessapproval.v1.ApproveApprovalRequestMessage
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.accessapproval.v1.ApprovalRequest
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new AccessApprovalMethodDescriptorSupplier("ApproveApprovalRequest"))
                      .build();
        }
      }
    }
    return getApproveApprovalRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.accessapproval.v1.DismissApprovalRequestMessage,
          com.google.cloud.accessapproval.v1.ApprovalRequest>
      getDismissApprovalRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DismissApprovalRequest",
      requestType = com.google.cloud.accessapproval.v1.DismissApprovalRequestMessage.class,
      responseType = com.google.cloud.accessapproval.v1.ApprovalRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.accessapproval.v1.DismissApprovalRequestMessage,
          com.google.cloud.accessapproval.v1.ApprovalRequest>
      getDismissApprovalRequestMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.accessapproval.v1.DismissApprovalRequestMessage,
            com.google.cloud.accessapproval.v1.ApprovalRequest>
        getDismissApprovalRequestMethod;
    if ((getDismissApprovalRequestMethod = AccessApprovalGrpc.getDismissApprovalRequestMethod)
        == null) {
      synchronized (AccessApprovalGrpc.class) {
        if ((getDismissApprovalRequestMethod = AccessApprovalGrpc.getDismissApprovalRequestMethod)
            == null) {
          AccessApprovalGrpc.getDismissApprovalRequestMethod =
              getDismissApprovalRequestMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.accessapproval.v1.DismissApprovalRequestMessage,
                          com.google.cloud.accessapproval.v1.ApprovalRequest>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "DismissApprovalRequest"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.accessapproval.v1.DismissApprovalRequestMessage
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.accessapproval.v1.ApprovalRequest
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new AccessApprovalMethodDescriptorSupplier("DismissApprovalRequest"))
                      .build();
        }
      }
    }
    return getDismissApprovalRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.accessapproval.v1.GetAccessApprovalSettingsMessage,
          com.google.cloud.accessapproval.v1.AccessApprovalSettings>
      getGetAccessApprovalSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccessApprovalSettings",
      requestType = com.google.cloud.accessapproval.v1.GetAccessApprovalSettingsMessage.class,
      responseType = com.google.cloud.accessapproval.v1.AccessApprovalSettings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.accessapproval.v1.GetAccessApprovalSettingsMessage,
          com.google.cloud.accessapproval.v1.AccessApprovalSettings>
      getGetAccessApprovalSettingsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.accessapproval.v1.GetAccessApprovalSettingsMessage,
            com.google.cloud.accessapproval.v1.AccessApprovalSettings>
        getGetAccessApprovalSettingsMethod;
    if ((getGetAccessApprovalSettingsMethod = AccessApprovalGrpc.getGetAccessApprovalSettingsMethod)
        == null) {
      synchronized (AccessApprovalGrpc.class) {
        if ((getGetAccessApprovalSettingsMethod =
                AccessApprovalGrpc.getGetAccessApprovalSettingsMethod)
            == null) {
          AccessApprovalGrpc.getGetAccessApprovalSettingsMethod =
              getGetAccessApprovalSettingsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.accessapproval.v1.GetAccessApprovalSettingsMessage,
                          com.google.cloud.accessapproval.v1.AccessApprovalSettings>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "GetAccessApprovalSettings"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.accessapproval.v1.GetAccessApprovalSettingsMessage
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.accessapproval.v1.AccessApprovalSettings
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new AccessApprovalMethodDescriptorSupplier("GetAccessApprovalSettings"))
                      .build();
        }
      }
    }
    return getGetAccessApprovalSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage,
          com.google.cloud.accessapproval.v1.AccessApprovalSettings>
      getUpdateAccessApprovalSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccessApprovalSettings",
      requestType = com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage.class,
      responseType = com.google.cloud.accessapproval.v1.AccessApprovalSettings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage,
          com.google.cloud.accessapproval.v1.AccessApprovalSettings>
      getUpdateAccessApprovalSettingsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage,
            com.google.cloud.accessapproval.v1.AccessApprovalSettings>
        getUpdateAccessApprovalSettingsMethod;
    if ((getUpdateAccessApprovalSettingsMethod =
            AccessApprovalGrpc.getUpdateAccessApprovalSettingsMethod)
        == null) {
      synchronized (AccessApprovalGrpc.class) {
        if ((getUpdateAccessApprovalSettingsMethod =
                AccessApprovalGrpc.getUpdateAccessApprovalSettingsMethod)
            == null) {
          AccessApprovalGrpc.getUpdateAccessApprovalSettingsMethod =
              getUpdateAccessApprovalSettingsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage,
                          com.google.cloud.accessapproval.v1.AccessApprovalSettings>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "UpdateAccessApprovalSettings"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.accessapproval.v1.AccessApprovalSettings
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new AccessApprovalMethodDescriptorSupplier(
                              "UpdateAccessApprovalSettings"))
                      .build();
        }
      }
    }
    return getUpdateAccessApprovalSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.accessapproval.v1.DeleteAccessApprovalSettingsMessage,
          com.google.protobuf.Empty>
      getDeleteAccessApprovalSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAccessApprovalSettings",
      requestType = com.google.cloud.accessapproval.v1.DeleteAccessApprovalSettingsMessage.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.accessapproval.v1.DeleteAccessApprovalSettingsMessage,
          com.google.protobuf.Empty>
      getDeleteAccessApprovalSettingsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.accessapproval.v1.DeleteAccessApprovalSettingsMessage,
            com.google.protobuf.Empty>
        getDeleteAccessApprovalSettingsMethod;
    if ((getDeleteAccessApprovalSettingsMethod =
            AccessApprovalGrpc.getDeleteAccessApprovalSettingsMethod)
        == null) {
      synchronized (AccessApprovalGrpc.class) {
        if ((getDeleteAccessApprovalSettingsMethod =
                AccessApprovalGrpc.getDeleteAccessApprovalSettingsMethod)
            == null) {
          AccessApprovalGrpc.getDeleteAccessApprovalSettingsMethod =
              getDeleteAccessApprovalSettingsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.accessapproval.v1.DeleteAccessApprovalSettingsMessage,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "DeleteAccessApprovalSettings"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.accessapproval.v1.DeleteAccessApprovalSettingsMessage
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new AccessApprovalMethodDescriptorSupplier(
                              "DeleteAccessApprovalSettings"))
                      .build();
        }
      }
    }
    return getDeleteAccessApprovalSettingsMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static AccessApprovalStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessApprovalStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<AccessApprovalStub>() {
          @java.lang.Override
          public AccessApprovalStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new AccessApprovalStub(channel, callOptions);
          }
        };
    return AccessApprovalStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccessApprovalBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessApprovalBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<AccessApprovalBlockingStub>() {
          @java.lang.Override
          public AccessApprovalBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new AccessApprovalBlockingStub(channel, callOptions);
          }
        };
    return AccessApprovalBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static AccessApprovalFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccessApprovalFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<AccessApprovalFutureStub>() {
          @java.lang.Override
          public AccessApprovalFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new AccessApprovalFutureStub(channel, callOptions);
          }
        };
    return AccessApprovalFutureStub.newStub(factory, channel);
  }

  /** */
  public abstract static class AccessApprovalImplBase implements io.grpc.BindableService {

    /** */
    public void listApprovalRequests(
        com.google.cloud.accessapproval.v1.ListApprovalRequestsMessage request,
        io.grpc.stub.StreamObserver<com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListApprovalRequestsMethod(), responseObserver);
    }

    /** */
    public void getApprovalRequest(
        com.google.cloud.accessapproval.v1.GetApprovalRequestMessage request,
        io.grpc.stub.StreamObserver<com.google.cloud.accessapproval.v1.ApprovalRequest>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetApprovalRequestMethod(), responseObserver);
    }

    /** */
    public void approveApprovalRequest(
        com.google.cloud.accessapproval.v1.ApproveApprovalRequestMessage request,
        io.grpc.stub.StreamObserver<com.google.cloud.accessapproval.v1.ApprovalRequest>
            responseObserver) {
      asyncUnimplementedUnaryCall(getApproveApprovalRequestMethod(), responseObserver);
    }

    /** */
    public void dismissApprovalRequest(
        com.google.cloud.accessapproval.v1.DismissApprovalRequestMessage request,
        io.grpc.stub.StreamObserver<com.google.cloud.accessapproval.v1.ApprovalRequest>
            responseObserver) {
      asyncUnimplementedUnaryCall(getDismissApprovalRequestMethod(), responseObserver);
    }

    /** */
    public void getAccessApprovalSettings(
        com.google.cloud.accessapproval.v1.GetAccessApprovalSettingsMessage request,
        io.grpc.stub.StreamObserver<com.google.cloud.accessapproval.v1.AccessApprovalSettings>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccessApprovalSettingsMethod(), responseObserver);
    }

    /** */
    public void updateAccessApprovalSettings(
        com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage request,
        io.grpc.stub.StreamObserver<com.google.cloud.accessapproval.v1.AccessApprovalSettings>
            responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAccessApprovalSettingsMethod(), responseObserver);
    }

    /** */
    public void deleteAccessApprovalSettings(
        com.google.cloud.accessapproval.v1.DeleteAccessApprovalSettingsMessage request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAccessApprovalSettingsMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getListApprovalRequestsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.accessapproval.v1.ListApprovalRequestsMessage,
                      com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse>(
                      this, METHODID_LIST_APPROVAL_REQUESTS)))
          .addMethod(
              getGetApprovalRequestMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.accessapproval.v1.GetApprovalRequestMessage,
                      com.google.cloud.accessapproval.v1.ApprovalRequest>(
                      this, METHODID_GET_APPROVAL_REQUEST)))
          .addMethod(
              getApproveApprovalRequestMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.accessapproval.v1.ApproveApprovalRequestMessage,
                      com.google.cloud.accessapproval.v1.ApprovalRequest>(
                      this, METHODID_APPROVE_APPROVAL_REQUEST)))
          .addMethod(
              getDismissApprovalRequestMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.accessapproval.v1.DismissApprovalRequestMessage,
                      com.google.cloud.accessapproval.v1.ApprovalRequest>(
                      this, METHODID_DISMISS_APPROVAL_REQUEST)))
          .addMethod(
              getGetAccessApprovalSettingsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.accessapproval.v1.GetAccessApprovalSettingsMessage,
                      com.google.cloud.accessapproval.v1.AccessApprovalSettings>(
                      this, METHODID_GET_ACCESS_APPROVAL_SETTINGS)))
          .addMethod(
              getUpdateAccessApprovalSettingsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage,
                      com.google.cloud.accessapproval.v1.AccessApprovalSettings>(
                      this, METHODID_UPDATE_ACCESS_APPROVAL_SETTINGS)))
          .addMethod(
              getDeleteAccessApprovalSettingsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.accessapproval.v1.DeleteAccessApprovalSettingsMessage,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_ACCESS_APPROVAL_SETTINGS)))
          .build();
    }
  }

  /** */
  public static final class AccessApprovalStub
      extends io.grpc.stub.AbstractAsyncStub<AccessApprovalStub> {
    private AccessApprovalStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessApprovalStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessApprovalStub(channel, callOptions);
    }

    /** */
    public void listApprovalRequests(
        com.google.cloud.accessapproval.v1.ListApprovalRequestsMessage request,
        io.grpc.stub.StreamObserver<com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListApprovalRequestsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getApprovalRequest(
        com.google.cloud.accessapproval.v1.GetApprovalRequestMessage request,
        io.grpc.stub.StreamObserver<com.google.cloud.accessapproval.v1.ApprovalRequest>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetApprovalRequestMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void approveApprovalRequest(
        com.google.cloud.accessapproval.v1.ApproveApprovalRequestMessage request,
        io.grpc.stub.StreamObserver<com.google.cloud.accessapproval.v1.ApprovalRequest>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getApproveApprovalRequestMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void dismissApprovalRequest(
        com.google.cloud.accessapproval.v1.DismissApprovalRequestMessage request,
        io.grpc.stub.StreamObserver<com.google.cloud.accessapproval.v1.ApprovalRequest>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDismissApprovalRequestMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getAccessApprovalSettings(
        com.google.cloud.accessapproval.v1.GetAccessApprovalSettingsMessage request,
        io.grpc.stub.StreamObserver<com.google.cloud.accessapproval.v1.AccessApprovalSettings>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccessApprovalSettingsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void updateAccessApprovalSettings(
        com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage request,
        io.grpc.stub.StreamObserver<com.google.cloud.accessapproval.v1.AccessApprovalSettings>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAccessApprovalSettingsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void deleteAccessApprovalSettings(
        com.google.cloud.accessapproval.v1.DeleteAccessApprovalSettingsMessage request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAccessApprovalSettingsMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /** */
  public static final class AccessApprovalBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AccessApprovalBlockingStub> {
    private AccessApprovalBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessApprovalBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessApprovalBlockingStub(channel, callOptions);
    }

    /** */
    public com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse listApprovalRequests(
        com.google.cloud.accessapproval.v1.ListApprovalRequestsMessage request) {
      return blockingUnaryCall(
          getChannel(), getListApprovalRequestsMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.accessapproval.v1.ApprovalRequest getApprovalRequest(
        com.google.cloud.accessapproval.v1.GetApprovalRequestMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetApprovalRequestMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.accessapproval.v1.ApprovalRequest approveApprovalRequest(
        com.google.cloud.accessapproval.v1.ApproveApprovalRequestMessage request) {
      return blockingUnaryCall(
          getChannel(), getApproveApprovalRequestMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.accessapproval.v1.ApprovalRequest dismissApprovalRequest(
        com.google.cloud.accessapproval.v1.DismissApprovalRequestMessage request) {
      return blockingUnaryCall(
          getChannel(), getDismissApprovalRequestMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.accessapproval.v1.AccessApprovalSettings getAccessApprovalSettings(
        com.google.cloud.accessapproval.v1.GetAccessApprovalSettingsMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetAccessApprovalSettingsMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.cloud.accessapproval.v1.AccessApprovalSettings updateAccessApprovalSettings(
        com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAccessApprovalSettingsMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.protobuf.Empty deleteAccessApprovalSettings(
        com.google.cloud.accessapproval.v1.DeleteAccessApprovalSettingsMessage request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAccessApprovalSettingsMethod(), getCallOptions(), request);
    }
  }

  /** */
  public static final class AccessApprovalFutureStub
      extends io.grpc.stub.AbstractFutureStub<AccessApprovalFutureStub> {
    private AccessApprovalFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessApprovalFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccessApprovalFutureStub(channel, callOptions);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse>
        listApprovalRequests(
            com.google.cloud.accessapproval.v1.ListApprovalRequestsMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getListApprovalRequestsMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.accessapproval.v1.ApprovalRequest>
        getApprovalRequest(com.google.cloud.accessapproval.v1.GetApprovalRequestMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetApprovalRequestMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.accessapproval.v1.ApprovalRequest>
        approveApprovalRequest(
            com.google.cloud.accessapproval.v1.ApproveApprovalRequestMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getApproveApprovalRequestMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.accessapproval.v1.ApprovalRequest>
        dismissApprovalRequest(
            com.google.cloud.accessapproval.v1.DismissApprovalRequestMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getDismissApprovalRequestMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.accessapproval.v1.AccessApprovalSettings>
        getAccessApprovalSettings(
            com.google.cloud.accessapproval.v1.GetAccessApprovalSettingsMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccessApprovalSettingsMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.accessapproval.v1.AccessApprovalSettings>
        updateAccessApprovalSettings(
            com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAccessApprovalSettingsMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteAccessApprovalSettings(
            com.google.cloud.accessapproval.v1.DeleteAccessApprovalSettingsMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAccessApprovalSettingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_APPROVAL_REQUESTS = 0;
  private static final int METHODID_GET_APPROVAL_REQUEST = 1;
  private static final int METHODID_APPROVE_APPROVAL_REQUEST = 2;
  private static final int METHODID_DISMISS_APPROVAL_REQUEST = 3;
  private static final int METHODID_GET_ACCESS_APPROVAL_SETTINGS = 4;
  private static final int METHODID_UPDATE_ACCESS_APPROVAL_SETTINGS = 5;
  private static final int METHODID_DELETE_ACCESS_APPROVAL_SETTINGS = 6;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccessApprovalImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccessApprovalImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_APPROVAL_REQUESTS:
          serviceImpl.listApprovalRequests(
              (com.google.cloud.accessapproval.v1.ListApprovalRequestsMessage) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.accessapproval.v1.ListApprovalRequestsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_APPROVAL_REQUEST:
          serviceImpl.getApprovalRequest(
              (com.google.cloud.accessapproval.v1.GetApprovalRequestMessage) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.accessapproval.v1.ApprovalRequest>)
                  responseObserver);
          break;
        case METHODID_APPROVE_APPROVAL_REQUEST:
          serviceImpl.approveApprovalRequest(
              (com.google.cloud.accessapproval.v1.ApproveApprovalRequestMessage) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.accessapproval.v1.ApprovalRequest>)
                  responseObserver);
          break;
        case METHODID_DISMISS_APPROVAL_REQUEST:
          serviceImpl.dismissApprovalRequest(
              (com.google.cloud.accessapproval.v1.DismissApprovalRequestMessage) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.accessapproval.v1.ApprovalRequest>)
                  responseObserver);
          break;
        case METHODID_GET_ACCESS_APPROVAL_SETTINGS:
          serviceImpl.getAccessApprovalSettings(
              (com.google.cloud.accessapproval.v1.GetAccessApprovalSettingsMessage) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.accessapproval.v1.AccessApprovalSettings>)
                  responseObserver);
          break;
        case METHODID_UPDATE_ACCESS_APPROVAL_SETTINGS:
          serviceImpl.updateAccessApprovalSettings(
              (com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.accessapproval.v1.AccessApprovalSettings>)
                  responseObserver);
          break;
        case METHODID_DELETE_ACCESS_APPROVAL_SETTINGS:
          serviceImpl.deleteAccessApprovalSettings(
              (com.google.cloud.accessapproval.v1.DeleteAccessApprovalSettingsMessage) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private abstract static class AccessApprovalBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccessApprovalBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccessApproval");
    }
  }

  private static final class AccessApprovalFileDescriptorSupplier
      extends AccessApprovalBaseDescriptorSupplier {
    AccessApprovalFileDescriptorSupplier() {}
  }

  private static final class AccessApprovalMethodDescriptorSupplier
      extends AccessApprovalBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccessApprovalMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccessApprovalGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new AccessApprovalFileDescriptorSupplier())
                      .addMethod(getListApprovalRequestsMethod())
                      .addMethod(getGetApprovalRequestMethod())
                      .addMethod(getApproveApprovalRequestMethod())
                      .addMethod(getDismissApprovalRequestMethod())
                      .addMethod(getGetAccessApprovalSettingsMethod())
                      .addMethod(getUpdateAccessApprovalSettingsMethod())
                      .addMethod(getDeleteAccessApprovalSettingsMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
