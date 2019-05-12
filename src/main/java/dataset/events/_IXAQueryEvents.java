package dataset.events;

import com4j.*;

/**
 * _IXAQueryEvents Interface
 */
@IID("{AAF89E20-1F84-4B1F-B6EE-617B6F2C9CD4}")
public abstract class _IXAQueryEvents {
  // Methods:
  /**
   * <p>
   * method ReceiveData
   * </p>
   * @param szTrCode Mandatory java.lang.String parameter.
   */

  @DISPID(1)
  public void receiveData(
    java.lang.String szTrCode) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * method ReceiveMessage
   * </p>
   * @param bIsSystemError Mandatory boolean parameter.
   * @param nMessageCode Mandatory java.lang.String parameter.
   * @param szMessage Mandatory java.lang.String parameter.
   */

  @DISPID(2)
  public void receiveMessage(
    boolean bIsSystemError,
    java.lang.String nMessageCode,
    java.lang.String szMessage) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * method ReceiveChartRealData
   * </p>
   * @param szTrCode Mandatory java.lang.String parameter.
   */

  @DISPID(3)
  public void receiveChartRealData(
    java.lang.String szTrCode) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * method ReceiveSearchRealData
   * </p>
   * @param szTrCode Mandatory java.lang.String parameter.
   */

  @DISPID(4)
  public void receiveSearchRealData(
    java.lang.String szTrCode) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
