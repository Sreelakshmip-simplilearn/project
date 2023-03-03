package orgg.simplilearn.lms.service;

import orgg.simplilearn.lms.Dao.UserDao;
import orgg.simplilearn.lms.Dao.UserDaoimpl;

import orgg.simplilearn.lms.entity.User;

public class UserServiceimpl implements UserService{
	UserDao Dao=new UserDaoimpl();

	@Override
	public void insert(User user) {
		Dao.insert(user);
		
	}

	@Override
	public User get(String Name, String Password) {
		return Dao.get(Name,Password);
	}

	@Override
	public void updatepassword(String Name, String Password) {
		User use=Dao.get(Name,Password);
		use.setPassword(Password);
		Dao.update(use);
		
	}

}
