/**
* <h1>ScoreTest Class</h1>
* Contains unit tests for the Score class
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
import com.realdecoy.blackjack.score.Score;


public class ScoreTest {

    Integer TOTAL_DECK_SIZE = 52;

    Deck deck;

    @Before
    public void setUp(){
        deck = new Deck();
    }

    @Test
    public void test_generateScoreFromCards_should_calculate_core() {
        
        deck.initialize();

        Score.generateScoreFromCards(deck.getDeck());

    }
}
