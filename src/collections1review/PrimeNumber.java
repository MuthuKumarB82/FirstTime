package collections1review;

public class PrimeNumber {
   public static void main(String[] args) {
	   int a = 97;
	   boolean isPrime = true;
	   for(int i=2;i<=a;i++) {
		   if(a%i==0) {
			   isPrime = false;
		   }
	   }
	   if(isPrime) {
		   System.out.println("Prime Number");
	   }
	   else {
		   System.out.println("Not a Prime Number");
	   }
   }
}
