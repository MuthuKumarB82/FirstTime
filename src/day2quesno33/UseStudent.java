package day2quesno33;

public class UseStudent {
   public static void main(String[] args) {
	
	   Student s1 = new Student ();
	   s1.name = "Siva";
	   s1.id = 234;
	   s1.age = 14;
	   s1.std = "IX";
	   s1.numofDaysPres = 180;
	   
	   Student s2 = new Student ();
	   s2.name = "mani";
	   s2.id = 236;
	   s2.age = 15;
	   s2.std = "X";
	   s2.numofDaysPres = 192;
	   
	   Student s3 = new Student ();
	   s3.name = "valli";
	   s3.id = 237;
	   s3.std = "X";
	   s3.numofDaysPres = 240*s3.attendPercen/100;
	   s3.attendPercen = 90;
	   
	   System.out.println(s1.name+", "+s1.id+", "+s1.age+", "+s1.std+", "+s1.numofDaysPres);
	   System.out.println(s2.name+": "+s2.id+": "+s2.std+": "+s2.age+": "+s2.numofDaysPres);
	   System.out.println(s3.name+"; "+s3.id+"; "+s3.age+"; "+s3.std+"; "+s3.numofDaysPres);
}
}
