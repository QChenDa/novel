package cn.edu.glut.dao;

import cn.edu.glut.entity.User;
import cn.edu.glut.entity.Userprofile;
import cn.edu.glut.entity.Userrights;

public interface UserDao {
	 public boolean addUser(User user);
	 
	 public boolean findByName(String name);
	 
	 public void delete(User user);
	 
	 public User find(String userName);
	 
	 public User update(User user);
	 
	 public boolean updateuserprofile(Userprofile userprofile);
	 
	 public Userprofile finduserprofilebyname(String username);
	 
	 public boolean updateuserrights(Userrights userrights);
	 
	 public Userrights finduserrightsbyid(int userid);
}
