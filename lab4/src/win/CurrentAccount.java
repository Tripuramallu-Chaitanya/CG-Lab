package win;

class CurrentAccount extends Account{
	double overdraftLimit;
	public CurrentAccount(double a, String b, int c) {
		this.balance=a;
		this.accHolder.setName(b);
		this.accHolder.setAge(c);
		this.overdraftLimit=balance-500;
	}
	
	
	
	@Override
	public boolean withdraw(double a) {
		if (a>overdraftLimit ) {
			return false;
		}
		else {
			balance-=a;
			System.out.println("Your account balance is: Rs."+balance);
			return true;}
	}
}
