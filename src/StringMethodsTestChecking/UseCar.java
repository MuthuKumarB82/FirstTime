package StringMethodsTestChecking;

public class UseCar {
	public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "bmw";
        c1.model = "XVI";
        c1.price = 4000000;
        c1.isPetrol = true;
        
        Car c2 = new Car();
        c2.brand = "jaggur";
        c2.model = "C2E";
        c2.price = 6000000;
        c2.isPetrol = false;
        
    System.out.println(c1.brand+" "+c1.brand.length()+" "+c1.model+" "+c1.price+" "+c1.isPetrol);
    
    System.out.println(c1.brand.toUpperCase());
    
    System.out.println(c2.brand.contains("g"));
    
    System.out.println(c1.brand.length());
    
	}
}