
public class test_car {
	car c1, c2, c3 ;
	
	c1 = new car("2004", "Toyota", "Prius", "$8000", "Excellent");
    c2 = new car("1981", "Ford", "Pinto", "$2000", "Good");
    c3 = new car("2001", "Toyota", "Sienna", "$6000", "Good");
    System.out.println("Car 1: \n" + c1.getDescription());
    System.out.println("Car 2: \n" + c2.getDescription());
    System.out.println("Car 3: \n" + c3.getDescription());

}
