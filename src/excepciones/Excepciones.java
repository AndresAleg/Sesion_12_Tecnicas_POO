package excepciones;

/**
 *
 * @author Andres
 */
public class Excepciones {

    public static void main(String[] args) {
        
        try {
            
            String valorNumerico = "";
            int numero = Utilitario.convertir(valorNumerico);
            System.out.println("El número es: " + numero);
            
        } catch (MiExcepcionNumerica e) {
            System.err.println(e.getMessage());
        } catch (MiExcepcionGenerica e) {
            System.err.println(e.getMessage());
        }
    }
    
}
