package lab6_Inheritance;



public class CheckingAccount extends BankAccount {

	//String name;
	//double amount;
	String accountNumber;
	final double fee = .15;
	
	public CheckingAccount(String name, double amount)
	{
		super(name, amount);
		accountNumber = super.getAccountNumber();
		accountNumber += "-10";
		super.setAccountNumber(accountNumber);
	}
	
	public boolean withdraw(double amount)
	{
		amount += fee;
		return super.withdraw(amount);
	}
	
	
}
