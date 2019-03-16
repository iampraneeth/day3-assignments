package tests;
import main.Triangle;
import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest{
	
	@Test
	public void testIsRight(){
		Triangle t=new Triangle(3,4,5);
		Triangle t1=new Triangle(1,2,3);
		
		assertTrue(t.isRight());
		assertFalse(t1.isRight());
	}
	@Test
	public void testIsScalane(){
		Triangle t=new Triangle(3,4,5);
		Triangle t1=new Triangle(1,1,3);
		
		assertTrue(t.isScalene());
		assertFalse(t1.isScalene());
	}
	@Test
	public void isIsosceles(){
		Triangle t=new Triangle(4,4,3);
		Triangle t1=new Triangle(1,2,3);
		
		assertTrue(t.isIsosceles());
		assertFalse(t1.isIsosceles());
	}
	@Test
	public void isEquilateral(){
		Triangle t=new Triangle(4,4,4);
		Triangle t1=new Triangle(1,1,3);
		
		assertTrue(t.isEquilateral());
		assertFalse(t1.isEquilateral());
	}
}