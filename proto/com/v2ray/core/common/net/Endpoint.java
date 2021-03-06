// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/common/net/destination.proto

package com.v2ray.core.common.net;

/**
 * Protobuf type {@code v2ray.core.common.net.Endpoint}
 */
public  final class Endpoint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.common.net.Endpoint)
    EndpointOrBuilder {
  // Use Endpoint.newBuilder() to construct.
  private Endpoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Endpoint() {
    network_ = 0;
    port_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Endpoint(
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
            int rawValue = input.readEnum();

            network_ = rawValue;
            break;
          }
          case 18: {
            com.v2ray.core.common.net.IPOrDomain.Builder subBuilder = null;
            if (address_ != null) {
              subBuilder = address_.toBuilder();
            }
            address_ = input.readMessage(com.v2ray.core.common.net.IPOrDomain.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(address_);
              address_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            port_ = input.readUInt32();
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
    return com.v2ray.core.common.net.Destination.internal_static_v2ray_core_common_net_Endpoint_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.common.net.Destination.internal_static_v2ray_core_common_net_Endpoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.common.net.Endpoint.class, com.v2ray.core.common.net.Endpoint.Builder.class);
  }

  public static final int NETWORK_FIELD_NUMBER = 1;
  private int network_;
  /**
   * <code>optional .v2ray.core.common.net.Network network = 1;</code>
   */
  public int getNetworkValue() {
    return network_;
  }
  /**
   * <code>optional .v2ray.core.common.net.Network network = 1;</code>
   */
  public com.v2ray.core.common.net.Network getNetwork() {
    com.v2ray.core.common.net.Network result = com.v2ray.core.common.net.Network.valueOf(network_);
    return result == null ? com.v2ray.core.common.net.Network.UNRECOGNIZED : result;
  }

  public static final int ADDRESS_FIELD_NUMBER = 2;
  private com.v2ray.core.common.net.IPOrDomain address_;
  /**
   * <code>optional .v2ray.core.common.net.IPOrDomain address = 2;</code>
   */
  public boolean hasAddress() {
    return address_ != null;
  }
  /**
   * <code>optional .v2ray.core.common.net.IPOrDomain address = 2;</code>
   */
  public com.v2ray.core.common.net.IPOrDomain getAddress() {
    return address_ == null ? com.v2ray.core.common.net.IPOrDomain.getDefaultInstance() : address_;
  }
  /**
   * <code>optional .v2ray.core.common.net.IPOrDomain address = 2;</code>
   */
  public com.v2ray.core.common.net.IPOrDomainOrBuilder getAddressOrBuilder() {
    return getAddress();
  }

  public static final int PORT_FIELD_NUMBER = 3;
  private int port_;
  /**
   * <code>optional uint32 port = 3;</code>
   */
  public int getPort() {
    return port_;
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
    if (network_ != com.v2ray.core.common.net.Network.Unknown.getNumber()) {
      output.writeEnum(1, network_);
    }
    if (address_ != null) {
      output.writeMessage(2, getAddress());
    }
    if (port_ != 0) {
      output.writeUInt32(3, port_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (network_ != com.v2ray.core.common.net.Network.Unknown.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, network_);
    }
    if (address_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAddress());
    }
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, port_);
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
    if (!(obj instanceof com.v2ray.core.common.net.Endpoint)) {
      return super.equals(obj);
    }
    com.v2ray.core.common.net.Endpoint other = (com.v2ray.core.common.net.Endpoint) obj;

    boolean result = true;
    result = result && network_ == other.network_;
    result = result && (hasAddress() == other.hasAddress());
    if (hasAddress()) {
      result = result && getAddress()
          .equals(other.getAddress());
    }
    result = result && (getPort()
        == other.getPort());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + NETWORK_FIELD_NUMBER;
    hash = (53 * hash) + network_;
    if (hasAddress()) {
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
    }
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.common.net.Endpoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.common.net.Endpoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.common.net.Endpoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.common.net.Endpoint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.common.net.Endpoint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.common.net.Endpoint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.common.net.Endpoint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.common.net.Endpoint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.common.net.Endpoint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.common.net.Endpoint parseFrom(
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
  public static Builder newBuilder(com.v2ray.core.common.net.Endpoint prototype) {
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
   * Protobuf type {@code v2ray.core.common.net.Endpoint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.common.net.Endpoint)
      com.v2ray.core.common.net.EndpointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.common.net.Destination.internal_static_v2ray_core_common_net_Endpoint_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.common.net.Destination.internal_static_v2ray_core_common_net_Endpoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.common.net.Endpoint.class, com.v2ray.core.common.net.Endpoint.Builder.class);
    }

    // Construct using com.v2ray.core.common.net.Endpoint.newBuilder()
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
      network_ = 0;

      if (addressBuilder_ == null) {
        address_ = null;
      } else {
        address_ = null;
        addressBuilder_ = null;
      }
      port_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.common.net.Destination.internal_static_v2ray_core_common_net_Endpoint_descriptor;
    }

    public com.v2ray.core.common.net.Endpoint getDefaultInstanceForType() {
      return com.v2ray.core.common.net.Endpoint.getDefaultInstance();
    }

    public com.v2ray.core.common.net.Endpoint build() {
      com.v2ray.core.common.net.Endpoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.v2ray.core.common.net.Endpoint buildPartial() {
      com.v2ray.core.common.net.Endpoint result = new com.v2ray.core.common.net.Endpoint(this);
      result.network_ = network_;
      if (addressBuilder_ == null) {
        result.address_ = address_;
      } else {
        result.address_ = addressBuilder_.build();
      }
      result.port_ = port_;
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
      if (other instanceof com.v2ray.core.common.net.Endpoint) {
        return mergeFrom((com.v2ray.core.common.net.Endpoint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.common.net.Endpoint other) {
      if (other == com.v2ray.core.common.net.Endpoint.getDefaultInstance()) return this;
      if (other.network_ != 0) {
        setNetworkValue(other.getNetworkValue());
      }
      if (other.hasAddress()) {
        mergeAddress(other.getAddress());
      }
      if (other.getPort() != 0) {
        setPort(other.getPort());
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
      com.v2ray.core.common.net.Endpoint parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.common.net.Endpoint) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int network_ = 0;
    /**
     * <code>optional .v2ray.core.common.net.Network network = 1;</code>
     */
    public int getNetworkValue() {
      return network_;
    }
    /**
     * <code>optional .v2ray.core.common.net.Network network = 1;</code>
     */
    public Builder setNetworkValue(int value) {
      network_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .v2ray.core.common.net.Network network = 1;</code>
     */
    public com.v2ray.core.common.net.Network getNetwork() {
      com.v2ray.core.common.net.Network result = com.v2ray.core.common.net.Network.valueOf(network_);
      return result == null ? com.v2ray.core.common.net.Network.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .v2ray.core.common.net.Network network = 1;</code>
     */
    public Builder setNetwork(com.v2ray.core.common.net.Network value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      network_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .v2ray.core.common.net.Network network = 1;</code>
     */
    public Builder clearNetwork() {
      
      network_ = 0;
      onChanged();
      return this;
    }

    private com.v2ray.core.common.net.IPOrDomain address_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.net.IPOrDomain, com.v2ray.core.common.net.IPOrDomain.Builder, com.v2ray.core.common.net.IPOrDomainOrBuilder> addressBuilder_;
    /**
     * <code>optional .v2ray.core.common.net.IPOrDomain address = 2;</code>
     */
    public boolean hasAddress() {
      return addressBuilder_ != null || address_ != null;
    }
    /**
     * <code>optional .v2ray.core.common.net.IPOrDomain address = 2;</code>
     */
    public com.v2ray.core.common.net.IPOrDomain getAddress() {
      if (addressBuilder_ == null) {
        return address_ == null ? com.v2ray.core.common.net.IPOrDomain.getDefaultInstance() : address_;
      } else {
        return addressBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .v2ray.core.common.net.IPOrDomain address = 2;</code>
     */
    public Builder setAddress(com.v2ray.core.common.net.IPOrDomain value) {
      if (addressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        address_ = value;
        onChanged();
      } else {
        addressBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.common.net.IPOrDomain address = 2;</code>
     */
    public Builder setAddress(
        com.v2ray.core.common.net.IPOrDomain.Builder builderForValue) {
      if (addressBuilder_ == null) {
        address_ = builderForValue.build();
        onChanged();
      } else {
        addressBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.common.net.IPOrDomain address = 2;</code>
     */
    public Builder mergeAddress(com.v2ray.core.common.net.IPOrDomain value) {
      if (addressBuilder_ == null) {
        if (address_ != null) {
          address_ =
            com.v2ray.core.common.net.IPOrDomain.newBuilder(address_).mergeFrom(value).buildPartial();
        } else {
          address_ = value;
        }
        onChanged();
      } else {
        addressBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.common.net.IPOrDomain address = 2;</code>
     */
    public Builder clearAddress() {
      if (addressBuilder_ == null) {
        address_ = null;
        onChanged();
      } else {
        address_ = null;
        addressBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.common.net.IPOrDomain address = 2;</code>
     */
    public com.v2ray.core.common.net.IPOrDomain.Builder getAddressBuilder() {
      
      onChanged();
      return getAddressFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .v2ray.core.common.net.IPOrDomain address = 2;</code>
     */
    public com.v2ray.core.common.net.IPOrDomainOrBuilder getAddressOrBuilder() {
      if (addressBuilder_ != null) {
        return addressBuilder_.getMessageOrBuilder();
      } else {
        return address_ == null ?
            com.v2ray.core.common.net.IPOrDomain.getDefaultInstance() : address_;
      }
    }
    /**
     * <code>optional .v2ray.core.common.net.IPOrDomain address = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.net.IPOrDomain, com.v2ray.core.common.net.IPOrDomain.Builder, com.v2ray.core.common.net.IPOrDomainOrBuilder> 
        getAddressFieldBuilder() {
      if (addressBuilder_ == null) {
        addressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.v2ray.core.common.net.IPOrDomain, com.v2ray.core.common.net.IPOrDomain.Builder, com.v2ray.core.common.net.IPOrDomainOrBuilder>(
                getAddress(),
                getParentForChildren(),
                isClean());
        address_ = null;
      }
      return addressBuilder_;
    }

    private int port_ ;
    /**
     * <code>optional uint32 port = 3;</code>
     */
    public int getPort() {
      return port_;
    }
    /**
     * <code>optional uint32 port = 3;</code>
     */
    public Builder setPort(int value) {
      
      port_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 port = 3;</code>
     */
    public Builder clearPort() {
      
      port_ = 0;
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


    // @@protoc_insertion_point(builder_scope:v2ray.core.common.net.Endpoint)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.common.net.Endpoint)
  private static final com.v2ray.core.common.net.Endpoint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.common.net.Endpoint();
  }

  public static com.v2ray.core.common.net.Endpoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Endpoint>
      PARSER = new com.google.protobuf.AbstractParser<Endpoint>() {
    public Endpoint parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Endpoint(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Endpoint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Endpoint> getParserForType() {
    return PARSER;
  }

  public com.v2ray.core.common.net.Endpoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

