package dataset.events;

import com4j.*;

/**
 * _IXARealEvents Interface
 */
@IID("{16602768-2C96-4D93-984B-E36E7E35BFBE}")
public abstract class _IXARealEvents {
  // Methods:
  /**
   * <p>
   * method ReceiveRealData
   * </p>
   * @param szTrCode Mandatory java.lang.String parameter.
   */

  @DISPID(1)
  public void receiveRealData(
    java.lang.String szTrCode) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * method RecieveLinkData
   * </p>
   * @param szLinkName Mandatory java.lang.String parameter.
   * @param szData Mandatory java.lang.String parameter.
   * @param szFiller Mandatory java.lang.String parameter.
   */

  @DISPID(2)
  public void recieveLinkData(
    java.lang.String szLinkName,
    java.lang.String szData,
    java.lang.String szFiller) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
