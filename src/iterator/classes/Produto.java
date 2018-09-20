/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator.classes;

import adapter.interfaces.Analisar;
import composite.classes.ComponentesSetor;

/**
 *
 * @author denis
 */
public class Produto extends ComponentesSetor implements  Analisar{
    
   
    private String descricao;
    private double preco;
    private String setor;

  
    

    public Produto(String descricao, double preco, String setor) {
        this.descricao = descricao;
        this.preco = preco;
        this.setor = setor;
    }

    
    @Override
    public  void print(String ident){
        System.out.println(ident+getDescricao());
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    

   public void analisarQualidade(){
       System.out.println("Analizando Qualidade");
   }

    @Override
    public void analisar() {
       this.analisarQualidade();
    }

    
    
    
}
