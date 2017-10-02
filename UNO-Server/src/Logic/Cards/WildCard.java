/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Cards;

import Logic.Table.Table;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import uno.conexion.ICard;
import uno.conexion.CardColor;

/**
 *
 * @author Nicole
 */
public class WildCard extends AbstractCard implements ICard {
    
    public WildCard(CardColor color){
        this.color = color;
        this.number = 13;
    }

    @Override
    public void playCard() {
        CardColor newColor = null;
        Table table = Table.getInstance();
        table.setMessage("Pick a color");
        try {
            table.sendMessage();
        } catch (RemoteException ex) {
            Logger.getLogger(WildCard.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.color = newColor;

    }
    
 
    
}
