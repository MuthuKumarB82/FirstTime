package conditionisandifelse;

public class Printaaabbbccc {
  public static void main(String[] args) {
	  String[] words = {"a","b","c"};
	  for(int i=0; i<words.length; i++) {
	   System.out.println(words[i]+words[i]+words[i]);
	  }
	  
	  String name = "ABC";
	  char[] a = name.toCharArray();
	  for(int i=0; i<name.length(); i++) {
		  System.out.println(a[i]+""+a[i]+""+a[i]);
	  }
  }
}