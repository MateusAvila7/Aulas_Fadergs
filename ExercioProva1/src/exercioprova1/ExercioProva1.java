
package exercioprova1;

import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class ExercioProva1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Aluno a = new Aluno();
        a.nome = JOptionPane.showInputDialog("Informe o seu nome:");
        a.nota1 = Integer.valueOf(JOptionPane.showInputDialog("Informe a sua primeira nota:"));
        a.nota2 = Integer.valueOf(JOptionPane.showInputDialog("Informe a sua segunda nota:"));
        a.nota3 = Integer.valueOf(JOptionPane.showInputDialog("Informe a sua terceira nota:"));
        
       
        
    }
    
}
