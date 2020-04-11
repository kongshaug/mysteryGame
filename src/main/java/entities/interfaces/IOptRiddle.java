/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.interfaces;

/**
 *
 * @author benja
 * @param <E>
 */
public interface IOptRiddle <E> extends IRiddle<E>{
    
    public E options();
    public void attempt();
    
}
