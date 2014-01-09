package com.jacob.pokemon;

import java.util.Scanner;
public class Main {
	public static String player;
	public static String rival;
	public static String nick;

	public static void main(String [] ags){
		Scanner s = new Scanner(System.in);


		System.out.println("Hello! What is your name?");
		player = s.nextLine();
		System.out.println("Hello " + player +"! This is your opponent, what's his name again?");
		rival = s.nextLine();

		System.out.println("Great! Please choose which pokemon you would like to use. \nYou may choose either BULBASAUR, CHARMANDER, or SQUIRTLE.");
		String choice = s.nextLine().toUpperCase();

		while(!choice.toUpperCase().equals("SQUIRTLE")&&!choice.toUpperCase().equals("BULBASAUR") &&!choice.toUpperCase().equals("CHARMANDER")){

			System.out.println("That is not one of the choices. Please choose either BULBASAUR, CHARMANDER, or SQUIRTLE.");
			choice = s.nextLine().toUpperCase();
		}

		System.out.println("Congradulations " + player +", you have chosen " + choice + 
				".\nWould you like to give it a nickname?");
		if(s.nextLine().equalsIgnoreCase("yes")){
			System.out.println("What would you like to nickname it?");
			nick = s.nextLine();
		}	
		else{
			nick = choice;
		}
		if(choice.equals("BULBASAUR")) Battle.Battle(Pokemon.BULBASAUR,Pokemon.CHARMANDER);
		if(choice.equals("CHARMANDER")) Battle.Battle(Pokemon.CHARMANDER,Pokemon.SQUIRTLE);
		if(choice.equals("SQUIRTLE")) Battle.Battle(Pokemon.SQUIRTLE,Pokemon.BULBASAUR);

	}







}

