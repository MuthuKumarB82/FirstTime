package day2quesno32;

public class UsePen {
   public static void main(String [] args) {
	   
	   Pen pen1 = new Pen ();
	   pen1.brand = "Faber";
	   pen1.price = 50;
	   pen1.tipwidth = 0.7f;
	   pen1.isBlueColor = true;
       
	   Pen pen2 = new Pen();
	   pen2.price = 60;
	   
	   Pen pen3 = new Pen ();
	   pen3.price = 40;
	   
	   Pen pen4 = new Pen ();
	   pen4.price = pen2.price+pen1.price+pen3.price;
	   
	   Pen pena = new Pen ();
	   pena.price = pen4.price/3;
	   
	   System.out.println(pena.price);
   }
}
