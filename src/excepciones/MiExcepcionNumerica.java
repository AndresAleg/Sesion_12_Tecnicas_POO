package excepciones;

/**
 *
 * @author Andres
 */
public class MiExcepcionNumerica extends Exception {
    
    private final static String MENSAJE = "" 
            +" Error de conversión numérica, "
            + "ingresa un texto que contenga un número";
    
    public MiExcepcionNumerica() {
        super(MENSAJE);
    }
}
