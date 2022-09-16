package oopsreview;

public class OrientLed extends LedLight{
  public String quality(int price) {
	  if(price>50 && price<=100) {
		  return "average";
	  }
	  else if(price>100) {
		  return "Better One";
	  }
	  else {
		  return "Useless";
	  }
  }
}
