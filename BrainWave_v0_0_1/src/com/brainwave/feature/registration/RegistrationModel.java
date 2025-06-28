package com.brainwave.feature.registration;

import com.brainwave.feature.base.BaseView;
import com.brainwave.repositry.brainwavedp.BrainwaveDp;
import com.brainwave.repositry.brainwavedto.RegistrationInfo;

public class RegistrationModel  extends BaseView {

	private final RegistrationView view;
	
	public RegistrationModel(RegistrationView view) {

		 
		this.view=view;
		
		}

	public void init() {
		
		if(BrainwaveDp.getIntance().getRegistrationInfo()==null) {
			
			view.proceedRegistration();
		}
		else {
			
			
		}
		
	}

	public void registerUser(RegistrationInfo info) {
		
		if(validateUser(info)) {
			
			BrainwaveDp.getIntance().setRegistrationInfo(info);
			
			showMessage("Registration Sucessfully");
			
			view.proceedLogin();
			
		}
		else {
			
			view.proceedRegistration();
		}
		
	}

	private boolean validateUser(RegistrationInfo info) {
		
		
		
		
		return info.getFirstName()!=null &&
				info.getLastName()!=null&&
				info.getUserName()!=null &&
				info.getPassword()!=null&&
				info.getMobileNo()!=null && 
				info.getEmailId()!=null;
	}

	public void validateCredentials(String userName, String passwordForLogin) {
		
		if(BrainwaveDp.getIntance().validateUser(userName,passwordForLogin)) {
			
			view.sucessfullyLogin();
			
		}
		else {
			
			view.InvalidateUser();
		}
		
	}
}