package com.brainwave.feature.questionbasedgame;

import java.util.Scanner;

public class QuestionBasedGameView {

	
	private int score=0;

    private final QuestionBasedGameModel model;
    private final Scanner scanner= new Scanner(System.in);

    public QuestionBasedGameView() {
        model = new QuestionBasedGameModel(this);
    }

	public void init() {
		
		startGame();
		
	}

	private void startGame() {
		
		System.out.println("🎮 Welcome to the Question Based Game!");
		
		
		for(int i =1; i<=10; i++) {
			
			  model.getQuestion();
			
		}
		
		System.out.println("Your Score is "+score);
		System.out.println("🏁 Game Over!");
		
		
		
	}

	public void displayQuestion(String question) {
		
		System.out.println(question);
		
		String answer = scanner.nextLine();
		
		model.checkAnswer(answer);
		
	}

	public void correctAnswer() {
		
		System.out.println("✅ Correct!");
		score++;
		
	}

	public void inCorrectAnswer(String answer) {
		
		System.out.println("❌ Incorrect."+"  Correct Answer is" +" "+answer);
	}
	
}
