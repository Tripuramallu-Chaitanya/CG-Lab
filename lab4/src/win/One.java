package win;
public class One {
	public static void main(String[] args) {
		SavingsAccount smith=new SavingsAccount(2000,"Smith",45);
		CurrentAccount kathy=new CurrentAccount(3000,"Kathy",21);
		smith.deposit(2000);
		kathy.withdraw(2000);
		System.out.println("Balance in Smith's account is Rs."+smith.getBalance());
		System.out.println("Balance in Kathy's account is Rs."+kathy.getBalance());
		System.out.println("Account number of Smith is: "+smith.getAccNum());
		System.out.println("Account number of Kathy is: "+kathy.getAccNum());
	}
}
