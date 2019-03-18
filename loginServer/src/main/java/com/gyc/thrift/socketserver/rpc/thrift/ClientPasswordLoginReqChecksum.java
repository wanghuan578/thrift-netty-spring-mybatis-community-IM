package com.gyc.thrift.socketserver.rpc.thrift;
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

public class ClientPasswordLoginReqChecksum implements TBase<ClientPasswordLoginReqChecksum, ClientPasswordLoginReqChecksum._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ClientPasswordLoginReqChecksum");

  private static final TField LOGNAME_FIELD_DESC = new TField("logname", TType.STRING, (short)1);
  private static final TField PASSWORD_FIELD_DESC = new TField("password", TType.STRING, (short)2);
  private static final TField CLIENT_RANDOM_FIELD_DESC = new TField("client_random", TType.I64, (short)3);
  private static final TField SERVER_RANDOM_FIELD_DESC = new TField("server_random", TType.I64, (short)4);

  public String logname;
  public String password;
  public long client_random;
  public long server_random;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    LOGNAME((short)1, "logname"),
    PASSWORD((short)2, "password"),
    CLIENT_RANDOM((short)3, "client_random"),
    SERVER_RANDOM((short)4, "server_random");

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
        case 1: // LOGNAME
          return LOGNAME;
        case 2: // PASSWORD
          return PASSWORD;
        case 3: // CLIENT_RANDOM
          return CLIENT_RANDOM;
        case 4: // SERVER_RANDOM
          return SERVER_RANDOM;
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
  private static final int __CLIENT_RANDOM_ISSET_ID = 0;
  private static final int __SERVER_RANDOM_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOGNAME, new FieldMetaData("logname", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.PASSWORD, new FieldMetaData("password", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.CLIENT_RANDOM, new FieldMetaData("client_random", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.SERVER_RANDOM, new FieldMetaData("server_random", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ClientPasswordLoginReqChecksum.class, metaDataMap);
  }

  public ClientPasswordLoginReqChecksum() {
  }

  public ClientPasswordLoginReqChecksum(
    String logname,
    String password,
    long client_random,
    long server_random)
  {
    this();
    this.logname = logname;
    this.password = password;
    this.client_random = client_random;
    setClient_randomIsSet(true);
    this.server_random = server_random;
    setServer_randomIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClientPasswordLoginReqChecksum(ClientPasswordLoginReqChecksum other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetLogname()) {
      this.logname = other.logname;
    }
    if (other.isSetPassword()) {
      this.password = other.password;
    }
    this.client_random = other.client_random;
    this.server_random = other.server_random;
  }

  public ClientPasswordLoginReqChecksum deepCopy() {
    return new ClientPasswordLoginReqChecksum(this);
  }

  @Override
  public void clear() {
    this.logname = null;
    this.password = null;
    setClient_randomIsSet(false);
    this.client_random = 0;
    setServer_randomIsSet(false);
    this.server_random = 0;
  }

  public String getLogname() {
    return this.logname;
  }

  public ClientPasswordLoginReqChecksum setLogname(String logname) {
    this.logname = logname;
    return this;
  }

  public void unsetLogname() {
    this.logname = null;
  }

  /** Returns true if field logname is set (has been asigned a value) and false otherwise */
  public boolean isSetLogname() {
    return this.logname != null;
  }

  public void setLognameIsSet(boolean value) {
    if (!value) {
      this.logname = null;
    }
  }

  public String getPassword() {
    return this.password;
  }

  public ClientPasswordLoginReqChecksum setPassword(String password) {
    this.password = password;
    return this;
  }

  public void unsetPassword() {
    this.password = null;
  }

  /** Returns true if field password is set (has been asigned a value) and false otherwise */
  public boolean isSetPassword() {
    return this.password != null;
  }

  public void setPasswordIsSet(boolean value) {
    if (!value) {
      this.password = null;
    }
  }

  public long getClient_random() {
    return this.client_random;
  }

  public ClientPasswordLoginReqChecksum setClient_random(long client_random) {
    this.client_random = client_random;
    setClient_randomIsSet(true);
    return this;
  }

  public void unsetClient_random() {
    __isset_bit_vector.clear(__CLIENT_RANDOM_ISSET_ID);
  }

  /** Returns true if field client_random is set (has been asigned a value) and false otherwise */
  public boolean isSetClient_random() {
    return __isset_bit_vector.get(__CLIENT_RANDOM_ISSET_ID);
  }

  public void setClient_randomIsSet(boolean value) {
    __isset_bit_vector.set(__CLIENT_RANDOM_ISSET_ID, value);
  }

  public long getServer_random() {
    return this.server_random;
  }

  public ClientPasswordLoginReqChecksum setServer_random(long server_random) {
    this.server_random = server_random;
    setServer_randomIsSet(true);
    return this;
  }

  public void unsetServer_random() {
    __isset_bit_vector.clear(__SERVER_RANDOM_ISSET_ID);
  }

  /** Returns true if field server_random is set (has been asigned a value) and false otherwise */
  public boolean isSetServer_random() {
    return __isset_bit_vector.get(__SERVER_RANDOM_ISSET_ID);
  }

  public void setServer_randomIsSet(boolean value) {
    __isset_bit_vector.set(__SERVER_RANDOM_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LOGNAME:
      if (value == null) {
        unsetLogname();
      } else {
        setLogname((String)value);
      }
      break;

    case PASSWORD:
      if (value == null) {
        unsetPassword();
      } else {
        setPassword((String)value);
      }
      break;

    case CLIENT_RANDOM:
      if (value == null) {
        unsetClient_random();
      } else {
        setClient_random((Long)value);
      }
      break;

    case SERVER_RANDOM:
      if (value == null) {
        unsetServer_random();
      } else {
        setServer_random((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LOGNAME:
      return getLogname();

    case PASSWORD:
      return getPassword();

    case CLIENT_RANDOM:
      return new Long(getClient_random());

    case SERVER_RANDOM:
      return new Long(getServer_random());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LOGNAME:
      return isSetLogname();
    case PASSWORD:
      return isSetPassword();
    case CLIENT_RANDOM:
      return isSetClient_random();
    case SERVER_RANDOM:
      return isSetServer_random();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ClientPasswordLoginReqChecksum)
      return this.equals((ClientPasswordLoginReqChecksum)that);
    return false;
  }

  public boolean equals(ClientPasswordLoginReqChecksum that) {
    if (that == null)
      return false;

    boolean this_present_logname = true && this.isSetLogname();
    boolean that_present_logname = true && that.isSetLogname();
    if (this_present_logname || that_present_logname) {
      if (!(this_present_logname && that_present_logname))
        return false;
      if (!this.logname.equals(that.logname))
        return false;
    }

    boolean this_present_password = true && this.isSetPassword();
    boolean that_present_password = true && that.isSetPassword();
    if (this_present_password || that_present_password) {
      if (!(this_present_password && that_present_password))
        return false;
      if (!this.password.equals(that.password))
        return false;
    }

    boolean this_present_client_random = true;
    boolean that_present_client_random = true;
    if (this_present_client_random || that_present_client_random) {
      if (!(this_present_client_random && that_present_client_random))
        return false;
      if (this.client_random != that.client_random)
        return false;
    }

    boolean this_present_server_random = true;
    boolean that_present_server_random = true;
    if (this_present_server_random || that_present_server_random) {
      if (!(this_present_server_random && that_present_server_random))
        return false;
      if (this.server_random != that.server_random)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ClientPasswordLoginReqChecksum other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ClientPasswordLoginReqChecksum typedOther = (ClientPasswordLoginReqChecksum)other;

    lastComparison = Boolean.valueOf(isSetLogname()).compareTo(typedOther.isSetLogname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLogname()) {
      lastComparison = TBaseHelper.compareTo(this.logname, typedOther.logname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPassword()).compareTo(typedOther.isSetPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPassword()) {
      lastComparison = TBaseHelper.compareTo(this.password, typedOther.password);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClient_random()).compareTo(typedOther.isSetClient_random());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClient_random()) {
      lastComparison = TBaseHelper.compareTo(this.client_random, typedOther.client_random);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetServer_random()).compareTo(typedOther.isSetServer_random());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServer_random()) {
      lastComparison = TBaseHelper.compareTo(this.server_random, typedOther.server_random);
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
        case 1: // LOGNAME
          if (field.type == TType.STRING) {
            this.logname = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // PASSWORD
          if (field.type == TType.STRING) {
            this.password = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // CLIENT_RANDOM
          if (field.type == TType.I64) {
            this.client_random = iprot.readI64();
            setClient_randomIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // SERVER_RANDOM
          if (field.type == TType.I64) {
            this.server_random = iprot.readI64();
            setServer_randomIsSet(true);
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
    if (this.logname != null) {
      oprot.writeFieldBegin(LOGNAME_FIELD_DESC);
      oprot.writeString(this.logname);
      oprot.writeFieldEnd();
    }
    if (this.password != null) {
      oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
      oprot.writeString(this.password);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(CLIENT_RANDOM_FIELD_DESC);
    oprot.writeI64(this.client_random);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(SERVER_RANDOM_FIELD_DESC);
    oprot.writeI64(this.server_random);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ClientPasswordLoginReqChecksum(");
    boolean first = true;

    sb.append("logname:");
    if (this.logname == null) {
      sb.append("null");
    } else {
      sb.append(this.logname);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("password:");
    if (this.password == null) {
      sb.append("null");
    } else {
      sb.append(this.password);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("client_random:");
    sb.append(this.client_random);
    first = false;
    if (!first) sb.append(", ");
    sb.append("server_random:");
    sb.append(this.server_random);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

