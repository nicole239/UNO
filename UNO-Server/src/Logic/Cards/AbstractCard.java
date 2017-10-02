/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Cards;
import uno.conexion.ICard;
import uno.conexion.CardColor;

/**
 *
 * @author Nicole
 */
public abstract class AbstractCard {
    CardColor color;
    int number;

    boolean colorIsValid(ICard lastCard){
        if(this.color == lastCard.getColor() || this.color == CardColor.BLACK){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean numberIsValid(ICard lastCard){
        if(this.number == lastCard.getNumber() || this.color == CardColor.BLACK){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isValid(ICard lastCard){
        if(colorIsValid(lastCard) && numberIsValid(lastCard)){
            return true;
        }else{
            return false;
        }
    }
  
    public CardColor getColor(){
        return this.color;
    }
    
    public int getNumber(){
        return this.number;
    }
 
}
