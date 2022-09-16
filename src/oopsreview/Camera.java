package oopsreview;

public class Camera {
   private String brand;
   private int price;
   private Lens lens;
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
   public void setLens(Lens lens) {
	   this.lens = lens;
   }
   public Lens getLens() {
	   return lens;
   }
   public Camera(String brand,int price,Lens lens) {
	   this.brand = brand;
	   this.price = price;
	   this.lens = lens;
   }
   public String toString() {
	   return brand+" "+price+" "+lens;
   }
}
