/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Dell
 */
public class NegociosException extends Exception {

    /**
     * Constructor por defecto de la excepción de negocios.
     */
    public NegociosException() {
    }

    /**
     * Constructor que acepta un mensaje de error.
     * 
     * @param message El mensaje de error.
     */
    public NegociosException(String message) {
        super(message);
    }

    /**
     * Constructor que acepta un mensaje de error y una causa raíz.
     * 
     * @param message El mensaje de error.
     * @param cause La causa raíz de la excepción.
     */
    public NegociosException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor que acepta una causa raíz.
     * 
     * @param cause La causa raíz de la excepción.
     */
    public NegociosException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructor que acepta un mensaje de error, una causa raíz, y dos booleanos
     * que indican si la supresión de la pila de llamadas y la escritura de la pila
     * de llamadas están habilitadas o no.
     * 
     * @param message El mensaje de error.
     * @param cause La causa raíz de la excepción.
     * @param enableSuppression Indica si la supresión de la pila de llamadas está habilitada o no.
     * @param writableStackTrace Indica si la escritura de la pila de llamadas está habilitada o no.
     */
    public NegociosException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
