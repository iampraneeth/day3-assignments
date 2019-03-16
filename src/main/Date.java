package main;
public class Date{
	private int date;
	private int month;
	private int year;
	
	public Date(int date,int month,int year){
		this.date=date;
		this.month=month;
		this.year=year;
		
	}
	public String toDisplayString(){
		if(this.date<=31 && this.date>=1 && this.month <=12 && this.month>=1 && this.year>=0){
			String str;
			String s1="//";
			str=Integer.toString(this.date)+s1;
			str=str+Integer.toString(this.month)+s1;
			str=str+Integer.toString(this.year);
			return str;
		}
		else{
			return "Invalid Input";
		}

	}
	public boolean isSmaller(Date d){
		if(date>d.date && month>d.month && year>d.year){
			return true;
		}
		else{
			return false;
		}
	}
	public int[] dateDifference(Date dateDiff){
		int d4[] = new int[3];
		int date1=this.date;
		int date2=dateDiff.date;
		int month1=this.month;
		int month2=dateDiff.month;
		int year1=this.year;
		int year2=dateDiff.year;
		int resultyear;
		int resultmonth;
		int resultday;
		if ((date1-date2)>0)
		{
			if ((month1-month2)>0)
			{
				resultday=(date1-date2);
				resultmonth=(month1-month2);
				resultyear=(year1-year2);
				
			}
			else
			{
				month1=month1+12;
				year1=year1-1;

				resultday=(date1-date2);
				resultmonth=(month1-month2);
				resultyear=(year1-year2);
			}
		}
		else
		{
			date1=date1+30;
			month1=month1-1;
			if((month1-month2)>0)
			{
				resultday=(date1-date2);
				resultmonth=(month1-month2);
				resultyear=(year1-year2);
				
			}
			else
			{
				month1=month1+12;
				year1=year1-1;

				resultday=(date1-date2);
				resultmonth=(month1-month2);
				resultyear=(year1-year2);
			}
		}
		d4[0]=resultday;
		d4[1]=resultmonth;
		d4[2]=resultyear;
		return d4;
	}	
		
}
	
	

	