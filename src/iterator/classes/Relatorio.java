/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator.classes;

import composite.classes.ComponentesSetor;
import composite.classes.Setor;
import java.util.ArrayList;
import iterator.interfaces.Iterator;



/**
 *
 * @author denis
 */
public class Relatorio {
    
    
    public void imprimeProdutos(Iterator iterator, String descricao){
        System.out.println("===="+descricao+"=======");
        while (iterator.hasNext()) {
            Produto produto = (Produto) iterator.next();
            System.out.println(produto.getDescricao()+": "+produto.getPreco());
            
        }
        
        
        
    }
   
    public void imprimeSetoresFloricultura() {
        System.out.println("Setores Floriculturas");
        ComponentesSetor setores = new Setor("SETORES Floricultura");
        ComponentesSetor buques = new Setor("BUQUES");
        ComponentesSetor cestas = new Setor("CESTAS");
        ComponentesSetor vasos = new Setor("VASOS");
        ComponentesSetor jardim = new Setor("JARDIM");
        
        ComponentesSetor mudas = new Setor("MUDAS");
        ComponentesSetor ferramentas = new Setor("FERRAMENTAS");
       

	ArrayList<Iterator> iteratorsList = new ArrayList<>();
        iteratorsList.add( new ProdutosFloricultura().createIterator());
        
        
        iteratorsList.forEach((iterator) -> {
            while (iterator.hasNext()) {
                Produto produto = (Produto) iterator.next();
                if (null == produto.getSetor()) {
                    setores.add(produto);
                } else switch (produto.getSetor()) {
                    case "Buques":
                        buques.add(produto);
                        break;
                    case "Cestas":
                        cestas.add(produto);
                        break;
                    case "Vasos":
                        vasos.add(produto);
                        break;
                    case "Jardim":
                        jardim.add(produto);
                        break;
                    case "Mudas":    
                        mudas.add(produto);
                        break;
                    case "Ferramentas":
                        ferramentas.add(produto);
                        break;
                    default:
                        setores.add(produto);
                        break;
                }
            }
        });
        setores.add(buques);
        setores.add(cestas);
        setores.add(vasos);
        jardim.add(mudas);
        jardim.add(ferramentas);
        setores.add(jardim);
        
        setores.print("-");
    }    
}
  
