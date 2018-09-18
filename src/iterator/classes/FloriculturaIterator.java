/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator.classes;

import iterator.interfaces.Iterator;
import java.util.ArrayList;

/**
 *
 * @author denis
 */
public class FloriculturaIterator implements Iterator {

    private ArrayList<Produto> produto;
    private int index = 0;

    public FloriculturaIterator(ArrayList<Produto> produtos) {
        this.produto = produtos;
    }

    
    public boolean hasNext() {
        return index < produto.size() && produto.get(index) != null;
    }

   
    public Object next() {
        return produto.get(index++);

    }

}