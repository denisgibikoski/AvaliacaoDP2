/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.classes;


import iterator.classes.Produto;

/**
 *
 * @author denis
 */
public class Chocolate extends Produto{

   
    
    public Chocolate(String descricao, double preco, String setor) {
        super(descricao, preco, setor);
    }
    
    public void analisarValidade(){
        System.out.println("Analizando Validade");
    }
    
}
