/**
* <h1>Card Class</h1>
* This class repesents the combination of a Suit and CardValue enums
* <p>
* 
* @author  Denis Bell
* @version 1.0
*/

package com.realdecoy.blackjack.card;

public class Card
{
  private Suit suit;
  private CardValue cardValue;
 
  public Card (CardValue cardValue, Suit suit)
  {
    this.cardValue = cardValue;
    this.suit = suit;
  }
 
  public Suit getSuit()
  {
    return suit;
  }
 
  public void setSuit(Suit suit)
  {
    this.suit = suit;
  }
 
  public CardValue getCardValue()
  {
    return cardValue;
  }
 
  public void setCardValue(CardValue cardValue)
  {
    this.cardValue = cardValue;
  }

  public String toString(){
    return getCardValue() + " Of " + getSuit();
  }
}