/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Table;

import uno.conexion.ICard;


/**
 *
 * @author Nicole
 */
public class Stack {
    ICard top;
    
    public Stack(ICard firstCard){
        this.top = firstCard;
    }
    
    public boolean addCard(ICard nextCard){
        if(nextCard.isValid(top)){
            this.top = nextCard;
            return true;
        }
        return false;
    }
}
