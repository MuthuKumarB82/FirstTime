package collectionsstagereview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseStudent {
   public static void main(String[] ags) {
	   ArrayList<Student> students = new ArrayList <> ();
	        students.add(new Student("Muthu",64,"XII"));
	        students.add(new Student("Kumar",43,"XII"));
	        students.add(new Student("Ajith",10,"XII"));
	        students.add(new Student("Aji",10,"X"));
	        
//	   Map<Integer,String> ss = students.stream().filter(x -> x.getId()>=10 && x.getId()<=60).collect(Collectors.toMap(x -> x.getId(), x -> x.getName()));
//	       ss.forEach((c,d) -> System.out.println(c+" "+d));
	      
//	   List<String> sss = students.stream().filter(x -> x.getId()==10).map(x -> x.getName()).collect(Collectors.toList());
//	       sss.forEach(f -> System.out.println(f));
	        
   }
}
