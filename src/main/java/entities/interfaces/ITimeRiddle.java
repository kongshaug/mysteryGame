/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.interfaces;

/**
 *
 * @author benja
 */
public interface ITimeRiddle <E> extends IRiddle<E>{
    
    public void startTimer();
    public void timeOut();
    
}
