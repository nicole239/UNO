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
public class CardFactory {
    public static ICard getInstance(int number, CardColor color){
        ICard card = null;
        if(number<=9){
            card = new NormalCard(number, color);
        }else{
            switch(number){
                case 10:
                    card = new SkipCard(color);
                    break;
                case 11:
                    card = new ReverseCard(color);
                    break;
                case 12:
                case 14:
                    card = new DrawCard(number, color);
                    break;
                case 13:
                    card = new WildCard(color);   
                    break;
            }
        }
        return card;
    }
}
