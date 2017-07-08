package cn.edu.glut.daoimpl;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.glut.dao.UserDao;
import cn.edu.glut.entity.User;
import cn.edu.glut.entity.Userprofile;
import cn.edu.glut.entity.Userrights;
@Transactional
public class UserDaoimpl implements UserDao {

	 SessionFactory sessionfactory;

	public SessionFactory getSessionfactory() {
		return sessionfactory;
	}

	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		Session s = sessionfactory.openSession();
		Transaction tx =s.getTransaction();
		tx.begin();
		Userrights userright = new Userrights();
		userright.setUser(user);
		userright.setUserGrade(1);
		userright.setUserId(user.getUserId());
		userright.setUserType("Reader");
		s.save(userright);
		s.save(user);
		tx.commit();
		return true;
	}

	@Override
	public boolean findByName(String name) {
		// TODO Auto-generated method stub
		String sql = "select * from User where User_Name="+"'"+name+"'";
		SQLQuery q = sessionfactory.openSession().createSQLQuery(sql);
		if (q.list().isEmpty())
			return true;
		else
			return false;
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		sessionfactory.openSession().delete(user);
	}

	@Override
	public User find(String username) {
		// TODO Auto-generated method stub
		String hql = "from User where userName="+"'"+username+"'";
		Query q = sessionfactory.openSession().createQuery(hql);
		return (User) q.list().get(0);
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		 sessionfactory.openSession().update(user);;
		return user;
	}

	@Override
	public boolean updateuserprofile(Userprofile userprofile) {
		// TODO Auto-generated method stub
		sessionfactory.openSession().saveOrUpdate(userprofile);
		return true;
	}

	@Override
	public Userprofile finduserprofilebyname(String username) {
		// TODO Auto-generated method stub
		String hql = "from Userprofile where userName="+"'"+username+"'";
		Query q = sessionfactory.openSession().createQuery(hql);
		return (Userprofile) q.list().get(0);
	}

	@Override
	public boolean updateuserrights(Userrights userrights) {
		// TODO Auto-generated method stub
		sessionfactory.openSession().saveOrUpdate(userrights);
		return true;
	}

	@Override
	public Userrights finduserrightsbyid(int userid) {
		// TODO Auto-generated method stub
		String hql = "from Userrights where userId="+userid;
		Query q = sessionfactory.openSession().createQuery(hql);
		return (Userrights) q.list().get(0);	
		}

}
