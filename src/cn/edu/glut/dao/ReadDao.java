package cn.edu.glut.dao;

import java.util.List;

import cn.edu.glut.entity.Book;
import cn.edu.glut.entity.BookRack;
import cn.edu.glut.entity.Chapter;
import cn.edu.glut.entity.Comment;
import cn.edu.glut.entity.ParentChildren;
import cn.edu.glut.entity.ParentChildrenId;


public interface ReadDao {
			public List<Chapter> getAllChapter(String BookName);
			public Chapter FindChapterByName(String ChapterName);
			public void AddBookToRack(BookRack BookRack);
			public void DeleteBookToRack(BookRack BookRack);
			public Book FindBookByname(String name);
			public List<Book> getAllRackBook(String UserName);
			public void AddComment(Comment Comment);
			public void AddCommentResponse(ParentChildren pa ,ParentChildrenId paid);
			
			
}
