package com.gambler;

import java.util.Scanner;

public class TestGambler {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Gambler gambler = new Gambler();
		while(true) {
			System.out.print("\nEnter 1 For Play One More Month: ");
			int ch = scan.nextInt();
			switch(ch) {
			case 1:
				System.out.println("\nDecided to play for one more month\n");
				gambler.Game();
				break;
			default:
				System.out.println("Oops Sorry!!");
				break;
			}
		}
	}
}
