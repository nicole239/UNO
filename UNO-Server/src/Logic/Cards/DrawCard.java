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
public class DrawCard extends AbstractCard implements ICard {
    int draw;

    public DrawCard(int number, CardColor color) {
        this.draw = number - 10;
        this.color = color;
        this.number = number;
    }
    
    
    
    @Override
    public void playCard() {
        // player draws draw cards
    }
    
}
