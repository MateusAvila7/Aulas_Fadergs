
package aulaheranca;

/**
 *
 * @author Mateus
 */
public class AulaHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Carro c1 = new Carro(" versailles ", 5 );
//        c1.cadastrar();
//        c1.imprimir();
//          c1.andar();
//          c1.andar(2);
//          c1.andar(2.0);
          System.err.println("O consumo foi:"+ (c1.getConsumo(30)) + " gasto");
          
        Moto m1 = new Moto(" Biz ", 125 );
//        m1.cadastrar();
//        m1.imprimir();  
         System.err.println("O consumo foi:"+ (m1.getConsumo(30)) + " gasto");



    }
    
    
}
