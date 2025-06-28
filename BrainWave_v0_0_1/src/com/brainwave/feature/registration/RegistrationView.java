package com.brainwave.feature.registration;

import java.util.Scanner;

import com.brainwave.feature.base.BaseView;
import com.brainwave.feature.game.gameView;
import com.brainwave.feature.mathsgame.mathsgamelevel1.MathsGameLevel1View;
import com.brainwave.repositry.brainwavedto.RegistrationInfo;

public class RegistrationView extends BaseView{
	
	private final RegistrationModel model;
	private final Scanner scanner = new Scanner(System.in);
	
	
	public RegistrationView() {
		
		
		model=new RegistrationModel(this);
	}

	public void init() {
		
		model.init();
		
	}

	public void proceedLogin() {
		
		
		System.out.println("Do you proceed to Login Y/N");
		
		String choice =scanner.nextLine();
		
		
		if(choice.equalsIgnoreCase("y")) {
			
			
			model.validateCredentials(getUserName(),getPasswordForLogin());
		}
		else {
			
			exitApp();
		}
		
		
	}

	public void proceedRegistration() {

		RegistrationInfo info = new RegistrationInfo();

		System.out.println("Welcome to Registration Page");

		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter the FirstName");

		info.setFirstName(scanner.nextLine());

		System.out.println("Enter the LastName");

		info.setLastName(scanner.nextLine());

		info.setEmailId(getEmailId());
		info.setUserName(getUserName());

		info.setPassword(getPassword());

		info.setMobileNo(getMobile());
		
		model.registerUser(info);
		
	}
	
	private String getMobile() {

		String moblieNumber;
		System.out.println("Enter the MoblieNumber");

		String regex = "^[6-9]\\d{9}$";

		do {

			moblieNumber = scanner.nextLine();

			if (!moblieNumber.matches(regex)) {

				System.out.println("Enter the Valid Mobile Number");
			} else
				break;
		} while (true);

		return moblieNumber;
	}

	private String getPassword() {

		String passWord = "";
		System.out.println("Enter the PassWord");

		do {

			passWord = scanner.nextLine();

			if (passWord.length() < 3 || passWord.length() > 20) {

				System.out.println("Password should not be empty and length min 8 and max 32\n\nEnter valid password:");

			} else
				break;

		} while (true);

		System.out.println("Enter the confirm Password");
		String confirmPassword = "";

		do {

			confirmPassword = scanner.nextLine();

			if (!passWord.equals(confirmPassword)) {

				System.out.println("PassWord MisWatch Try Again !");

			} else
				break;

		} while (true);

		return passWord;

	}

	private String getEmailId() {

		String emailId = "";
		System.out.println("Enter the Email ID");
		do {

			emailId = scanner.nextLine();
			String regex = "^[A-Za-z0-9+_.-]+@(.+)+$";
			if (!emailId.matches(regex)) {

				System.out.println("Invalid Email id! \nEnter the Valid Email id");
			} else
				break;
		} while (true);
		return emailId;
	}

	private String getUserName() {

		String userName = "";

		System.out.println("Enter the UserName");

		do {

			userName = scanner.nextLine();
			if (userName.length() < 3 || userName.length() > 20) {

				System.out.println("User Id Invalid \n Enter the valid UserName");

			} else
				break;

		} while (true);
		return userName;
	}
	

	private String getPasswordForLogin() {
		String password = "";

		System.out.println("Enter the Password : ");

		do {
			password = scanner.nextLine();
			if (password.length() < 8 || password.length() > 20) {
				System.out.println("Enter the valid Password");
			} else
				break;

		} while (true);

		return password;
	}

	public void InvalidateUser() {
		
		System.out.println("Invalidate userName or Password");
		proceedLogin();	
		
	}

	public void sucessfullyLogin() {
		
		System.out.println("Login Successfully");
		
            
		new gameView().init();
		
	}

	
}
