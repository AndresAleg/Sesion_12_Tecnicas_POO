package excepciones;

/**
 *
 * @author Andres
 */
public class MiExcepcionGenerica extends Exception {
    
    private final static String MENSAJE = "" 
        + "Esta es una excepcion general, "
        + "y no sabemos la causa";
    
    public MiExcepcionGenerica() {
        super(MENSAJE);
    }
}
