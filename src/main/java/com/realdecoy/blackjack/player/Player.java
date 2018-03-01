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

public abstract class Player{

    String name;
    Integer score;
    ArrayList<Card> cards;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

      public Integer getScore(){
        return this.score;
    }

    public void setScore(String name){
        this.name = name;
    }
}