package win;

class SavingsAccount extends Account{
	
	final double minimumBalance=500;
	public SavingsAccount(double a, String b, int c) {
		this.balance=a;
		this.accHolder.setName(b);
		this.accHolder.setAge(c);
	}
	public boolean withdraw(double a) {
		if(super.balance-a<minimumBalance) {
			System.out.println("You can withdraw Rs."+(super.balance-500)+" maximum");
			return false;
		}
		else {
			super.balance-=a;
			System.out.println("your account balance is: "+super.balance);
		return true;
		}
	}
}
