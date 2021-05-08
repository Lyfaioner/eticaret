package business.concrete;

import business.abstracts.UserValidationService;

public class ValidationManager implements UserValidationService{

	@Override
	public boolean EmailValidation(String email) {
		return true;
		
		
	}

}
