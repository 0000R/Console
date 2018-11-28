package com.example.demo;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner choose = new Scanner(System.in);
		String menuOption = null;

		menu();

		while (!"exit".equals(menuOption)) {
			menuOption = choose.nextLine();
			// System.out.println(menuOption);
			switch (menuOption) {
			case "b":
				System.out.println("beans");
				break;
			case "r":
				System.out.println("roxy");
				break;
			case "z":
				getRandomNumber();
				break;
			default:
				break;
			}
			menu();
		}

		choose.close();
	}

	//

	private static void getRandomNumber() {
		System.out.println(Math.floor(Math.random() * 100 + 1));
	}
//math.floor makes a whole number
	private static void menu() {
		System.out.println("my menu");
		System.out.println("b) for beans");
		System.out.println("r) for roxy");
		System.out.println("z) for random rumber");
		System.out.println("exit) to quit");

	}
}
