/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Table;

import java.rmi.RemoteException;
import uno.conexion.ICard;
import java.util.List;

/**
 *
 * @author Nicole
 */
public class Player {
    List<ICard> hand;
    String id;
    boolean myTurn;
    Table table = Table.getInstance();
    
    public Player(){
        for(int i = 0; i < 7 ; i++){
            drawCard();
        }
    }
  
    private void pickCard(int position) throws RemoteException{
        ICard pickedCard = hand.get(position);
        boolean validCard = table.playCard(pickedCard);
        if(!validCard){
            table.setMessage("Invalid Card! Pick another one");
            table.sendMessage();
        }else{
            hand.remove(position);
            this.myTurn = false;
        }
        
    }
    
    private void drawCard(){
        hand.add(table.drawCard());
    }
    
    
            
}
