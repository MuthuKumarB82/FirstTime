package oopsreview;

public class Stationary {
   public int totalPrice(int noteBookPrice) {
	   return noteBookPrice;
   }
   public int totalPrice(int noteBookPrice,int penPrice) {
	   return noteBookPrice+penPrice;
   }
   public int totalPrice(int noteBookPrice,int penPrice,int markerPrice) {
	   return noteBookPrice+penPrice+markerPrice;
   }
   public int notePrice(String brand) {
	   return 30;
   }
}