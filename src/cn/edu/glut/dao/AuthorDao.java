package cn.edu.glut.dao;

import cn.edu.glut.entity.Book;
import cn.edu.glut.entity.Chapter;

public interface AuthorDao {
//		作者创建书籍
		public void AddBook(Book book);
//		作者删除书籍
		public void DeleteBook(Book book);
//		作者添加书籍章节
		public void AddChapter(Chapter chapter);
//		作者更新章节
		public void UpdateChapter(Chapter chapter);
//		作者删除章节
		public void DeleteChapter(Chapter chapter);
//		作者查询书籍
		public Book FindBookByBookName(String bookname);
}
