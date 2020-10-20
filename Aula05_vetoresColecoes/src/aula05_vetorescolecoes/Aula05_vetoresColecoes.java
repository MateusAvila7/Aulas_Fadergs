
package aula05_vetorescolecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Mateus
 */
public class Aula05_vetoresColecoes {

    
    public static void main(String[] args) {
    
       int idades[];
       double[] alturas;
//        
//        idades = new int[5];
//        alturas = new double[5];
//        String nomes[] = new String[5];
//        
//        idades [0] = 25;
//        alturas [0] = 1.75;
//        nomes [0] = "João";
//        
//        idades [1] = 11;
//        alturas [1] = 1.3;
//        nomes [1] = "Júlia";
//        
//        for( int i =0; i < 5; i++){
//            System.out.println("Nome: " + nomes[i]);
//            System.err.println("Idade:" + idades[i]);
//            System.err.println("altura:" + alturas[i]);
//        }
//     

       Collection<String> listaNomes = new ArrayList<>();
        listaNomes.add("Carlos");
        listaNomes.add("Pricila");
        listaNomes.add("Julia");
        
        System.out.println("Tamnho da oleção: "+ listaNomes.size() );
        
        for(String nome : listaNomes){
            System.err.println( nome ); 
        }
        
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        
        Pessoa p = new Pessoa();
        p.nome = "Rosa";
        p.idade = 21;
        pessoas.add ( p );
        
        Pessoa p2 = new Pessoa();
        p2.nome = JOptionPane.showInputDialog("Informe o nome: ");
        p2.idade = Integer.valueOf( JOptionPane.showInputDialog("Informe a idade: "));
        
        pessoas.add( p2 );
        
         for(Pessoa vivente : pessoas){
            System.err.println( vivente ); 
        }
        System.out.println("Primeira: " + pessoas.get(0).nome);
    }
    
}
