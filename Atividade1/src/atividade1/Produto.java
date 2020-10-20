/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;



/**
 *
 * @author Mateus
 */
public class Produto {
    
    private int id;
    public String NomeProduto;
    public double PrecoProduto;
    public int quantiProduto;
    
    
   
    

    @Override
    public String toString() {
        return "Nome do produto: " + this.NomeProduto + "Preço do produto:" +
              this.PrecoProduto + "Quantidade do produto: " + this.quantiProduto ;
        
        
        
    }
    
    
}
