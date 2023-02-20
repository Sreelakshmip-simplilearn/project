package org.simplilearn.lms.Service;


import org.simplilearn.lms.dao.UserDao;
import org.simplilearn.lms.dao.UserDaoimpl;
import org.simplilearn.lms.entity.User;

public class Userserviceimpl implements Userservice {
	UserDao dao=new UserDaoimpl();
	@Override
	public void insert(User user) {
		dao.insert(user);
		
	}

	@Override
	public  User get(String username, String password) {
		
		return dao.get(username,password);
	}

	@Override
	public void updatepassword(String username,String password) {
		User user=dao.get(username,password);
		user.setPassword(password);
		dao.update(user);
	}
}
