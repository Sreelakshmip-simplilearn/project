package orgg.simplilearn.lms.service;



import orgg.simplilearn.lms.entity.Admin;

public interface AdminService {
	void insert(Admin admin);
	Admin get(String Name,String Password);
	void updatepassword(String Name,String Password);
}


