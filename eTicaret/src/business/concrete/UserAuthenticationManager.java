package business.concrete;

import business.abstracts.UserAuthenticationService;
import business.abstracts.UserService;
import business.abstracts.UserValidationService;
import entities.concretes.User;

public class UserAuthenticationManager implements UserAuthenticationService {
	private UserService userService;
	private UserValidationService userValidationService;
	public UserAuthenticationManager(UserService userService,UserValidationService userValidationService) {
		super();
		this.userService = userService;
		this.userValidationService = userValidationService;
	
	}
	@Override
	public void register(User user) {
		if(userValidationService.EmailValidation(user.getEmail()) && user.getFirstName().length()>2 && user.getPassword().length()>6) {
			userService.add(user);
			return;
		
	}
	System.out.println("Kullanıcı bilgileri doğru eklenmedi");	
}
}