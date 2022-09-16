package StringMethodsTestChecking;

public class Printidia {
  public static void main(String[] args) {
	  String a = "INDIA";
	  String b = "";
	  String c = "";
	  for(int i=0; i<a.length(); i++) {
		  b = b+a.charAt(i);
		  c = c+b;
	  }
	  System.out.println(c);
  }
}
