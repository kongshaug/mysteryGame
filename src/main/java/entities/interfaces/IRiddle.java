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
public interface IRiddle <E> {
    
    public E get();
    public boolean validate();
    public E hint();
    public int level();
    public int point();
    
    
}
