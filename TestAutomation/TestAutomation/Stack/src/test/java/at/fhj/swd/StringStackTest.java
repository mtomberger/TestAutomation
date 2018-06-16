package at.fhj.swd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class StringStackTest
{
    public Stack s;
    
    @Before
    public void setup() throws Exception
    {
        s = new StringStack(5); // keep size of 5 !!
    }

    /**
     * Tests if stack capacity must be > 0
    **/
    @Test(expected = IllegalArgumentException.class)
    public void testConstructor()
    {
        Stack s = new StringStack(0);
    }
    /**
     * tests if stack is empty after initialization
     * 
     * use assert
     * - assertTrue to check it's empty
     */
    @Test
    public void testIsEmpty() throws Exception
    {
        Assert.assertTrue(s.isEmpty());

    }
    
    /**
     * tests if stack is empty after pushing
     * 
     * use assert
     * - assertFalse to check it's not empty
     */
    @Test
    public void testIsNotEmpty() throws Exception
    {
        s.push("S1");
        Assert.assertFalse(s.isEmpty());
    }

    /**
     * tests push and pop function
     * 
     * do following test
     * - use push, 1 or x times
     * - use pull, as often as you use push
     * - use isEmpty to check that's empty again
     * - assert every content of the stack in the correct ordering
     * @throws Exception 
     */
    @Test
    public void testPushPop() throws Exception
    {
        s.push("s1");
        s.push("s2");
        s.push("s3");
        s.push("s4");
        String s4 = s.pop();
        String s3 = s.pop();
        String s2 = s.pop();
        String s1 = s.pop();
        Assert.assertSame("s4",s4);
        Assert.assertSame("s3",s3);
        Assert.assertSame("s2",s2);
        Assert.assertSame("s1",s1);
        Assert.assertTrue(s.isEmpty());
    }
    /**
     * Tests if the capacity check works
     **/
    @Test(expected = IllegalStateException.class)
    public void testPushOverflow() throws Exception
    {
        s.push("1");
        s.push("2");
        s.push("3");
        s.push("4");
        s.push("5");
        //too much
        s.push("6");

    }
    /**
     * tests if pop on empty stack failes
     * */
    @Test(expected = IllegalStateException.class)
    public void testPopEmpty() throws Exception
    {
        s.pop();
    }
    /**
     * Feel Free to insert other test cases for the String Stack Implementation !!!
     */
    
}
