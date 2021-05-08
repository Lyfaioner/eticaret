package business.concrete;

import business.abstracts.UserService;
import core.GoogleService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
private UserDao userDao;
private GoogleService googleService;
public UserManager(UserDao userDao) {
	super();
	this.userDao = userDao;
}
	@Override
	public void add(User user) {
		for (User users : userDao.getAll()) {
			if(user.getEmail().equals(users.getEmail())) {
				System.out.println("Bu email zaten kullanılıyor");
				return;
			}
			
		}
		userDao.add(user);
		System.out.println("Kayıt olundu");
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(String eMail, String password) {
		// TODO Auto-generated method stub
		
	}

}
