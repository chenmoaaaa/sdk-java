// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/log/config.proto

package com.v2ray.core.app.log;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.app.log.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .v2ray.core.app.log.LogType error_log_type = 1;</code>
   */
  int getErrorLogTypeValue();
  /**
   * <code>optional .v2ray.core.app.log.LogType error_log_type = 1;</code>
   */
  com.v2ray.core.app.log.LogType getErrorLogType();

  /**
   * <code>optional .v2ray.core.app.log.LogLevel error_log_level = 2;</code>
   */
  int getErrorLogLevelValue();
  /**
   * <code>optional .v2ray.core.app.log.LogLevel error_log_level = 2;</code>
   */
  com.v2ray.core.app.log.LogLevel getErrorLogLevel();

  /**
   * <code>optional string error_log_path = 3;</code>
   */
  java.lang.String getErrorLogPath();
  /**
   * <code>optional string error_log_path = 3;</code>
   */
  com.google.protobuf.ByteString
      getErrorLogPathBytes();

  /**
   * <code>optional .v2ray.core.app.log.LogType access_log_type = 4;</code>
   */
  int getAccessLogTypeValue();
  /**
   * <code>optional .v2ray.core.app.log.LogType access_log_type = 4;</code>
   */
  com.v2ray.core.app.log.LogType getAccessLogType();

  /**
   * <code>optional string access_log_path = 5;</code>
   */
  java.lang.String getAccessLogPath();
  /**
   * <code>optional string access_log_path = 5;</code>
   */
  com.google.protobuf.ByteString
      getAccessLogPathBytes();
}
