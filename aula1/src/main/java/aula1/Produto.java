
package aula1;


public class Produto {
    
    //Atributos
    public int codigo;
    public String marca, modelo;
    public double preco;
    public Double quantidade;
    public boolean perecivel;
    
    //Metodos get e set 
    
    public int getCodigo(){
        return this.codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public String getMarca(){
        return marca;
    }
    public void setmarca(String _marca){
        marca = _marca;
    }
            
            
            
    //Metodos construtores
    public Produto(){
        
    }
   
    public Produto(String _marca){
        this.marca = _marca;
    }
    public Produto(String modelo, String marca){
        this.modelo = modelo;
        this.marca = marca;
    }
    public Produto(String modelo, String marca, double preco){
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }
    public Produto(double preco, String modelo, String marca){
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }
}
