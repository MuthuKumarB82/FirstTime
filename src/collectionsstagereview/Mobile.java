package collectionsstagereview;

public class Mobile {
    private String brand;
    private int price;
    private boolean isWarranty;
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
    public void setIsWarranty(boolean isWarranty) {
    	this.isWarranty = isWarranty;
    }
    public boolean getIsWarranty() {
    	return isWarranty;
    }
    public Mobile(String brand,int price,boolean isWarranty) {
    	this.price = price;
    	this.brand = brand;
    	this.isWarranty = isWarranty;
    }
    public String toString() {
    	return "BRAND: "+brand+", PRICE:"+price+", WARRANTY:"+isWarranty;
    }
}
