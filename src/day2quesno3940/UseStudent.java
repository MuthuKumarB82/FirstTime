package day2quesno3940;

public class UseStudent {
	public static void main(String[] args) {
		
		Student s1 = new Student ();
	     s1.name = "MK";
	     s1.age = 17;
	     s1.mobNo = 7658732456l;
	     s1.classSection = "XI B";
	     s1.marksPercentage = 97.88f;
	   System.out.println("NAME = "+s1.name+" : "+
	                       "AGE = "+s1.age+" : "+
			                "Mob.No. = "+s1.mobNo+" : "+
	                        "STD&Sec. = "+s1.classSection+" : "+
			                "PERCENTAGE = "+s1.marksPercentage);
	}

}
