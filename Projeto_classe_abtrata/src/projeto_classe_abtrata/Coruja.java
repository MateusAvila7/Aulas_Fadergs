
package projeto_classe_abtrata;

/**
 *
 * @author Mateus
 */
public class Coruja extends Ave{

    @Override
    public void voar() {
        System.err.println("Coruja vul");
    }

    @Override
    public void cadastrar() {
        System.err.println("Coruja cadastrada");
    }

    @Override
    public boolean editar() {
        System.err.println("Coruja editada");
        return true;
    }

    @Override
    public int ponhar() {
        return 2; 
    }
    
    
    
}
