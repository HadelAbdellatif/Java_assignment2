import java.util.Date;
@SuppressWarnings("deprecation")
public class Car {      
	 //defining fields 
	private String PlateNo; //has default value null
	private int yearmanufacture;     //has default value 0
	private int monthmanufacter;     //has default value 0
	private String color;            //has default value null
	private double price;            //has default value 0
	private String manufactureby;    //has default value null
	private int guaranteedueyear;    //has default value 0
	private int guaranteeduemonth;   //has default value 0
	
	//No-argument constructor
	public Car() {
		Date d=new Date();
		PlateNo="0123-A";                        //has value 0123-A
		yearmanufacture=d.getYear()+1900 ;       //has value current year
		monthmanufacter= d.getMonth()+1;         //has value current month
		color="red";                             //has value red
		price=50000.00;                          //has value 50000.00
		manufactureby="Marcedes";                //has value Marcedes
		guaranteeduemonth=d.getMonth()+7;        //has value after 6 months from the current month
		if(guaranteedueyear%12 > 0) {            // if-close when month 12 finish go to next year and start from month 1
		guaranteedueyear=d.getYear()+1901 ;
		guaranteeduemonth=guaranteeduemonth-12;
		}
		else
		guaranteedueyear=d.getYear()+1900 ;
	   
	}
	//constructor with arguments that mentioned in UML 
	public Car(String PlateNo ,int yearmanufacture ,int monthmanufacter,String color ,double price ,String manufactureby ,int guaranteedueyear ,int guaranteeduemonth) {
		this.PlateNo=PlateNo;
		this.yearmanufacture=yearmanufacture;
		this.monthmanufacter=monthmanufacter;
		this.color=color;
		this.price=price;
		this.manufactureby=manufactureby;
		this.guaranteedueyear=guaranteedueyear;
		this.guaranteeduemonth=guaranteeduemonth;
		
	}
	
	public void setYearManufacture(int year) {
		yearmanufacture=year;
	}
	public int getYearManufacture() {
		return yearmanufacture;
}
	
	public void setMonthManufacter(int month) {
		monthmanufacter=month;
	}
	public int getMonthManufacter() {
		return monthmanufacter;
}
	
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color.toUpperCase();
}
	
	public double getPrice() {
		return price;
}
	
	public String getmanufactureby() {
		return manufactureby.toUpperCase();
}
	
	public void setguaranteedueyear(int month , int year) {
		guaranteedueyear=year;
		guaranteeduemonth=month;
	}
   
    public String CarAge() {          // method that calculate the age of the car (the current date - production date) 
    	int ageinyears = 0;           //ignore days
    	int ageinmonths = 0;
		Date d=new Date();
		if((d.getMonth()+1) < getMonthManufacter()) {
    		ageinyears =d.getYear()+1900-yearmanufacture-1;
    		ageinmonths =(d.getMonth()+1)+12;
		}
		else {
			ageinyears =d.getYear()+1900-yearmanufacture;
    		ageinmonths =d.getMonth()+1-monthmanufacter;
		}
    		String s=("The care age is "+ageinyears+" year and "+ageinmonths+" month ");
    		return s.toUpperCase();
    	}
    
    
    public String CalculateGuarantee(){   //method that calculate after how many years and months the guarantee will end
       int years=0;
       int months=0;
		Date d=new Date();
		String s = null;
        if((d.getYear()+1900) < guaranteedueyear) {
        	if((d.getMonth()+1) > guaranteeduemonth) {
        		months=(guaranteeduemonth-(d.getMonth()+1))+12;
        		years=Math.abs(guaranteedueyear-(d.getYear()+1900))-1;
        		s=("Guarantee ends after "+years+"years and "+months+" monthes");
        	}
        	else {
        		months=guaranteeduemonth-(d.getMonth()+1);
        	    years=Math.abs(guaranteedueyear-(d.getYear()+1900));
        	    s=("Guarantee ends after "+years+"years and "+months+" monthes");
        	}
        }
        if((d.getYear()+1900) > guaranteedueyear){
        		if(guaranteeduemonth > (d.getMonth()+1)) {
        			months =(d.getMonth()+1)-guaranteeduemonth+12;
        			years=(d.getYear()+1900)-guaranteedueyear-1;
        			s=("Guarantee ends befor "+years+"years and "+months+" monthes");
        		}
        else 
        	{
        	months=((d.getMonth()+1)-guaranteeduemonth);
            years=((d.getYear()+1900)-guaranteedueyear);
            s=("Guarantee ends befor "+years+"years and "+months+" monthes");
        	}
       }
       return s.toUpperCase();
       	}
     
	public String printCarInfo() {         //it's just for print
		return ("PlateNo "+PlateNo+" yearmanufacture "+yearmanufacture+" monthmanufacter "+monthmanufacter+" color "+color+" price "+price+" manufactureby "+manufactureby+" guaranteedueyear "+guaranteedueyear+" guaranteeduemonth "+guaranteeduemonth).toUpperCase();
	}
}