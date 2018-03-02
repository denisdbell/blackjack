/**
* <h1>PlayerTest Class</h1>
* Contains unit tests for the BlackJack class
* <p>
* 
* @author  Denis Bell
* @version 1.0
*/

package com.realdecoy.blackjack.game;

import com.realdecoy.blackjack.game.BlackJack;
import com.realdecoy.blackjack.player.Player;
import com.realdecoy.blackjack.player.BlackJackPlayer;
import com.realdecoy.blackjack.player.Dealer;
import static org.junit.Assert.assertTrue;
import org.junit.*;



public class BlackJackTest{

    BlackJack blackJack = new BlackJack();

    @Before
    public void setUp(){

        blackJack = new BlackJack();  
    }

    @Test
    public void test_getCurrentPlayer_should_choose_Dealer_player_when_totalPlays_is_odd() {

        Integer oddTotalPlays = 3;

        Player player = blackJack.getCurrentPlayer(oddTotalPlays);

        assertTrue(player instanceof Dealer);

    }   

    @Test
    public void test_getCurrentPlayer_should_choose_BlackJackPlayer_player_when_totalPlays_is_even() {

        Integer evenTotalPlays = 2;

        Player player = blackJack.getCurrentPlayer(evenTotalPlays);

        assertTrue(player instanceof BlackJackPlayer);
        
    }   
}
