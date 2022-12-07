/** */
package main.java.exceptions;

/**
 * @author rodrigo.pires
 */
public class DAOException extends RuntimeException {

  private static final long serialVersionUID = 7054379063290825137L;

  public DAOException(String msg, Exception ex) {
    super(msg, ex);
  }
}
