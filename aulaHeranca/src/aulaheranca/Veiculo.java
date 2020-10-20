
package aulaheranca;

import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class Veiculo {
    
    public int id;
    public String modelo;
    public String placa;
    protected String marca;
    private String chassi;
    
    
    public Veiculo(){
        
    }
    public Veiculo(String modelo ){ //parametro
        this.modelo = modelo;
    }
    public void cadastrar(){
        
        JOptionPane.showMessageDialog(null,"Veiculo " + this.modelo
                                       + " cadastro!");
        
        System.out.println("Veiculo" + this.modelo + "cadastro");
    }
    public void imprimir (){
        String t = "Veiculo: " + this.modelo;
        JOptionPane.showMessageDialog(null, t );
    }
    
    protected double getConsumo(int km){
        double consumo = km / 10;
        return consumo;
        
    }
    
}
