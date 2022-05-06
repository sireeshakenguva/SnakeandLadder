package com.bridgelabs.Snake;

import java.sql.SQLOutput;

import java.util.Random;
import java.util.Scanner;

public class Snake {
	public static void main(String[] args){
	    System.out.println("Welcome to Snake Ladder Program");
	     
        Scanner read = new Scanner(System.in);
        int num = 0;
        int position = 0;
        System.out.println("The position  number is at 0 ");
        Random random = new Random();
        int dice1 = random.nextInt(6) + 1;
        System.out.println("The player rolls dice " + dice1);
        int NOPLAY = 0, LADDER = 1, SNAKE = 2; //Initialising  conditions
        int dice2 = random.nextInt(3); // the player checks condition for noplay,ladder,snake
        System.out.println("check Condition : " + dice2);

        if (dice2 == NOPLAY) {
            position = position + dice1;
            System.out.println("The position remain same at" + position);
        }else if (dice2 == LADDER) {
                position = position + dice1 + dice1;
                System.out.println("The position received ladder so move forward by " + position);
        } else {
            position = position - dice1;
            if (position < 0) {
                position = 0;
            }
            System.out.println("The position received Snake so move backward by" + position);
        }

        System.out.println("The position number  is " + position);

    }
}
