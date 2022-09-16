package oopsreview;

public class UseCamera {
  public static void main(String[] args) {
	  Lens lens = new Lens("Nikon",20000);
	  Camera c1 = new Camera("Nikon",250000,lens);
	  Camera c2 = new Camera("Canon",400000,lens);
	  Camera c3 = new Camera("Fuji",280900,lens);
	  
	  Camera[] cameras = {c1,c2,c3};
	  int max = 0;
	  String temp = "";
	  for(Camera c:cameras) {
		  if(c.getPrice()>max) {
		  max = c.getPrice();
		  temp = c.getBrand();
		  }
	  }
	  System.out.println(temp);
  }
}