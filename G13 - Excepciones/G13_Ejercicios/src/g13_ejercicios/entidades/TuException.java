
package g13_ejercicios.entidades;

public class TuException extends Exception {

    /**
     * Creates a new instance of <code>TuException</code> without detail
     * message.
     */
    public TuException() {
    }

    /**
     * Constructs an instance of <code>TuException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public TuException(String msg) {
        super(msg);
    }
}
