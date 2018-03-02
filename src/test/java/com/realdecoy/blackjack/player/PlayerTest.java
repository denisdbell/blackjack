/**
* <h1>PlayerTest Class</h1>
* Contains unit tests for the Player class
* <p>
* 
* @author  Denis Bell
* @version 1.0
*/

package com.realdecoy.blackjack.player;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import java.util.Collections;
import java.util.ArrayList;
import org.junit.*;
import com.realdecoy.blackjack.card.Card;
import com.realdecoy.blackjack.player.Player;
import com.realdecoy.blackjack.card.CardValue;
import com.realdecoy.blackjack.card.Suit;
import com.realdecoy.blackjack.card.Deck;


public class PlayerTest {

    Deck deck;

    Player player;

    ArrayList<Card> cards = new ArrayList<Card>();

    Integer cardScore;

    @Before
    public void setUp(){

        deck = new Deck();  

        player = new Player();
    }

    @Test
    public void test_hit_should_remove_card_from_deck_and_add_to_players_cards() {
        
        deck.initialize();

        ArrayList originalDeck = new ArrayList();

        originalDeck.addAll(deck.getDeck());
        
        ArrayList<Card> newDeck = player.hit(deck.getDeck());

        Card playerCard = player.getCards().get(0);

        Card newDeckFirstCard = newDeck.get(0);

        assertTrue(player.getCards().size() == 1);

        assertTrue(newDeckFirstCard.getCardValue() == CardValue.TWO);

        assertTrue(newDeckFirstCard.getSuit() == Suit.SPADES);

        assertTrue(newDeck.size() == originalDeck.size() - 1);

        assertTrue(playerCard.getCardValue() == CardValue.TWO);

        assertTrue(playerCard.getSuit() == Suit.HEARTS);
    }
}
