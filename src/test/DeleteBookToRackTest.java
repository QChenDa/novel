package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.glut.action.AddBookToRackAction;
import cn.edu.glut.action.DeleteBookToRack;

public class DeleteBookToRackTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDeleteBook() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DeleteBookToRack a = (DeleteBookToRack) ctx.getBean("DeleteBookToRack");
		a.DeleteBook();
	}

}
