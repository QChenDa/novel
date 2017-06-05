package cn.edu.glut.serviceimpl;

import java.io.Serializable;

import org.springframework.transaction.annotation.Transactional;

import cn.edu.glut.dao.AdminDao;
import cn.edu.glut.entity.Admin;
import cn.edu.glut.service.AdminService;

@Transactional
public class AdminServiceImpl implements AdminService {
	
	private AdminDao adminDao;
	
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	//µÇÂ¼
	public Admin login(Admin admin) {
		
		return adminDao.select(admin);
	}

	//Ìí¼Ó
	public Serializable addAdmin(Admin admin) {
		
		return adminDao.add(admin);
	}

	//¸üÐÂ
	public void updateAdmin(Admin admin) {
		adminDao.update(admin);
	}

}
