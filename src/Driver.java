public class Driver {

	public static void main(String[] args) {
		Car[] cars=new Car[5];     // make an array
		cars[0] = new Car("1234-B",2010,9,"red",150000.00,"Lamborghini", 2021,3);
		cars[1] = new Car("4567-C",2017,3,"blue",100000.00,"BMW", 2022,12);
		cars[2] = new Car("7890-D",2011,6,"black",75000.00,"Mazda", 2023,7);
		cars[3] = new Car("0102-E",2020,10,"white",1250000.00,"Oudy", 2024,5);
		cars[4] = new Car("1212-F",1999,12,"yelow",200000.00,"volkswagen", 2025,2);
		
		printCarsInfo(cars);       // call up the print info method
		Car info = maxPrice(cars);    // call up the maxPrice method
		System.out.println(info.printCarInfo().toUpperCase());
		System.out.println(info.CalculateGuarantee());
		System.out.println(info.CarAge());
		
	}
	
	public static void printCarsInfo( Car[] cars) {    //method for print
	for(int i=0 ; i<cars.length ; i++) {
		System.out.println(cars[i].printCarInfo());
		System.out.println(cars[i].CalculateGuarantee());
		System.out.println(cars[i].CarAge());
	}
	
	}
	
	public static Car maxPrice( Car[] cars) {    // method for get the car that has the most expensive price
		Car max = cars[0]; 
		for(int i = 1 ; i<cars.length ; i++) {
	
			if(max.getPrice() < cars[i].getPrice())
				max=cars[i];
			    
		}
      return max;
	}

}
