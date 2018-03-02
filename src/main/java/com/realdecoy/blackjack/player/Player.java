/**
* <h1>Generic Player Class</h1>
* Contains the core attributes that will be used by Black Jack Players
* <p>
* 
* @author  Denis Bell
* @version 1.0
*/
package com.realdecoy.blackjack.player;

import com.realdecoy.blackjack.card.Card;
import com.realdecoy.blackjack.score.Score;

import java.util.ArrayList;


public class Player{

    private String name;
    private Integer score;
    private ArrayList<Card> cards = new ArrayList<Card>();

    public Player(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getScore(){
       
        this.score = Score.generateScoreFromCards(this.cards);
        return this.score;
    }

    public ArrayList<Card> getCards(){
        return cards;
    }

    public Boolean busted(){

        if( getScore() > 21 ){
            return true;
        }else{
            return false;
        }
    }

     public Boolean hasScoreOf21(){

        if( getScore() == 21 ){
            return true;
        }else{
            return false;
        }
    }


    public ArrayList<Card>  hit(ArrayList<Card> deck){

        if(deck.size() == 0){
            return deck;
        }else{
            //Take first card from the deck 
            //Add it to the players cards
            //remove card from the deck
            cards.add(deck.get(0));
            deck.remove(0);
        }
        
        return deck;
    }

    public Card getLastCard(){
        
        return cards.get( cards.size() - 1 );
               
    }
}