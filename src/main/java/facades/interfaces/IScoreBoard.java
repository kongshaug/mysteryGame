/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades.interfaces;

import entities.interfaces.IScore;

/**
 *
 * @author benja
 * @param <E>
 */
public interface IScoreBoard <E>{
    
    public E getAllScores(); //Change to list of score Entities
    
    public void setScore(String name, int score, int numOfRiddles);

    /**
     *
     * @param <E>
     * @param name
     * @return
     */
    public <E> IScore<E> getScore(String name);
    
}
