package bankOfengland;

public class bankOfEnglandPractice {
	
	public static void main(String abc[]) {
		
		hsbc obj = new hsbc();
		obj.deposit(5000);
		obj.withdraw(800);
		obj.ShowBalance();
		obj.withdraw(80000);
	}
	
}

abstract class Bank {
	
	int amount; 
	
	public void ShowBalance() {
		System.out.println("your current balance is "+ amount);
	}
	
	abstract public void deposit(int a);
	abstract public void withdraw(int a);

}

class hsbc extends Bank{

	public void deposit(int b) {
		
		amount += b;
	}
	
	public void withdraw(int c) {
		
		if(c <= amount) {
			amount -= c;
		}
		else {
			System.out.println("exuuuuuuuse me ");
		}
		
	}
	
}