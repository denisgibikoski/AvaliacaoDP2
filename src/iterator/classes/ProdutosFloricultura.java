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
public class ProdutosFloricultura {

    private ArrayList<Produto> produtoList;

    public ProdutosFloricultura() {
        produtoList = new ArrayList<>();
    }

    public void addProduto(String descricao, String setor, double preco) {
        Produto produto = new Produto(descricao, preco, setor);
        produtoList.add(produto);
    }

    public ArrayList<Produto> getProdutos() {
        return produtoList;
    }

    public Iterator createIterator() {
        return new FloriculturaIterator(produtoList);
    }

}
