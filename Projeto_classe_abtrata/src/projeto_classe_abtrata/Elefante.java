
package projeto_classe_abtrata;

/**
 *
 * @author Mateus
 */
public class Elefante extends Mamifero{

    @Override
    public void amamentar() {
        System.err.println("Elefante amamentado");
    }

    @Override
    public void cadastrar() {
        System.err.println("Elefante cadastrado");
    }

    @Override
    public boolean editar() {
        System.err.println("Elefante editado ");
        return true;
    }
    
    
    
}
