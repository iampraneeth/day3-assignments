package main;

public class Country{
	private String nameOfCountry;
	private long populationOfCountry;
	private long areaOfCountry;
	
	public Country(){}
	public Country(String nameOfCountry,long populationOfCountry,long areaOfCountry){
		this.nameOfCountry = nameOfCountry;
		this.populationOfCountry=populationOfCountry;
		this.areaOfCountry=areaOfCountry;
	}
	public void setCountryName(String nameOfCountry){
		this.nameOfCountry = nameOfCountry;
	}
	
	public void setPopulation(long populationOfCountry){
		this.populationOfCountry=populationOfCountry;
	}
	public void setArea(long areaOfCountry){
		this.areaOfCountry=areaOfCountry;
	}
	public String getNameOfCountry(){
		return nameOfCountry;
	}
	public long getAreaOfCountry(){
		return areaOfCountry;
	}
	public long getPopulationOfCountry(){
		return populationOfCountry;
	}
	public String largestArea(Country[] country){
		long max=country[0].areaOfCountry;
		int index=1;
		for(int i=1;i<country.length;i++){
			if(max < country[i].areaOfCountry){
				max=country[i].areaOfCountry;
				index=i;
			}
		}
		return (country[index].nameOfCountry);
	}
	public long largestPopulation(Country[] country){
		
		long max=country[0].populationOfCountry;
		int index=1;
		for(int i=1;i<country.length;i++){
			if(max < country[i].populationOfCountry){
				max=country[i].populationOfCountry;
				index=i;
			}
		}
		return (country[index].populationOfCountry);
	}

	public String populationDensity(Country[] country){
		
		long max=country[0].populationOfCountry/country[0].areaOfCountry;
		int index=1;
		for(int i=1;i<country.length;i++){
			if(max < country[i].populationOfCountry/country[i].areaOfCountry){
				max=country[i].populationOfCountry/country[i].areaOfCountry;
				index=i;
			}
		}
		return (country[index].nameOfCountry);
		
	}



		
	
}