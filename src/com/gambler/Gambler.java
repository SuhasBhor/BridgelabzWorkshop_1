package com.gambler;

import java.util.Random;

public class Gambler {
	static int Every_Day_Stack=100;  //initial amount we have
	final static int Bet_Every_Game=1;    //every beat amount
	public void Game() {
		System.out.println("Welcome To Gambler Simulator");
		System.out.println("Every Day Stack: "+Every_Day_Stack);
		System.out.println("Beat Price: "+Bet_Every_Game);
		
		int Stack_Upper = 150;  //upper bound of Stack
		int Stack_Lower =50;    //lower bound of Stack so if Amount reach to this then loop will stop
		
		//checking till condition is true 
		while(Every_Day_Stack > Stack_Lower && Every_Day_Stack < Stack_Upper) {   
		Random random = new Random();  //taking random value between 0 and 1
		int bet = random.nextInt(2);
		//checking win or loss condition
		if(bet == 1) {
			System.out.println("Bet Win");
			System.out.println("Final Amount: "+(Every_Day_Stack += Bet_Every_Game)); //increment amount by 1
		}else {
			System.out.println("Bet Loss");
			System.out.println("Final Amount: "+(Every_Day_Stack -= Bet_Every_Game)); //decrement amount by 1
		}
		}
	}
}

