
package atividade1;

import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Produto p = new Produto();
        p.NomeProduto = JOptionPane.showInputDialog("Informe o nome do produto: ");
        p.PrecoProduto = Integer.valueOf(JOptionPane.showInputDialog("Informe o preço do produto: "));
        p.quantiProduto = Integer.valueOf(JOptionPane.showInputDialog("Informe a quantidade do produto: "));
        
       // System.err.println(" Nome do produto: " + Produto.class);
        
    }
    
}
