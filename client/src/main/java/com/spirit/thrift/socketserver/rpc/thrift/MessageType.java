package com.spirit.thrift.socketserver.rpc.thrift;
/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum MessageType implements org.apache.thrift.TEnum {
  MT_HELLO_REQ(100),
  MT_HELLO_RES(101),
  MT_HELLO_NOTIFY(102),
  MT_KEEPALIVE_REQ(103),
  MT_KEEPALIVE_RES(104);

  private final int value;

  private MessageType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static MessageType findByValue(int value) { 
    switch (value) {
      case 100:
        return MT_HELLO_REQ;
      case 101:
        return MT_HELLO_RES;
      case 102:
        return MT_HELLO_NOTIFY;
      case 103:
        return MT_KEEPALIVE_REQ;
      case 104:
        return MT_KEEPALIVE_RES;
      default:
        return null;
    }
  }
}
