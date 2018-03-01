/**
* <h1>Score</h1>
* Generates the scores based on the value of the cards
* <p>
* 
* @author  Denis Bell
* @version 1.0
*/
package com.realdecoy.blackjack.score;

import com.realdecoy.blackjack.card.Card;
import java.util.ArrayList;
import java.util.Iterator;


public class Score {

    public static Integer generateScoreFromCards(ArrayList<Card> cards){
        
        Iterator cardIterator = cards.iterator();
        
        while (cardIterator.hasNext()){

            Card aCard = (Card) cardIterator.next();
            System.out.println(aCard.getCardValue() + " of " + aCard.getSuit());
        }

        return 0;
    }

}