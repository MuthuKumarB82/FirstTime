package day2quesno343738;

public class UseAccountHolder {
	public static void main(String[] args){
		
		AccountHolder ah1 = new AccountHolder();
		ah1.name = "mano";
		ah1.age = 26;
		ah1.gender = true;
		ah1.accNum = 288330485612583l;
		ah1.savPerc = 18;
		ah1.monInc = 21000;
		ah1.savAmt = ah1.monInc*ah1.savPerc/100;
		System.out.println(ah1.name+", "+ah1.age+", "+ah1.gender+", "+ah1.accNum+", "+ah1.monInc+", "+ah1.savAmt);
	}

}
