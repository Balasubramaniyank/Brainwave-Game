package com.brainwave.feature.mathsgame.mathsgamelevel1;

import java.util.Scanner;

import com.brainwave.feature.base.BaseView;
import com.brainwave.feature.mathsgame.mathsgamelevel2.MathsGameLevel2View;

public class MathsGameLevel1View extends BaseView{
	
	
	   private final MathsGameLevel1Model model;
	   private final Scanner scanner = new Scanner(System.in);
	   
	   private int score=0;
	public MathsGameLevel1View() {
        model = new MathsGameLevel1Model(this);
    }
	public void init() {
		
		StartGame();
		
	}
	 

	
	    private void StartGame() {
		
		
		System.out.println("Level 1");
		
		
		
		for (int i = 1; i <= 6; i++) {
		    String question = model.generateQuestion();
		    double correctAnswer = model.getAnswer();

		    System.out.println("Q" + i + ": " + question);
		    double userAnswer = scanner.nextDouble();

		      if(model.checkAnswer(userAnswer)){
		    	  
		    	  System.out.println("✅ Correct");
		    	  score++;
		    	    
		      }
		      else {
		    	  
		    	  System.out.println("❌ Wrong. Correct Answer: " + correctAnswer);
		    	  
		      }
		}
		
		 if (score == 10) {
			 
		    String bonusQ = model.generateBonusQuestion();
		    double bonusA = model.getBonusAnswer();

		    System.out.println(bonusQ);
		    double userBonus = scanner.nextDouble();

		    if (model.checkAnswer(userBonus)) {
		        System.out.println("🎉 Bonus Correct!");
		    } else {
		        System.out.println("❌ Bonus Wrong. Correct Answer: " + bonusA);
		    }
		    
		}

		 
		 model.scoreCheck(score);

		
	}
		public void secoundRound() {
			
			System.out.println("First Level Complated");
			System.out.println("Do you want Play Secound level : Y/N");
			
			
		    String choice = scanner.nextLine();
		    
		    if(choice.equalsIgnoreCase("y")) {
		    	
		    	new MathsGameLevel2View().init();
		    }
		    else {
		    	
		    	exitApp();
		    }
			
			
		}
		public void gameOver() {
			
			System.out.println("🏁 Game Over!");
		}

}
