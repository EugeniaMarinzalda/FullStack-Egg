
package g13_ejercicios.entidades;

public class MioException extends Exception {

    /**
     * Creates a new instance of <code>MioException</code> without detail
     * message.
     */
    public MioException() {
        
    }

    /**
     * Constructs an instance of <code>MioException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public MioException(String msg) {
        super(msg);
    }
}
