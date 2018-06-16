package at.fhj.swd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;


public class StringQueueTest {
	

    StringQueue queue;
    @Before
    public void testSetup()
    {
        queue = new StringQueue();
        queue.offer("String1");
        queue.offer("String2");
        queue.offer("String3");
    }
    @Test
    public void testOffer()
    {
        queue.offer("String4");
        Assert.assertSame(queue.poll(),"String1");
        Assert.assertSame(queue.poll(),"String2");
        Assert.assertSame(queue.poll(),"String3");
        Assert.assertSame(queue.poll(),"String4");
    }
    @Test
    public void testElement()
    {
        Assert.assertSame(queue.element(),"String1");
        Assert.assertSame(queue.element(),"String1");
    }
    @Test(expected = NoSuchElementException.class)
    public void testElementException()
    {
        StringQueue q1 = new StringQueue();
        q1.element();
    }
    @Test
    public void testPeek()
    {
        Assert.assertSame(queue.peek(),"String1");
        Assert.assertSame(queue.peek(),"String1");
    }
    @Test
    public void testPeekNull()
    {
        StringQueue q1 = new StringQueue();
        Assert.assertSame(q1.peek(),null);
    }
    @Test
    public void testPoll()
    {
        Assert.assertSame(queue.poll(),"String1");
        Assert.assertSame(queue.poll(),"String2");
        Assert.assertSame(queue.poll(),"String3");
    }
    @Test
    public void testRemove()
    {
        queue.remove();
        Assert.assertSame(queue.peek(),"String2");
        queue.remove();
        Assert.assertSame(queue.peek(),"String3");
    }
    @Test(expected = NoSuchElementException.class)
    public void testRemoveException()
    {
        StringQueue q1 = new StringQueue();
        q1.remove();
    }
}
