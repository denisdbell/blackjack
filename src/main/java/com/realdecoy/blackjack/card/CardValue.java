/**
* <h1>Card Enum</h1>
* Contains the various cards and their respective values
* <p>
* 
* @author  Denis Bell
* @version 1.0
*/

package com.realdecoy.blackjack.card;

public enum CardValue {
    
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10),
    ACE(1);
 
    private int cardValue;
    
    private CardValue (int value){
        this.cardValue = value;
    }

    public void setCardValue (int value){
        this.cardValue = value;
    }
    
    public int getCardValue() {
        return cardValue;
    }
}