// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/transport/internet/headers/srtp/config.proto

package com.v2ray.core.transport.internet.headers.srtp;

/**
 * Protobuf type {@code v2ray.core.transport.internet.headers.srtp.Config}
 */
public  final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.transport.internet.headers.srtp.Config)
    ConfigOrBuilder {
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
    version_ = 0;
    padding_ = false;
    extension_ = false;
    csrcCount_ = 0;
    marker_ = false;
    payloadType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Config(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            version_ = input.readUInt32();
            break;
          }
          case 16: {

            padding_ = input.readBool();
            break;
          }
          case 24: {

            extension_ = input.readBool();
            break;
          }
          case 32: {

            csrcCount_ = input.readUInt32();
            break;
          }
          case 40: {

            marker_ = input.readBool();
            break;
          }
          case 48: {

            payloadType_ = input.readUInt32();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.transport.internet.headers.srtp.ConfigOuterClass.internal_static_v2ray_core_transport_internet_headers_srtp_Config_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.transport.internet.headers.srtp.ConfigOuterClass.internal_static_v2ray_core_transport_internet_headers_srtp_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.transport.internet.headers.srtp.Config.class, com.v2ray.core.transport.internet.headers.srtp.Config.Builder.class);
  }

  public static final int VERSION_FIELD_NUMBER = 1;
  private int version_;
  /**
   * <code>optional uint32 version = 1;</code>
   */
  public int getVersion() {
    return version_;
  }

  public static final int PADDING_FIELD_NUMBER = 2;
  private boolean padding_;
  /**
   * <code>optional bool padding = 2;</code>
   */
  public boolean getPadding() {
    return padding_;
  }

  public static final int EXTENSION_FIELD_NUMBER = 3;
  private boolean extension_;
  /**
   * <code>optional bool extension = 3;</code>
   */
  public boolean getExtension() {
    return extension_;
  }

  public static final int CSRC_COUNT_FIELD_NUMBER = 4;
  private int csrcCount_;
  /**
   * <code>optional uint32 csrc_count = 4;</code>
   */
  public int getCsrcCount() {
    return csrcCount_;
  }

  public static final int MARKER_FIELD_NUMBER = 5;
  private boolean marker_;
  /**
   * <code>optional bool marker = 5;</code>
   */
  public boolean getMarker() {
    return marker_;
  }

  public static final int PAYLOAD_TYPE_FIELD_NUMBER = 6;
  private int payloadType_;
  /**
   * <code>optional uint32 payload_type = 6;</code>
   */
  public int getPayloadType() {
    return payloadType_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (version_ != 0) {
      output.writeUInt32(1, version_);
    }
    if (padding_ != false) {
      output.writeBool(2, padding_);
    }
    if (extension_ != false) {
      output.writeBool(3, extension_);
    }
    if (csrcCount_ != 0) {
      output.writeUInt32(4, csrcCount_);
    }
    if (marker_ != false) {
      output.writeBool(5, marker_);
    }
    if (payloadType_ != 0) {
      output.writeUInt32(6, payloadType_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (version_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, version_);
    }
    if (padding_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, padding_);
    }
    if (extension_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, extension_);
    }
    if (csrcCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, csrcCount_);
    }
    if (marker_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, marker_);
    }
    if (payloadType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, payloadType_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.v2ray.core.transport.internet.headers.srtp.Config)) {
      return super.equals(obj);
    }
    com.v2ray.core.transport.internet.headers.srtp.Config other = (com.v2ray.core.transport.internet.headers.srtp.Config) obj;

    boolean result = true;
    result = result && (getVersion()
        == other.getVersion());
    result = result && (getPadding()
        == other.getPadding());
    result = result && (getExtension()
        == other.getExtension());
    result = result && (getCsrcCount()
        == other.getCsrcCount());
    result = result && (getMarker()
        == other.getMarker());
    result = result && (getPayloadType()
        == other.getPayloadType());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion();
    hash = (37 * hash) + PADDING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPadding());
    hash = (37 * hash) + EXTENSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getExtension());
    hash = (37 * hash) + CSRC_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCsrcCount();
    hash = (37 * hash) + MARKER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMarker());
    hash = (37 * hash) + PAYLOAD_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getPayloadType();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.transport.internet.headers.srtp.Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.headers.srtp.Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.headers.srtp.Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.transport.internet.headers.srtp.Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.headers.srtp.Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.headers.srtp.Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.headers.srtp.Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.headers.srtp.Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.transport.internet.headers.srtp.Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.transport.internet.headers.srtp.Config parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.v2ray.core.transport.internet.headers.srtp.Config prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code v2ray.core.transport.internet.headers.srtp.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.transport.internet.headers.srtp.Config)
      com.v2ray.core.transport.internet.headers.srtp.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.transport.internet.headers.srtp.ConfigOuterClass.internal_static_v2ray_core_transport_internet_headers_srtp_Config_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.transport.internet.headers.srtp.ConfigOuterClass.internal_static_v2ray_core_transport_internet_headers_srtp_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.transport.internet.headers.srtp.Config.class, com.v2ray.core.transport.internet.headers.srtp.Config.Builder.class);
    }

    // Construct using com.v2ray.core.transport.internet.headers.srtp.Config.newBuilder()
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
    public Builder clear() {
      super.clear();
      version_ = 0;

      padding_ = false;

      extension_ = false;

      csrcCount_ = 0;

      marker_ = false;

      payloadType_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.transport.internet.headers.srtp.ConfigOuterClass.internal_static_v2ray_core_transport_internet_headers_srtp_Config_descriptor;
    }

    public com.v2ray.core.transport.internet.headers.srtp.Config getDefaultInstanceForType() {
      return com.v2ray.core.transport.internet.headers.srtp.Config.getDefaultInstance();
    }

    public com.v2ray.core.transport.internet.headers.srtp.Config build() {
      com.v2ray.core.transport.internet.headers.srtp.Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.v2ray.core.transport.internet.headers.srtp.Config buildPartial() {
      com.v2ray.core.transport.internet.headers.srtp.Config result = new com.v2ray.core.transport.internet.headers.srtp.Config(this);
      result.version_ = version_;
      result.padding_ = padding_;
      result.extension_ = extension_;
      result.csrcCount_ = csrcCount_;
      result.marker_ = marker_;
      result.payloadType_ = payloadType_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.v2ray.core.transport.internet.headers.srtp.Config) {
        return mergeFrom((com.v2ray.core.transport.internet.headers.srtp.Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.transport.internet.headers.srtp.Config other) {
      if (other == com.v2ray.core.transport.internet.headers.srtp.Config.getDefaultInstance()) return this;
      if (other.getVersion() != 0) {
        setVersion(other.getVersion());
      }
      if (other.getPadding() != false) {
        setPadding(other.getPadding());
      }
      if (other.getExtension() != false) {
        setExtension(other.getExtension());
      }
      if (other.getCsrcCount() != 0) {
        setCsrcCount(other.getCsrcCount());
      }
      if (other.getMarker() != false) {
        setMarker(other.getMarker());
      }
      if (other.getPayloadType() != 0) {
        setPayloadType(other.getPayloadType());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.v2ray.core.transport.internet.headers.srtp.Config parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.transport.internet.headers.srtp.Config) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int version_ ;
    /**
     * <code>optional uint32 version = 1;</code>
     */
    public int getVersion() {
      return version_;
    }
    /**
     * <code>optional uint32 version = 1;</code>
     */
    public Builder setVersion(int value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 version = 1;</code>
     */
    public Builder clearVersion() {
      
      version_ = 0;
      onChanged();
      return this;
    }

    private boolean padding_ ;
    /**
     * <code>optional bool padding = 2;</code>
     */
    public boolean getPadding() {
      return padding_;
    }
    /**
     * <code>optional bool padding = 2;</code>
     */
    public Builder setPadding(boolean value) {
      
      padding_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool padding = 2;</code>
     */
    public Builder clearPadding() {
      
      padding_ = false;
      onChanged();
      return this;
    }

    private boolean extension_ ;
    /**
     * <code>optional bool extension = 3;</code>
     */
    public boolean getExtension() {
      return extension_;
    }
    /**
     * <code>optional bool extension = 3;</code>
     */
    public Builder setExtension(boolean value) {
      
      extension_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool extension = 3;</code>
     */
    public Builder clearExtension() {
      
      extension_ = false;
      onChanged();
      return this;
    }

    private int csrcCount_ ;
    /**
     * <code>optional uint32 csrc_count = 4;</code>
     */
    public int getCsrcCount() {
      return csrcCount_;
    }
    /**
     * <code>optional uint32 csrc_count = 4;</code>
     */
    public Builder setCsrcCount(int value) {
      
      csrcCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 csrc_count = 4;</code>
     */
    public Builder clearCsrcCount() {
      
      csrcCount_ = 0;
      onChanged();
      return this;
    }

    private boolean marker_ ;
    /**
     * <code>optional bool marker = 5;</code>
     */
    public boolean getMarker() {
      return marker_;
    }
    /**
     * <code>optional bool marker = 5;</code>
     */
    public Builder setMarker(boolean value) {
      
      marker_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool marker = 5;</code>
     */
    public Builder clearMarker() {
      
      marker_ = false;
      onChanged();
      return this;
    }

    private int payloadType_ ;
    /**
     * <code>optional uint32 payload_type = 6;</code>
     */
    public int getPayloadType() {
      return payloadType_;
    }
    /**
     * <code>optional uint32 payload_type = 6;</code>
     */
    public Builder setPayloadType(int value) {
      
      payloadType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 payload_type = 6;</code>
     */
    public Builder clearPayloadType() {
      
      payloadType_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:v2ray.core.transport.internet.headers.srtp.Config)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.transport.internet.headers.srtp.Config)
  private static final com.v2ray.core.transport.internet.headers.srtp.Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.transport.internet.headers.srtp.Config();
  }

  public static com.v2ray.core.transport.internet.headers.srtp.Config getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Config>
      PARSER = new com.google.protobuf.AbstractParser<Config>() {
    public Config parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Config(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Config> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Config> getParserForType() {
    return PARSER;
  }

  public com.v2ray.core.transport.internet.headers.srtp.Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

