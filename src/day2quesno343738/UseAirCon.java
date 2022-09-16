package day2quesno343738;

public class UseAirCon {
	public static void main(String[] args) {
		
		AirCon ac1 = new AirCon () ;
		ac1.brand = "Panasonic";
		ac1.price = 10000;
		ac1.noOfWings = 5;
		ac1.isQuality = true;
        System.out.println("BRAND="+ac1.brand+" : "+
        		           "PRICE="+ac1.price+" : "+
        		           "No.of WINGS="+ac1.noOfWings+" : "+
        		           "QUALITY="+ac1.isQuality);
        
        AirCon ac2 = new AirCon ();
        ac2.brand = "Diaken";
        ac2.price = 25000;
        ac2.noOfWings = 3;
        ac2.isQuality = true;
        System.out.println(ac2.brand+" : "+ac2.price+" : "+ac2.noOfWings+" : "+ac2.isQuality);
	}

}
