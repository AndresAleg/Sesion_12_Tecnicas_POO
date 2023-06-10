package excepciones;

/**
 *
 * @author Andres
 */
public class Utilitario {
    /**
    * Esta funcion permite convertir un texto en numero
    * y controlar los errores que se pueden presentar a
    * partir de ello.
    * @param numeroEnTexto El numero a convertir
    * @return Devuelve un numero entero (int)
     */
    public static int convertir(String numeroEnTexto) 
            throws MiExcepcionNumerica, MiExcepcionGenerica {
        
        try {
            return Integer.parseInt(numeroEnTexto);
        } catch (NumberFormatException s) {
            throw new MiExcepcionNumerica();
        } catch (Exception ex) {
            throw new MiExcepcionGenerica();
        }
    }
}
