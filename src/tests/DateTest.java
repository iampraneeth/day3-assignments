package tests;
import main.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class DateTest{

	
	@Test
	public void testingToString(){
		Date dateForString1 = new Date(18,4,1997);
		Date dateForString2=new Date(17,14,1956);
		
		assertEquals("18//4//1997",dateForString1.toDisplayString());
		assertEquals("Invalid Input",dateForString2.toDisplayString());
	}

	@Test
	public void testingDateIsSmaller(){
		Date date=new Date(18,04,1997);
		Date date1=new Date(17,03,1996);
		assertEquals(true,date.isSmaller(date1));
		assertEquals(false,date1.isSmaller(date));
		
	}
	@Test
	public void testingDateDifference(){
		Date date2=new Date(18,04,1997);
		Date date3=new Date(17,03,1996);
		int expectedArray[]={1,1,1};
		int actualArray[]=date2.dateDifference(date3);
		
		assertEquals(expectedArray[0],actualArray[0]);
		assertEquals(expectedArray[1],actualArray[1]);
		assertEquals(expectedArray[2],actualArray[2]);
		
		//assertEquals("In Valid",);
	}
	

		
	
	

}
	