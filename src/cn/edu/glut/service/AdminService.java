package cn.edu.glut.service;

import java.io.Serializable;
import cn.edu.glut.entity.Admin;

public interface AdminService {
	
	public Admin login(Admin admin);
	public Serializable addAdmin(Admin admin);
	public void updateAdmin(Admin admin);

}
