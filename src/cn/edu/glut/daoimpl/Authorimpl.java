package cn.edu.glut.daoimpl;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import cn.edu.glut.dao.AuthorDao;
import cn.edu.glut.entity.Book;
import cn.edu.glut.entity.Chapter;

public class Authorimpl implements AuthorDao{
   
	SessionFactory sesseionfactory;
	
	public SessionFactory getSesseionfactory() {
		return sesseionfactory;
	}

	public void setSesseionfactory(SessionFactory sesseionfactory) {
		this.sesseionfactory = sesseionfactory;
	}

	
    @Override
	public void AddBook(Book book) {
		// TODO Auto-generated method stub
		sesseionfactory.openSession().save(book);
	}

	@Override
	public void DeleteBook(Book book) {
		// TODO Auto-generated method stub
		sesseionfactory.openSession().delete(book);
	}

	@Override
	public void AddChapter(Chapter chapter) {
		// TODO Auto-generated method stub
		sesseionfactory.openSession().save(chapter);
		}

	@Override
	public void UpdateChapter(Chapter chapter) {
		// TODO Auto-generated method stub
		
		sesseionfactory.openSession().update(chapter);
		}

	@Override
	public void DeleteChapter(Chapter chapter) {
		// TODO Auto-generated method stub
		
		sesseionfactory.openSession().delete(chapter);
		}

	@Override
	public Book FindBookByBookName(String bookname) {
		// TODO Auto-generated method stub
		String HQL ="from Book where bookName="+"'"+bookname+"'";
		Query q=sesseionfactory.openSession().createQuery(HQL);
		 return (Book)q.list().get(0);
	}
			
}
