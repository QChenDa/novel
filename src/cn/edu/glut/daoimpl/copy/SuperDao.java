package cn.edu.glut.daoimpl.copy;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class SuperDao {
	
	private SessionFactory sessionFactory;
	private HibernateTemplate hibernateTemplate;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	
	@SuppressWarnings("unchecked")
	public List<Object> getAllObject(Class clazz, String hql) {
		List<Object> list = (List<Object>) hibernateTemplate.find(
				"from " + clazz.getName() + " s where 1=1 " + hql);

		return list;
	}
	
	
	//分页查询
	public List<Object> selectPage(int index, Class clazz, String bhql) {

		final int PAGETOTAL = 10;

		List<Object> list = null;

		final int page = index;

		final String hql = "from " + clazz.getName() + " as s where 1=1" + bhql;
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(hql);
		query.setFirstResult((page - 1) * PAGETOTAL);
		query.setMaxResults(PAGETOTAL);
		
		list = query.list();
		return list;
		//hibernateTemplate.findByCriteria(criteria, (page - 1) * PAGETOTAL, PAGETOTAL);
		

/*		list = hibernateTemplate.execute(new HibernateCallback() {
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				List result = session.createQuery(hql).setFirstResult(
						(page - 1) * PAGETOTAL).setMaxResults(PAGETOTAL).list();
				return result;
			}
		});

		return list;*/
	}
	
	
	//删除操作
	public void delete(Object entity){
		hibernateTemplate.delete(entity);
	}
	
	//增加操作
	public Serializable add(Object entity){
		Serializable id = hibernateTemplate.save(entity);
		return id;
	}
	
	//更新操作
	public void update(Object entity){
		hibernateTemplate.update(entity);
	}
	
	
	
	
	
	
}
