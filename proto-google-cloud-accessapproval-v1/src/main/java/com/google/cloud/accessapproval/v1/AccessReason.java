// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/accessapproval/v1/accessapproval.proto

package com.google.cloud.accessapproval.v1;

/**
 * Protobuf type {@code google.cloud.accessapproval.v1.AccessReason}
 */
public final class AccessReason extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.accessapproval.v1.AccessReason)
    AccessReasonOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AccessReason.newBuilder() to construct.
  private AccessReason(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AccessReason() {
    type_ = 0;
    detail_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AccessReason();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AccessReason(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            detail_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.accessapproval.v1.AccessApprovalProto.internal_static_google_cloud_accessapproval_v1_AccessReason_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.accessapproval.v1.AccessApprovalProto.internal_static_google_cloud_accessapproval_v1_AccessReason_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.accessapproval.v1.AccessReason.class, com.google.cloud.accessapproval.v1.AccessReason.Builder.class);
  }

  /**
   * <pre>
   * Type of access justification.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.accessapproval.v1.AccessReason.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Default value for proto, shouldn't be used.
     * </pre>
     *
     * <code>TYPE_UNSPECIFIED = 0;</code>
     */
    TYPE_UNSPECIFIED(0),
    /**
     * <pre>
     * Customer made a request or raised an issue that required the principal to
     * access customer data. `detail` is of the form ("#####" is the issue ID):
     * - "Feedback Report: #####"
     * - "Case Number: #####"
     * - "Case ID: #####"
     * - "E-PIN Reference: #####"
     * - "Google-#####"
     * - "T-#####"
     * </pre>
     *
     * <code>CUSTOMER_INITIATED_SUPPORT = 1;</code>
     */
    CUSTOMER_INITIATED_SUPPORT(1),
    /**
     * <pre>
     * The principal accessed customer data in order to diagnose or resolve a
     * suspected issue in services or a known outage. Often this access is used
     * to confirm that customers are not affected by a suspected service issue
     * or to remediate a reversible system issue.
     * </pre>
     *
     * <code>GOOGLE_INITIATED_SERVICE = 2;</code>
     */
    GOOGLE_INITIATED_SERVICE(2),
    /**
     * <pre>
     * Google initiated service for security, fraud, abuse, or compliance
     * purposes.
     * </pre>
     *
     * <code>GOOGLE_INITIATED_REVIEW = 3;</code>
     */
    GOOGLE_INITIATED_REVIEW(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Default value for proto, shouldn't be used.
     * </pre>
     *
     * <code>TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Customer made a request or raised an issue that required the principal to
     * access customer data. `detail` is of the form ("#####" is the issue ID):
     * - "Feedback Report: #####"
     * - "Case Number: #####"
     * - "Case ID: #####"
     * - "E-PIN Reference: #####"
     * - "Google-#####"
     * - "T-#####"
     * </pre>
     *
     * <code>CUSTOMER_INITIATED_SUPPORT = 1;</code>
     */
    public static final int CUSTOMER_INITIATED_SUPPORT_VALUE = 1;
    /**
     * <pre>
     * The principal accessed customer data in order to diagnose or resolve a
     * suspected issue in services or a known outage. Often this access is used
     * to confirm that customers are not affected by a suspected service issue
     * or to remediate a reversible system issue.
     * </pre>
     *
     * <code>GOOGLE_INITIATED_SERVICE = 2;</code>
     */
    public static final int GOOGLE_INITIATED_SERVICE_VALUE = 2;
    /**
     * <pre>
     * Google initiated service for security, fraud, abuse, or compliance
     * purposes.
     * </pre>
     *
     * <code>GOOGLE_INITIATED_REVIEW = 3;</code>
     */
    public static final int GOOGLE_INITIATED_REVIEW_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Type forNumber(int value) {
      switch (value) {
        case 0: return TYPE_UNSPECIFIED;
        case 1: return CUSTOMER_INITIATED_SUPPORT;
        case 2: return GOOGLE_INITIATED_SERVICE;
        case 3: return GOOGLE_INITIATED_REVIEW;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.accessapproval.v1.AccessReason.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.accessapproval.v1.AccessReason.Type)
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * Type of access justification.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.AccessReason.Type type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * Type of access justification.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.AccessReason.Type type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public com.google.cloud.accessapproval.v1.AccessReason.Type getType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.accessapproval.v1.AccessReason.Type result = com.google.cloud.accessapproval.v1.AccessReason.Type.valueOf(type_);
    return result == null ? com.google.cloud.accessapproval.v1.AccessReason.Type.UNRECOGNIZED : result;
  }

  public static final int DETAIL_FIELD_NUMBER = 2;
  private volatile java.lang.Object detail_;
  /**
   * <pre>
   * More detail about certain reason types. See comments for each type above.
   * </pre>
   *
   * <code>string detail = 2;</code>
   * @return The detail.
   */
  @java.lang.Override
  public java.lang.String getDetail() {
    java.lang.Object ref = detail_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      detail_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * More detail about certain reason types. See comments for each type above.
   * </pre>
   *
   * <code>string detail = 2;</code>
   * @return The bytes for detail.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDetailBytes() {
    java.lang.Object ref = detail_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      detail_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (type_ != com.google.cloud.accessapproval.v1.AccessReason.Type.TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (!getDetailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, detail_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.google.cloud.accessapproval.v1.AccessReason.Type.TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (!getDetailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, detail_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.accessapproval.v1.AccessReason)) {
      return super.equals(obj);
    }
    com.google.cloud.accessapproval.v1.AccessReason other = (com.google.cloud.accessapproval.v1.AccessReason) obj;

    if (type_ != other.type_) return false;
    if (!getDetail()
        .equals(other.getDetail())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + DETAIL_FIELD_NUMBER;
    hash = (53 * hash) + getDetail().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.accessapproval.v1.AccessReason parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.accessapproval.v1.AccessReason parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.accessapproval.v1.AccessReason parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.accessapproval.v1.AccessReason parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.accessapproval.v1.AccessReason parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.accessapproval.v1.AccessReason parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.accessapproval.v1.AccessReason parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.accessapproval.v1.AccessReason parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.accessapproval.v1.AccessReason parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.accessapproval.v1.AccessReason parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.accessapproval.v1.AccessReason parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.accessapproval.v1.AccessReason parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.accessapproval.v1.AccessReason prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.cloud.accessapproval.v1.AccessReason}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.accessapproval.v1.AccessReason)
      com.google.cloud.accessapproval.v1.AccessReasonOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto.internal_static_google_cloud_accessapproval_v1_AccessReason_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto.internal_static_google_cloud_accessapproval_v1_AccessReason_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.accessapproval.v1.AccessReason.class, com.google.cloud.accessapproval.v1.AccessReason.Builder.class);
    }

    // Construct using com.google.cloud.accessapproval.v1.AccessReason.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = 0;

      detail_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto.internal_static_google_cloud_accessapproval_v1_AccessReason_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.AccessReason getDefaultInstanceForType() {
      return com.google.cloud.accessapproval.v1.AccessReason.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.AccessReason build() {
      com.google.cloud.accessapproval.v1.AccessReason result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.AccessReason buildPartial() {
      com.google.cloud.accessapproval.v1.AccessReason result = new com.google.cloud.accessapproval.v1.AccessReason(this);
      result.type_ = type_;
      result.detail_ = detail_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.accessapproval.v1.AccessReason) {
        return mergeFrom((com.google.cloud.accessapproval.v1.AccessReason)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.accessapproval.v1.AccessReason other) {
      if (other == com.google.cloud.accessapproval.v1.AccessReason.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.getDetail().isEmpty()) {
        detail_ = other.detail_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.accessapproval.v1.AccessReason parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.accessapproval.v1.AccessReason) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <pre>
     * Type of access justification.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.AccessReason.Type type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Type of access justification.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.AccessReason.Type type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of access justification.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.AccessReason.Type type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public com.google.cloud.accessapproval.v1.AccessReason.Type getType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.accessapproval.v1.AccessReason.Type result = com.google.cloud.accessapproval.v1.AccessReason.Type.valueOf(type_);
      return result == null ? com.google.cloud.accessapproval.v1.AccessReason.Type.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Type of access justification.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.AccessReason.Type type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.cloud.accessapproval.v1.AccessReason.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of access justification.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.AccessReason.Type type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object detail_ = "";
    /**
     * <pre>
     * More detail about certain reason types. See comments for each type above.
     * </pre>
     *
     * <code>string detail = 2;</code>
     * @return The detail.
     */
    public java.lang.String getDetail() {
      java.lang.Object ref = detail_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        detail_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * More detail about certain reason types. See comments for each type above.
     * </pre>
     *
     * <code>string detail = 2;</code>
     * @return The bytes for detail.
     */
    public com.google.protobuf.ByteString
        getDetailBytes() {
      java.lang.Object ref = detail_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        detail_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * More detail about certain reason types. See comments for each type above.
     * </pre>
     *
     * <code>string detail = 2;</code>
     * @param value The detail to set.
     * @return This builder for chaining.
     */
    public Builder setDetail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      detail_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * More detail about certain reason types. See comments for each type above.
     * </pre>
     *
     * <code>string detail = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDetail() {
      
      detail_ = getDefaultInstance().getDetail();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * More detail about certain reason types. See comments for each type above.
     * </pre>
     *
     * <code>string detail = 2;</code>
     * @param value The bytes for detail to set.
     * @return This builder for chaining.
     */
    public Builder setDetailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      detail_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.accessapproval.v1.AccessReason)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.accessapproval.v1.AccessReason)
  private static final com.google.cloud.accessapproval.v1.AccessReason DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.accessapproval.v1.AccessReason();
  }

  public static com.google.cloud.accessapproval.v1.AccessReason getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccessReason>
      PARSER = new com.google.protobuf.AbstractParser<AccessReason>() {
    @java.lang.Override
    public AccessReason parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AccessReason(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AccessReason> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccessReason> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.accessapproval.v1.AccessReason getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

