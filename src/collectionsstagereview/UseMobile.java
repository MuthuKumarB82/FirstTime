package collectionsstagereview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseMobile {
   public static void main(String[] args) {
	   Mobile m1 = new Mobile("Oppo",60000,true);
	   Mobile m2 = new Mobile("RealMe",30000,true);
	   Mobile m3 = new Mobile("XYZ",10000,false);
	   Mobile m4 = new Mobile("Gfive",9000,false);
	   
	ArrayList<Mobile> mobiles = new ArrayList <> ();
	    mobiles.add(m1);
	    mobiles.add(m2);
	    mobiles.add(m3);
	    mobiles.add(m4);
	   
	mobiles.stream().filter(x -> x.getIsWarranty()==true).forEach(c -> System.out.println(c.getBrand()+" "+(c.getPrice()-999)));
	   
	   
//	Map<Integer,Mobile> mob = mobiles.stream().filter(x -> x.getIsWarranty()==true).collect(Collectors.toMap(x -> x.getPrice(), y -> y));
//	   mob.forEach((a,b) -> System.out.println(a+" "+b));
	    
//	mobiles.stream().filter(x -> x.getIsWarranty()==true).map(x -> x.getPrice()-999).forEach(c -> System.out.println(c));   
	    
   }
}