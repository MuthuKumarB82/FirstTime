package conditionisandifelse;

public class MultiplyWithFor {
  public static void main(String[] args) {
	  int temp1 = 1;
	  int temp2 = 1;
	  for(int i=1; i<=5; i++) {
		  temp1 = temp1*i;
		  temp2 = temp2*temp1;
	  }
	  System.out.println(temp2);
  }
}
