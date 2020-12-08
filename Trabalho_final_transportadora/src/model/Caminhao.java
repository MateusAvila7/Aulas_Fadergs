
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class Caminhao  extends Veiculos{
    
    public String eixo;
    
    
    public  Caminhao(){
        super();
    }
    public Caminhao(String marca){
        super(marca);
    }

    @Override
    public void imprimir() {
        String texto  = "Marca: "  + this.marca + "\n Código: "
                +this.codigo + "\n Numero de eixos: " + this.eixo;
        JOptionPane.showMessageDialog(null,texto);
    }
    
    
}
