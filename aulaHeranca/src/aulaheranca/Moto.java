
package aulaheranca;

import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class Moto extends Veiculo{
    
    public int cilindradas;
    
    public Moto(){
        
    }
    public Moto(String modelo, int cilindradas){
        super(modelo);
        this.cilindradas = cilindradas;
        
    }

    @Override
    public void cadastrar() {
       super.cadastrar();
        String t = " Moto " + this.modelo + " que tem " + 
                this.cilindradas + " cilindras , cadastrado";
        System.err.println(t);
    }
    

    @Override
    public void imprimir() {
        String t = "Moto : " + this.modelo + "que tem" +
                 this.cilindradas + " cilindradas, cadastrado!";
        JOptionPane.showMessageDialog(null, t );
    }

    @Override
    protected double getConsumo(int km) {
        double consumo = super.getConsumo(km) / 3;  
        return consumo; 
    }
    
}
