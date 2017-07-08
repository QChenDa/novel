package cn.edu.glut.serviceimpl.copy;

import java.util.Iterator;
import java.util.Set;

import org.springframework.transaction.annotation.Transactional;

import cn.edu.glut.dao.copy.AuthorDao;
import cn.edu.glut.entity.User;
import cn.edu.glut.entity.Userprofile;
import cn.edu.glut.service.copy.AuthorService;
@Transactional
public class AuthorServiceImpl implements AuthorService {
	private AuthorDao authorDao;
	public void setAuthorDao(AuthorDao authorDao) {
		this.authorDao = authorDao;
	}
	
	//��¼
	@Override
	public User login(User user) {
		return authorDao.find(user);
	}

	//ע��
	@Override
	public Boolean addUser(User user) {
		if(!authorDao.findByName(user.getUserName()) && !authorDao.findByEmail(user.getUserEmali())){
			authorDao.addUser(user);
			return true;
		}else{
			return false;
		}
	}
	
	
	
}
