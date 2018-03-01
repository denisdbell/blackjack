/**
* <h1>Deck Class</h1>
* Contains the total set of Card objects. Has functionality to shuffle cards
* <p>
* 
* @author  Denis Bell
* @version 1.0
*/


package com.realdecoy.blackjack.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
 
public class Deck
{
  private ArrayList deck = new ArrayList();
 
  public Deck (){
   
    Iterator cardIterator = deck.iterator();
    while (cardIterator.hasNext())
    {
      Card aCard = (Card) cardIterator.next();
      System.out.println(aCard.getCardValue() + " of " + aCard.getSuit());
    }
  }

  public void initialize(){
        
    for (int i=0; i<13; i++){
        CardValue value = CardValue.values()[i];

        for (int j=0; j<4; j++){
            Card card = new Card(value, Suit.values()[j]);
            this.deck.add(card);
        }
    }
  }

  public void shuffle(){
        Collections.shuffle(this.deck);
  }

  public ArrayList getDeck(){
      return this.deck;
  }
}
