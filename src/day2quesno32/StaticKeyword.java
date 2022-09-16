package day2quesno32;

public class StaticKeyword { 
		  
//	static{
//		System.out.println("static block is invoked");
//		}  
//		  public static void main(String args[]){  
//		   System.out.println("Hello main");  
//		 
//		} 
//}

final int age = 18;  
void display() {  
  
// reassigning value to age variable   
// gives compile time error  
int age = 55;  
}  
  
public static void main(String[] args) {  
  
StaticKeyword obj = new StaticKeyword();  
// gives compile time error  
obj.display();  
}  
}  