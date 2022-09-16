package collections1review;

import java.util.ArrayList;

public class UseWatch {
	public static void main(String[] args) {
		Watch w1 = new Watch("Rolex", 250000, true, true);
		Watch w2 = new Watch("Titan", 40000, true, false);
		Watch w3 = new Watch("Toyato", 2000, true, false);
		Watch w4 = new Watch("Apple", 18000, true, true);
		Watch w5 = new Watch("Realme", 15000, true, true);
		Watch w6 = new Watch("Boat", 20000, true, true);
		Watch w7 = new Watch("Boult", 17000, true, true);
		Watch w8 = new Watch("MK", 25000, true, false);
		Watch w9 = new Watch("Tata", 20000, true, false);
		Watch w10 = new Watch("Tesla", 40000, true, true);
		Watch w11 = new Watch("Urs", 1000, false, false);
		Watch w12 = new Watch("Iam", 500, false, false);

		ArrayList<Watch> wat = new ArrayList<>();
		wat.add(w1);
		wat.add(w2);
		wat.add(w3);
		wat.add(w4);
		wat.add(w5);
		wat.add(w6);
		wat.add(w7);
		wat.add(w8);
		wat.add(w9);
		wat.add(w10);
		wat.add(w11);
		wat.add(w12);

		ArrayList<Watch> watch2 = new ArrayList<>();
		for (int i = 0; i < wat.size(); i++) {
			if (wat.get(i).getPrice() < 3000) {
               watch2.add(wat.get(i));
			}
		}
		watch2.forEach(y -> System.out.println(y));

	 ArrayList <Watch> watch1 = new ArrayList<> ();
	 for(Watch watch : wat) {
		 if(watch.getPrice()<3000) {
			 watch1.add(watch);
		 }
	 }
	 watch1.forEach(w -> System.out.println(w));

	ArrayList<Watch> watch3 = new ArrayList<>();
	  wat.forEach(wat2 -> {
			if (wat2.getPrice()>3000) {
				watch3.add(wat2);
			}
		});
		watch3.forEach(y1 -> System.out.println(y1));
	}
}
