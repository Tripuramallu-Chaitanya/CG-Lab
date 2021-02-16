package win;

abstract class Account{
	public static int cnt=0;
	protected long accNum=2020010100;
	{
		cnt++;
		accNum+=cnt;
	}
	protected double balance;
	protected Person accHolder=new Person();
	public Account(){
		
	}
	
	public long getAccNum() {
		return accNum;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double a) {
			this.balance+=a;
			System.out.println("Your account balance is: "+balance);	
	}
	abstract public boolean withdraw(double a);
//	{
//		if ((balance-a)<500) {
//			System.out.println("you can withdraw Rs."+(balance-500)+" maximum");
//			return false;
//		}
//		else {
//			balance-=a;
//			System.out.println("your account balance is: "+balance);
//			return true;
//		}
//	}
}
