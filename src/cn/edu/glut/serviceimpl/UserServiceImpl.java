package cn.edu.glut.serviceimpl;

import org.springframework.transaction.annotation.Transactional;

import cn.edu.glut.dao.UserDao;
import cn.edu.glut.entity.User;
import cn.edu.glut.service.UserService;

@Transactional
public class UserServiceImpl implements UserService{
	//ע��Dao
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	
	//��¼
	@Override
	public User login(User user) {
		return userDao.find(user);
	}

	
	//ע��
	@Override
	public Boolean addUser(User user) {
		if(!userDao.findByName(user.getUserName()) && !userDao.findByEmail(user.getUserEmali())){
			userDao.addUser(user);
			return true;
		}else{
			return false;
		}
	}


	@Override
	public void updateUser(User user) {
		
	}
	
}
