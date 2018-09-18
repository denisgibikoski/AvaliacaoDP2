/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.interfaces;

import iterator.classes.Produto;

/**
 *
 * @author denis
 */
public interface Observer {
    
    public void update(Produto produto, float  qtdEstoque);
    
}
