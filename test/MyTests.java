import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MyTests {

	@Test
	public void test() {
		IntegralArray ar = new IntegralArray();
		// new array
		Assert.assertTrue(ar.getLength() == 0);
		// min & max
		ar.push(-1);
		ar.push(-8);
		ar.push(4);
		ar.push(8);
		ar.push(1);

		Assert.assertTrue(ar.getMin() == -8);
		Assert.assertTrue(ar.getMax() == 8);
		// push
		ar = new IntegralArray();

		ar.push(3);
		ar.push(7);
		ar.push(2);

		Assert.assertTrue(ar.get(0)== 3);
		Assert.assertTrue(ar.get(1)== 7);


	}
}
