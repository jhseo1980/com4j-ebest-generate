package ebest.dataset  ;

import com4j.*;

/**
 * IXAReal Interface
 */
@IID("{ED0FC93A-7879-4C0D-BA8F-71A7E2B5A737}")
public interface IXAReal extends Com4jObject {
  // Methods:
  /**
   * <p>
   * property FileName
   * </p>
   * <p>
   * Getter method for the COM property "ResFileName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String resFileName();


  /**
   * <p>
   * property FileName
   * </p>
   * <p>
   * Setter method for the COM property "ResFileName"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  void resFileName(
    java.lang.String pVal);


  /**
   * <p>
   * property GetTrCode
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String getTrCode();


  /**
   * <p>
   * method LoadFromResFile
   * </p>
   * @param szFileName Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(10)
  boolean loadFromResFile(
    java.lang.String szFileName);


  /**
   * <p>
   * Input Record를 Setting.
   * </p>
   * @param szBlockName Mandatory java.lang.String parameter.
   * @param szFieldName Mandatory java.lang.String parameter.
   * @param szData Mandatory java.lang.String parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(11)
  void setFieldData(
    java.lang.String szBlockName,
    java.lang.String szFieldName,
    java.lang.String szData);


  /**
   * <p>
   * method GetFieldData
   * </p>
   * @param szBlockName Mandatory java.lang.String parameter.
   * @param szFieldName Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String getFieldData(
    java.lang.String szBlockName,
    java.lang.String szFieldName);


  /**
   * <p>
   * method AdviseRealData
   * </p>
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(13)
  void adviseRealData();


  /**
   * <p>
   * method UnadviseRealData
   * </p>
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(14)
  void unadviseRealData();


  /**
   * <p>
   * method UnadviseRealDataWithKey
   * </p>
   * @param szCode Mandatory java.lang.String parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(15)
  void unadviseRealDataWithKey(
    java.lang.String szCode);


  /**
   * <p>
   * method AdviseLinkFromHTS
   * </p>
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(16)
  void adviseLinkFromHTS();


  /**
   * <p>
   * method UnAdviseLinkFromHTS
   * </p>
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(17)
  void unAdviseLinkFromHTS();


  /**
   * <p>
   * method GetBlockData
   * </p>
   * @param szBlockName Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String getBlockData(
    java.lang.String szBlockName);


  // Properties:
}
