package cn.edu.glut.daoimpl;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.edu.glut.dao.ReadDao;
import cn.edu.glut.entity.Book;
import cn.edu.glut.entity.BookRack;
import cn.edu.glut.entity.Chapter;
import cn.edu.glut.entity.Comment;
import cn.edu.glut.entity.ParentChildren;
import cn.edu.glut.entity.ParentChildrenId;

public class ReadDaoimpl implements ReadDao {
	
	private SessionFactory sessionfactory;


	public SessionFactory getSessionfactory() {
		return sessionfactory;
	}

	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	@Override
	public List<Chapter> getAllChapter(Book book) {
		// TODO Auto-generated method stub
	 
		 String hql = "from Chapter where book=" + book.getBookId();	
		 Query q = sessionfactory.getCurrentSession().createQuery(hql);		 		 	 
		 return q.list();
	}

	@Override
	public Chapter FindChapterByName(String ChapterName) {
		// TODO Auto-generated method stub

		String hql = "from Chapter where ChapterName=" + ChapterName;
		Query q = sessionfactory.getCurrentSession().createQuery(hql);

		return (Chapter) q.list().get(0);
	}

	@Override
	public void AddBookToRack(BookRack BookRack) {
		// TODO Auto-generated method stub

		sessionfactory.getCurrentSession().save(BookRack);

	}

	@Override
	public Book FindBookByname(String BookName) {
		// TODO Auto-generated method stub

		String sql = "from Book where BookName=" + BookName;
		Query q = sessionfactory.getCurrentSession().createQuery(sql);
		return (Book) q.list().get(0);
	}

	@Override
	public List<Book> getAllRackBook(int UserId) {
		// TODO Auto-generated method stub

		String hql = "from BookRack where user=" + UserId;
		Query q = sessionfactory.getCurrentSession().createQuery(hql);
		return q.list();
	}

	@Override
	public void AddComment(Comment Comment) {
		// TODO Auto-generated method stub
			Comment.setCommentTime(new Date());
		sessionfactory.getCurrentSession().save(Comment);
	}

	@Override
	public void AddCommentResponse(ParentChildren pa, ParentChildrenId paid) {
		// TODO Auto-generated method stub
		try {
			sessionfactory.getCurrentSession().save(paid);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			sessionfactory.getCurrentSession().save(pa);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
	}

	@Override
	public void DeleteBookToRack(BookRack BookRack) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().delete(BookRack);
		
	}

}
