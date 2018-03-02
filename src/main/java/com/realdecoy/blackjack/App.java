package com.realdecoy.blackjack;
import com.realdecoy.blackjack.game.BlackJack;
import java.util.Scanner;
import com.realdecoy.blackjack.util.ConsoleColor;



public class App {

    public static void main(String[] args) {
        
        BlackJack blackJack = new BlackJack();
        Scanner scan = new Scanner(System.in);

        System.out.println(ConsoleColor.ANSI_YELLOW + "***********************************************************************" + ConsoleColor.ANSI_RESET);
        System.out.println(ConsoleColor.ANSI_YELLOW + "*************    Welcome to RealDecoy's Black Jack Game   *************" + ConsoleColor.ANSI_RESET);
        System.out.println(ConsoleColor.ANSI_YELLOW + "*************             Author: Denis Bell              *************" + ConsoleColor.ANSI_RESET);
        System.out.println(ConsoleColor.ANSI_YELLOW + "*************           Press any key to START!           *************" + ConsoleColor.ANSI_RESET);
        System.out.println(ConsoleColor.ANSI_YELLOW + "***********************************************************************" + ConsoleColor.ANSI_RESET);

        scan.nextLine();

        while(blackJack.play()){

        }
    }
    
}
