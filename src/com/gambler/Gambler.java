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
		int Stack_Lower = 50;    //lower bound of Stack so if Amount reach to this then loop will stop
		int Winning = 0;
		
		for(int days = 1; days <= 20; days++) {
			Every_Day_Stack=100;
			while(Every_Day_Stack > Stack_Lower && Every_Day_Stack < Stack_Upper) {   //checking till condition is true 
				Random random = new Random();  //taking random value between 0 and 1
				int bet = random.nextInt(2);
				//checking win or loss condition
				
				switch(bet) {
				case 1:
					Every_Day_Stack += Bet_Every_Game; //increment amount by 1
					break;
				default:
					Every_Day_Stack -= Bet_Every_Game; //decrement amount by 1
					break;
				}
			}
			if(Every_Day_Stack == Stack_Upper) {
				System.out.println("Player Has Won Gambler For Day "+days);
				Winning += 50;
			}else {
				System.out.println("Player Has Loss Gambler For Day "+days);
				Winning -= 50;
			}
			System.out.println("Total Win Price: "+Winning + "\n");
		}
	}
}

