package com.brainwave.repositry.brainwavedp;

import java.util.Arrays;
import java.util.List;

import com.brainwave.repositry.brainwavedto.RegistrationInfo;

public class BrainwaveDp {

 
	 private RegistrationInfo registrationInfo;
	 
	 private static BrainwaveDp sbrainwaveDp;

	public RegistrationInfo getRegistrationInfo() {
		return registrationInfo;
	}

	public void setRegistrationInfo(RegistrationInfo registrationDp) {
		this.registrationInfo = registrationDp;
	}
	 

	
	public static BrainwaveDp getIntance() {
		
		
		if(sbrainwaveDp==null) {
			
			
			sbrainwaveDp =new BrainwaveDp();
		}
		
		return sbrainwaveDp;
		
	}

	public boolean validateUser(String userName, String passwordForLogin) {
		
		
		if(registrationInfo.getUserName().equals(userName)&&registrationInfo.getPassword().equals(passwordForLogin)) {
			
			
			 return true;
		}
		
		
		return false;
	}

	
	
	
	public final List<String> questions = Arrays.asList(
		    "What is the capital of India?",
		    "What is 5 + 3?",
		    "What color do you get when you mix red and white?",
		    "How many legs does a spider have?",
		    "What is the boiling point of water in Celsius?",
		    "Which planet is known as the Red Planet?",
		    "How many days are there in a leap year?",
		    "Who wrote the national anthem of India?",
		    "What gas do plants absorb from the air?",
		    "Which animal is known as the 'King of the Jungle'?",
		    "What is the largest mammal in the world?",
		    "How many continents are there?",
		    "Which planet is closest to the sun?",
		    "Which organ pumps blood in the human body?",
		    "What is the color of the sky on a clear day?",
		    "How many hours are there in a day?",
		    "What is H2O commonly known as?",
		    "Which festival is known as the festival of lights?",
		    "What do bees produce?",
		    "Which shape has three sides?",
		    "How many vowels are there in the English alphabet?",
		    "Who is known as the Father of the Nation (India)?",
		    "What is the freezing point of water?",
		    "Which month comes after June?",
		    "How many colors are there in a rainbow?",
		    "Which bird is known for mimicking human speech?",
		    "What is the currency of India?",
		    "Which insect has colorful wings and undergoes metamorphosis?",
		    "What is 12 divided by 4?",
		    "Which instrument is used to measure temperature?",
		    "Which animal has a trunk?",
		    "Who was the first Prime Minister of India?",
		    "Which part of the plant absorbs water?",
		    "What is the process by which plants make food?",
		    "Which ocean is the largest in the world?"
		);

	
	
	public final List<String> answers = Arrays.asList(
		    "Delhi",
		    "8",
		    "Pink",
		    "8",
		    "100",
		    "Mars",
		    "366",
		    "Rabindranath Tagore",
		    "Carbon Dioxide",
		    "Lion",
		    "Blue Whale",
		    "7",
		    "Mercury",
		    "Heart",
		    "Blue",
		    "24",
		    "Water",
		    "Diwali",
		    "Honey",
		    "Triangle",
		    "5",
		    "Mahatma Gandhi",
		    "0",
		    "July",
		    "7",
		    "Parrot",
		    "Rupee",
		    "Butterfly",
		    "3",
		    "Thermometer",
		    "Elephant",
		    "Jawaharlal Nehru",
		    "Roots",
		    "Photosynthesis",
		    "Pacific Ocean"
		);

	
	
	
	
}
