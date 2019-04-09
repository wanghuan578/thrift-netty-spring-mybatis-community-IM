package com.spirit.thrift.socketserver.rpc.thrift;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class CommonRes implements TBase<CommonRes, CommonRes._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("CommonRes");

  private static final TField ERROR_CODE_FIELD_DESC = new TField("error_code", TType.I16, (short)1);
  private static final TField ERROR_TEXT_FIELD_DESC = new TField("error_text", TType.STRING, (short)2);
  private static final TField RESERVE_FIELD_DESC = new TField("reserve", TType.I32, (short)3);

  public short error_code;
  public String error_text;
  public int reserve;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    ERROR_CODE((short)1, "error_code"),
    ERROR_TEXT((short)2, "error_text"),
    RESERVE((short)3, "reserve");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ERROR_CODE
          return ERROR_CODE;
        case 2: // ERROR_TEXT
          return ERROR_TEXT;
        case 3: // RESERVE
          return RESERVE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ERROR_CODE_ISSET_ID = 0;
  private static final int __RESERVE_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERROR_CODE, new FieldMetaData("error_code", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I16)));
    tmpMap.put(_Fields.ERROR_TEXT, new FieldMetaData("error_text", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.RESERVE, new FieldMetaData("reserve", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(CommonRes.class, metaDataMap);
  }

  public CommonRes() {
  }

  public CommonRes(
    short error_code,
    String error_text,
    int reserve)
  {
    this();
    this.error_code = error_code;
    setError_codeIsSet(true);
    this.error_text = error_text;
    this.reserve = reserve;
    setReserveIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CommonRes(CommonRes other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.error_code = other.error_code;
    if (other.isSetError_text()) {
      this.error_text = other.error_text;
    }
    this.reserve = other.reserve;
  }

  public CommonRes deepCopy() {
    return new CommonRes(this);
  }

  public void clear() {
    setError_codeIsSet(false);
    this.error_code = 0;
    this.error_text = null;
    setReserveIsSet(false);
    this.reserve = 0;
  }

  public short getError_code() {
    return this.error_code;
  }

  public CommonRes setError_code(short error_code) {
    this.error_code = error_code;
    setError_codeIsSet(true);
    return this;
  }

  public void unsetError_code() {
    __isset_bit_vector.clear(__ERROR_CODE_ISSET_ID);
  }

  /** Returns true if field error_code is set (has been asigned a value) and false otherwise */
  public boolean isSetError_code() {
    return __isset_bit_vector.get(__ERROR_CODE_ISSET_ID);
  }

  public void setError_codeIsSet(boolean value) {
    __isset_bit_vector.set(__ERROR_CODE_ISSET_ID, value);
  }

  public String getError_text() {
    return this.error_text;
  }

  public CommonRes setError_text(String error_text) {
    this.error_text = error_text;
    return this;
  }

  public void unsetError_text() {
    this.error_text = null;
  }

  /** Returns true if field error_text is set (has been asigned a value) and false otherwise */
  public boolean isSetError_text() {
    return this.error_text != null;
  }

  public void setError_textIsSet(boolean value) {
    if (!value) {
      this.error_text = null;
    }
  }

  public int getReserve() {
    return this.reserve;
  }

  public CommonRes setReserve(int reserve) {
    this.reserve = reserve;
    setReserveIsSet(true);
    return this;
  }

  public void unsetReserve() {
    __isset_bit_vector.clear(__RESERVE_ISSET_ID);
  }

  /** Returns true if field reserve is set (has been asigned a value) and false otherwise */
  public boolean isSetReserve() {
    return __isset_bit_vector.get(__RESERVE_ISSET_ID);
  }

  public void setReserveIsSet(boolean value) {
    __isset_bit_vector.set(__RESERVE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ERROR_CODE:
      if (value == null) {
        unsetError_code();
      } else {
        setError_code((Short)value);
      }
      break;

    case ERROR_TEXT:
      if (value == null) {
        unsetError_text();
      } else {
        setError_text((String)value);
      }
      break;

    case RESERVE:
      if (value == null) {
        unsetReserve();
      } else {
        setReserve((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ERROR_CODE:
      return new Short(getError_code());

    case ERROR_TEXT:
      return getError_text();

    case RESERVE:
      return new Integer(getReserve());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ERROR_CODE:
      return isSetError_code();
    case ERROR_TEXT:
      return isSetError_text();
    case RESERVE:
      return isSetReserve();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CommonRes)
      return this.equals((CommonRes)that);
    return false;
  }

  public boolean equals(CommonRes that) {
    if (that == null)
      return false;

    boolean this_present_error_code = true;
    boolean that_present_error_code = true;
    if (this_present_error_code || that_present_error_code) {
      if (!(this_present_error_code && that_present_error_code))
        return false;
      if (this.error_code != that.error_code)
        return false;
    }

    boolean this_present_error_text = true && this.isSetError_text();
    boolean that_present_error_text = true && that.isSetError_text();
    if (this_present_error_text || that_present_error_text) {
      if (!(this_present_error_text && that_present_error_text))
        return false;
      if (!this.error_text.equals(that.error_text))
        return false;
    }

    boolean this_present_reserve = true;
    boolean that_present_reserve = true;
    if (this_present_reserve || that_present_reserve) {
      if (!(this_present_reserve && that_present_reserve))
        return false;
      if (this.reserve != that.reserve)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CommonRes other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CommonRes typedOther = (CommonRes)other;

    lastComparison = Boolean.valueOf(isSetError_code()).compareTo(typedOther.isSetError_code());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetError_code()) {
      lastComparison = TBaseHelper.compareTo(this.error_code, typedOther.error_code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetError_text()).compareTo(typedOther.isSetError_text());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetError_text()) {
      lastComparison = TBaseHelper.compareTo(this.error_text, typedOther.error_text);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReserve()).compareTo(typedOther.isSetReserve());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReserve()) {
      lastComparison = TBaseHelper.compareTo(this.reserve, typedOther.reserve);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // ERROR_CODE
          if (field.type == TType.I16) {
            this.error_code = iprot.readI16();
            setError_codeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // ERROR_TEXT
          if (field.type == TType.STRING) {
            this.error_text = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // RESERVE
          if (field.type == TType.I32) {
            this.reserve = iprot.readI32();
            setReserveIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
    oprot.writeI16(this.error_code);
    oprot.writeFieldEnd();
    if (this.error_text != null) {
      oprot.writeFieldBegin(ERROR_TEXT_FIELD_DESC);
      oprot.writeString(this.error_text);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(RESERVE_FIELD_DESC);
    oprot.writeI32(this.reserve);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CommonRes(");
    boolean first = true;

    sb.append("error_code:");
    sb.append(this.error_code);
    first = false;
    if (!first) sb.append(", ");
    sb.append("error_text:");
    if (this.error_text == null) {
      sb.append("null");
    } else {
      sb.append(this.error_text);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("reserve:");
    sb.append(this.reserve);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

