package cn.edu.glut.daoimpl.copy;

import java.io.Serializable;
import java.util.List;
import org.springframework.orm.hibernate5.HibernateTemplate;
import cn.edu.glut.dao.AdminDao;
import cn.edu.glut.entity.Admin;

public class AdminDaoImpl implements AdminDao {
	
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	public Admin select(Admin admin) {
		String hql = "from Admin a where a.username=? and a.password=?";
		List<Admin> list = (List<Admin>) hibernateTemplate.find(hql, admin.getUsername(),admin.getPassword());
		if(list.size()>0 && list!=null){
			return list.get(0);
		}else{
			return null;
		}
	} 


	public Serializable add(Admin admin) {
		Serializable id = hibernateTemplate.save(admin);
		return  id;
	}


	public void update(Admin admin) {
		hibernateTemplate.update(admin);
	}
}
