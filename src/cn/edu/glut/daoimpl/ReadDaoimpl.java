package cn.edu.glut.daoimpl;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;

import cn.edu.glut.dao.ReadDao;
import cn.edu.glut.entity.Book;
import cn.edu.glut.entity.BookRack;
import cn.edu.glut.entity.Chapter;
import cn.edu.glut.entity.Comment;
import cn.edu.glut.entity.ParentChildren;
import cn.edu.glut.entity.ParentChildrenId;

public class ReadDaoimpl implements ReadDao {
	
	private SessionFactory sessionFactory;


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Chapter> getAllChapter(int bookid) {
		// TODO Auto-generated method stub
	 
		 String hql = "from Chapter where book=" + bookid;	
		 Query q = sessionFactory.openSession().createQuery(hql);		 		 	 
		 return q.list();
	}

	@Override
	public Chapter FindChapterByName(String ChapterName) {
		// TODO Auto-generated method stub

		String hql = "from Chapter where title=" +"'"+ ChapterName+"'";
		Query q = sessionFactory.openSession().createQuery(hql);
		return (Chapter) q.list().get(0);
	}

	@Override
	public void AddBookToRack(BookRack BookRack) {
		// TODO Auto-generated method stub

		sessionFactory.openSession().save(BookRack);

	}

	@Override
	public Book FindBookByname(String BookName) {
		// TODO Auto-generated method stub

		String hql = "from Book where bookName=" + "'"+BookName+"'";
		Query q = sessionFactory.openSession().createQuery(hql);
		return (Book) q.list().get(0);
	}

	@Override
	public List<Book> getAllRackBook(int UserId) {
		// TODO Auto-generated method stub

		String hql = "from BookRack where user=" +"'"+ UserId+"'";
		Query q = sessionFactory.openSession().createQuery(hql);
		return q.list();
	}

	@Override
	public void AddComment(Comment Comment) {
		// TODO Auto-generated method stub
			Comment.setCommentTime(new Date());
		sessionFactory.openSession().save(Comment);
	}

	@Override
	public void AddCommentResponse(ParentChildren pa, ParentChildrenId paid) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.openSession().save(paid);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			sessionFactory.openSession().save(pa);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
	}

	@Override
	public void DeleteBookToRack(int bookid) {
		// TODO Auto-generated method stub
		String sql = "delete from Book_Rack where Book_Id=" +"'"+ bookid+"'";
		Query q = sessionFactory.openSession().createSQLQuery(sql);
		q.executeUpdate();
	}

}
