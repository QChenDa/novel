package cn.edu.glut.dao;

import java.io.Serializable;

import cn.edu.glut.entity.Admin;
public interface AdminDao {
	
	public Admin select(Admin admin);
	public Serializable add(Admin admin);
	public void update(Admin admin);

}
