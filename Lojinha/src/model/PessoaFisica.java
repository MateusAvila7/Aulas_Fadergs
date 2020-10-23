
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class PessoaFisica extends Cliente {
    
    public String CPF;
    
    
    public PessoaFisica(){
        super();
    }
    public PessoaFisica(String nome){
        super(nome);
    }
    public PessoaFisica(int id){
        this.id = id;
    }

    @Override
    public void imprimir() {
        String texto = "Nome " + this.nome + "\n Telefone: "
                +this.telefone + "\nCPF: " + this.CPF;
        JOptionPane.showMessageDialog(null, texto);
    }
    
    
}
