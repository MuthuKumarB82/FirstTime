package oopsreview;

public class Marker extends Stationary {
  public int notePrice(String brand) {
	  if(brand.equalsIgnoreCase("classmate")) {
		  return 60;
	  }
	  else if(brand.equalsIgnoreCase("Faber")) {
		  return 50;
	  }
	  else {
		  return 20;
	  }
  }
}
