package test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.glut.action.AddBookToRackAction;

public class AddBookToRackActionTest {

	@Test
	public void testAddBook() {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		AddBookToRackAction a = (AddBookToRackAction) ctx.getBean("AddBookToRackAction");
		a.AddBook();
	}

}
