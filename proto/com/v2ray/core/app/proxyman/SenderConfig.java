// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/proxyman/config.proto

package com.v2ray.core.app.proxyman;

/**
 * Protobuf type {@code v2ray.core.app.proxyman.SenderConfig}
 */
public  final class SenderConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.app.proxyman.SenderConfig)
    SenderConfigOrBuilder {
  // Use SenderConfig.newBuilder() to construct.
  private SenderConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SenderConfig() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SenderConfig(
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
          case 10: {
            com.v2ray.core.common.net.IPOrDomain.Builder subBuilder = null;
            if (via_ != null) {
              subBuilder = via_.toBuilder();
            }
            via_ = input.readMessage(com.v2ray.core.common.net.IPOrDomain.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(via_);
              via_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.v2ray.core.transport.internet.StreamConfig.Builder subBuilder = null;
            if (streamSettings_ != null) {
              subBuilder = streamSettings_.toBuilder();
            }
            streamSettings_ = input.readMessage(com.v2ray.core.transport.internet.StreamConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(streamSettings_);
              streamSettings_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.v2ray.core.transport.internet.ProxyConfig.Builder subBuilder = null;
            if (proxySettings_ != null) {
              subBuilder = proxySettings_.toBuilder();
            }
            proxySettings_ = input.readMessage(com.v2ray.core.transport.internet.ProxyConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(proxySettings_);
              proxySettings_ = subBuilder.buildPartial();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.app.proxyman.Config.internal_static_v2ray_core_app_proxyman_SenderConfig_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.app.proxyman.Config.internal_static_v2ray_core_app_proxyman_SenderConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.v2ray.core.app.proxyman.SenderConfig.class, com.v2ray.core.app.proxyman.SenderConfig.Builder.class);
  }

  public static final int VIA_FIELD_NUMBER = 1;
  private com.v2ray.core.common.net.IPOrDomain via_;
  /**
   * <pre>
   * Send traffic through the given IP. Only IP is allowed.
   * </pre>
   *
   * <code>optional .v2ray.core.common.net.IPOrDomain via = 1;</code>
   */
  public boolean hasVia() {
    return via_ != null;
  }
  /**
   * <pre>
   * Send traffic through the given IP. Only IP is allowed.
   * </pre>
   *
   * <code>optional .v2ray.core.common.net.IPOrDomain via = 1;</code>
   */
  public com.v2ray.core.common.net.IPOrDomain getVia() {
    return via_ == null ? com.v2ray.core.common.net.IPOrDomain.getDefaultInstance() : via_;
  }
  /**
   * <pre>
   * Send traffic through the given IP. Only IP is allowed.
   * </pre>
   *
   * <code>optional .v2ray.core.common.net.IPOrDomain via = 1;</code>
   */
  public com.v2ray.core.common.net.IPOrDomainOrBuilder getViaOrBuilder() {
    return getVia();
  }

  public static final int STREAM_SETTINGS_FIELD_NUMBER = 2;
  private com.v2ray.core.transport.internet.StreamConfig streamSettings_;
  /**
   * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 2;</code>
   */
  public boolean hasStreamSettings() {
    return streamSettings_ != null;
  }
  /**
   * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 2;</code>
   */
  public com.v2ray.core.transport.internet.StreamConfig getStreamSettings() {
    return streamSettings_ == null ? com.v2ray.core.transport.internet.StreamConfig.getDefaultInstance() : streamSettings_;
  }
  /**
   * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 2;</code>
   */
  public com.v2ray.core.transport.internet.StreamConfigOrBuilder getStreamSettingsOrBuilder() {
    return getStreamSettings();
  }

  public static final int PROXY_SETTINGS_FIELD_NUMBER = 3;
  private com.v2ray.core.transport.internet.ProxyConfig proxySettings_;
  /**
   * <code>optional .v2ray.core.transport.internet.ProxyConfig proxy_settings = 3;</code>
   */
  public boolean hasProxySettings() {
    return proxySettings_ != null;
  }
  /**
   * <code>optional .v2ray.core.transport.internet.ProxyConfig proxy_settings = 3;</code>
   */
  public com.v2ray.core.transport.internet.ProxyConfig getProxySettings() {
    return proxySettings_ == null ? com.v2ray.core.transport.internet.ProxyConfig.getDefaultInstance() : proxySettings_;
  }
  /**
   * <code>optional .v2ray.core.transport.internet.ProxyConfig proxy_settings = 3;</code>
   */
  public com.v2ray.core.transport.internet.ProxyConfigOrBuilder getProxySettingsOrBuilder() {
    return getProxySettings();
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
    if (via_ != null) {
      output.writeMessage(1, getVia());
    }
    if (streamSettings_ != null) {
      output.writeMessage(2, getStreamSettings());
    }
    if (proxySettings_ != null) {
      output.writeMessage(3, getProxySettings());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (via_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getVia());
    }
    if (streamSettings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStreamSettings());
    }
    if (proxySettings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getProxySettings());
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
    if (!(obj instanceof com.v2ray.core.app.proxyman.SenderConfig)) {
      return super.equals(obj);
    }
    com.v2ray.core.app.proxyman.SenderConfig other = (com.v2ray.core.app.proxyman.SenderConfig) obj;

    boolean result = true;
    result = result && (hasVia() == other.hasVia());
    if (hasVia()) {
      result = result && getVia()
          .equals(other.getVia());
    }
    result = result && (hasStreamSettings() == other.hasStreamSettings());
    if (hasStreamSettings()) {
      result = result && getStreamSettings()
          .equals(other.getStreamSettings());
    }
    result = result && (hasProxySettings() == other.hasProxySettings());
    if (hasProxySettings()) {
      result = result && getProxySettings()
          .equals(other.getProxySettings());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasVia()) {
      hash = (37 * hash) + VIA_FIELD_NUMBER;
      hash = (53 * hash) + getVia().hashCode();
    }
    if (hasStreamSettings()) {
      hash = (37 * hash) + STREAM_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getStreamSettings().hashCode();
    }
    if (hasProxySettings()) {
      hash = (37 * hash) + PROXY_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getProxySettings().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.v2ray.core.app.proxyman.SenderConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.app.proxyman.SenderConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.app.proxyman.SenderConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.v2ray.core.app.proxyman.SenderConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.v2ray.core.app.proxyman.SenderConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.proxyman.SenderConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.app.proxyman.SenderConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.proxyman.SenderConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.v2ray.core.app.proxyman.SenderConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.v2ray.core.app.proxyman.SenderConfig parseFrom(
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
  public static Builder newBuilder(com.v2ray.core.app.proxyman.SenderConfig prototype) {
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
   * Protobuf type {@code v2ray.core.app.proxyman.SenderConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.app.proxyman.SenderConfig)
      com.v2ray.core.app.proxyman.SenderConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.app.proxyman.Config.internal_static_v2ray_core_app_proxyman_SenderConfig_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.app.proxyman.Config.internal_static_v2ray_core_app_proxyman_SenderConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.v2ray.core.app.proxyman.SenderConfig.class, com.v2ray.core.app.proxyman.SenderConfig.Builder.class);
    }

    // Construct using com.v2ray.core.app.proxyman.SenderConfig.newBuilder()
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
      if (viaBuilder_ == null) {
        via_ = null;
      } else {
        via_ = null;
        viaBuilder_ = null;
      }
      if (streamSettingsBuilder_ == null) {
        streamSettings_ = null;
      } else {
        streamSettings_ = null;
        streamSettingsBuilder_ = null;
      }
      if (proxySettingsBuilder_ == null) {
        proxySettings_ = null;
      } else {
        proxySettings_ = null;
        proxySettingsBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.app.proxyman.Config.internal_static_v2ray_core_app_proxyman_SenderConfig_descriptor;
    }

    public com.v2ray.core.app.proxyman.SenderConfig getDefaultInstanceForType() {
      return com.v2ray.core.app.proxyman.SenderConfig.getDefaultInstance();
    }

    public com.v2ray.core.app.proxyman.SenderConfig build() {
      com.v2ray.core.app.proxyman.SenderConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.v2ray.core.app.proxyman.SenderConfig buildPartial() {
      com.v2ray.core.app.proxyman.SenderConfig result = new com.v2ray.core.app.proxyman.SenderConfig(this);
      if (viaBuilder_ == null) {
        result.via_ = via_;
      } else {
        result.via_ = viaBuilder_.build();
      }
      if (streamSettingsBuilder_ == null) {
        result.streamSettings_ = streamSettings_;
      } else {
        result.streamSettings_ = streamSettingsBuilder_.build();
      }
      if (proxySettingsBuilder_ == null) {
        result.proxySettings_ = proxySettings_;
      } else {
        result.proxySettings_ = proxySettingsBuilder_.build();
      }
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
      if (other instanceof com.v2ray.core.app.proxyman.SenderConfig) {
        return mergeFrom((com.v2ray.core.app.proxyman.SenderConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.v2ray.core.app.proxyman.SenderConfig other) {
      if (other == com.v2ray.core.app.proxyman.SenderConfig.getDefaultInstance()) return this;
      if (other.hasVia()) {
        mergeVia(other.getVia());
      }
      if (other.hasStreamSettings()) {
        mergeStreamSettings(other.getStreamSettings());
      }
      if (other.hasProxySettings()) {
        mergeProxySettings(other.getProxySettings());
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
      com.v2ray.core.app.proxyman.SenderConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.v2ray.core.app.proxyman.SenderConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.v2ray.core.common.net.IPOrDomain via_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.net.IPOrDomain, com.v2ray.core.common.net.IPOrDomain.Builder, com.v2ray.core.common.net.IPOrDomainOrBuilder> viaBuilder_;
    /**
     * <pre>
     * Send traffic through the given IP. Only IP is allowed.
     * </pre>
     *
     * <code>optional .v2ray.core.common.net.IPOrDomain via = 1;</code>
     */
    public boolean hasVia() {
      return viaBuilder_ != null || via_ != null;
    }
    /**
     * <pre>
     * Send traffic through the given IP. Only IP is allowed.
     * </pre>
     *
     * <code>optional .v2ray.core.common.net.IPOrDomain via = 1;</code>
     */
    public com.v2ray.core.common.net.IPOrDomain getVia() {
      if (viaBuilder_ == null) {
        return via_ == null ? com.v2ray.core.common.net.IPOrDomain.getDefaultInstance() : via_;
      } else {
        return viaBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Send traffic through the given IP. Only IP is allowed.
     * </pre>
     *
     * <code>optional .v2ray.core.common.net.IPOrDomain via = 1;</code>
     */
    public Builder setVia(com.v2ray.core.common.net.IPOrDomain value) {
      if (viaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        via_ = value;
        onChanged();
      } else {
        viaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Send traffic through the given IP. Only IP is allowed.
     * </pre>
     *
     * <code>optional .v2ray.core.common.net.IPOrDomain via = 1;</code>
     */
    public Builder setVia(
        com.v2ray.core.common.net.IPOrDomain.Builder builderForValue) {
      if (viaBuilder_ == null) {
        via_ = builderForValue.build();
        onChanged();
      } else {
        viaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Send traffic through the given IP. Only IP is allowed.
     * </pre>
     *
     * <code>optional .v2ray.core.common.net.IPOrDomain via = 1;</code>
     */
    public Builder mergeVia(com.v2ray.core.common.net.IPOrDomain value) {
      if (viaBuilder_ == null) {
        if (via_ != null) {
          via_ =
            com.v2ray.core.common.net.IPOrDomain.newBuilder(via_).mergeFrom(value).buildPartial();
        } else {
          via_ = value;
        }
        onChanged();
      } else {
        viaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Send traffic through the given IP. Only IP is allowed.
     * </pre>
     *
     * <code>optional .v2ray.core.common.net.IPOrDomain via = 1;</code>
     */
    public Builder clearVia() {
      if (viaBuilder_ == null) {
        via_ = null;
        onChanged();
      } else {
        via_ = null;
        viaBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Send traffic through the given IP. Only IP is allowed.
     * </pre>
     *
     * <code>optional .v2ray.core.common.net.IPOrDomain via = 1;</code>
     */
    public com.v2ray.core.common.net.IPOrDomain.Builder getViaBuilder() {
      
      onChanged();
      return getViaFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Send traffic through the given IP. Only IP is allowed.
     * </pre>
     *
     * <code>optional .v2ray.core.common.net.IPOrDomain via = 1;</code>
     */
    public com.v2ray.core.common.net.IPOrDomainOrBuilder getViaOrBuilder() {
      if (viaBuilder_ != null) {
        return viaBuilder_.getMessageOrBuilder();
      } else {
        return via_ == null ?
            com.v2ray.core.common.net.IPOrDomain.getDefaultInstance() : via_;
      }
    }
    /**
     * <pre>
     * Send traffic through the given IP. Only IP is allowed.
     * </pre>
     *
     * <code>optional .v2ray.core.common.net.IPOrDomain via = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.net.IPOrDomain, com.v2ray.core.common.net.IPOrDomain.Builder, com.v2ray.core.common.net.IPOrDomainOrBuilder> 
        getViaFieldBuilder() {
      if (viaBuilder_ == null) {
        viaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.v2ray.core.common.net.IPOrDomain, com.v2ray.core.common.net.IPOrDomain.Builder, com.v2ray.core.common.net.IPOrDomainOrBuilder>(
                getVia(),
                getParentForChildren(),
                isClean());
        via_ = null;
      }
      return viaBuilder_;
    }

    private com.v2ray.core.transport.internet.StreamConfig streamSettings_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.transport.internet.StreamConfig, com.v2ray.core.transport.internet.StreamConfig.Builder, com.v2ray.core.transport.internet.StreamConfigOrBuilder> streamSettingsBuilder_;
    /**
     * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 2;</code>
     */
    public boolean hasStreamSettings() {
      return streamSettingsBuilder_ != null || streamSettings_ != null;
    }
    /**
     * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 2;</code>
     */
    public com.v2ray.core.transport.internet.StreamConfig getStreamSettings() {
      if (streamSettingsBuilder_ == null) {
        return streamSettings_ == null ? com.v2ray.core.transport.internet.StreamConfig.getDefaultInstance() : streamSettings_;
      } else {
        return streamSettingsBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 2;</code>
     */
    public Builder setStreamSettings(com.v2ray.core.transport.internet.StreamConfig value) {
      if (streamSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        streamSettings_ = value;
        onChanged();
      } else {
        streamSettingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 2;</code>
     */
    public Builder setStreamSettings(
        com.v2ray.core.transport.internet.StreamConfig.Builder builderForValue) {
      if (streamSettingsBuilder_ == null) {
        streamSettings_ = builderForValue.build();
        onChanged();
      } else {
        streamSettingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 2;</code>
     */
    public Builder mergeStreamSettings(com.v2ray.core.transport.internet.StreamConfig value) {
      if (streamSettingsBuilder_ == null) {
        if (streamSettings_ != null) {
          streamSettings_ =
            com.v2ray.core.transport.internet.StreamConfig.newBuilder(streamSettings_).mergeFrom(value).buildPartial();
        } else {
          streamSettings_ = value;
        }
        onChanged();
      } else {
        streamSettingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 2;</code>
     */
    public Builder clearStreamSettings() {
      if (streamSettingsBuilder_ == null) {
        streamSettings_ = null;
        onChanged();
      } else {
        streamSettings_ = null;
        streamSettingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 2;</code>
     */
    public com.v2ray.core.transport.internet.StreamConfig.Builder getStreamSettingsBuilder() {
      
      onChanged();
      return getStreamSettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 2;</code>
     */
    public com.v2ray.core.transport.internet.StreamConfigOrBuilder getStreamSettingsOrBuilder() {
      if (streamSettingsBuilder_ != null) {
        return streamSettingsBuilder_.getMessageOrBuilder();
      } else {
        return streamSettings_ == null ?
            com.v2ray.core.transport.internet.StreamConfig.getDefaultInstance() : streamSettings_;
      }
    }
    /**
     * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.transport.internet.StreamConfig, com.v2ray.core.transport.internet.StreamConfig.Builder, com.v2ray.core.transport.internet.StreamConfigOrBuilder> 
        getStreamSettingsFieldBuilder() {
      if (streamSettingsBuilder_ == null) {
        streamSettingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.v2ray.core.transport.internet.StreamConfig, com.v2ray.core.transport.internet.StreamConfig.Builder, com.v2ray.core.transport.internet.StreamConfigOrBuilder>(
                getStreamSettings(),
                getParentForChildren(),
                isClean());
        streamSettings_ = null;
      }
      return streamSettingsBuilder_;
    }

    private com.v2ray.core.transport.internet.ProxyConfig proxySettings_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.transport.internet.ProxyConfig, com.v2ray.core.transport.internet.ProxyConfig.Builder, com.v2ray.core.transport.internet.ProxyConfigOrBuilder> proxySettingsBuilder_;
    /**
     * <code>optional .v2ray.core.transport.internet.ProxyConfig proxy_settings = 3;</code>
     */
    public boolean hasProxySettings() {
      return proxySettingsBuilder_ != null || proxySettings_ != null;
    }
    /**
     * <code>optional .v2ray.core.transport.internet.ProxyConfig proxy_settings = 3;</code>
     */
    public com.v2ray.core.transport.internet.ProxyConfig getProxySettings() {
      if (proxySettingsBuilder_ == null) {
        return proxySettings_ == null ? com.v2ray.core.transport.internet.ProxyConfig.getDefaultInstance() : proxySettings_;
      } else {
        return proxySettingsBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .v2ray.core.transport.internet.ProxyConfig proxy_settings = 3;</code>
     */
    public Builder setProxySettings(com.v2ray.core.transport.internet.ProxyConfig value) {
      if (proxySettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        proxySettings_ = value;
        onChanged();
      } else {
        proxySettingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.transport.internet.ProxyConfig proxy_settings = 3;</code>
     */
    public Builder setProxySettings(
        com.v2ray.core.transport.internet.ProxyConfig.Builder builderForValue) {
      if (proxySettingsBuilder_ == null) {
        proxySettings_ = builderForValue.build();
        onChanged();
      } else {
        proxySettingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.transport.internet.ProxyConfig proxy_settings = 3;</code>
     */
    public Builder mergeProxySettings(com.v2ray.core.transport.internet.ProxyConfig value) {
      if (proxySettingsBuilder_ == null) {
        if (proxySettings_ != null) {
          proxySettings_ =
            com.v2ray.core.transport.internet.ProxyConfig.newBuilder(proxySettings_).mergeFrom(value).buildPartial();
        } else {
          proxySettings_ = value;
        }
        onChanged();
      } else {
        proxySettingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.transport.internet.ProxyConfig proxy_settings = 3;</code>
     */
    public Builder clearProxySettings() {
      if (proxySettingsBuilder_ == null) {
        proxySettings_ = null;
        onChanged();
      } else {
        proxySettings_ = null;
        proxySettingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .v2ray.core.transport.internet.ProxyConfig proxy_settings = 3;</code>
     */
    public com.v2ray.core.transport.internet.ProxyConfig.Builder getProxySettingsBuilder() {
      
      onChanged();
      return getProxySettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .v2ray.core.transport.internet.ProxyConfig proxy_settings = 3;</code>
     */
    public com.v2ray.core.transport.internet.ProxyConfigOrBuilder getProxySettingsOrBuilder() {
      if (proxySettingsBuilder_ != null) {
        return proxySettingsBuilder_.getMessageOrBuilder();
      } else {
        return proxySettings_ == null ?
            com.v2ray.core.transport.internet.ProxyConfig.getDefaultInstance() : proxySettings_;
      }
    }
    /**
     * <code>optional .v2ray.core.transport.internet.ProxyConfig proxy_settings = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.transport.internet.ProxyConfig, com.v2ray.core.transport.internet.ProxyConfig.Builder, com.v2ray.core.transport.internet.ProxyConfigOrBuilder> 
        getProxySettingsFieldBuilder() {
      if (proxySettingsBuilder_ == null) {
        proxySettingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.v2ray.core.transport.internet.ProxyConfig, com.v2ray.core.transport.internet.ProxyConfig.Builder, com.v2ray.core.transport.internet.ProxyConfigOrBuilder>(
                getProxySettings(),
                getParentForChildren(),
                isClean());
        proxySettings_ = null;
      }
      return proxySettingsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:v2ray.core.app.proxyman.SenderConfig)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.app.proxyman.SenderConfig)
  private static final com.v2ray.core.app.proxyman.SenderConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.v2ray.core.app.proxyman.SenderConfig();
  }

  public static com.v2ray.core.app.proxyman.SenderConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SenderConfig>
      PARSER = new com.google.protobuf.AbstractParser<SenderConfig>() {
    public SenderConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SenderConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SenderConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SenderConfig> getParserForType() {
    return PARSER;
  }

  public com.v2ray.core.app.proxyman.SenderConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

