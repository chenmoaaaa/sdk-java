// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/common/protocol/command.proto

package com.v2ray.core.common.protocol;

public interface AlternativeOutboundConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.common.protocol.AlternativeOutboundConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .v2ray.core.common.serial.TypedMessage settings = 1;</code>
   */
  boolean hasSettings();
  /**
   * <code>optional .v2ray.core.common.serial.TypedMessage settings = 1;</code>
   */
  com.v2ray.core.common.serial.TypedMessage getSettings();
  /**
   * <code>optional .v2ray.core.common.serial.TypedMessage settings = 1;</code>
   */
  com.v2ray.core.common.serial.TypedMessageOrBuilder getSettingsOrBuilder();

  /**
   * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
   */
  boolean hasStreamSettings();
  /**
   * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
   */
  com.v2ray.core.transport.internet.StreamConfig getStreamSettings();
  /**
   * <code>optional .v2ray.core.transport.internet.StreamConfig stream_settings = 3;</code>
   */
  com.v2ray.core.transport.internet.StreamConfigOrBuilder getStreamSettingsOrBuilder();
}
