package cn.edu.glut.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.glut.dao.ReadDao;
import cn.edu.glut.daoimpl.ReadDaoimpl;
import cn.edu.glut.entity.Book;
import cn.edu.glut.entity.BookRack;
import cn.edu.glut.entity.Chapter;
import cn.edu.glut.entity.Comment;
import cn.edu.glut.entity.ParentChildren;
import cn.edu.glut.entity.ParentChildrenId;
import cn.edu.glut.service.ReadService;

@Transactional
public class ReadServiceimpl implements ReadService {

	ReadDao readdao;

	public void setReaddao(ReadDao readdao) {
		this.readdao = readdao;
	}

	public ReadDao getReaddao() {
		return readdao;
	}

	@Override
	public List<Chapter> getAllChapter(Book book) {
		// TODO Auto-generated method stub

		List<Chapter> list = readdao.getAllChapter(book);
		return list;
	}

	@Override
	public Chapter FindChapterByName(String ChapterName) {
		// TODO Auto-generated method stub
		Chapter chapter = readdao.FindChapterByName(ChapterName);
		return chapter;
	}

	@Override
	public void AddBookToRack(BookRack BookRack) {
		// TODO Auto-generated method stub
		readdao.AddBookToRack(BookRack);
	}

	@Override
	public void DeleteBookToRack(BookRack BookRack) {
		// TODO Auto-generated method stub
		readdao.DeleteBookToRack(BookRack);
	}

	@Override
	public Book FindBookByname(String name) {
		// TODO Auto-generated method stub
		Book book = readdao.FindBookByname(name);
		return book;
	}

	@Override
	public List<Book> getAllRackBook(int UserName) {
		// TODO Auto-generated method stub
		List<Book> list = readdao.getAllRackBook(UserName);
		return list;
	}

	@Override
	public void AddComment(Comment Comment) {
		// TODO Auto-generated method stub
		readdao.AddComment(Comment);
	}

	@Override
	public void AddCommentResponse(ParentChildren pa, ParentChildrenId paid) {
		// TODO Auto-generated method stub
		readdao.AddCommentResponse(pa, paid);
	}

}
