/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.classes;

import adapter.interfaces.Analisar;

/**
 *
 * @author denis
 */
public class ChocolateAdapter implements Analisar{
    
    Chocolate chocolate;

    public ChocolateAdapter(Chocolate chocolate) {
        this.chocolate = chocolate;
    }
    
    @Override
    public void analisar() {
        chocolate.analisarValidade();
   }
    
}
