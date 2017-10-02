/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno.conexion;

/**
 *
 * @author Nicole
 */
public interface ICard {
    boolean isValid(ICard lastCard);
    CardColor getColor();
    int getNumber();
    void playCard();
}
