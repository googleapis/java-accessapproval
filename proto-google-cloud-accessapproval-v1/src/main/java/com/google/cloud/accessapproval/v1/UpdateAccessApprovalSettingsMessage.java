// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/accessapproval/v1/accessapproval.proto

package com.google.cloud.accessapproval.v1;

/**
 * <pre>
 * Request to update access approval settings.
 * </pre>
 *
 * Protobuf type {@code google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage}
 */
public final class UpdateAccessApprovalSettingsMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage)
    UpdateAccessApprovalSettingsMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateAccessApprovalSettingsMessage.newBuilder() to construct.
  private UpdateAccessApprovalSettingsMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateAccessApprovalSettingsMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateAccessApprovalSettingsMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateAccessApprovalSettingsMessage(
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
          case 10: {
            com.google.cloud.accessapproval.v1.AccessApprovalSettings.Builder subBuilder = null;
            if (settings_ != null) {
              subBuilder = settings_.toBuilder();
            }
            settings_ = input.readMessage(com.google.cloud.accessapproval.v1.AccessApprovalSettings.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(settings_);
              settings_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
            }

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
    return com.google.cloud.accessapproval.v1.AccessApprovalProto.internal_static_google_cloud_accessapproval_v1_UpdateAccessApprovalSettingsMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.accessapproval.v1.AccessApprovalProto.internal_static_google_cloud_accessapproval_v1_UpdateAccessApprovalSettingsMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage.class, com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage.Builder.class);
  }

  public static final int SETTINGS_FIELD_NUMBER = 1;
  private com.google.cloud.accessapproval.v1.AccessApprovalSettings settings_;
  /**
   * <pre>
   * The new AccessApprovalSettings.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
   * @return Whether the settings field is set.
   */
  @java.lang.Override
  public boolean hasSettings() {
    return settings_ != null;
  }
  /**
   * <pre>
   * The new AccessApprovalSettings.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
   * @return The settings.
   */
  @java.lang.Override
  public com.google.cloud.accessapproval.v1.AccessApprovalSettings getSettings() {
    return settings_ == null ? com.google.cloud.accessapproval.v1.AccessApprovalSettings.getDefaultInstance() : settings_;
  }
  /**
   * <pre>
   * The new AccessApprovalSettings.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.accessapproval.v1.AccessApprovalSettingsOrBuilder getSettingsOrBuilder() {
    return getSettings();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * The update mask applies to the settings. Only the top level fields of
   * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
   * supported. For each field, if it is included, the currently stored value
   * will be entirely overwritten with the value of the field passed in this
   * request.
   * For the `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * If this field is left unset, only the notification_emails field will be
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * The update mask applies to the settings. Only the top level fields of
   * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
   * supported. For each field, if it is included, the currently stored value
   * will be entirely overwritten with the value of the field passed in this
   * request.
   * For the `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * If this field is left unset, only the notification_emails field will be
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * The update mask applies to the settings. Only the top level fields of
   * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
   * supported. For each field, if it is included, the currently stored value
   * will be entirely overwritten with the value of the field passed in this
   * request.
   * For the `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * If this field is left unset, only the notification_emails field will be
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (settings_ != null) {
      output.writeMessage(1, getSettings());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (settings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSettings());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage)) {
      return super.equals(obj);
    }
    com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage other = (com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage) obj;

    if (hasSettings() != other.hasSettings()) return false;
    if (hasSettings()) {
      if (!getSettings()
          .equals(other.getSettings())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
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
    if (hasSettings()) {
      hash = (37 * hash) + SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSettings().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage parseFrom(
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
  public static Builder newBuilder(com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage prototype) {
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
   * <pre>
   * Request to update access approval settings.
   * </pre>
   *
   * Protobuf type {@code google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage)
      com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto.internal_static_google_cloud_accessapproval_v1_UpdateAccessApprovalSettingsMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto.internal_static_google_cloud_accessapproval_v1_UpdateAccessApprovalSettingsMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage.class, com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage.Builder.class);
    }

    // Construct using com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage.newBuilder()
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
      if (settingsBuilder_ == null) {
        settings_ = null;
      } else {
        settings_ = null;
        settingsBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto.internal_static_google_cloud_accessapproval_v1_UpdateAccessApprovalSettingsMessage_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage getDefaultInstanceForType() {
      return com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage build() {
      com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage buildPartial() {
      com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage result = new com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage(this);
      if (settingsBuilder_ == null) {
        result.settings_ = settings_;
      } else {
        result.settings_ = settingsBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage) {
        return mergeFrom((com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage other) {
      if (other == com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage.getDefaultInstance()) return this;
      if (other.hasSettings()) {
        mergeSettings(other.getSettings());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.accessapproval.v1.AccessApprovalSettings settings_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.accessapproval.v1.AccessApprovalSettings, com.google.cloud.accessapproval.v1.AccessApprovalSettings.Builder, com.google.cloud.accessapproval.v1.AccessApprovalSettingsOrBuilder> settingsBuilder_;
    /**
     * <pre>
     * The new AccessApprovalSettings.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
     * @return Whether the settings field is set.
     */
    public boolean hasSettings() {
      return settingsBuilder_ != null || settings_ != null;
    }
    /**
     * <pre>
     * The new AccessApprovalSettings.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
     * @return The settings.
     */
    public com.google.cloud.accessapproval.v1.AccessApprovalSettings getSettings() {
      if (settingsBuilder_ == null) {
        return settings_ == null ? com.google.cloud.accessapproval.v1.AccessApprovalSettings.getDefaultInstance() : settings_;
      } else {
        return settingsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The new AccessApprovalSettings.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
     */
    public Builder setSettings(com.google.cloud.accessapproval.v1.AccessApprovalSettings value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        settings_ = value;
        onChanged();
      } else {
        settingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The new AccessApprovalSettings.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
     */
    public Builder setSettings(
        com.google.cloud.accessapproval.v1.AccessApprovalSettings.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        settings_ = builderForValue.build();
        onChanged();
      } else {
        settingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The new AccessApprovalSettings.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
     */
    public Builder mergeSettings(com.google.cloud.accessapproval.v1.AccessApprovalSettings value) {
      if (settingsBuilder_ == null) {
        if (settings_ != null) {
          settings_ =
            com.google.cloud.accessapproval.v1.AccessApprovalSettings.newBuilder(settings_).mergeFrom(value).buildPartial();
        } else {
          settings_ = value;
        }
        onChanged();
      } else {
        settingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The new AccessApprovalSettings.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
     */
    public Builder clearSettings() {
      if (settingsBuilder_ == null) {
        settings_ = null;
        onChanged();
      } else {
        settings_ = null;
        settingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The new AccessApprovalSettings.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
     */
    public com.google.cloud.accessapproval.v1.AccessApprovalSettings.Builder getSettingsBuilder() {
      
      onChanged();
      return getSettingsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The new AccessApprovalSettings.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
     */
    public com.google.cloud.accessapproval.v1.AccessApprovalSettingsOrBuilder getSettingsOrBuilder() {
      if (settingsBuilder_ != null) {
        return settingsBuilder_.getMessageOrBuilder();
      } else {
        return settings_ == null ?
            com.google.cloud.accessapproval.v1.AccessApprovalSettings.getDefaultInstance() : settings_;
      }
    }
    /**
     * <pre>
     * The new AccessApprovalSettings.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.accessapproval.v1.AccessApprovalSettings, com.google.cloud.accessapproval.v1.AccessApprovalSettings.Builder, com.google.cloud.accessapproval.v1.AccessApprovalSettingsOrBuilder> 
        getSettingsFieldBuilder() {
      if (settingsBuilder_ == null) {
        settingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.accessapproval.v1.AccessApprovalSettings, com.google.cloud.accessapproval.v1.AccessApprovalSettings.Builder, com.google.cloud.accessapproval.v1.AccessApprovalSettingsOrBuilder>(
                getSettings(),
                getParentForChildren(),
                isClean());
        settings_ = null;
      }
      return settingsBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * The update mask applies to the settings. Only the top level fields of
     * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
     * supported. For each field, if it is included, the currently stored value
     * will be entirely overwritten with the value of the field passed in this
     * request.
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If this field is left unset, only the notification_emails field will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * The update mask applies to the settings. Only the top level fields of
     * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
     * supported. For each field, if it is included, the currently stored value
     * will be entirely overwritten with the value of the field passed in this
     * request.
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If this field is left unset, only the notification_emails field will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The update mask applies to the settings. Only the top level fields of
     * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
     * supported. For each field, if it is included, the currently stored value
     * will be entirely overwritten with the value of the field passed in this
     * request.
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If this field is left unset, only the notification_emails field will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The update mask applies to the settings. Only the top level fields of
     * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
     * supported. For each field, if it is included, the currently stored value
     * will be entirely overwritten with the value of the field passed in this
     * request.
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If this field is left unset, only the notification_emails field will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The update mask applies to the settings. Only the top level fields of
     * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
     * supported. For each field, if it is included, the currently stored value
     * will be entirely overwritten with the value of the field passed in this
     * request.
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If this field is left unset, only the notification_emails field will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The update mask applies to the settings. Only the top level fields of
     * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
     * supported. For each field, if it is included, the currently stored value
     * will be entirely overwritten with the value of the field passed in this
     * request.
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If this field is left unset, only the notification_emails field will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The update mask applies to the settings. Only the top level fields of
     * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
     * supported. For each field, if it is included, the currently stored value
     * will be entirely overwritten with the value of the field passed in this
     * request.
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If this field is left unset, only the notification_emails field will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The update mask applies to the settings. Only the top level fields of
     * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
     * supported. For each field, if it is included, the currently stored value
     * will be entirely overwritten with the value of the field passed in this
     * request.
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If this field is left unset, only the notification_emails field will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * The update mask applies to the settings. Only the top level fields of
     * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
     * supported. For each field, if it is included, the currently stored value
     * will be entirely overwritten with the value of the field passed in this
     * request.
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If this field is left unset, only the notification_emails field will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage)
  private static final com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage();
  }

  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateAccessApprovalSettingsMessage>
      PARSER = new com.google.protobuf.AbstractParser<UpdateAccessApprovalSettingsMessage>() {
    @java.lang.Override
    public UpdateAccessApprovalSettingsMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateAccessApprovalSettingsMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateAccessApprovalSettingsMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateAccessApprovalSettingsMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

