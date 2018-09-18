/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.classes;

import java.util.ArrayList;

/**
 *
 * @author denis
 */
public class Setor  extends ComponentesSetor{
    
    ArrayList<ComponentesSetor>componentes = new ArrayList<>();
    
    private String descricao;

    public Setor(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

   
    @Override
    public void add(ComponentesSetor componente) {
     componentes.add(componente);
    }

  
    @Override
    public void remove(ComponentesSetor componente) {
        componentes.remove(componente); 
    }

    public ComponentesSetor getChild(int i) {
       return (ComponentesSetor) componentes.get(i);
    }

   
    @Override
    public void print(String ident) {
        System.out.println(ident+getDescricao());
        ident += "_";
        for (ComponentesSetor componente : componentes) {
            componente.print(ident);
        }
    }

    
  
    
    
    
}
