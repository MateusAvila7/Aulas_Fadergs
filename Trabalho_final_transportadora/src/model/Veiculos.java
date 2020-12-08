
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class Veiculos {
    
    public String marca;
    public String placa;
    public String codigo;
    
    
    public Veiculos(){
        
    }
    public Veiculos(String marca){
        this.marca = marca;
    }
    public Veiculos(String placa, String codigo){
        this.placa = placa ;
        this.codigo = codigo;
    }
    
    public void imprimir(){
        String texto  = "Marca: "  + this.marca + "\n Código: "
                +this.codigo;
        JOptionPane.showMessageDialog(null,texto);
        
    }
}
