import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SortArrayByNumTest {
	Person[] arrayList = new Person [10];
	
	@Before
	public void update() {
		arrayList[1] = new Person("fname", "lname", 0);
		arrayList[3] = new Person("fname", "lname", 50);
		arrayList[5] = new Person("fname", "lname", 50);
		arrayList[6] = new Person("fname", "lname", 40);
		arrayList[8] = new Person("fname", "lname", -10);
		arrayList[9] = new Person("fname", "lname", -20);
	}
	
	@Test 
	public void getTest() {
		SortArrayByNum tester = new SortArrayByNum(arrayList);
		Person newPersonMin = (Person)  tester.get(0);
		Person newPersonZero = (Person)  tester.get(2);
		Person newPersonPluse = (Person)  tester.get(3);
		Person newPersonNull = (Person)  tester.get(6);
		assertEquals("number = -20", -20, newPersonMin.getNumber());
		assertEquals("number = 0", 0, newPersonZero.getNumber());
		assertEquals("number = 40", 40, newPersonPluse.getNumber());
		assertNull("number = null", newPersonNull);
	}
	
	@Test
	public void getLengthTest() {
		SortArrayByNum tester = new SortArrayByNum(arrayList);		
		assertEquals("Length", arrayList.length, tester.getLength());
	}
}
