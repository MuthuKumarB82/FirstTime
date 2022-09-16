package collections1review;

public class Watch {
  private String brand;
  private int price;
  private boolean isWaterProof;
  private boolean isSmart;
  
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
  public void setIsWaterProof(boolean isWaterProof) {
	  this.isWaterProof = isWaterProof;
  }
  public boolean getIsWaterProof() {
	  return isWaterProof;
  }
  public void setIsSmart(boolean isSmart) {
	  this.isSmart = isSmart;
  }
  public boolean getIsSmart() {
	  return isSmart;
  }
  public Watch(String brand, int price,boolean isWaterProof,boolean isSmart) {
	  this.brand = brand;
	  this.price = price;
	  this.isWaterProof = isWaterProof;
	  this.isSmart = isSmart;
  }
  public String toString() {
	  return "BRAND : "+brand+", PRICE : "+price+", WATERPROOF : "+isWaterProof+", SMART : "+isSmart;
  }
}
