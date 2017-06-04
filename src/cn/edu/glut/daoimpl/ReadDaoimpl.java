package cn.edu.glut.daoimpl;

import java.util.List;

import javax.annotation.Resource;





import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;





import cn.edu.glut.dao.ReadDao;
import cn.edu.glut.entity.Book;
import cn.edu.glut.entity.BookRack;
import cn.edu.glut.entity.Chapter;
import cn.edu.glut.entity.Comment;
import cn.edu.glut.entity.ParentChildren;
import cn.edu.glut.entity.ParentChildrenId;


@Component("readdao")

public class ReadDaoimpl implements	ReadDao{
	
			@Resource
			private SessionFactory sessionfactory;
			
			@Override
			public List<Chapter> getAllChapter(String BookName) {
				// TODO Auto-generated method stub

				String hql ="from Chapter where BookName="+BookName;
				Query  q = sessionfactory.getCurrentSession().createQuery(hql);
				return q.list();		
			}		

			@Override
			public Chapter FindChapterByName(String ChapterName) {
				// TODO Auto-generated method stub

				String hql ="from Chapter where ChapterName="+ChapterName;
				Query  q = sessionfactory.getCurrentSession().createQuery(hql);
						
						return (Chapter)q.list().get(0);
			}
			@Override
			public void AddBookToRack(BookRack BookRack) {
				// TODO Auto-generated method stub

				sessionfactory.getCurrentSession().save(BookRack);

			}

			@Override
			public Book FindBookByname(String BookName) {
				// TODO Auto-generated method stub

				String sql ="from Book where BookName="+BookName;
				Query  q = sessionfactory.getCurrentSession().createQuery(sql);
				return (Book) q.list().get(0);
			}

			@Override
			public List<Book> getAllRackBook(String UserName) {
				// TODO Auto-generated method stub

				String hql ="from BookRack where UserName="+UserName;
				Query  q = sessionfactory.getCurrentSession().createQuery(hql);
				return q.list();		
			}

			@Override
			public void AddComment(Comment Comment) {
				// TODO Auto-generated method stub

				sessionfactory.getCurrentSession().save(Comment);
			}

			@Override
			public void AddCommentResponse(ParentChildren pa,ParentChildrenId paid) {
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
