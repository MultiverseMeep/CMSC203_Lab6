package lab6_Inheritance;

public class SavingsAccount extends BankAccount {


	double rate = 2.5;
	int savingsNumber = 0;
	String accountNumber;

	
	public SavingsAccount(String name, double amount)
	{
		super(name, amount);
		accountNumber = super.getAccountNumber();
		accountNumber += "-" + savingsNumber;
		super.setAccountNumber(accountNumber);
	}
	
	public void postInterest()
	{
		double amount = super.getBalance();
		double interest = amount * rate/100/12;
		super.deposit(interest);
	}
		
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount)
	{
		super(oldAccount, amount);
		
		savingsNumber++;
		
		accountNumber = oldAccount.accountNumber.substring(0, oldAccount.accountNumber.length() - 2) + "-" + savingsNumber;
		super.setAccountNumber(accountNumber);
	}
	
	
}
