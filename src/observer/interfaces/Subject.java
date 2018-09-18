/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.interfaces;

/**
 *
 * @author denis
 */
public interface Subject {

    public void registerObserver(Observer observador);

    public void removeObserver(Observer observador);

    public void notifyObservers();

}
