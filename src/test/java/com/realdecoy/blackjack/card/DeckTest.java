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
import org.junit.*;


public class DeckTest {

    Deck deck;

    @Before
    public void setUp(){
        System.out.println("Running");
        deck = new Deck();
    }

    @Test
    public void test_initilize_should_populate_deck_with_52_cards() {
        
        //Deck should be empty initially
        assertTrue(deck.getDeck().size() == 0);

        deck.initialize();

        assertTrue(deck.getDeck().size() == 52);
    }
}
