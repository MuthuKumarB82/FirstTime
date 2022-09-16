package oopsreview;

public class Lens {
   private String brand;
   private int price;
   public void setBrand(String brand) {
	   this.brand = brand;
   }
   public String getBrand() {
	   return brand;
   }
   public void setPrice(int price) {
	   this.price = price;
   }
   public int getPrice() {
	   return price;
   }
   public Lens(String brand,int price) {
	   this.brand = brand;
	   this.price = price;
   }
   public String toString() {
	   return brand+" "+price;
   }
}
