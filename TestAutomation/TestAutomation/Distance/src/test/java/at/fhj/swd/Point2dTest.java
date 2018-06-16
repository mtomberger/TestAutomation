package at.fhj.swd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Point2dTest {

	private Point2d p1;
	private Point2d p2;

	@Before
	public void setup(){
		p1 = new Point2d(1,1);
		p2 = new Point2d(5,4);
	}

	@Test
	public void testConstructor(){
		assertEquals(1,p1.getX(), 0.0001);
		assertEquals(1,p1.getY(), 0.0001);
		assertEquals(5,p2.getX(), 0.0001);
		assertEquals(4,p2.getY(), 0.0001);
	}

	/**
	 * Set some Point2d for testing their functionality
	 */

	/**
	 * Test the Setter of the x-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of x
	 */
	@Test
	public void testSetX(){
		p1.setX(33);
		assertEquals(33, p1.getX(), 0.0001);
	}

	/**
	 * Test the Setter of the y-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of y
	 */
	@Test
	public void testSetY(){
		p1.setY(33);
		assertEquals(33, p1.getY(), 0.0001);
	}
	

	/**
	 * Test the distanceFrom() Method
	 * - call the method distanceFrom and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFrom()
	 */
	@Test
	public void testDistanceFrom(){
		assertEquals(5, p1.distanceFrom(p2), 0.0001);
	}

	/**
	 * Test the distanceFromOrigin() Method
	 * - call the method distanceFromOrigin and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFromOrigin()
	 */
	@Test
	public void testDistanceFromOrigin(){
		assertEquals(1.414, p1.distanceFromOrigin(), 0.001);
		assertEquals(6.403, p2.distanceFromOrigin(), 0.001);
	}
}
