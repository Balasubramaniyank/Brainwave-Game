package com.brainwave.feature.mathsgame.mathsgamelevel1;

import java.util.Random;

public class MathsGameLevel1Model {

	

    private final MathsGameLevel1View view;

    public MathsGameLevel1Model(MathsGameLevel1View view) {
        this.view = view;
    }

	public void init() {
		
	}
	

    Random random = new Random();

    private int baseNumber;
    private int percent;
    private double answer;

    public String generateQuestion() {
        baseNumber = random.nextInt(401) + 100; // Random number from 100 to 500
        percent = (random.nextInt(9) + 1) * 5;  // 5%, 10%, ..., 45%

        answer = (percent / 100.0) * baseNumber;

        return "What is " + percent + "% of " + baseNumber + "?";
    }

    public double getAnswer() {
        return answer;
    }

    public String generateBonusQuestion() {
        int base = random.nextInt(91) + 10; // 10 to 100
        int perc = 10;

        answer = (perc / 100.0) * base;

        return "Bonus: What is " + perc + "% of " + base + "?";
    }

    public double getBonusAnswer() {
        return answer;
    }

	public boolean checkAnswer(double userAnswer) {
		
		  if (Math.abs(userAnswer - answer) < 0.01) {
		       
			  return true;
		       
		    } 
		    
		
		  
		  
		return false;
	}

	public void scoreCheck(int score) {
		
		
		if(score==1) {
			
	       view.secoundRound();		
		}
		else {
			
			view.gameOver();
		}
		
	}
}
	
	

