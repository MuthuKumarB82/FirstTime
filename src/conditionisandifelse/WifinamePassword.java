package conditionisandifelse;

public class WifinamePassword {
   public static void main(String[] args) {
     String name1 = args[0];
     String name2 = args[1];
     if(name1.equals(name2) && name2.equals(name1)) {
    	 System.out.println("CONNECTED");
     }
     else {
    	 System.out.println("NOT CONNECTED");
     }
   }
}