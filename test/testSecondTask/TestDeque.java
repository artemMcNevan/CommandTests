package testSecondTask;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import SecondTask.Deque;

public class TestDeque {
	@Before
	public void CreateForTest() {
		
	}
	@Test
	public void TestZeroElement() {
		Deque<String> testDeque = new Deque<String> ();
		assertNull("lastElement == null", testDeque.get_back());
		assertNull("firstElement == null", testDeque.get_front());
		assertEquals( 0 , testDeque.size());
	}
	@Test
	public void TestOneFrontElement() {
		Deque<String> testDeque = new Deque<String> ();
		testDeque.push_front("2");
		assertEquals( 1 , testDeque.size());
		assertEquals("2", testDeque.get_front());
		assertNull("lastElement == null", testDeque.get_back());
		assertEquals( 0 , testDeque.size());
		testDeque.push_front("2");
		assertEquals("2", testDeque.get_back());
		assertEquals( 0 , testDeque.size());
		assertNull("lastElement == null", testDeque.get_back());
		assertNull("firstElement == null", testDeque.get_front());
	}
	@Test
	public void TestOneBackElement() {
		Deque<String> testDeque = new Deque<String> ();
		testDeque.push_back("1");
		assertEquals( 1 , testDeque.size());
		assertEquals("1", testDeque.get_back());
		assertNull("lastElement == null", testDeque.get_back());
		assertEquals( 0 , testDeque.size());
		testDeque.push_back("2");
		assertEquals("2", testDeque.get_front());
		assertEquals( 0 , testDeque.size());
		assertNull("lastElement == null", testDeque.get_back());
		assertNull("firstElement == null", testDeque.get_front());
	}
	@Test
	public void TestTwoFrontElement() {
		Deque<String> testDeque = new Deque<String> ();
		assertNull("lastElement == null", testDeque.get_back());
		assertNull("firstElement == null", testDeque.get_front());
		assertEquals( 0 , testDeque.size());
		testDeque.push_front("2");
		testDeque.push_front("1");
		assertEquals( 2 , testDeque.size());
		assertEquals("1", testDeque.get_front());
		assertEquals("2", testDeque.get_front());
		assertEquals( 0 , testDeque.size());
		assertNull("lastElement == null", testDeque.get_back());
		assertNull("firstElement == null", testDeque.get_front());
	}
	@Test
	public void TestTwoBackElement() {
		Deque<String> testDeque = new Deque<String> ();
		assertNull("lastElement == null", testDeque.get_back());
		assertNull("firstElement == null", testDeque.get_front());
		assertEquals( 0 , testDeque.size());
		testDeque.push_back("1");
		testDeque.push_back("2");
		assertEquals( 2 , testDeque.size());
		assertEquals("2", testDeque.get_back());
		assertEquals("1", testDeque.get_back());
		assertEquals( 0 , testDeque.size());
		assertNull("lastElement == null", testDeque.get_back());
		assertNull("firstElement == null", testDeque.get_front());
	}
	@Test
	public void TestTwoElement() {
		Deque<String> testDeque = new Deque<String> ();
		assertNull("lastElement == null", testDeque.get_back());
		assertNull("firstElement == null", testDeque.get_front());
		assertEquals( 0 , testDeque.size());
		testDeque.push_front("1");
		testDeque.push_back("2");
		assertEquals( 2 , testDeque.size());
		assertEquals("1", testDeque.get_front());
		assertEquals("2", testDeque.get_back());
		assertEquals( 0 , testDeque.size());
		assertNull("lastElement == null", testDeque.get_back());
		assertNull("firstElement == null", testDeque.get_front());
	}
	@Test
	public void TestManyElement() {
		Deque<String> testDeque = new Deque<String> ();
		assertNull("lastElement == null", testDeque.get_back());
		assertNull("firstElement == null", testDeque.get_front());
		assertEquals( 0 , testDeque.size());
		testDeque.push_front("2");
		testDeque.push_back("3");
		testDeque.push_front("1");
		testDeque.push_back("4");
		assertEquals( 4 , testDeque.size());
		assertEquals("1", testDeque.get_front());
		assertEquals("4", testDeque.get_back());
		assertEquals("2", testDeque.get_front());
		assertEquals("3", testDeque.get_back());
		assertEquals( 0 , testDeque.size());
		assertNull("lastElement == null", testDeque.get_back());
		assertNull("firstElement == null", testDeque.get_front());
	}
	
}


