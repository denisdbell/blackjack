/**
* <h1>DeckTest Class</h1>
* Contains unit tests for the Deck class
* <p>
* 
* @author  Denis Bell
* @version 1.0
*/

package com.realdecoy.blackjack.card;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import java.util.Collections;
import java.util.ArrayList;
import org.junit.*;


public class DeckTest {

    Integer TOTAL_DECK_SIZE = 52;

    Deck deck;

    @Before
    public void setUp(){
        deck = new Deck();
    }

    @Test
    public void test_initilize_should_populate_deck_with_52_cards() {
        

        //Deck should be empty initially i.e size of zero
        assertTrue(deck.getDeck().size() == 0);

        deck.initialize();

        //Should have a total size of 52
        assertTrue(deck.getDeck().size() == TOTAL_DECK_SIZE);
    }

    @Test
    public void test_shuffle_should_sort_the_deck(){
       
        deck.initialize();

        ArrayList originalDeck = new ArrayList();

        originalDeck.addAll(deck.getDeck());

        deck.shuffle();

        System.out.println(deck.getDeck() + " " + originalDeck);

        assertTrue(deck.getDeck().size() == originalDeck.size());

        assertTrue(!deck.getDeck().equals(originalDeck) );

    }
}
