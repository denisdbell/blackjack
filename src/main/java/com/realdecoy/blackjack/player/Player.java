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


public abstract class Player{

    private String name;
    private Integer score;
    private ArrayList<Card> cards = new ArrayList<Card>();

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
}