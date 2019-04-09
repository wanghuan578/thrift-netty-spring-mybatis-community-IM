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

public class ClientLoginResUserInfo implements TBase<ClientLoginResUserInfo, ClientLoginResUserInfo._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ClientLoginResUserInfo");

  private static final TField USER_ID_FIELD_DESC = new TField("user_id", TType.I32, (short)1);
  private static final TField USER_NAME_FIELD_DESC = new TField("user_name", TType.STRING, (short)2);
  private static final TField EMAIL_FIELD_DESC = new TField("email", TType.STRING, (short)3);
  private static final TField NICK_NAME_FIELD_DESC = new TField("nick_name", TType.STRING, (short)4);
  private static final TField AVATAR_URL_FIELD_DESC = new TField("avatar_url", TType.STRING, (short)5);
  private static final TField BIRTHDATE_FIELD_DESC = new TField("birthdate", TType.STRING, (short)6);
  private static final TField BASE_ROLE_ID_FIELD_DESC = new TField("base_role_id", TType.I16, (short)7);
  private static final TField DECOLOR_FIELD_DESC = new TField("decolor", TType.I32, (short)8);
  private static final TField DECOLOR_ENDTIME_FIELD_DESC = new TField("decolor_endtime", TType.I64, (short)9);
  private static final TField PRIZE_ROLE_ID_FIELD_DESC = new TField("prize_role_id", TType.I16, (short)10);
  private static final TField PRIZE_ROLE_ENDTIME_FIELD_DESC = new TField("prize_role_endtime", TType.I64, (short)11);
  private static final TField GOOD_NUMBER_FIELD_DESC = new TField("good_number", TType.I32, (short)12);
  private static final TField GOOD_NUMBER_ROLE_ID_FIELD_DESC = new TField("good_number_role_id", TType.I16, (short)13);
  private static final TField GOOD_NUMBER_ROLE_ID_STARTTIME_FIELD_DESC = new TField("good_number_role_id_starttime", TType.I64, (short)14);
  private static final TField GOOD_NUMBER_ROLE_ID_ENDTIME_FIELD_DESC = new TField("good_number_role_id_endtime", TType.I64, (short)15);
  private static final TField KMONEY_FIELD_DESC = new TField("kmoney", TType.I64, (short)16);
  private static final TField GIFTMONEY_FIELD_DESC = new TField("giftmoney", TType.I64, (short)17);
  private static final TField VIDEO_GIFT_ID_FIELD_DESC = new TField("video_gift_id", TType.I32, (short)18);
  private static final TField VIDEO_GIFT_END_TIME_FIELD_DESC = new TField("video_gift_end_time", TType.I64, (short)19);
  private static final TField STAMP_GIFT_ID_FIELD_DESC = new TField("stamp_gift_id", TType.I32, (short)20);
  private static final TField STAMP_GIFT_END_TIME_FIELD_DESC = new TField("stamp_gift_end_time", TType.I64, (short)21);
  private static final TField EXP_LEVEL_FIELD_DESC = new TField("exp_level", TType.I16, (short)22);
  private static final TField EXP_VALUE_FIELD_DESC = new TField("exp_value", TType.I32, (short)23);
  private static final TField EXP_RANK_FIELD_DESC = new TField("exp_rank", TType.I32, (short)24);
  private static final TField GENDER_FIELD_DESC = new TField("gender", TType.BYTE, (short)25);
  private static final TField CHINESE_ZODIAC_FIELD_DESC = new TField("chinese_zodiac", TType.STRING, (short)26);
  private static final TField ZODIAC_FIELD_DESC = new TField("zodiac", TType.STRING, (short)27);
  private static final TField BLOOD_TYPE_FIELD_DESC = new TField("blood_type", TType.STRING, (short)28);
  private static final TField INTEREST_FIELD_DESC = new TField("interest", TType.STRING, (short)29);
  private static final TField CHARACTER_FIELD_DESC = new TField("character", TType.STRING, (short)30);
  private static final TField SIGN_NAME_FIELD_DESC = new TField("sign_name", TType.STRING, (short)31);
  private static final TField CHEST_FIELD_DESC = new TField("chest", TType.I16, (short)32);
  private static final TField WAIST_FIELD_DESC = new TField("waist", TType.I16, (short)33);
  private static final TField HIP_FIELD_DESC = new TField("hip", TType.I16, (short)34);
  private static final TField ADDRESS_FIELD_DESC = new TField("address", TType.STRING, (short)35);
  private static final TField SESSION_ID_FIELD_DESC = new TField("session_id", TType.STRING, (short)36);
  private static final TField SESSION_KEY_FIELD_DESC = new TField("session_key", TType.STRING, (short)37);
  private static final TField TICKET_IV_FIELD_DESC = new TField("ticket_iv", TType.STRING, (short)38);
  private static final TField CLIENT_IP_FIELD_DESC = new TField("client_ip", TType.STRING, (short)39);

  public int user_id;
  public String user_name;
  public String email;
  public String nick_name;
  public String avatar_url;
  public String birthdate;
  public short base_role_id;
  public int decolor;
  public long decolor_endtime;
  public short prize_role_id;
  public long prize_role_endtime;
  public int good_number;
  public short good_number_role_id;
  public long good_number_role_id_starttime;
  public long good_number_role_id_endtime;
  public long kmoney;
  public long giftmoney;
  public int video_gift_id;
  public long video_gift_end_time;
  public int stamp_gift_id;
  public long stamp_gift_end_time;
  public short exp_level;
  public int exp_value;
  public int exp_rank;
  public byte gender;
  public String chinese_zodiac;
  public String zodiac;
  public String blood_type;
  public String interest;
  public String character;
  public String sign_name;
  public short chest;
  public short waist;
  public short hip;
  public String address;
  public String session_id;
  public String session_key;
  public String ticket_iv;
  public String client_ip;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    USER_ID((short)1, "user_id"),
    USER_NAME((short)2, "user_name"),
    EMAIL((short)3, "email"),
    NICK_NAME((short)4, "nick_name"),
    AVATAR_URL((short)5, "avatar_url"),
    BIRTHDATE((short)6, "birthdate"),
    BASE_ROLE_ID((short)7, "base_role_id"),
    DECOLOR((short)8, "decolor"),
    DECOLOR_ENDTIME((short)9, "decolor_endtime"),
    PRIZE_ROLE_ID((short)10, "prize_role_id"),
    PRIZE_ROLE_ENDTIME((short)11, "prize_role_endtime"),
    GOOD_NUMBER((short)12, "good_number"),
    GOOD_NUMBER_ROLE_ID((short)13, "good_number_role_id"),
    GOOD_NUMBER_ROLE_ID_STARTTIME((short)14, "good_number_role_id_starttime"),
    GOOD_NUMBER_ROLE_ID_ENDTIME((short)15, "good_number_role_id_endtime"),
    KMONEY((short)16, "kmoney"),
    GIFTMONEY((short)17, "giftmoney"),
    VIDEO_GIFT_ID((short)18, "video_gift_id"),
    VIDEO_GIFT_END_TIME((short)19, "video_gift_end_time"),
    STAMP_GIFT_ID((short)20, "stamp_gift_id"),
    STAMP_GIFT_END_TIME((short)21, "stamp_gift_end_time"),
    EXP_LEVEL((short)22, "exp_level"),
    EXP_VALUE((short)23, "exp_value"),
    EXP_RANK((short)24, "exp_rank"),
    GENDER((short)25, "gender"),
    CHINESE_ZODIAC((short)26, "chinese_zodiac"),
    ZODIAC((short)27, "zodiac"),
    BLOOD_TYPE((short)28, "blood_type"),
    INTEREST((short)29, "interest"),
    CHARACTER((short)30, "character"),
    SIGN_NAME((short)31, "sign_name"),
    CHEST((short)32, "chest"),
    WAIST((short)33, "waist"),
    HIP((short)34, "hip"),
    ADDRESS((short)35, "address"),
    SESSION_ID((short)36, "session_id"),
    SESSION_KEY((short)37, "session_key"),
    TICKET_IV((short)38, "ticket_iv"),
    CLIENT_IP((short)39, "client_ip");

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
        case 1: // USER_ID
          return USER_ID;
        case 2: // USER_NAME
          return USER_NAME;
        case 3: // EMAIL
          return EMAIL;
        case 4: // NICK_NAME
          return NICK_NAME;
        case 5: // AVATAR_URL
          return AVATAR_URL;
        case 6: // BIRTHDATE
          return BIRTHDATE;
        case 7: // BASE_ROLE_ID
          return BASE_ROLE_ID;
        case 8: // DECOLOR
          return DECOLOR;
        case 9: // DECOLOR_ENDTIME
          return DECOLOR_ENDTIME;
        case 10: // PRIZE_ROLE_ID
          return PRIZE_ROLE_ID;
        case 11: // PRIZE_ROLE_ENDTIME
          return PRIZE_ROLE_ENDTIME;
        case 12: // GOOD_NUMBER
          return GOOD_NUMBER;
        case 13: // GOOD_NUMBER_ROLE_ID
          return GOOD_NUMBER_ROLE_ID;
        case 14: // GOOD_NUMBER_ROLE_ID_STARTTIME
          return GOOD_NUMBER_ROLE_ID_STARTTIME;
        case 15: // GOOD_NUMBER_ROLE_ID_ENDTIME
          return GOOD_NUMBER_ROLE_ID_ENDTIME;
        case 16: // KMONEY
          return KMONEY;
        case 17: // GIFTMONEY
          return GIFTMONEY;
        case 18: // VIDEO_GIFT_ID
          return VIDEO_GIFT_ID;
        case 19: // VIDEO_GIFT_END_TIME
          return VIDEO_GIFT_END_TIME;
        case 20: // STAMP_GIFT_ID
          return STAMP_GIFT_ID;
        case 21: // STAMP_GIFT_END_TIME
          return STAMP_GIFT_END_TIME;
        case 22: // EXP_LEVEL
          return EXP_LEVEL;
        case 23: // EXP_VALUE
          return EXP_VALUE;
        case 24: // EXP_RANK
          return EXP_RANK;
        case 25: // GENDER
          return GENDER;
        case 26: // CHINESE_ZODIAC
          return CHINESE_ZODIAC;
        case 27: // ZODIAC
          return ZODIAC;
        case 28: // BLOOD_TYPE
          return BLOOD_TYPE;
        case 29: // INTEREST
          return INTEREST;
        case 30: // CHARACTER
          return CHARACTER;
        case 31: // SIGN_NAME
          return SIGN_NAME;
        case 32: // CHEST
          return CHEST;
        case 33: // WAIST
          return WAIST;
        case 34: // HIP
          return HIP;
        case 35: // ADDRESS
          return ADDRESS;
        case 36: // SESSION_ID
          return SESSION_ID;
        case 37: // SESSION_KEY
          return SESSION_KEY;
        case 38: // TICKET_IV
          return TICKET_IV;
        case 39: // CLIENT_IP
          return CLIENT_IP;
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
  private static final int __USER_ID_ISSET_ID = 0;
  private static final int __BASE_ROLE_ID_ISSET_ID = 1;
  private static final int __DECOLOR_ISSET_ID = 2;
  private static final int __DECOLOR_ENDTIME_ISSET_ID = 3;
  private static final int __PRIZE_ROLE_ID_ISSET_ID = 4;
  private static final int __PRIZE_ROLE_ENDTIME_ISSET_ID = 5;
  private static final int __GOOD_NUMBER_ISSET_ID = 6;
  private static final int __GOOD_NUMBER_ROLE_ID_ISSET_ID = 7;
  private static final int __GOOD_NUMBER_ROLE_ID_STARTTIME_ISSET_ID = 8;
  private static final int __GOOD_NUMBER_ROLE_ID_ENDTIME_ISSET_ID = 9;
  private static final int __KMONEY_ISSET_ID = 10;
  private static final int __GIFTMONEY_ISSET_ID = 11;
  private static final int __VIDEO_GIFT_ID_ISSET_ID = 12;
  private static final int __VIDEO_GIFT_END_TIME_ISSET_ID = 13;
  private static final int __STAMP_GIFT_ID_ISSET_ID = 14;
  private static final int __STAMP_GIFT_END_TIME_ISSET_ID = 15;
  private static final int __EXP_LEVEL_ISSET_ID = 16;
  private static final int __EXP_VALUE_ISSET_ID = 17;
  private static final int __EXP_RANK_ISSET_ID = 18;
  private static final int __GENDER_ISSET_ID = 19;
  private static final int __CHEST_ISSET_ID = 20;
  private static final int __WAIST_ISSET_ID = 21;
  private static final int __HIP_ISSET_ID = 22;
  private BitSet __isset_bit_vector = new BitSet(23);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_ID, new FieldMetaData("user_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.USER_NAME, new FieldMetaData("user_name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.EMAIL, new FieldMetaData("email", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.NICK_NAME, new FieldMetaData("nick_name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.AVATAR_URL, new FieldMetaData("avatar_url", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.BIRTHDATE, new FieldMetaData("birthdate", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.BASE_ROLE_ID, new FieldMetaData("base_role_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I16)));
    tmpMap.put(_Fields.DECOLOR, new FieldMetaData("decolor", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.DECOLOR_ENDTIME, new FieldMetaData("decolor_endtime", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.PRIZE_ROLE_ID, new FieldMetaData("prize_role_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I16)));
    tmpMap.put(_Fields.PRIZE_ROLE_ENDTIME, new FieldMetaData("prize_role_endtime", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.GOOD_NUMBER, new FieldMetaData("good_number", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.GOOD_NUMBER_ROLE_ID, new FieldMetaData("good_number_role_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I16)));
    tmpMap.put(_Fields.GOOD_NUMBER_ROLE_ID_STARTTIME, new FieldMetaData("good_number_role_id_starttime", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.GOOD_NUMBER_ROLE_ID_ENDTIME, new FieldMetaData("good_number_role_id_endtime", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.KMONEY, new FieldMetaData("kmoney", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.GIFTMONEY, new FieldMetaData("giftmoney", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.VIDEO_GIFT_ID, new FieldMetaData("video_gift_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.VIDEO_GIFT_END_TIME, new FieldMetaData("video_gift_end_time", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.STAMP_GIFT_ID, new FieldMetaData("stamp_gift_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.STAMP_GIFT_END_TIME, new FieldMetaData("stamp_gift_end_time", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.EXP_LEVEL, new FieldMetaData("exp_level", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I16)));
    tmpMap.put(_Fields.EXP_VALUE, new FieldMetaData("exp_value", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.EXP_RANK, new FieldMetaData("exp_rank", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.GENDER, new FieldMetaData("gender", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BYTE)));
    tmpMap.put(_Fields.CHINESE_ZODIAC, new FieldMetaData("chinese_zodiac", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.ZODIAC, new FieldMetaData("zodiac", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.BLOOD_TYPE, new FieldMetaData("blood_type", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.INTEREST, new FieldMetaData("interest", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.CHARACTER, new FieldMetaData("character", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.SIGN_NAME, new FieldMetaData("sign_name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.CHEST, new FieldMetaData("chest", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I16)));
    tmpMap.put(_Fields.WAIST, new FieldMetaData("waist", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I16)));
    tmpMap.put(_Fields.HIP, new FieldMetaData("hip", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I16)));
    tmpMap.put(_Fields.ADDRESS, new FieldMetaData("address", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.SESSION_ID, new FieldMetaData("session_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.SESSION_KEY, new FieldMetaData("session_key", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.TICKET_IV, new FieldMetaData("ticket_iv", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.CLIENT_IP, new FieldMetaData("client_ip", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ClientLoginResUserInfo.class, metaDataMap);
  }

  public ClientLoginResUserInfo() {
  }

  public ClientLoginResUserInfo(
    int user_id,
    String user_name,
    String email,
    String nick_name,
    String avatar_url,
    String birthdate,
    short base_role_id,
    int decolor,
    long decolor_endtime,
    short prize_role_id,
    long prize_role_endtime,
    int good_number,
    short good_number_role_id,
    long good_number_role_id_starttime,
    long good_number_role_id_endtime,
    long kmoney,
    long giftmoney,
    int video_gift_id,
    long video_gift_end_time,
    int stamp_gift_id,
    long stamp_gift_end_time,
    short exp_level,
    int exp_value,
    int exp_rank,
    byte gender,
    String chinese_zodiac,
    String zodiac,
    String blood_type,
    String interest,
    String character,
    String sign_name,
    short chest,
    short waist,
    short hip,
    String address,
    String session_id,
    String session_key,
    String ticket_iv,
    String client_ip)
  {
    this();
    this.user_id = user_id;
    setUser_idIsSet(true);
    this.user_name = user_name;
    this.email = email;
    this.nick_name = nick_name;
    this.avatar_url = avatar_url;
    this.birthdate = birthdate;
    this.base_role_id = base_role_id;
    setBase_role_idIsSet(true);
    this.decolor = decolor;
    setDecolorIsSet(true);
    this.decolor_endtime = decolor_endtime;
    setDecolor_endtimeIsSet(true);
    this.prize_role_id = prize_role_id;
    setPrize_role_idIsSet(true);
    this.prize_role_endtime = prize_role_endtime;
    setPrize_role_endtimeIsSet(true);
    this.good_number = good_number;
    setGood_numberIsSet(true);
    this.good_number_role_id = good_number_role_id;
    setGood_number_role_idIsSet(true);
    this.good_number_role_id_starttime = good_number_role_id_starttime;
    setGood_number_role_id_starttimeIsSet(true);
    this.good_number_role_id_endtime = good_number_role_id_endtime;
    setGood_number_role_id_endtimeIsSet(true);
    this.kmoney = kmoney;
    setKmoneyIsSet(true);
    this.giftmoney = giftmoney;
    setGiftmoneyIsSet(true);
    this.video_gift_id = video_gift_id;
    setVideo_gift_idIsSet(true);
    this.video_gift_end_time = video_gift_end_time;
    setVideo_gift_end_timeIsSet(true);
    this.stamp_gift_id = stamp_gift_id;
    setStamp_gift_idIsSet(true);
    this.stamp_gift_end_time = stamp_gift_end_time;
    setStamp_gift_end_timeIsSet(true);
    this.exp_level = exp_level;
    setExp_levelIsSet(true);
    this.exp_value = exp_value;
    setExp_valueIsSet(true);
    this.exp_rank = exp_rank;
    setExp_rankIsSet(true);
    this.gender = gender;
    setGenderIsSet(true);
    this.chinese_zodiac = chinese_zodiac;
    this.zodiac = zodiac;
    this.blood_type = blood_type;
    this.interest = interest;
    this.character = character;
    this.sign_name = sign_name;
    this.chest = chest;
    setChestIsSet(true);
    this.waist = waist;
    setWaistIsSet(true);
    this.hip = hip;
    setHipIsSet(true);
    this.address = address;
    this.session_id = session_id;
    this.session_key = session_key;
    this.ticket_iv = ticket_iv;
    this.client_ip = client_ip;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClientLoginResUserInfo(ClientLoginResUserInfo other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.user_id = other.user_id;
    if (other.isSetUser_name()) {
      this.user_name = other.user_name;
    }
    if (other.isSetEmail()) {
      this.email = other.email;
    }
    if (other.isSetNick_name()) {
      this.nick_name = other.nick_name;
    }
    if (other.isSetAvatar_url()) {
      this.avatar_url = other.avatar_url;
    }
    if (other.isSetBirthdate()) {
      this.birthdate = other.birthdate;
    }
    this.base_role_id = other.base_role_id;
    this.decolor = other.decolor;
    this.decolor_endtime = other.decolor_endtime;
    this.prize_role_id = other.prize_role_id;
    this.prize_role_endtime = other.prize_role_endtime;
    this.good_number = other.good_number;
    this.good_number_role_id = other.good_number_role_id;
    this.good_number_role_id_starttime = other.good_number_role_id_starttime;
    this.good_number_role_id_endtime = other.good_number_role_id_endtime;
    this.kmoney = other.kmoney;
    this.giftmoney = other.giftmoney;
    this.video_gift_id = other.video_gift_id;
    this.video_gift_end_time = other.video_gift_end_time;
    this.stamp_gift_id = other.stamp_gift_id;
    this.stamp_gift_end_time = other.stamp_gift_end_time;
    this.exp_level = other.exp_level;
    this.exp_value = other.exp_value;
    this.exp_rank = other.exp_rank;
    this.gender = other.gender;
    if (other.isSetChinese_zodiac()) {
      this.chinese_zodiac = other.chinese_zodiac;
    }
    if (other.isSetZodiac()) {
      this.zodiac = other.zodiac;
    }
    if (other.isSetBlood_type()) {
      this.blood_type = other.blood_type;
    }
    if (other.isSetInterest()) {
      this.interest = other.interest;
    }
    if (other.isSetCharacter()) {
      this.character = other.character;
    }
    if (other.isSetSign_name()) {
      this.sign_name = other.sign_name;
    }
    this.chest = other.chest;
    this.waist = other.waist;
    this.hip = other.hip;
    if (other.isSetAddress()) {
      this.address = other.address;
    }
    if (other.isSetSession_id()) {
      this.session_id = other.session_id;
    }
    if (other.isSetSession_key()) {
      this.session_key = other.session_key;
    }
    if (other.isSetTicket_iv()) {
      this.ticket_iv = other.ticket_iv;
    }
    if (other.isSetClient_ip()) {
      this.client_ip = other.client_ip;
    }
  }

  public ClientLoginResUserInfo deepCopy() {
    return new ClientLoginResUserInfo(this);
  }

  public void clear() {
    setUser_idIsSet(false);
    this.user_id = 0;
    this.user_name = null;
    this.email = null;
    this.nick_name = null;
    this.avatar_url = null;
    this.birthdate = null;
    setBase_role_idIsSet(false);
    this.base_role_id = 0;
    setDecolorIsSet(false);
    this.decolor = 0;
    setDecolor_endtimeIsSet(false);
    this.decolor_endtime = 0;
    setPrize_role_idIsSet(false);
    this.prize_role_id = 0;
    setPrize_role_endtimeIsSet(false);
    this.prize_role_endtime = 0;
    setGood_numberIsSet(false);
    this.good_number = 0;
    setGood_number_role_idIsSet(false);
    this.good_number_role_id = 0;
    setGood_number_role_id_starttimeIsSet(false);
    this.good_number_role_id_starttime = 0;
    setGood_number_role_id_endtimeIsSet(false);
    this.good_number_role_id_endtime = 0;
    setKmoneyIsSet(false);
    this.kmoney = 0;
    setGiftmoneyIsSet(false);
    this.giftmoney = 0;
    setVideo_gift_idIsSet(false);
    this.video_gift_id = 0;
    setVideo_gift_end_timeIsSet(false);
    this.video_gift_end_time = 0;
    setStamp_gift_idIsSet(false);
    this.stamp_gift_id = 0;
    setStamp_gift_end_timeIsSet(false);
    this.stamp_gift_end_time = 0;
    setExp_levelIsSet(false);
    this.exp_level = 0;
    setExp_valueIsSet(false);
    this.exp_value = 0;
    setExp_rankIsSet(false);
    this.exp_rank = 0;
    setGenderIsSet(false);
    this.gender = 0;
    this.chinese_zodiac = null;
    this.zodiac = null;
    this.blood_type = null;
    this.interest = null;
    this.character = null;
    this.sign_name = null;
    setChestIsSet(false);
    this.chest = 0;
    setWaistIsSet(false);
    this.waist = 0;
    setHipIsSet(false);
    this.hip = 0;
    this.address = null;
    this.session_id = null;
    this.session_key = null;
    this.ticket_iv = null;
    this.client_ip = null;
  }

  public int getUser_id() {
    return this.user_id;
  }

  public ClientLoginResUserInfo setUser_id(int user_id) {
    this.user_id = user_id;
    setUser_idIsSet(true);
    return this;
  }

  public void unsetUser_id() {
    __isset_bit_vector.clear(__USER_ID_ISSET_ID);
  }

  /** Returns true if field user_id is set (has been asigned a value) and false otherwise */
  public boolean isSetUser_id() {
    return __isset_bit_vector.get(__USER_ID_ISSET_ID);
  }

  public void setUser_idIsSet(boolean value) {
    __isset_bit_vector.set(__USER_ID_ISSET_ID, value);
  }

  public String getUser_name() {
    return this.user_name;
  }

  public ClientLoginResUserInfo setUser_name(String user_name) {
    this.user_name = user_name;
    return this;
  }

  public void unsetUser_name() {
    this.user_name = null;
  }

  /** Returns true if field user_name is set (has been asigned a value) and false otherwise */
  public boolean isSetUser_name() {
    return this.user_name != null;
  }

  public void setUser_nameIsSet(boolean value) {
    if (!value) {
      this.user_name = null;
    }
  }

  public String getEmail() {
    return this.email;
  }

  public ClientLoginResUserInfo setEmail(String email) {
    this.email = email;
    return this;
  }

  public void unsetEmail() {
    this.email = null;
  }

  /** Returns true if field email is set (has been asigned a value) and false otherwise */
  public boolean isSetEmail() {
    return this.email != null;
  }

  public void setEmailIsSet(boolean value) {
    if (!value) {
      this.email = null;
    }
  }

  public String getNick_name() {
    return this.nick_name;
  }

  public ClientLoginResUserInfo setNick_name(String nick_name) {
    this.nick_name = nick_name;
    return this;
  }

  public void unsetNick_name() {
    this.nick_name = null;
  }

  /** Returns true if field nick_name is set (has been asigned a value) and false otherwise */
  public boolean isSetNick_name() {
    return this.nick_name != null;
  }

  public void setNick_nameIsSet(boolean value) {
    if (!value) {
      this.nick_name = null;
    }
  }

  public String getAvatar_url() {
    return this.avatar_url;
  }

  public ClientLoginResUserInfo setAvatar_url(String avatar_url) {
    this.avatar_url = avatar_url;
    return this;
  }

  public void unsetAvatar_url() {
    this.avatar_url = null;
  }

  /** Returns true if field avatar_url is set (has been asigned a value) and false otherwise */
  public boolean isSetAvatar_url() {
    return this.avatar_url != null;
  }

  public void setAvatar_urlIsSet(boolean value) {
    if (!value) {
      this.avatar_url = null;
    }
  }

  public String getBirthdate() {
    return this.birthdate;
  }

  public ClientLoginResUserInfo setBirthdate(String birthdate) {
    this.birthdate = birthdate;
    return this;
  }

  public void unsetBirthdate() {
    this.birthdate = null;
  }

  /** Returns true if field birthdate is set (has been asigned a value) and false otherwise */
  public boolean isSetBirthdate() {
    return this.birthdate != null;
  }

  public void setBirthdateIsSet(boolean value) {
    if (!value) {
      this.birthdate = null;
    }
  }

  public short getBase_role_id() {
    return this.base_role_id;
  }

  public ClientLoginResUserInfo setBase_role_id(short base_role_id) {
    this.base_role_id = base_role_id;
    setBase_role_idIsSet(true);
    return this;
  }

  public void unsetBase_role_id() {
    __isset_bit_vector.clear(__BASE_ROLE_ID_ISSET_ID);
  }

  /** Returns true if field base_role_id is set (has been asigned a value) and false otherwise */
  public boolean isSetBase_role_id() {
    return __isset_bit_vector.get(__BASE_ROLE_ID_ISSET_ID);
  }

  public void setBase_role_idIsSet(boolean value) {
    __isset_bit_vector.set(__BASE_ROLE_ID_ISSET_ID, value);
  }

  public int getDecolor() {
    return this.decolor;
  }

  public ClientLoginResUserInfo setDecolor(int decolor) {
    this.decolor = decolor;
    setDecolorIsSet(true);
    return this;
  }

  public void unsetDecolor() {
    __isset_bit_vector.clear(__DECOLOR_ISSET_ID);
  }

  /** Returns true if field decolor is set (has been asigned a value) and false otherwise */
  public boolean isSetDecolor() {
    return __isset_bit_vector.get(__DECOLOR_ISSET_ID);
  }

  public void setDecolorIsSet(boolean value) {
    __isset_bit_vector.set(__DECOLOR_ISSET_ID, value);
  }

  public long getDecolor_endtime() {
    return this.decolor_endtime;
  }

  public ClientLoginResUserInfo setDecolor_endtime(long decolor_endtime) {
    this.decolor_endtime = decolor_endtime;
    setDecolor_endtimeIsSet(true);
    return this;
  }

  public void unsetDecolor_endtime() {
    __isset_bit_vector.clear(__DECOLOR_ENDTIME_ISSET_ID);
  }

  /** Returns true if field decolor_endtime is set (has been asigned a value) and false otherwise */
  public boolean isSetDecolor_endtime() {
    return __isset_bit_vector.get(__DECOLOR_ENDTIME_ISSET_ID);
  }

  public void setDecolor_endtimeIsSet(boolean value) {
    __isset_bit_vector.set(__DECOLOR_ENDTIME_ISSET_ID, value);
  }

  public short getPrize_role_id() {
    return this.prize_role_id;
  }

  public ClientLoginResUserInfo setPrize_role_id(short prize_role_id) {
    this.prize_role_id = prize_role_id;
    setPrize_role_idIsSet(true);
    return this;
  }

  public void unsetPrize_role_id() {
    __isset_bit_vector.clear(__PRIZE_ROLE_ID_ISSET_ID);
  }

  /** Returns true if field prize_role_id is set (has been asigned a value) and false otherwise */
  public boolean isSetPrize_role_id() {
    return __isset_bit_vector.get(__PRIZE_ROLE_ID_ISSET_ID);
  }

  public void setPrize_role_idIsSet(boolean value) {
    __isset_bit_vector.set(__PRIZE_ROLE_ID_ISSET_ID, value);
  }

  public long getPrize_role_endtime() {
    return this.prize_role_endtime;
  }

  public ClientLoginResUserInfo setPrize_role_endtime(long prize_role_endtime) {
    this.prize_role_endtime = prize_role_endtime;
    setPrize_role_endtimeIsSet(true);
    return this;
  }

  public void unsetPrize_role_endtime() {
    __isset_bit_vector.clear(__PRIZE_ROLE_ENDTIME_ISSET_ID);
  }

  /** Returns true if field prize_role_endtime is set (has been asigned a value) and false otherwise */
  public boolean isSetPrize_role_endtime() {
    return __isset_bit_vector.get(__PRIZE_ROLE_ENDTIME_ISSET_ID);
  }

  public void setPrize_role_endtimeIsSet(boolean value) {
    __isset_bit_vector.set(__PRIZE_ROLE_ENDTIME_ISSET_ID, value);
  }

  public int getGood_number() {
    return this.good_number;
  }

  public ClientLoginResUserInfo setGood_number(int good_number) {
    this.good_number = good_number;
    setGood_numberIsSet(true);
    return this;
  }

  public void unsetGood_number() {
    __isset_bit_vector.clear(__GOOD_NUMBER_ISSET_ID);
  }

  /** Returns true if field good_number is set (has been asigned a value) and false otherwise */
  public boolean isSetGood_number() {
    return __isset_bit_vector.get(__GOOD_NUMBER_ISSET_ID);
  }

  public void setGood_numberIsSet(boolean value) {
    __isset_bit_vector.set(__GOOD_NUMBER_ISSET_ID, value);
  }

  public short getGood_number_role_id() {
    return this.good_number_role_id;
  }

  public ClientLoginResUserInfo setGood_number_role_id(short good_number_role_id) {
    this.good_number_role_id = good_number_role_id;
    setGood_number_role_idIsSet(true);
    return this;
  }

  public void unsetGood_number_role_id() {
    __isset_bit_vector.clear(__GOOD_NUMBER_ROLE_ID_ISSET_ID);
  }

  /** Returns true if field good_number_role_id is set (has been asigned a value) and false otherwise */
  public boolean isSetGood_number_role_id() {
    return __isset_bit_vector.get(__GOOD_NUMBER_ROLE_ID_ISSET_ID);
  }

  public void setGood_number_role_idIsSet(boolean value) {
    __isset_bit_vector.set(__GOOD_NUMBER_ROLE_ID_ISSET_ID, value);
  }

  public long getGood_number_role_id_starttime() {
    return this.good_number_role_id_starttime;
  }

  public ClientLoginResUserInfo setGood_number_role_id_starttime(long good_number_role_id_starttime) {
    this.good_number_role_id_starttime = good_number_role_id_starttime;
    setGood_number_role_id_starttimeIsSet(true);
    return this;
  }

  public void unsetGood_number_role_id_starttime() {
    __isset_bit_vector.clear(__GOOD_NUMBER_ROLE_ID_STARTTIME_ISSET_ID);
  }

  /** Returns true if field good_number_role_id_starttime is set (has been asigned a value) and false otherwise */
  public boolean isSetGood_number_role_id_starttime() {
    return __isset_bit_vector.get(__GOOD_NUMBER_ROLE_ID_STARTTIME_ISSET_ID);
  }

  public void setGood_number_role_id_starttimeIsSet(boolean value) {
    __isset_bit_vector.set(__GOOD_NUMBER_ROLE_ID_STARTTIME_ISSET_ID, value);
  }

  public long getGood_number_role_id_endtime() {
    return this.good_number_role_id_endtime;
  }

  public ClientLoginResUserInfo setGood_number_role_id_endtime(long good_number_role_id_endtime) {
    this.good_number_role_id_endtime = good_number_role_id_endtime;
    setGood_number_role_id_endtimeIsSet(true);
    return this;
  }

  public void unsetGood_number_role_id_endtime() {
    __isset_bit_vector.clear(__GOOD_NUMBER_ROLE_ID_ENDTIME_ISSET_ID);
  }

  /** Returns true if field good_number_role_id_endtime is set (has been asigned a value) and false otherwise */
  public boolean isSetGood_number_role_id_endtime() {
    return __isset_bit_vector.get(__GOOD_NUMBER_ROLE_ID_ENDTIME_ISSET_ID);
  }

  public void setGood_number_role_id_endtimeIsSet(boolean value) {
    __isset_bit_vector.set(__GOOD_NUMBER_ROLE_ID_ENDTIME_ISSET_ID, value);
  }

  public long getKmoney() {
    return this.kmoney;
  }

  public ClientLoginResUserInfo setKmoney(long kmoney) {
    this.kmoney = kmoney;
    setKmoneyIsSet(true);
    return this;
  }

  public void unsetKmoney() {
    __isset_bit_vector.clear(__KMONEY_ISSET_ID);
  }

  /** Returns true if field kmoney is set (has been asigned a value) and false otherwise */
  public boolean isSetKmoney() {
    return __isset_bit_vector.get(__KMONEY_ISSET_ID);
  }

  public void setKmoneyIsSet(boolean value) {
    __isset_bit_vector.set(__KMONEY_ISSET_ID, value);
  }

  public long getGiftmoney() {
    return this.giftmoney;
  }

  public ClientLoginResUserInfo setGiftmoney(long giftmoney) {
    this.giftmoney = giftmoney;
    setGiftmoneyIsSet(true);
    return this;
  }

  public void unsetGiftmoney() {
    __isset_bit_vector.clear(__GIFTMONEY_ISSET_ID);
  }

  /** Returns true if field giftmoney is set (has been asigned a value) and false otherwise */
  public boolean isSetGiftmoney() {
    return __isset_bit_vector.get(__GIFTMONEY_ISSET_ID);
  }

  public void setGiftmoneyIsSet(boolean value) {
    __isset_bit_vector.set(__GIFTMONEY_ISSET_ID, value);
  }

  public int getVideo_gift_id() {
    return this.video_gift_id;
  }

  public ClientLoginResUserInfo setVideo_gift_id(int video_gift_id) {
    this.video_gift_id = video_gift_id;
    setVideo_gift_idIsSet(true);
    return this;
  }

  public void unsetVideo_gift_id() {
    __isset_bit_vector.clear(__VIDEO_GIFT_ID_ISSET_ID);
  }

  /** Returns true if field video_gift_id is set (has been asigned a value) and false otherwise */
  public boolean isSetVideo_gift_id() {
    return __isset_bit_vector.get(__VIDEO_GIFT_ID_ISSET_ID);
  }

  public void setVideo_gift_idIsSet(boolean value) {
    __isset_bit_vector.set(__VIDEO_GIFT_ID_ISSET_ID, value);
  }

  public long getVideo_gift_end_time() {
    return this.video_gift_end_time;
  }

  public ClientLoginResUserInfo setVideo_gift_end_time(long video_gift_end_time) {
    this.video_gift_end_time = video_gift_end_time;
    setVideo_gift_end_timeIsSet(true);
    return this;
  }

  public void unsetVideo_gift_end_time() {
    __isset_bit_vector.clear(__VIDEO_GIFT_END_TIME_ISSET_ID);
  }

  /** Returns true if field video_gift_end_time is set (has been asigned a value) and false otherwise */
  public boolean isSetVideo_gift_end_time() {
    return __isset_bit_vector.get(__VIDEO_GIFT_END_TIME_ISSET_ID);
  }

  public void setVideo_gift_end_timeIsSet(boolean value) {
    __isset_bit_vector.set(__VIDEO_GIFT_END_TIME_ISSET_ID, value);
  }

  public int getStamp_gift_id() {
    return this.stamp_gift_id;
  }

  public ClientLoginResUserInfo setStamp_gift_id(int stamp_gift_id) {
    this.stamp_gift_id = stamp_gift_id;
    setStamp_gift_idIsSet(true);
    return this;
  }

  public void unsetStamp_gift_id() {
    __isset_bit_vector.clear(__STAMP_GIFT_ID_ISSET_ID);
  }

  /** Returns true if field stamp_gift_id is set (has been asigned a value) and false otherwise */
  public boolean isSetStamp_gift_id() {
    return __isset_bit_vector.get(__STAMP_GIFT_ID_ISSET_ID);
  }

  public void setStamp_gift_idIsSet(boolean value) {
    __isset_bit_vector.set(__STAMP_GIFT_ID_ISSET_ID, value);
  }

  public long getStamp_gift_end_time() {
    return this.stamp_gift_end_time;
  }

  public ClientLoginResUserInfo setStamp_gift_end_time(long stamp_gift_end_time) {
    this.stamp_gift_end_time = stamp_gift_end_time;
    setStamp_gift_end_timeIsSet(true);
    return this;
  }

  public void unsetStamp_gift_end_time() {
    __isset_bit_vector.clear(__STAMP_GIFT_END_TIME_ISSET_ID);
  }

  /** Returns true if field stamp_gift_end_time is set (has been asigned a value) and false otherwise */
  public boolean isSetStamp_gift_end_time() {
    return __isset_bit_vector.get(__STAMP_GIFT_END_TIME_ISSET_ID);
  }

  public void setStamp_gift_end_timeIsSet(boolean value) {
    __isset_bit_vector.set(__STAMP_GIFT_END_TIME_ISSET_ID, value);
  }

  public short getExp_level() {
    return this.exp_level;
  }

  public ClientLoginResUserInfo setExp_level(short exp_level) {
    this.exp_level = exp_level;
    setExp_levelIsSet(true);
    return this;
  }

  public void unsetExp_level() {
    __isset_bit_vector.clear(__EXP_LEVEL_ISSET_ID);
  }

  /** Returns true if field exp_level is set (has been asigned a value) and false otherwise */
  public boolean isSetExp_level() {
    return __isset_bit_vector.get(__EXP_LEVEL_ISSET_ID);
  }

  public void setExp_levelIsSet(boolean value) {
    __isset_bit_vector.set(__EXP_LEVEL_ISSET_ID, value);
  }

  public int getExp_value() {
    return this.exp_value;
  }

  public ClientLoginResUserInfo setExp_value(int exp_value) {
    this.exp_value = exp_value;
    setExp_valueIsSet(true);
    return this;
  }

  public void unsetExp_value() {
    __isset_bit_vector.clear(__EXP_VALUE_ISSET_ID);
  }

  /** Returns true if field exp_value is set (has been asigned a value) and false otherwise */
  public boolean isSetExp_value() {
    return __isset_bit_vector.get(__EXP_VALUE_ISSET_ID);
  }

  public void setExp_valueIsSet(boolean value) {
    __isset_bit_vector.set(__EXP_VALUE_ISSET_ID, value);
  }

  public int getExp_rank() {
    return this.exp_rank;
  }

  public ClientLoginResUserInfo setExp_rank(int exp_rank) {
    this.exp_rank = exp_rank;
    setExp_rankIsSet(true);
    return this;
  }

  public void unsetExp_rank() {
    __isset_bit_vector.clear(__EXP_RANK_ISSET_ID);
  }

  /** Returns true if field exp_rank is set (has been asigned a value) and false otherwise */
  public boolean isSetExp_rank() {
    return __isset_bit_vector.get(__EXP_RANK_ISSET_ID);
  }

  public void setExp_rankIsSet(boolean value) {
    __isset_bit_vector.set(__EXP_RANK_ISSET_ID, value);
  }

  public byte getGender() {
    return this.gender;
  }

  public ClientLoginResUserInfo setGender(byte gender) {
    this.gender = gender;
    setGenderIsSet(true);
    return this;
  }

  public void unsetGender() {
    __isset_bit_vector.clear(__GENDER_ISSET_ID);
  }

  /** Returns true if field gender is set (has been asigned a value) and false otherwise */
  public boolean isSetGender() {
    return __isset_bit_vector.get(__GENDER_ISSET_ID);
  }

  public void setGenderIsSet(boolean value) {
    __isset_bit_vector.set(__GENDER_ISSET_ID, value);
  }

  public String getChinese_zodiac() {
    return this.chinese_zodiac;
  }

  public ClientLoginResUserInfo setChinese_zodiac(String chinese_zodiac) {
    this.chinese_zodiac = chinese_zodiac;
    return this;
  }

  public void unsetChinese_zodiac() {
    this.chinese_zodiac = null;
  }

  /** Returns true if field chinese_zodiac is set (has been asigned a value) and false otherwise */
  public boolean isSetChinese_zodiac() {
    return this.chinese_zodiac != null;
  }

  public void setChinese_zodiacIsSet(boolean value) {
    if (!value) {
      this.chinese_zodiac = null;
    }
  }

  public String getZodiac() {
    return this.zodiac;
  }

  public ClientLoginResUserInfo setZodiac(String zodiac) {
    this.zodiac = zodiac;
    return this;
  }

  public void unsetZodiac() {
    this.zodiac = null;
  }

  /** Returns true if field zodiac is set (has been asigned a value) and false otherwise */
  public boolean isSetZodiac() {
    return this.zodiac != null;
  }

  public void setZodiacIsSet(boolean value) {
    if (!value) {
      this.zodiac = null;
    }
  }

  public String getBlood_type() {
    return this.blood_type;
  }

  public ClientLoginResUserInfo setBlood_type(String blood_type) {
    this.blood_type = blood_type;
    return this;
  }

  public void unsetBlood_type() {
    this.blood_type = null;
  }

  /** Returns true if field blood_type is set (has been asigned a value) and false otherwise */
  public boolean isSetBlood_type() {
    return this.blood_type != null;
  }

  public void setBlood_typeIsSet(boolean value) {
    if (!value) {
      this.blood_type = null;
    }
  }

  public String getInterest() {
    return this.interest;
  }

  public ClientLoginResUserInfo setInterest(String interest) {
    this.interest = interest;
    return this;
  }

  public void unsetInterest() {
    this.interest = null;
  }

  /** Returns true if field interest is set (has been asigned a value) and false otherwise */
  public boolean isSetInterest() {
    return this.interest != null;
  }

  public void setInterestIsSet(boolean value) {
    if (!value) {
      this.interest = null;
    }
  }

  public String getCharacter() {
    return this.character;
  }

  public ClientLoginResUserInfo setCharacter(String character) {
    this.character = character;
    return this;
  }

  public void unsetCharacter() {
    this.character = null;
  }

  /** Returns true if field character is set (has been asigned a value) and false otherwise */
  public boolean isSetCharacter() {
    return this.character != null;
  }

  public void setCharacterIsSet(boolean value) {
    if (!value) {
      this.character = null;
    }
  }

  public String getSign_name() {
    return this.sign_name;
  }

  public ClientLoginResUserInfo setSign_name(String sign_name) {
    this.sign_name = sign_name;
    return this;
  }

  public void unsetSign_name() {
    this.sign_name = null;
  }

  /** Returns true if field sign_name is set (has been asigned a value) and false otherwise */
  public boolean isSetSign_name() {
    return this.sign_name != null;
  }

  public void setSign_nameIsSet(boolean value) {
    if (!value) {
      this.sign_name = null;
    }
  }

  public short getChest() {
    return this.chest;
  }

  public ClientLoginResUserInfo setChest(short chest) {
    this.chest = chest;
    setChestIsSet(true);
    return this;
  }

  public void unsetChest() {
    __isset_bit_vector.clear(__CHEST_ISSET_ID);
  }

  /** Returns true if field chest is set (has been asigned a value) and false otherwise */
  public boolean isSetChest() {
    return __isset_bit_vector.get(__CHEST_ISSET_ID);
  }

  public void setChestIsSet(boolean value) {
    __isset_bit_vector.set(__CHEST_ISSET_ID, value);
  }

  public short getWaist() {
    return this.waist;
  }

  public ClientLoginResUserInfo setWaist(short waist) {
    this.waist = waist;
    setWaistIsSet(true);
    return this;
  }

  public void unsetWaist() {
    __isset_bit_vector.clear(__WAIST_ISSET_ID);
  }

  /** Returns true if field waist is set (has been asigned a value) and false otherwise */
  public boolean isSetWaist() {
    return __isset_bit_vector.get(__WAIST_ISSET_ID);
  }

  public void setWaistIsSet(boolean value) {
    __isset_bit_vector.set(__WAIST_ISSET_ID, value);
  }

  public short getHip() {
    return this.hip;
  }

  public ClientLoginResUserInfo setHip(short hip) {
    this.hip = hip;
    setHipIsSet(true);
    return this;
  }

  public void unsetHip() {
    __isset_bit_vector.clear(__HIP_ISSET_ID);
  }

  /** Returns true if field hip is set (has been asigned a value) and false otherwise */
  public boolean isSetHip() {
    return __isset_bit_vector.get(__HIP_ISSET_ID);
  }

  public void setHipIsSet(boolean value) {
    __isset_bit_vector.set(__HIP_ISSET_ID, value);
  }

  public String getAddress() {
    return this.address;
  }

  public ClientLoginResUserInfo setAddress(String address) {
    this.address = address;
    return this;
  }

  public void unsetAddress() {
    this.address = null;
  }

  /** Returns true if field address is set (has been asigned a value) and false otherwise */
  public boolean isSetAddress() {
    return this.address != null;
  }

  public void setAddressIsSet(boolean value) {
    if (!value) {
      this.address = null;
    }
  }

  public String getSession_id() {
    return this.session_id;
  }

  public ClientLoginResUserInfo setSession_id(String session_id) {
    this.session_id = session_id;
    return this;
  }

  public void unsetSession_id() {
    this.session_id = null;
  }

  /** Returns true if field session_id is set (has been asigned a value) and false otherwise */
  public boolean isSetSession_id() {
    return this.session_id != null;
  }

  public void setSession_idIsSet(boolean value) {
    if (!value) {
      this.session_id = null;
    }
  }

  public String getSession_key() {
    return this.session_key;
  }

  public ClientLoginResUserInfo setSession_key(String session_key) {
    this.session_key = session_key;
    return this;
  }

  public void unsetSession_key() {
    this.session_key = null;
  }

  /** Returns true if field session_key is set (has been asigned a value) and false otherwise */
  public boolean isSetSession_key() {
    return this.session_key != null;
  }

  public void setSession_keyIsSet(boolean value) {
    if (!value) {
      this.session_key = null;
    }
  }

  public String getTicket_iv() {
    return this.ticket_iv;
  }

  public ClientLoginResUserInfo setTicket_iv(String ticket_iv) {
    this.ticket_iv = ticket_iv;
    return this;
  }

  public void unsetTicket_iv() {
    this.ticket_iv = null;
  }

  /** Returns true if field ticket_iv is set (has been asigned a value) and false otherwise */
  public boolean isSetTicket_iv() {
    return this.ticket_iv != null;
  }

  public void setTicket_ivIsSet(boolean value) {
    if (!value) {
      this.ticket_iv = null;
    }
  }

  public String getClient_ip() {
    return this.client_ip;
  }

  public ClientLoginResUserInfo setClient_ip(String client_ip) {
    this.client_ip = client_ip;
    return this;
  }

  public void unsetClient_ip() {
    this.client_ip = null;
  }

  /** Returns true if field client_ip is set (has been asigned a value) and false otherwise */
  public boolean isSetClient_ip() {
    return this.client_ip != null;
  }

  public void setClient_ipIsSet(boolean value) {
    if (!value) {
      this.client_ip = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER_ID:
      if (value == null) {
        unsetUser_id();
      } else {
        setUser_id((Integer)value);
      }
      break;

    case USER_NAME:
      if (value == null) {
        unsetUser_name();
      } else {
        setUser_name((String)value);
      }
      break;

    case EMAIL:
      if (value == null) {
        unsetEmail();
      } else {
        setEmail((String)value);
      }
      break;

    case NICK_NAME:
      if (value == null) {
        unsetNick_name();
      } else {
        setNick_name((String)value);
      }
      break;

    case AVATAR_URL:
      if (value == null) {
        unsetAvatar_url();
      } else {
        setAvatar_url((String)value);
      }
      break;

    case BIRTHDATE:
      if (value == null) {
        unsetBirthdate();
      } else {
        setBirthdate((String)value);
      }
      break;

    case BASE_ROLE_ID:
      if (value == null) {
        unsetBase_role_id();
      } else {
        setBase_role_id((Short)value);
      }
      break;

    case DECOLOR:
      if (value == null) {
        unsetDecolor();
      } else {
        setDecolor((Integer)value);
      }
      break;

    case DECOLOR_ENDTIME:
      if (value == null) {
        unsetDecolor_endtime();
      } else {
        setDecolor_endtime((Long)value);
      }
      break;

    case PRIZE_ROLE_ID:
      if (value == null) {
        unsetPrize_role_id();
      } else {
        setPrize_role_id((Short)value);
      }
      break;

    case PRIZE_ROLE_ENDTIME:
      if (value == null) {
        unsetPrize_role_endtime();
      } else {
        setPrize_role_endtime((Long)value);
      }
      break;

    case GOOD_NUMBER:
      if (value == null) {
        unsetGood_number();
      } else {
        setGood_number((Integer)value);
      }
      break;

    case GOOD_NUMBER_ROLE_ID:
      if (value == null) {
        unsetGood_number_role_id();
      } else {
        setGood_number_role_id((Short)value);
      }
      break;

    case GOOD_NUMBER_ROLE_ID_STARTTIME:
      if (value == null) {
        unsetGood_number_role_id_starttime();
      } else {
        setGood_number_role_id_starttime((Long)value);
      }
      break;

    case GOOD_NUMBER_ROLE_ID_ENDTIME:
      if (value == null) {
        unsetGood_number_role_id_endtime();
      } else {
        setGood_number_role_id_endtime((Long)value);
      }
      break;

    case KMONEY:
      if (value == null) {
        unsetKmoney();
      } else {
        setKmoney((Long)value);
      }
      break;

    case GIFTMONEY:
      if (value == null) {
        unsetGiftmoney();
      } else {
        setGiftmoney((Long)value);
      }
      break;

    case VIDEO_GIFT_ID:
      if (value == null) {
        unsetVideo_gift_id();
      } else {
        setVideo_gift_id((Integer)value);
      }
      break;

    case VIDEO_GIFT_END_TIME:
      if (value == null) {
        unsetVideo_gift_end_time();
      } else {
        setVideo_gift_end_time((Long)value);
      }
      break;

    case STAMP_GIFT_ID:
      if (value == null) {
        unsetStamp_gift_id();
      } else {
        setStamp_gift_id((Integer)value);
      }
      break;

    case STAMP_GIFT_END_TIME:
      if (value == null) {
        unsetStamp_gift_end_time();
      } else {
        setStamp_gift_end_time((Long)value);
      }
      break;

    case EXP_LEVEL:
      if (value == null) {
        unsetExp_level();
      } else {
        setExp_level((Short)value);
      }
      break;

    case EXP_VALUE:
      if (value == null) {
        unsetExp_value();
      } else {
        setExp_value((Integer)value);
      }
      break;

    case EXP_RANK:
      if (value == null) {
        unsetExp_rank();
      } else {
        setExp_rank((Integer)value);
      }
      break;

    case GENDER:
      if (value == null) {
        unsetGender();
      } else {
        setGender((Byte)value);
      }
      break;

    case CHINESE_ZODIAC:
      if (value == null) {
        unsetChinese_zodiac();
      } else {
        setChinese_zodiac((String)value);
      }
      break;

    case ZODIAC:
      if (value == null) {
        unsetZodiac();
      } else {
        setZodiac((String)value);
      }
      break;

    case BLOOD_TYPE:
      if (value == null) {
        unsetBlood_type();
      } else {
        setBlood_type((String)value);
      }
      break;

    case INTEREST:
      if (value == null) {
        unsetInterest();
      } else {
        setInterest((String)value);
      }
      break;

    case CHARACTER:
      if (value == null) {
        unsetCharacter();
      } else {
        setCharacter((String)value);
      }
      break;

    case SIGN_NAME:
      if (value == null) {
        unsetSign_name();
      } else {
        setSign_name((String)value);
      }
      break;

    case CHEST:
      if (value == null) {
        unsetChest();
      } else {
        setChest((Short)value);
      }
      break;

    case WAIST:
      if (value == null) {
        unsetWaist();
      } else {
        setWaist((Short)value);
      }
      break;

    case HIP:
      if (value == null) {
        unsetHip();
      } else {
        setHip((Short)value);
      }
      break;

    case ADDRESS:
      if (value == null) {
        unsetAddress();
      } else {
        setAddress((String)value);
      }
      break;

    case SESSION_ID:
      if (value == null) {
        unsetSession_id();
      } else {
        setSession_id((String)value);
      }
      break;

    case SESSION_KEY:
      if (value == null) {
        unsetSession_key();
      } else {
        setSession_key((String)value);
      }
      break;

    case TICKET_IV:
      if (value == null) {
        unsetTicket_iv();
      } else {
        setTicket_iv((String)value);
      }
      break;

    case CLIENT_IP:
      if (value == null) {
        unsetClient_ip();
      } else {
        setClient_ip((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_ID:
      return new Integer(getUser_id());

    case USER_NAME:
      return getUser_name();

    case EMAIL:
      return getEmail();

    case NICK_NAME:
      return getNick_name();

    case AVATAR_URL:
      return getAvatar_url();

    case BIRTHDATE:
      return getBirthdate();

    case BASE_ROLE_ID:
      return new Short(getBase_role_id());

    case DECOLOR:
      return new Integer(getDecolor());

    case DECOLOR_ENDTIME:
      return new Long(getDecolor_endtime());

    case PRIZE_ROLE_ID:
      return new Short(getPrize_role_id());

    case PRIZE_ROLE_ENDTIME:
      return new Long(getPrize_role_endtime());

    case GOOD_NUMBER:
      return new Integer(getGood_number());

    case GOOD_NUMBER_ROLE_ID:
      return new Short(getGood_number_role_id());

    case GOOD_NUMBER_ROLE_ID_STARTTIME:
      return new Long(getGood_number_role_id_starttime());

    case GOOD_NUMBER_ROLE_ID_ENDTIME:
      return new Long(getGood_number_role_id_endtime());

    case KMONEY:
      return new Long(getKmoney());

    case GIFTMONEY:
      return new Long(getGiftmoney());

    case VIDEO_GIFT_ID:
      return new Integer(getVideo_gift_id());

    case VIDEO_GIFT_END_TIME:
      return new Long(getVideo_gift_end_time());

    case STAMP_GIFT_ID:
      return new Integer(getStamp_gift_id());

    case STAMP_GIFT_END_TIME:
      return new Long(getStamp_gift_end_time());

    case EXP_LEVEL:
      return new Short(getExp_level());

    case EXP_VALUE:
      return new Integer(getExp_value());

    case EXP_RANK:
      return new Integer(getExp_rank());

    case GENDER:
      return new Byte(getGender());

    case CHINESE_ZODIAC:
      return getChinese_zodiac();

    case ZODIAC:
      return getZodiac();

    case BLOOD_TYPE:
      return getBlood_type();

    case INTEREST:
      return getInterest();

    case CHARACTER:
      return getCharacter();

    case SIGN_NAME:
      return getSign_name();

    case CHEST:
      return new Short(getChest());

    case WAIST:
      return new Short(getWaist());

    case HIP:
      return new Short(getHip());

    case ADDRESS:
      return getAddress();

    case SESSION_ID:
      return getSession_id();

    case SESSION_KEY:
      return getSession_key();

    case TICKET_IV:
      return getTicket_iv();

    case CLIENT_IP:
      return getClient_ip();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER_ID:
      return isSetUser_id();
    case USER_NAME:
      return isSetUser_name();
    case EMAIL:
      return isSetEmail();
    case NICK_NAME:
      return isSetNick_name();
    case AVATAR_URL:
      return isSetAvatar_url();
    case BIRTHDATE:
      return isSetBirthdate();
    case BASE_ROLE_ID:
      return isSetBase_role_id();
    case DECOLOR:
      return isSetDecolor();
    case DECOLOR_ENDTIME:
      return isSetDecolor_endtime();
    case PRIZE_ROLE_ID:
      return isSetPrize_role_id();
    case PRIZE_ROLE_ENDTIME:
      return isSetPrize_role_endtime();
    case GOOD_NUMBER:
      return isSetGood_number();
    case GOOD_NUMBER_ROLE_ID:
      return isSetGood_number_role_id();
    case GOOD_NUMBER_ROLE_ID_STARTTIME:
      return isSetGood_number_role_id_starttime();
    case GOOD_NUMBER_ROLE_ID_ENDTIME:
      return isSetGood_number_role_id_endtime();
    case KMONEY:
      return isSetKmoney();
    case GIFTMONEY:
      return isSetGiftmoney();
    case VIDEO_GIFT_ID:
      return isSetVideo_gift_id();
    case VIDEO_GIFT_END_TIME:
      return isSetVideo_gift_end_time();
    case STAMP_GIFT_ID:
      return isSetStamp_gift_id();
    case STAMP_GIFT_END_TIME:
      return isSetStamp_gift_end_time();
    case EXP_LEVEL:
      return isSetExp_level();
    case EXP_VALUE:
      return isSetExp_value();
    case EXP_RANK:
      return isSetExp_rank();
    case GENDER:
      return isSetGender();
    case CHINESE_ZODIAC:
      return isSetChinese_zodiac();
    case ZODIAC:
      return isSetZodiac();
    case BLOOD_TYPE:
      return isSetBlood_type();
    case INTEREST:
      return isSetInterest();
    case CHARACTER:
      return isSetCharacter();
    case SIGN_NAME:
      return isSetSign_name();
    case CHEST:
      return isSetChest();
    case WAIST:
      return isSetWaist();
    case HIP:
      return isSetHip();
    case ADDRESS:
      return isSetAddress();
    case SESSION_ID:
      return isSetSession_id();
    case SESSION_KEY:
      return isSetSession_key();
    case TICKET_IV:
      return isSetTicket_iv();
    case CLIENT_IP:
      return isSetClient_ip();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ClientLoginResUserInfo)
      return this.equals((ClientLoginResUserInfo)that);
    return false;
  }

  public boolean equals(ClientLoginResUserInfo that) {
    if (that == null)
      return false;

    boolean this_present_user_id = true;
    boolean that_present_user_id = true;
    if (this_present_user_id || that_present_user_id) {
      if (!(this_present_user_id && that_present_user_id))
        return false;
      if (this.user_id != that.user_id)
        return false;
    }

    boolean this_present_user_name = true && this.isSetUser_name();
    boolean that_present_user_name = true && that.isSetUser_name();
    if (this_present_user_name || that_present_user_name) {
      if (!(this_present_user_name && that_present_user_name))
        return false;
      if (!this.user_name.equals(that.user_name))
        return false;
    }

    boolean this_present_email = true && this.isSetEmail();
    boolean that_present_email = true && that.isSetEmail();
    if (this_present_email || that_present_email) {
      if (!(this_present_email && that_present_email))
        return false;
      if (!this.email.equals(that.email))
        return false;
    }

    boolean this_present_nick_name = true && this.isSetNick_name();
    boolean that_present_nick_name = true && that.isSetNick_name();
    if (this_present_nick_name || that_present_nick_name) {
      if (!(this_present_nick_name && that_present_nick_name))
        return false;
      if (!this.nick_name.equals(that.nick_name))
        return false;
    }

    boolean this_present_avatar_url = true && this.isSetAvatar_url();
    boolean that_present_avatar_url = true && that.isSetAvatar_url();
    if (this_present_avatar_url || that_present_avatar_url) {
      if (!(this_present_avatar_url && that_present_avatar_url))
        return false;
      if (!this.avatar_url.equals(that.avatar_url))
        return false;
    }

    boolean this_present_birthdate = true && this.isSetBirthdate();
    boolean that_present_birthdate = true && that.isSetBirthdate();
    if (this_present_birthdate || that_present_birthdate) {
      if (!(this_present_birthdate && that_present_birthdate))
        return false;
      if (!this.birthdate.equals(that.birthdate))
        return false;
    }

    boolean this_present_base_role_id = true;
    boolean that_present_base_role_id = true;
    if (this_present_base_role_id || that_present_base_role_id) {
      if (!(this_present_base_role_id && that_present_base_role_id))
        return false;
      if (this.base_role_id != that.base_role_id)
        return false;
    }

    boolean this_present_decolor = true;
    boolean that_present_decolor = true;
    if (this_present_decolor || that_present_decolor) {
      if (!(this_present_decolor && that_present_decolor))
        return false;
      if (this.decolor != that.decolor)
        return false;
    }

    boolean this_present_decolor_endtime = true;
    boolean that_present_decolor_endtime = true;
    if (this_present_decolor_endtime || that_present_decolor_endtime) {
      if (!(this_present_decolor_endtime && that_present_decolor_endtime))
        return false;
      if (this.decolor_endtime != that.decolor_endtime)
        return false;
    }

    boolean this_present_prize_role_id = true;
    boolean that_present_prize_role_id = true;
    if (this_present_prize_role_id || that_present_prize_role_id) {
      if (!(this_present_prize_role_id && that_present_prize_role_id))
        return false;
      if (this.prize_role_id != that.prize_role_id)
        return false;
    }

    boolean this_present_prize_role_endtime = true;
    boolean that_present_prize_role_endtime = true;
    if (this_present_prize_role_endtime || that_present_prize_role_endtime) {
      if (!(this_present_prize_role_endtime && that_present_prize_role_endtime))
        return false;
      if (this.prize_role_endtime != that.prize_role_endtime)
        return false;
    }

    boolean this_present_good_number = true;
    boolean that_present_good_number = true;
    if (this_present_good_number || that_present_good_number) {
      if (!(this_present_good_number && that_present_good_number))
        return false;
      if (this.good_number != that.good_number)
        return false;
    }

    boolean this_present_good_number_role_id = true;
    boolean that_present_good_number_role_id = true;
    if (this_present_good_number_role_id || that_present_good_number_role_id) {
      if (!(this_present_good_number_role_id && that_present_good_number_role_id))
        return false;
      if (this.good_number_role_id != that.good_number_role_id)
        return false;
    }

    boolean this_present_good_number_role_id_starttime = true;
    boolean that_present_good_number_role_id_starttime = true;
    if (this_present_good_number_role_id_starttime || that_present_good_number_role_id_starttime) {
      if (!(this_present_good_number_role_id_starttime && that_present_good_number_role_id_starttime))
        return false;
      if (this.good_number_role_id_starttime != that.good_number_role_id_starttime)
        return false;
    }

    boolean this_present_good_number_role_id_endtime = true;
    boolean that_present_good_number_role_id_endtime = true;
    if (this_present_good_number_role_id_endtime || that_present_good_number_role_id_endtime) {
      if (!(this_present_good_number_role_id_endtime && that_present_good_number_role_id_endtime))
        return false;
      if (this.good_number_role_id_endtime != that.good_number_role_id_endtime)
        return false;
    }

    boolean this_present_kmoney = true;
    boolean that_present_kmoney = true;
    if (this_present_kmoney || that_present_kmoney) {
      if (!(this_present_kmoney && that_present_kmoney))
        return false;
      if (this.kmoney != that.kmoney)
        return false;
    }

    boolean this_present_giftmoney = true;
    boolean that_present_giftmoney = true;
    if (this_present_giftmoney || that_present_giftmoney) {
      if (!(this_present_giftmoney && that_present_giftmoney))
        return false;
      if (this.giftmoney != that.giftmoney)
        return false;
    }

    boolean this_present_video_gift_id = true;
    boolean that_present_video_gift_id = true;
    if (this_present_video_gift_id || that_present_video_gift_id) {
      if (!(this_present_video_gift_id && that_present_video_gift_id))
        return false;
      if (this.video_gift_id != that.video_gift_id)
        return false;
    }

    boolean this_present_video_gift_end_time = true;
    boolean that_present_video_gift_end_time = true;
    if (this_present_video_gift_end_time || that_present_video_gift_end_time) {
      if (!(this_present_video_gift_end_time && that_present_video_gift_end_time))
        return false;
      if (this.video_gift_end_time != that.video_gift_end_time)
        return false;
    }

    boolean this_present_stamp_gift_id = true;
    boolean that_present_stamp_gift_id = true;
    if (this_present_stamp_gift_id || that_present_stamp_gift_id) {
      if (!(this_present_stamp_gift_id && that_present_stamp_gift_id))
        return false;
      if (this.stamp_gift_id != that.stamp_gift_id)
        return false;
    }

    boolean this_present_stamp_gift_end_time = true;
    boolean that_present_stamp_gift_end_time = true;
    if (this_present_stamp_gift_end_time || that_present_stamp_gift_end_time) {
      if (!(this_present_stamp_gift_end_time && that_present_stamp_gift_end_time))
        return false;
      if (this.stamp_gift_end_time != that.stamp_gift_end_time)
        return false;
    }

    boolean this_present_exp_level = true;
    boolean that_present_exp_level = true;
    if (this_present_exp_level || that_present_exp_level) {
      if (!(this_present_exp_level && that_present_exp_level))
        return false;
      if (this.exp_level != that.exp_level)
        return false;
    }

    boolean this_present_exp_value = true;
    boolean that_present_exp_value = true;
    if (this_present_exp_value || that_present_exp_value) {
      if (!(this_present_exp_value && that_present_exp_value))
        return false;
      if (this.exp_value != that.exp_value)
        return false;
    }

    boolean this_present_exp_rank = true;
    boolean that_present_exp_rank = true;
    if (this_present_exp_rank || that_present_exp_rank) {
      if (!(this_present_exp_rank && that_present_exp_rank))
        return false;
      if (this.exp_rank != that.exp_rank)
        return false;
    }

    boolean this_present_gender = true;
    boolean that_present_gender = true;
    if (this_present_gender || that_present_gender) {
      if (!(this_present_gender && that_present_gender))
        return false;
      if (this.gender != that.gender)
        return false;
    }

    boolean this_present_chinese_zodiac = true && this.isSetChinese_zodiac();
    boolean that_present_chinese_zodiac = true && that.isSetChinese_zodiac();
    if (this_present_chinese_zodiac || that_present_chinese_zodiac) {
      if (!(this_present_chinese_zodiac && that_present_chinese_zodiac))
        return false;
      if (!this.chinese_zodiac.equals(that.chinese_zodiac))
        return false;
    }

    boolean this_present_zodiac = true && this.isSetZodiac();
    boolean that_present_zodiac = true && that.isSetZodiac();
    if (this_present_zodiac || that_present_zodiac) {
      if (!(this_present_zodiac && that_present_zodiac))
        return false;
      if (!this.zodiac.equals(that.zodiac))
        return false;
    }

    boolean this_present_blood_type = true && this.isSetBlood_type();
    boolean that_present_blood_type = true && that.isSetBlood_type();
    if (this_present_blood_type || that_present_blood_type) {
      if (!(this_present_blood_type && that_present_blood_type))
        return false;
      if (!this.blood_type.equals(that.blood_type))
        return false;
    }

    boolean this_present_interest = true && this.isSetInterest();
    boolean that_present_interest = true && that.isSetInterest();
    if (this_present_interest || that_present_interest) {
      if (!(this_present_interest && that_present_interest))
        return false;
      if (!this.interest.equals(that.interest))
        return false;
    }

    boolean this_present_character = true && this.isSetCharacter();
    boolean that_present_character = true && that.isSetCharacter();
    if (this_present_character || that_present_character) {
      if (!(this_present_character && that_present_character))
        return false;
      if (!this.character.equals(that.character))
        return false;
    }

    boolean this_present_sign_name = true && this.isSetSign_name();
    boolean that_present_sign_name = true && that.isSetSign_name();
    if (this_present_sign_name || that_present_sign_name) {
      if (!(this_present_sign_name && that_present_sign_name))
        return false;
      if (!this.sign_name.equals(that.sign_name))
        return false;
    }

    boolean this_present_chest = true;
    boolean that_present_chest = true;
    if (this_present_chest || that_present_chest) {
      if (!(this_present_chest && that_present_chest))
        return false;
      if (this.chest != that.chest)
        return false;
    }

    boolean this_present_waist = true;
    boolean that_present_waist = true;
    if (this_present_waist || that_present_waist) {
      if (!(this_present_waist && that_present_waist))
        return false;
      if (this.waist != that.waist)
        return false;
    }

    boolean this_present_hip = true;
    boolean that_present_hip = true;
    if (this_present_hip || that_present_hip) {
      if (!(this_present_hip && that_present_hip))
        return false;
      if (this.hip != that.hip)
        return false;
    }

    boolean this_present_address = true && this.isSetAddress();
    boolean that_present_address = true && that.isSetAddress();
    if (this_present_address || that_present_address) {
      if (!(this_present_address && that_present_address))
        return false;
      if (!this.address.equals(that.address))
        return false;
    }

    boolean this_present_session_id = true && this.isSetSession_id();
    boolean that_present_session_id = true && that.isSetSession_id();
    if (this_present_session_id || that_present_session_id) {
      if (!(this_present_session_id && that_present_session_id))
        return false;
      if (!this.session_id.equals(that.session_id))
        return false;
    }

    boolean this_present_session_key = true && this.isSetSession_key();
    boolean that_present_session_key = true && that.isSetSession_key();
    if (this_present_session_key || that_present_session_key) {
      if (!(this_present_session_key && that_present_session_key))
        return false;
      if (!this.session_key.equals(that.session_key))
        return false;
    }

    boolean this_present_ticket_iv = true && this.isSetTicket_iv();
    boolean that_present_ticket_iv = true && that.isSetTicket_iv();
    if (this_present_ticket_iv || that_present_ticket_iv) {
      if (!(this_present_ticket_iv && that_present_ticket_iv))
        return false;
      if (!this.ticket_iv.equals(that.ticket_iv))
        return false;
    }

    boolean this_present_client_ip = true && this.isSetClient_ip();
    boolean that_present_client_ip = true && that.isSetClient_ip();
    if (this_present_client_ip || that_present_client_ip) {
      if (!(this_present_client_ip && that_present_client_ip))
        return false;
      if (!this.client_ip.equals(that.client_ip))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ClientLoginResUserInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ClientLoginResUserInfo typedOther = (ClientLoginResUserInfo)other;

    lastComparison = Boolean.valueOf(isSetUser_id()).compareTo(typedOther.isSetUser_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser_id()) {
      lastComparison = TBaseHelper.compareTo(this.user_id, typedOther.user_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUser_name()).compareTo(typedOther.isSetUser_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser_name()) {
      lastComparison = TBaseHelper.compareTo(this.user_name, typedOther.user_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEmail()).compareTo(typedOther.isSetEmail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmail()) {
      lastComparison = TBaseHelper.compareTo(this.email, typedOther.email);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNick_name()).compareTo(typedOther.isSetNick_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNick_name()) {
      lastComparison = TBaseHelper.compareTo(this.nick_name, typedOther.nick_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAvatar_url()).compareTo(typedOther.isSetAvatar_url());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAvatar_url()) {
      lastComparison = TBaseHelper.compareTo(this.avatar_url, typedOther.avatar_url);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBirthdate()).compareTo(typedOther.isSetBirthdate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBirthdate()) {
      lastComparison = TBaseHelper.compareTo(this.birthdate, typedOther.birthdate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBase_role_id()).compareTo(typedOther.isSetBase_role_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBase_role_id()) {
      lastComparison = TBaseHelper.compareTo(this.base_role_id, typedOther.base_role_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDecolor()).compareTo(typedOther.isSetDecolor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDecolor()) {
      lastComparison = TBaseHelper.compareTo(this.decolor, typedOther.decolor);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDecolor_endtime()).compareTo(typedOther.isSetDecolor_endtime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDecolor_endtime()) {
      lastComparison = TBaseHelper.compareTo(this.decolor_endtime, typedOther.decolor_endtime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrize_role_id()).compareTo(typedOther.isSetPrize_role_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrize_role_id()) {
      lastComparison = TBaseHelper.compareTo(this.prize_role_id, typedOther.prize_role_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrize_role_endtime()).compareTo(typedOther.isSetPrize_role_endtime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrize_role_endtime()) {
      lastComparison = TBaseHelper.compareTo(this.prize_role_endtime, typedOther.prize_role_endtime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGood_number()).compareTo(typedOther.isSetGood_number());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGood_number()) {
      lastComparison = TBaseHelper.compareTo(this.good_number, typedOther.good_number);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGood_number_role_id()).compareTo(typedOther.isSetGood_number_role_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGood_number_role_id()) {
      lastComparison = TBaseHelper.compareTo(this.good_number_role_id, typedOther.good_number_role_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGood_number_role_id_starttime()).compareTo(typedOther.isSetGood_number_role_id_starttime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGood_number_role_id_starttime()) {
      lastComparison = TBaseHelper.compareTo(this.good_number_role_id_starttime, typedOther.good_number_role_id_starttime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGood_number_role_id_endtime()).compareTo(typedOther.isSetGood_number_role_id_endtime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGood_number_role_id_endtime()) {
      lastComparison = TBaseHelper.compareTo(this.good_number_role_id_endtime, typedOther.good_number_role_id_endtime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetKmoney()).compareTo(typedOther.isSetKmoney());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKmoney()) {
      lastComparison = TBaseHelper.compareTo(this.kmoney, typedOther.kmoney);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGiftmoney()).compareTo(typedOther.isSetGiftmoney());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGiftmoney()) {
      lastComparison = TBaseHelper.compareTo(this.giftmoney, typedOther.giftmoney);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVideo_gift_id()).compareTo(typedOther.isSetVideo_gift_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVideo_gift_id()) {
      lastComparison = TBaseHelper.compareTo(this.video_gift_id, typedOther.video_gift_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVideo_gift_end_time()).compareTo(typedOther.isSetVideo_gift_end_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVideo_gift_end_time()) {
      lastComparison = TBaseHelper.compareTo(this.video_gift_end_time, typedOther.video_gift_end_time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStamp_gift_id()).compareTo(typedOther.isSetStamp_gift_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStamp_gift_id()) {
      lastComparison = TBaseHelper.compareTo(this.stamp_gift_id, typedOther.stamp_gift_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStamp_gift_end_time()).compareTo(typedOther.isSetStamp_gift_end_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStamp_gift_end_time()) {
      lastComparison = TBaseHelper.compareTo(this.stamp_gift_end_time, typedOther.stamp_gift_end_time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExp_level()).compareTo(typedOther.isSetExp_level());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExp_level()) {
      lastComparison = TBaseHelper.compareTo(this.exp_level, typedOther.exp_level);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExp_value()).compareTo(typedOther.isSetExp_value());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExp_value()) {
      lastComparison = TBaseHelper.compareTo(this.exp_value, typedOther.exp_value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExp_rank()).compareTo(typedOther.isSetExp_rank());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExp_rank()) {
      lastComparison = TBaseHelper.compareTo(this.exp_rank, typedOther.exp_rank);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGender()).compareTo(typedOther.isSetGender());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGender()) {
      lastComparison = TBaseHelper.compareTo(this.gender, typedOther.gender);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChinese_zodiac()).compareTo(typedOther.isSetChinese_zodiac());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChinese_zodiac()) {
      lastComparison = TBaseHelper.compareTo(this.chinese_zodiac, typedOther.chinese_zodiac);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetZodiac()).compareTo(typedOther.isSetZodiac());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetZodiac()) {
      lastComparison = TBaseHelper.compareTo(this.zodiac, typedOther.zodiac);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBlood_type()).compareTo(typedOther.isSetBlood_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBlood_type()) {
      lastComparison = TBaseHelper.compareTo(this.blood_type, typedOther.blood_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInterest()).compareTo(typedOther.isSetInterest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInterest()) {
      lastComparison = TBaseHelper.compareTo(this.interest, typedOther.interest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCharacter()).compareTo(typedOther.isSetCharacter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCharacter()) {
      lastComparison = TBaseHelper.compareTo(this.character, typedOther.character);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSign_name()).compareTo(typedOther.isSetSign_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSign_name()) {
      lastComparison = TBaseHelper.compareTo(this.sign_name, typedOther.sign_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChest()).compareTo(typedOther.isSetChest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChest()) {
      lastComparison = TBaseHelper.compareTo(this.chest, typedOther.chest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWaist()).compareTo(typedOther.isSetWaist());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWaist()) {
      lastComparison = TBaseHelper.compareTo(this.waist, typedOther.waist);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHip()).compareTo(typedOther.isSetHip());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHip()) {
      lastComparison = TBaseHelper.compareTo(this.hip, typedOther.hip);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAddress()).compareTo(typedOther.isSetAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAddress()) {
      lastComparison = TBaseHelper.compareTo(this.address, typedOther.address);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSession_id()).compareTo(typedOther.isSetSession_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSession_id()) {
      lastComparison = TBaseHelper.compareTo(this.session_id, typedOther.session_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSession_key()).compareTo(typedOther.isSetSession_key());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSession_key()) {
      lastComparison = TBaseHelper.compareTo(this.session_key, typedOther.session_key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTicket_iv()).compareTo(typedOther.isSetTicket_iv());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTicket_iv()) {
      lastComparison = TBaseHelper.compareTo(this.ticket_iv, typedOther.ticket_iv);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClient_ip()).compareTo(typedOther.isSetClient_ip());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClient_ip()) {
      lastComparison = TBaseHelper.compareTo(this.client_ip, typedOther.client_ip);
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
        case 1: // USER_ID
          if (field.type == TType.I32) {
            this.user_id = iprot.readI32();
            setUser_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // USER_NAME
          if (field.type == TType.STRING) {
            this.user_name = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // EMAIL
          if (field.type == TType.STRING) {
            this.email = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // NICK_NAME
          if (field.type == TType.STRING) {
            this.nick_name = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // AVATAR_URL
          if (field.type == TType.STRING) {
            this.avatar_url = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // BIRTHDATE
          if (field.type == TType.STRING) {
            this.birthdate = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // BASE_ROLE_ID
          if (field.type == TType.I16) {
            this.base_role_id = iprot.readI16();
            setBase_role_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // DECOLOR
          if (field.type == TType.I32) {
            this.decolor = iprot.readI32();
            setDecolorIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 9: // DECOLOR_ENDTIME
          if (field.type == TType.I64) {
            this.decolor_endtime = iprot.readI64();
            setDecolor_endtimeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 10: // PRIZE_ROLE_ID
          if (field.type == TType.I16) {
            this.prize_role_id = iprot.readI16();
            setPrize_role_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 11: // PRIZE_ROLE_ENDTIME
          if (field.type == TType.I64) {
            this.prize_role_endtime = iprot.readI64();
            setPrize_role_endtimeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 12: // GOOD_NUMBER
          if (field.type == TType.I32) {
            this.good_number = iprot.readI32();
            setGood_numberIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 13: // GOOD_NUMBER_ROLE_ID
          if (field.type == TType.I16) {
            this.good_number_role_id = iprot.readI16();
            setGood_number_role_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 14: // GOOD_NUMBER_ROLE_ID_STARTTIME
          if (field.type == TType.I64) {
            this.good_number_role_id_starttime = iprot.readI64();
            setGood_number_role_id_starttimeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 15: // GOOD_NUMBER_ROLE_ID_ENDTIME
          if (field.type == TType.I64) {
            this.good_number_role_id_endtime = iprot.readI64();
            setGood_number_role_id_endtimeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 16: // KMONEY
          if (field.type == TType.I64) {
            this.kmoney = iprot.readI64();
            setKmoneyIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 17: // GIFTMONEY
          if (field.type == TType.I64) {
            this.giftmoney = iprot.readI64();
            setGiftmoneyIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 18: // VIDEO_GIFT_ID
          if (field.type == TType.I32) {
            this.video_gift_id = iprot.readI32();
            setVideo_gift_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 19: // VIDEO_GIFT_END_TIME
          if (field.type == TType.I64) {
            this.video_gift_end_time = iprot.readI64();
            setVideo_gift_end_timeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 20: // STAMP_GIFT_ID
          if (field.type == TType.I32) {
            this.stamp_gift_id = iprot.readI32();
            setStamp_gift_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 21: // STAMP_GIFT_END_TIME
          if (field.type == TType.I64) {
            this.stamp_gift_end_time = iprot.readI64();
            setStamp_gift_end_timeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 22: // EXP_LEVEL
          if (field.type == TType.I16) {
            this.exp_level = iprot.readI16();
            setExp_levelIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 23: // EXP_VALUE
          if (field.type == TType.I32) {
            this.exp_value = iprot.readI32();
            setExp_valueIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 24: // EXP_RANK
          if (field.type == TType.I32) {
            this.exp_rank = iprot.readI32();
            setExp_rankIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 25: // GENDER
          if (field.type == TType.BYTE) {
            this.gender = iprot.readByte();
            setGenderIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 26: // CHINESE_ZODIAC
          if (field.type == TType.STRING) {
            this.chinese_zodiac = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 27: // ZODIAC
          if (field.type == TType.STRING) {
            this.zodiac = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 28: // BLOOD_TYPE
          if (field.type == TType.STRING) {
            this.blood_type = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 29: // INTEREST
          if (field.type == TType.STRING) {
            this.interest = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 30: // CHARACTER
          if (field.type == TType.STRING) {
            this.character = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 31: // SIGN_NAME
          if (field.type == TType.STRING) {
            this.sign_name = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 32: // CHEST
          if (field.type == TType.I16) {
            this.chest = iprot.readI16();
            setChestIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 33: // WAIST
          if (field.type == TType.I16) {
            this.waist = iprot.readI16();
            setWaistIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 34: // HIP
          if (field.type == TType.I16) {
            this.hip = iprot.readI16();
            setHipIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 35: // ADDRESS
          if (field.type == TType.STRING) {
            this.address = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 36: // SESSION_ID
          if (field.type == TType.STRING) {
            this.session_id = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 37: // SESSION_KEY
          if (field.type == TType.STRING) {
            this.session_key = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 38: // TICKET_IV
          if (field.type == TType.STRING) {
            this.ticket_iv = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 39: // CLIENT_IP
          if (field.type == TType.STRING) {
            this.client_ip = iprot.readString();
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
    oprot.writeFieldBegin(USER_ID_FIELD_DESC);
    oprot.writeI32(this.user_id);
    oprot.writeFieldEnd();
    if (this.user_name != null) {
      oprot.writeFieldBegin(USER_NAME_FIELD_DESC);
      oprot.writeString(this.user_name);
      oprot.writeFieldEnd();
    }
    if (this.email != null) {
      oprot.writeFieldBegin(EMAIL_FIELD_DESC);
      oprot.writeString(this.email);
      oprot.writeFieldEnd();
    }
    if (this.nick_name != null) {
      oprot.writeFieldBegin(NICK_NAME_FIELD_DESC);
      oprot.writeString(this.nick_name);
      oprot.writeFieldEnd();
    }
    if (this.avatar_url != null) {
      oprot.writeFieldBegin(AVATAR_URL_FIELD_DESC);
      oprot.writeString(this.avatar_url);
      oprot.writeFieldEnd();
    }
    if (this.birthdate != null) {
      oprot.writeFieldBegin(BIRTHDATE_FIELD_DESC);
      oprot.writeString(this.birthdate);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(BASE_ROLE_ID_FIELD_DESC);
    oprot.writeI16(this.base_role_id);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(DECOLOR_FIELD_DESC);
    oprot.writeI32(this.decolor);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(DECOLOR_ENDTIME_FIELD_DESC);
    oprot.writeI64(this.decolor_endtime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(PRIZE_ROLE_ID_FIELD_DESC);
    oprot.writeI16(this.prize_role_id);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(PRIZE_ROLE_ENDTIME_FIELD_DESC);
    oprot.writeI64(this.prize_role_endtime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(GOOD_NUMBER_FIELD_DESC);
    oprot.writeI32(this.good_number);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(GOOD_NUMBER_ROLE_ID_FIELD_DESC);
    oprot.writeI16(this.good_number_role_id);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(GOOD_NUMBER_ROLE_ID_STARTTIME_FIELD_DESC);
    oprot.writeI64(this.good_number_role_id_starttime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(GOOD_NUMBER_ROLE_ID_ENDTIME_FIELD_DESC);
    oprot.writeI64(this.good_number_role_id_endtime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(KMONEY_FIELD_DESC);
    oprot.writeI64(this.kmoney);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(GIFTMONEY_FIELD_DESC);
    oprot.writeI64(this.giftmoney);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(VIDEO_GIFT_ID_FIELD_DESC);
    oprot.writeI32(this.video_gift_id);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(VIDEO_GIFT_END_TIME_FIELD_DESC);
    oprot.writeI64(this.video_gift_end_time);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(STAMP_GIFT_ID_FIELD_DESC);
    oprot.writeI32(this.stamp_gift_id);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(STAMP_GIFT_END_TIME_FIELD_DESC);
    oprot.writeI64(this.stamp_gift_end_time);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(EXP_LEVEL_FIELD_DESC);
    oprot.writeI16(this.exp_level);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(EXP_VALUE_FIELD_DESC);
    oprot.writeI32(this.exp_value);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(EXP_RANK_FIELD_DESC);
    oprot.writeI32(this.exp_rank);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(GENDER_FIELD_DESC);
    oprot.writeByte(this.gender);
    oprot.writeFieldEnd();
    if (this.chinese_zodiac != null) {
      oprot.writeFieldBegin(CHINESE_ZODIAC_FIELD_DESC);
      oprot.writeString(this.chinese_zodiac);
      oprot.writeFieldEnd();
    }
    if (this.zodiac != null) {
      oprot.writeFieldBegin(ZODIAC_FIELD_DESC);
      oprot.writeString(this.zodiac);
      oprot.writeFieldEnd();
    }
    if (this.blood_type != null) {
      oprot.writeFieldBegin(BLOOD_TYPE_FIELD_DESC);
      oprot.writeString(this.blood_type);
      oprot.writeFieldEnd();
    }
    if (this.interest != null) {
      oprot.writeFieldBegin(INTEREST_FIELD_DESC);
      oprot.writeString(this.interest);
      oprot.writeFieldEnd();
    }
    if (this.character != null) {
      oprot.writeFieldBegin(CHARACTER_FIELD_DESC);
      oprot.writeString(this.character);
      oprot.writeFieldEnd();
    }
    if (this.sign_name != null) {
      oprot.writeFieldBegin(SIGN_NAME_FIELD_DESC);
      oprot.writeString(this.sign_name);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(CHEST_FIELD_DESC);
    oprot.writeI16(this.chest);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(WAIST_FIELD_DESC);
    oprot.writeI16(this.waist);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(HIP_FIELD_DESC);
    oprot.writeI16(this.hip);
    oprot.writeFieldEnd();
    if (this.address != null) {
      oprot.writeFieldBegin(ADDRESS_FIELD_DESC);
      oprot.writeString(this.address);
      oprot.writeFieldEnd();
    }
    if (this.session_id != null) {
      oprot.writeFieldBegin(SESSION_ID_FIELD_DESC);
      oprot.writeString(this.session_id);
      oprot.writeFieldEnd();
    }
    if (this.session_key != null) {
      oprot.writeFieldBegin(SESSION_KEY_FIELD_DESC);
      oprot.writeString(this.session_key);
      oprot.writeFieldEnd();
    }
    if (this.ticket_iv != null) {
      oprot.writeFieldBegin(TICKET_IV_FIELD_DESC);
      oprot.writeString(this.ticket_iv);
      oprot.writeFieldEnd();
    }
    if (this.client_ip != null) {
      oprot.writeFieldBegin(CLIENT_IP_FIELD_DESC);
      oprot.writeString(this.client_ip);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ClientLoginResUserInfo(");
    boolean first = true;

    sb.append("user_id:");
    sb.append(this.user_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("user_name:");
    if (this.user_name == null) {
      sb.append("null");
    } else {
      sb.append(this.user_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("email:");
    if (this.email == null) {
      sb.append("null");
    } else {
      sb.append(this.email);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nick_name:");
    if (this.nick_name == null) {
      sb.append("null");
    } else {
      sb.append(this.nick_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("avatar_url:");
    if (this.avatar_url == null) {
      sb.append("null");
    } else {
      sb.append(this.avatar_url);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("birthdate:");
    if (this.birthdate == null) {
      sb.append("null");
    } else {
      sb.append(this.birthdate);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("base_role_id:");
    sb.append(this.base_role_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("decolor:");
    sb.append(this.decolor);
    first = false;
    if (!first) sb.append(", ");
    sb.append("decolor_endtime:");
    sb.append(this.decolor_endtime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("prize_role_id:");
    sb.append(this.prize_role_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("prize_role_endtime:");
    sb.append(this.prize_role_endtime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("good_number:");
    sb.append(this.good_number);
    first = false;
    if (!first) sb.append(", ");
    sb.append("good_number_role_id:");
    sb.append(this.good_number_role_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("good_number_role_id_starttime:");
    sb.append(this.good_number_role_id_starttime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("good_number_role_id_endtime:");
    sb.append(this.good_number_role_id_endtime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("kmoney:");
    sb.append(this.kmoney);
    first = false;
    if (!first) sb.append(", ");
    sb.append("giftmoney:");
    sb.append(this.giftmoney);
    first = false;
    if (!first) sb.append(", ");
    sb.append("video_gift_id:");
    sb.append(this.video_gift_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("video_gift_end_time:");
    sb.append(this.video_gift_end_time);
    first = false;
    if (!first) sb.append(", ");
    sb.append("stamp_gift_id:");
    sb.append(this.stamp_gift_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("stamp_gift_end_time:");
    sb.append(this.stamp_gift_end_time);
    first = false;
    if (!first) sb.append(", ");
    sb.append("exp_level:");
    sb.append(this.exp_level);
    first = false;
    if (!first) sb.append(", ");
    sb.append("exp_value:");
    sb.append(this.exp_value);
    first = false;
    if (!first) sb.append(", ");
    sb.append("exp_rank:");
    sb.append(this.exp_rank);
    first = false;
    if (!first) sb.append(", ");
    sb.append("gender:");
    sb.append(this.gender);
    first = false;
    if (!first) sb.append(", ");
    sb.append("chinese_zodiac:");
    if (this.chinese_zodiac == null) {
      sb.append("null");
    } else {
      sb.append(this.chinese_zodiac);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("zodiac:");
    if (this.zodiac == null) {
      sb.append("null");
    } else {
      sb.append(this.zodiac);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("blood_type:");
    if (this.blood_type == null) {
      sb.append("null");
    } else {
      sb.append(this.blood_type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("interest:");
    if (this.interest == null) {
      sb.append("null");
    } else {
      sb.append(this.interest);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("character:");
    if (this.character == null) {
      sb.append("null");
    } else {
      sb.append(this.character);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sign_name:");
    if (this.sign_name == null) {
      sb.append("null");
    } else {
      sb.append(this.sign_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("chest:");
    sb.append(this.chest);
    first = false;
    if (!first) sb.append(", ");
    sb.append("waist:");
    sb.append(this.waist);
    first = false;
    if (!first) sb.append(", ");
    sb.append("hip:");
    sb.append(this.hip);
    first = false;
    if (!first) sb.append(", ");
    sb.append("address:");
    if (this.address == null) {
      sb.append("null");
    } else {
      sb.append(this.address);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("session_id:");
    if (this.session_id == null) {
      sb.append("null");
    } else {
      sb.append(this.session_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("session_key:");
    if (this.session_key == null) {
      sb.append("null");
    } else {
      sb.append(this.session_key);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ticket_iv:");
    if (this.ticket_iv == null) {
      sb.append("null");
    } else {
      sb.append(this.ticket_iv);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("client_ip:");
    if (this.client_ip == null) {
      sb.append("null");
    } else {
      sb.append(this.client_ip);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

