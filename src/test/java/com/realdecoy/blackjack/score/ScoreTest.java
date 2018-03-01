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
import com.realdecoy.blackjack.card.Card;
import com.realdecoy.blackjack.card.CardValue.*;
import com.realdecoy.blackjack.card.Suit;




public class ScoreTest {

    Deck deck;

    ArrayList<Card> cards = new ArrayList<Card>();

    Integer cardScore;

    @Before
    public void setUp(){
        deck = new Deck();  

        cards = new ArrayList<Card>(){{
		   add(new Card(CardValue.THREE,Suit.HEARTS));
		   add(new Card(CardValue.QUEEN,Suit.SPADES));
		   add(new Card(CardValue.KING,Suit.CLUBS));
		}};

        cardScore = 23; 
    }

    @Test
    public void test_generateScoreFromCards_should_calculate_correct_score() {
        
        deck.initialize();

        Integer score = Score.generateScoreFromCards(cards);

        assertTrue(score == cardScore);
    }

    @Test
    public void test_generateScoreFromCards_should_return_zero_if_empty_list_is_provided() {
        
        Integer score = Score.generateScoreFromCards(new ArrayList<Card>());

        assertTrue(score == 0);
    }
}
