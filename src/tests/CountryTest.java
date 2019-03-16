package tests;
import main.Country;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
public class CountryTest{
	
	Country countries[];

	@Before
	public void startUp(){
		countries=new Country[4];
		countries[0]=new Country("INDIA",10250,55652);
		countries[1]=new Country("USA",11256,5965559);
		countries[2]=new Country("UK",11302,5565291);
		countries[3]=new Country("CANADA",400000,400000);

		}
	@Test
	public void testLargestCountry(){
		
		String expectedCountry=countries[1].getNameOfCountry();
		Country actualCountry=new Country();
		String actual=actualCountry.largestArea(countries);
		assertEquals(expectedCountry,actual);
		
		



		}
	@Test
	public void testLargestPopulation(){
		
		long expectedCountry=countries[3].getPopulationOfCountry();
		Country actualCountry=new Country();
		long actual=actualCountry.largestPopulation(countries);
		assertEquals(expectedCountry,actual);
		
		



		}
	@Test
	public void testPopulationDensity(){
		
		String expectedCountry=countries[3].getNameOfCountry();
		Country actualCountry=new Country();
		
		String actual=actualCountry.populationDensity(countries);
		assertEquals(expectedCountry,actual);
		
		



		}
}