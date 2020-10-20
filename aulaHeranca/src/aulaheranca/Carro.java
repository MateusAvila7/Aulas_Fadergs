
package aulaheranca;

import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class Carro extends Veiculo{
    
    public int nPortas;
    
    public Carro (){
        
    }
    public Carro (String modelo){
//        this.modelo = modelo;
        super(modelo);
    }
    public Carro (int  nPortas){
        super();
        this.nPortas = nPortas;
    }
    public Carro (String modelo, int nPortas){
//        this.modelo = modelo;
        super(modelo);
        this.nPortas = nPortas; 
    }
    public Carro (int nPortas, String placa){
        super();
        this.placa = placa;
        this.nPortas = nPortas; 
    }
    
    public void andar(){
        System.err.println("O carro andou");
    }
    public void andar(int km){
        System.err.println("O carro andou " + (km * 1000) + " metros ");
    }
    public void andar(double km){
        System.err.println("O carro andou " + (km * 100000) + " centimetro ");
    }
    

    @Override
    public void cadastrar() {
        super.cadastrar();
        String t = " Carro " + this.modelo + " que tem " + 
                this.nPortas + " portas, cadastrar";
        System.err.println(t);
    }

    @Override
    public void imprimir() {
        String t = "Carro: " + this.modelo + "\n" +
                "Numero de portas : " + this.nPortas;
        JOptionPane.showMessageDialog(null, t );
        
    }

    @Override
    public double getConsumo(int km) {
        return (km / 15); 
    }
    
    
    
    
}
