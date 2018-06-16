package at.fhj.swd;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Point3dTest {

	/**
	 * Set some Point3d for testing their functionality
	 */
	private Point3d p1;
	private Point3d p2;

	@Before
	public void testSetup()
	{
		p1 = new Point3d(1,1,1);
		p2 = new Point3d(4,5,6);
	}
	/**
	 * Test the Setter of the x-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of x
	 */
	@Test
	public void testSetX(){
		p1.setX(5.5);
		Assert.assertEquals(5.5,p1.getX(),0.001);
	}

	/**
	 * Test the Setter of the y-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of y
	 */
	@Test
	public void testSetY(){
		p1.setY(18.7);
		Assert.assertEquals(18.7,p1.getY(),0.001);
	}
	

	/**
	 * Test the Setter of the z-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of z
	 */
	@Test
	public void testSetZ(){
		p1.setZ(13.8);
		Assert.assertEquals(13.8,p1.getZ(),0.001);
	}

	/**
	 * Test the distanceFrom() Method
	 * - call the method distanceFrom and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFrom()
	 */
	@Test
	public void testDistanceFrom(){
		Assert.assertEquals(Math.sqrt(3*3+4*4+5*5),p2.distanceFrom(p1),0.001);
	}

	/**
	 * Test the distanceFromOrigin() Method
	 * - call the method distanceFromOrigin and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFromOrigin()
	 */
	@Test
	public void testDistanceFromOrigin(){
		Assert.assertEquals(Math.sqrt(3),p1.distanceFromOrigin(),0.001);
	}
}
