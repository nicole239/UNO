/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Cards;

import Logic.Table.Table;
import uno.conexion.ICard;
import uno.conexion.CardColor;

/**
 *
 * @author Nicole
 */
public class SkipCard extends AbstractCard implements ICard {
    
    public SkipCard(CardColor color){
        this.color = color;
        this.number = 10;   
            
    }

    @Override
    public void playCard() {
       Table table = Table.getInstance();
       table.changeCurrentPlayer();
    }
    
}
