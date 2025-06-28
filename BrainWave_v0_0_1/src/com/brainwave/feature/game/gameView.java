package com.brainwave.feature.game;

import java.util.Scanner;

import com.brainwave.feature.mathsgame.mathsgamelevel1.MathsGameLevel1View;
import com.brainwave.feature.questionbasedgame.QuestionBasedGameView;
import com.brainwave.feature.registration.RegistrationView;

public class gameView {

	
	private final gameModel model;
	private final Scanner scanner = new Scanner(System.in);
	
	
	
	public gameView() {
		
		
		model=new gameModel(this);
	}



	public void init() {
		showMenu();
	}
	
	
private void showMenu() {
		
		
		System.out.println("....Welcome to Brainwave....");
		
		while(true) {
			
			System.out.println("Press 1 : Maths Game");
			System.out.println("Press 2 : Quiz Game");
			System.out.println("Press 3 : Logout");
			System.out.println("Press 4 : Exit");
			System.out.println();
			System.out.println("Enter the Choice");
			
			int choice =Integer.parseInt(scanner.nextLine());
			
			switch (choice) {
			
			case 1:
			   
				new MathsGameLevel1View().init();
				
			case 2:
				
				new QuestionBasedGameView().init(); 
			case 3: 
				 
			 
				
			  
			
			}
			
			
		}
      
		
	}

	
	
}
