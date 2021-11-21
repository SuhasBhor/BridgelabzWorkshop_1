package com.gambler;

import java.util.Random;

public class Gambler {
	static int Every_Day_Stack=100;  //initial amount we have
	final static int Bet_Every_Game=1;    //every beat amount
	int WinDays=0;
	int LossDays=0;
	int Win=0;
	int Loss=0;
	int winMax=0;
	int lossMax=0;
	int luckyDay=0;
	int unluckyDay=0;
	
	public void Game() {
		System.out.println("Welcome To Gambler Simulator");
		
		int Stack_Upper = 150;  //upper bound of Stack
		int Stack_Lower = 50;    //lower bound of Stack so if Amount reach to this then loop will stop
		int Winning = 0;
		
		for(int days = 1; days <= 30; days++) {
			Every_Day_Stack=100;
			
			while(Every_Day_Stack > Stack_Lower && Every_Day_Stack < Stack_Upper) {   //checking till condition is true 
				Random random = new Random();  //taking random value between 0 and 1
				int bet = random.nextInt(2);
				//checking win or loss condition
					
				switch(bet) {
				case 1:
					Every_Day_Stack += Bet_Every_Game; //increment amount by 1
					Win++;
					break;
				default:
					Every_Day_Stack -= Bet_Every_Game; //decrement amount by 1
					Loss++;
					break;
					}
				}
				
				if(Every_Day_Stack == Stack_Upper) {
					//System.out.println("Player Has Won Gambler For Day "+days);
					WinDays += 1;
					Winning += 50;
				}else {
					//System.out.println("Player Has Loss Gambler For Day "+days);
					LossDays += 1;
					Winning -= 50;
				}
				//System.out.println("Total Win Price: "+Winning + "\n");
				
				if(Win > winMax) {
					winMax = Win;
					luckyDay = days + 1;
				}
				
				if(Loss > lossMax) {
					lossMax = Loss;
					unluckyDay = days + 1;
				}
				
				Win=0;
				Loss=0;
			}
			 System.out.println("The Luckiest Day is :"+luckyDay);
			 System.out.println("The Unluckiest Day is: "+unluckyDay);
			 System.out.println("Total Win Days: "+WinDays);
			 System.out.println("Total Loss Days: "+LossDays);
			 System.out.println("Total Win Price Won In Month Is " +Winning + "\n");
		}
}

