package oopsreview;

public abstract class LedLight implements Light {
  public String lightPower(String bulb) {
	  return "Bright";
  }
  public abstract String quality(int price);
}
