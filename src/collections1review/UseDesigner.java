package collections1review;

import java.util.ArrayList;

public class UseDesigner {
     public static void main(String[] args) {
    	 Designer des1 = new Designer("Lekshmi","HR",35000,"Java",false,"TCS");
    	 Designer des2 = new Designer("Kumar","Senior",55000,"Java",true,"Acceture");
    	 Designer des3 = new Designer("Raj","TL",75000,"Java",true,"Wipro");
    	 Designer des4 = new Designer("Balaji","Senior",52000,"Python",true,"Cognizant");
    	 Designer des5 = new Designer("Ravi","HR",35000,"Python",true,"Accenture");
    	 Designer des6 = new Designer("Sandhya","HR",38000,"Python",false,"Wipro");
    	 Designer des7 = new Designer("Muthu","TL",78900,"Python",true,"Wipro");
    	 Designer des8 = new Designer("Suganth","Senior",59900,"C++",true,"Cognizant");
    	 Designer des9 = new Designer("Aswathy","Senior",55000,"C++",false,"tcs");
    	 Designer des10 = new Designer("Saranya","TL",83000,"Java",false,"TCS");
    	 Designer des11 = new Designer("Senthil","TL",85000,"Java",true,"cognzant");
    	 Designer des12 = new Designer("Girija","HR",50000,"Python",false,"TCS");
    	 
    	 ArrayList<Designer> designer = new ArrayList<> ();
    	     designer.add(des1);
    	     designer.add(des2);
    	     designer.add(des3);
    	     designer.add(des4);
    	     designer.add(des5);
    	     designer.add(des6);
    	     designer.add(des7);
    	     designer.add(des8);
    	     designer.add(des9);
    	     designer.add(des10);
    	     designer.add(des11);
    	     designer.add(des12);
    	     
    	 ArrayList<Designer> de = new ArrayList <> ();
    	 ArrayList<Designer> de1 = new ArrayList <> ();
    	 ArrayList<Designer> de2 = new ArrayList <> ();
    	 
    	 for(Designer d : designer) {
    		 if(d.getDesignation().equalsIgnoreCase("senior") && d.getCompany().equalsIgnoreCase("cognizant")) {
    			 de.add(d);
    		 }
    		 else if(d.getDesignation().equalsIgnoreCase("Hr") && d.getCompany().equalsIgnoreCase("tcs")) {
    			 de1.add(d);
    		 }
    		 else if(d.getDesignation().equalsIgnoreCase("tl") && d.getCompany().equalsIgnoreCase("wipro")) {
    			 de2.add(d);
    		 }
    	 }
    	 de.forEach(x -> System.out.println(x));
    	 de1.forEach(y -> System.out.println(y));
    	 de2.forEach(z -> System.out.println(z));
     }
}
