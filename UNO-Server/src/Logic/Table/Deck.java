/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.Table;


import Logic.Cards.CardFactory;
import java.util.Collections;
import java.util.List;
import uno.conexion.ICard;
import uno.conexion.CardColor;

/**
 *
 * @author Nicole
 */
public class Deck {
    public List<ICard> cards;
    
    public Deck(){
       fillDeck();
    }
    
    private void fillDeck(){
        for(int j = 0; j<2; j++){ //adds 2 of each normal card
             for(int num = 0; num< 13; num++){
                 if(!(num == 0 && j == 1)){ //doesn't add the second 0 card
                    cards.add(CardFactory.getInstance(num, CardColor.BLUE));  //adds each color of normal cards
                    cards.add(CardFactory.getInstance(num, CardColor.GREEN));
                    cards.add(CardFactory.getInstance(num, CardColor.RED));
                    cards.add(CardFactory.getInstance(num, CardColor.YELLOW));
                 }
            }
        }
     
        for(int i = 0; i<4 ; i++){
            cards.add(CardFactory.getInstance(13, CardColor.BLACK)); //adds 4 wild cards
            cards.add(CardFactory.getInstance(14, CardColor.BLACK)); //adds 4 draw 4 cards
        }
        
        Collections.shuffle(cards);
    }
    
    public ICard drawCard(){
        if(cards.isEmpty()){
            fillDeck();
        }
        ICard card = cards.remove(0);
        return card;
    }
       
    
}
