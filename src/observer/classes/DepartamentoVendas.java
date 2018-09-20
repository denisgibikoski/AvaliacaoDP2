/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.classes;

import observer.interfaces.Observer;

/**
 *
 * @author denis
 */
public class DepartamentoVendas  implements Observer{
    
    private Veiculo veiculo;
            

    @Override
    public void update(Veiculo veiculo) {
        this.veiculo = veiculo;
        
        display();
        
      }

    private void display() {
        System.out.println("Veiculo utilizado para entrega ");
    }
    
}
