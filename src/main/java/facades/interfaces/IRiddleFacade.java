/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades.interfaces;

import entities.interfaces.IRiddle;

/**
 *
 * @author benja
 */
public interface IRiddleFacade <E>{
    
    public <E> IRiddle<E> getRandRiddle(int level);
    public <E> IRiddle<E> getRiddleByType(int type, int level); //Figure out how to identify what type of puzzle
    public boolean giveAnswer(E answer, int id);
    public E getHint(int id);
}
