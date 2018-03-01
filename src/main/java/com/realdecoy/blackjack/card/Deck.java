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
  private ArrayList deck;
 
  public Deck ()
  {
   
  
    Iterator cardIterator = deck.iterator();
    while (cardIterator.hasNext())
    {
      Card aCard = cardIterator.next();
      System.out.println(aCard.getCardValue() + " of " + aCard.getSuit());
    }
  }

  public initialize(){
    
    this.deck = new ArrayList();
    
    for (int i=0; i<13; i++){
        CardValue value = CardValue.values()[i];

        for (int j=0; j<4; j++){
            Card card = new Card(value, Suit.values()[j]);
            this.deck.add(card);
        }
    }
  }

  public shuffleDeck(){
        Collections.shuffle(deck);
  }
}
