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
public class NormalCard extends AbstractCard implements ICard {


    public NormalCard(int number, CardColor color) {
        this.number = number;
        this.color = color;
       
    }

    @Override
    public void playCard() {
        //Salta al siguiente jugador
    }
    
       

    
}
