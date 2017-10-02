/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Table;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import uno.conexion.IRemote;
import uno.conexion.ICard;


/**
 *
 * @author Nicole
 */
public class Table extends UnicastRemoteObject implements IRemote{
    private static Table instance = null;
    private boolean direction;
    private Deck deck;
    private Stack stack;
    private Player[] players;
    private int currentPlayer;
    private String message;
  
    public Table(){
        this.direction = true;
        this.deck = new Deck();
        this.stack = new Stack(deck.drawCard());
    }
    
    public static Table getInstance() {
        if(instance == null) {
            instance = new Table();
        }
        return instance;
    }
    
    public void changeDirection(){
        this.direction = !direction;
    }
    
    public ICard drawCard(){
        return deck.drawCard();
    }
    
    public boolean playCard(ICard nextCard){
        boolean cardIsValid = stack.addCard(nextCard);
        if(cardIsValid){
            nextCard.playCard();
            changeCurrentPlayer();
            Player nextPlayer = players[currentPlayer];
            nextPlayer.myTurn = true;
            return true;
        }else{
            return false;
        }
    }
    
    public void changeCurrentPlayer(){
        if(direction){
            currentPlayer++;
            if(currentPlayer == players.length)
                currentPlayer = 0;
        }else{
            currentPlayer--;
            if(currentPlayer == -1)
                currentPlayer = players.length - 1;
        }
        
    }
    
    public void setMessage(String newMessage){
        this.message = newMessage;
    }
    

    @Override
    public String getData(String text) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String sendMessage() throws RemoteException {
        return message;
    }

    @Override
    public ICard getNextCard(ICard nextCard) throws RemoteException {
        return nextCard;
    }

 
}
