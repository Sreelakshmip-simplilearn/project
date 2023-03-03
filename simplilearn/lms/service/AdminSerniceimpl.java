package orgg.simplilearn.lms.service;

import orgg.simplilearn.lms.Dao.AdminDao;
import orgg.simplilearn.lms.Dao.AdminDaoimpl;

import orgg.simplilearn.lms.entity.Admin;

public class AdminSerniceimpl implements AdminService {
     AdminDao dao=new AdminDaoimpl();
	@Override
	public void insert(Admin admin) {
		dao.insert(admin);
		
	}

	@Override
	public  Admin get(String Name, String Password) {
		
		return dao.get(Name,Password);
	}

	@Override
	public void updatepassword(String Name, String Password) {
		Admin admin=dao.get(Name,Password);
		admin.setPassword(Password);
		dao.update(admin);
	}
}
