import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FindMinNumTest {
	private int numberNegative = -50;
	private int numberZero = 0;
	private int numberPozitive = 30;
	Person[][] arrayList = new Person [6][2];
	
	@Before
	public void CreatePersonForTest() {
		arrayList[0][0] = new Person("fname", "lname", numberNegative);
		arrayList[0][1] = new Person("fname", "lname", numberZero);
		arrayList[1][0] = new Person("fname", "lname", numberPozitive);
	}
	
	@Test
	public void Test() {
		FindMinNumPerson tester = new FindMinNumPerson();		
		assertEquals("min = -50", arrayList[0][0], tester.findMinNum(arrayList));
		
	}
	

}
