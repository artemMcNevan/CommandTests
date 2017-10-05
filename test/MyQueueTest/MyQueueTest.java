package MyQueueTest;

import MyQueue.MyQueue;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fylhtqww on 10/5/2017.
 */
public class MyQueueTest {

    @Test
    public void test() {

        MyQueue m = new MyQueue();

        m.push_back(1);
        m.push_back(2);
        m.push_back(3);
        m.push_back(4);
        m.push_back(5);
        MyQueue mClone = new MyQueue(m);

        Assert.assertTrue(m.size() == 5);
        Assert.assertTrue(m.getElement(0) == (Object) 1);
        Assert.assertTrue(m.get() == (Object) 1);
        Assert.assertTrue(m.getElement(0) == (Object) 2);

        mClone.push_back(6);

        Assert.assertTrue(mClone.size() == 6);
        Assert.assertTrue(mClone.get() == (Object) 1);
        Assert.assertTrue(mClone.get() == (Object) 2);
        Assert.assertTrue(mClone.get() == (Object) 3);
        Assert.assertTrue(mClone.get() == (Object) 4);
        Assert.assertTrue(mClone.get() == (Object) 5);
        Assert.assertTrue(mClone.get() == (Object) 6);
        Assert.assertTrue(mClone.get() ==  null);
    }
}
