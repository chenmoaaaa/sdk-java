// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/transport/internet/headers/srtp/config.proto

package com.v2ray.core.transport.internet.headers.srtp;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.transport.internet.headers.srtp.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint32 version = 1;</code>
   */
  int getVersion();

  /**
   * <code>optional bool padding = 2;</code>
   */
  boolean getPadding();

  /**
   * <code>optional bool extension = 3;</code>
   */
  boolean getExtension();

  /**
   * <code>optional uint32 csrc_count = 4;</code>
   */
  int getCsrcCount();

  /**
   * <code>optional bool marker = 5;</code>
   */
  boolean getMarker();

  /**
   * <code>optional uint32 payload_type = 6;</code>
   */
  int getPayloadType();
}
