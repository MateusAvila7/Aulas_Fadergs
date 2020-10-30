
package projeto_classe_abtrata;

/**
 *
 * @author Mateus
 */
public class Projeto_classe_abtrata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Anaimal a = new Animal();
        
//        Mamifero m = new Mamifero();
//        m.cadastrar();

        Elefante e = new Elefante();
        e.amamentar();
        
        Coruja c = new Coruja();
        System.out.println( "Coruja ponhou " + c.ponhar() + " ovos ");
        
        
    }
    
}
