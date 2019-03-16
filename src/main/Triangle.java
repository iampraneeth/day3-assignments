package main;

public class Triangle{
	public int side1;
	public int side2;
	public int side3;

	public Triangle(int side1,int side2,int side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	
	public boolean isRight(){
	
		int hypotenuse;
		int base;
		int height;
		if(side1 > side2 && side1 > side3)
		{
			hypotenuse=side1;
			base=side2;
			height=side3;
		}
		else if(side2 > side1 && side2 > side3)
		{
			

			hypotenuse=side2;
			base=side1;
			height=side3;

		}
		else
		{
			hypotenuse=side3;
			base=side1;
			height=side2;
		}
		if ((hypotenuse*hypotenuse)==(base*base)+(height*height))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isScalene(){
		if(side1==side2 || side2==side3 || side3==side1)
		{
			return false;
		}
		else
			return true;

	}
	public boolean isIsosceles(){
		if(side1==side2 && side1!=side3)
			return true; 
		else if(side1==side3 && side1!=side2)
			return true;
		else if(side3==side2 && side1!=side3)
			return true;
		return false;

		

	}
	public boolean isEquilateral(){
		if((side1==side2) && (side2==side3) && (side3==side1)){
			return true;
		}
		else{
			return false;}

	}
}