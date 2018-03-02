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
import com.realdecoy.blackjack.card.Card;
import java.util.ArrayList;
import java.util.Scanner;
import com.realdecoy.blackjack.card.CardValue;
import com.realdecoy.blackjack.util.ConsoleColor;


public class BlackJack {

    public Deck deck = new Deck();

    ArrayList<Player> players = new ArrayList<Player>(){{
		   add(new BlackJackPlayer("Player One"));
		   add(new Dealer("Dealer"));
	}};
    
    private Boolean thereIsNoWinner = true;

    private Integer totalPlays = 0; //Track the amount of plays made

    Scanner scan = new Scanner(System.in);

    public BlackJack(){
        
        deck.initialize();

        deck.shuffle();
    }

    public Boolean play(){

        String option = "";
        String aceValue = "";

        
        Player currentPlayer = getPlayer(this.totalPlays);

        String color = this.totalPlays % 2 == 1 ? ConsoleColor.ANSI_CYAN : ConsoleColor.ANSI_PURPLE;

        System.out.println( color +  "Its now " + currentPlayer.getName() + "'s' turn" + ConsoleColor.ANSI_RESET);

        while( !(option.equalsIgnoreCase("s") || option.equalsIgnoreCase("h")) ){
            
            if(currentPlayer instanceof BlackJackPlayer){
                System.out.println(color +  "Enter h to HIT Or s to STAND" + ConsoleColor.ANSI_RESET);
                option = scan.nextLine();
            }else if(currentPlayer instanceof Dealer){
                option = "h";
            }
        }

        if( option.equalsIgnoreCase("h") ){
            
            currentPlayer.hit(deck.getDeck());

            if(currentPlayer instanceof BlackJackPlayer){
                
               Card lastCard =  currentPlayer.getLastCard();

                if(lastCard.getCardValue() == CardValue.ACE ){
    
                    while( !(aceValue.equals("1") || aceValue.equals("11")) ){
                        System.out.println(color + "You chose " + lastCard + " Enter a value of 1 or 11 for the card"  + ConsoleColor.ANSI_RESET);
                        aceValue = scan.nextLine();   
                    }

                    CardValue ace = CardValue.ACE;

                    ace.setCardValue(Integer.parseInt(aceValue));

                    currentPlayer.getCards().set( currentPlayer.getCards().size() - 1, new Card(ace,lastCard.getSuit()));
                }
            }

            System.out.println(color + currentPlayer.getName() + " took " + currentPlayer.getLastCard() + " from the deck " + ConsoleColor.ANSI_RESET);

            System.out.println(color + currentPlayer.getName() + " Score is:  " + currentPlayer.getScore() + ConsoleColor.ANSI_RESET );

            System.out.println(color + "---------------------------------------------------------------------" + ConsoleColor.ANSI_RESET );
       
        }

        this.totalPlays++;

        Player winner = this.checkForWinner();

        if( winner != null ){
               System.out.println( ConsoleColor.ANSI_GREEN + "*************************************************************************" + ConsoleColor.ANSI_RESET);
               System.out.println( ConsoleColor.ANSI_GREEN + "Winner is " + winner.getName() + " with a score of " +  winner.getScore() + ConsoleColor.ANSI_RESET);
               System.out.println( ConsoleColor.ANSI_GREEN + "*************************************************************************" + ConsoleColor.ANSI_RESET);
               return false;
        }

        return true;
    }

    public Player getPlayer(Integer totalPlays){

        Integer index = totalPlays % 2;

        Player currentPlayer = players.get(index);

        players.set(index,currentPlayer);

        return currentPlayer;
    }

    public Player checkForWinner(){

        Player dealer = getPlayer(1);
        Player blackJackPlayer = getPlayer(0);

        for (Player player : players) {
            
            if(player.busted()){
                return ( player instanceof Dealer ? blackJackPlayer :  dealer) ;
            }

            if(player.hasScoreOf21()){
                return player;
            }
        }

        return null;
    }
}