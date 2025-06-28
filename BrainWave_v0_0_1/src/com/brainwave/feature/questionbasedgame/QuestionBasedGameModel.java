package com.brainwave.feature.questionbasedgame;

import com.brainwave.repositry.brainwavedp.BrainwaveDp;

public class QuestionBasedGameModel {
	
	private final QuestionBasedGameView view;

    public QuestionBasedGameModel(QuestionBasedGameView view) {
        this.view = view;
    }
    
    int answerIndex=0;

	public void getQuestion() {
		
		
		int choice=(int)(Math.random() *30);
		
		answerIndex=choice;
		
		String question=BrainwaveDp.getIntance().questions.get(choice);
		
		view.displayQuestion(question);

	}

	public void checkAnswer(String answer) {
	
		String userAnswer = answer.trim();
		
		String answerDp=BrainwaveDp.getIntance().answers.get(answerIndex);
		
		
		if(userAnswer.equalsIgnoreCase(answerDp)) {
			
			view.correctAnswer();
			
		}
		else {
			
			view.inCorrectAnswer(answerDp);
		}
		
	     	
	}

}
