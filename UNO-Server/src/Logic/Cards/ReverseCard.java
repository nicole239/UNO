/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Cards;

import uno.conexion.ICard;
import uno.conexion.CardColor;

import Logic.Table.Table;

/**
 *
 * @author Nicole
 */
public class ReverseCard extends AbstractCard implements ICard{
    
    public ReverseCard(CardColor color){
        this.color = color;
        this.number = 11;
    }

    @Override
    public void playCard() {
       Table table =  Table.getInstance();
       table.changeDirection();
    }
    
}
