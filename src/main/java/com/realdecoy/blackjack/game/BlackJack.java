/**
* <h1>BlackJack Class</h1>
* Contains the core functionality for the BlackJack game
* <p>
* 
* @author  Denis Bell
* @version 1.0
*/

package com.realdecoy.blackjack.game;

import com.realdecoy.blackjack.card.Deck;
import com.realdecoy.blackjack.player.BlackJackPlayer;
import com.realdecoy.blackjack.player.Dealer;
import com.realdecoy.blackjack.player.Player;
import java.util.ArrayList;

public class BlackJack {

    public Deck deck = new Deck();

    ArrayList<Player> players = new ArrayList<Player>(){{
		   add(new BlackJackPlayer());
		   add(new Dealer());
	}};
    
    private Boolean thereIsNoWinner = true;

    private Integer totalPlays = 1; //Track the amount of plays made

    public BlackJack(){
        
        deck.initialize();

        deck.shuffle();
    }

    public void play(){

        while(thereIsNoWinner){

            Player currentPlayer = getCurrentPlayer(this.totalPlays);

            this.totalPlays++;
        }
    }

    public Player getCurrentPlayer(Integer totalPlays){

        Integer turn = totalPlays % 2;

        return  players.get(turn);
    }
}