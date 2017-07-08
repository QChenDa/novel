package cn.edu.glut.dao;

import java.util.List;

import cn.edu.glut.entity.Book;
import cn.edu.glut.entity.BookRack;
import cn.edu.glut.entity.Chapter;
import cn.edu.glut.entity.Comment;
import cn.edu.glut.entity.ParentChildren;
import cn.edu.glut.entity.ParentChildrenId;


public interface ReadDao {
			public List<Chapter> getAllChapter(int Bookid);
			public Chapter FindChapterByName(String ChapterName);
			public void AddBookToRack(BookRack BookRack);
			public void DeleteBookToRack(int bookid);
			public Book FindBookByname(String name);
			public List<Book> getAllRackBook(int UserId);
			public void AddComment(Comment Comment);
			public void AddCommentResponse(ParentChildren pa ,ParentChildrenId paid);
			
			
}
