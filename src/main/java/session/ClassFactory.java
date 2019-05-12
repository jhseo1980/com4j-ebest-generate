package session  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * XASession Class
   */
  public static session.IXASession createXASession() {
    return COM4J.createInstance( session.IXASession.class, "{7FEF321C-6BFD-413C-AA80-541A275434A1}" );
  }
}
