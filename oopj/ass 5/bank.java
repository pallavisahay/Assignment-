abstract class AccountOperations
{
abstract void deposit(double amt);
abstract void withdraw(double amt);
abstract void displayBalance();

}

class BankAccount extends AccountOperations{
	
	private long accountNumber;
	private String accountHolderName;
	private double balance;
	static int totalAccount=0;	
	BankAccount()
	{
		this.accountNumber=generateAccountNumber();
		this.accountHolderName="Pallavi";
		this.balance=20000.0;
		totalAccount++;
		
	}
	
	BankAccount(String name,double deposit)
	{    
		this.accountNumber=generateAccountNumber();
		this.accountHolderName=name;
		this.balance=deposit;
		totalAccount++;
	}
	
	BankAccount(BankAccount b)
	{
		this.accountNumber=generateAccountNumber();
		this.accountHolderName=b.accountHolderName;
		this.balance=b.balance;
		totalAccount++;
	}
	
	
	public void withdraw(double amt)
	{
		final int MAX_Limit=500;
		if(MAX_Limit<amt)
		{
			this.balance -=amt;
			System.out.println("After withdraw Balance is = "+balance);
			
		}
		else
		{
			System.out.println("Balance not sufficient!!!!");
		}
	}		
	
	public void withdraw(double amt, int passcode)
	{ int a=123;
		if((a==passcode) )
		{
			withdraw(amt);
		
		}
			
		
	}
	
	public int getAccountNo(int no)
	{
		return no;
	}
	
	
	static int totalCount()
	{
		return totalAccount;
		
	}
	
 private long generateAccountNumber()
 {
	 return (1200+totalAccount);
	 
 }
 
public void displayBalance()

{

System.out.println(balance);	
	
}
public void deposit(double amt)
{
	final int MAX_Limit=500;
		if(MAX_Limit>amt)
		{
			this.balance +=amt;
			System.out.println("After withdraw Balance is = "+balance);
			
		}
		else
		{
			System.out.println("Balance not sufficient!!!!");
		}
	
}
	
}


class SavingsAccount extends BankAccount{
	
	public void withdraw(double amt)
	{
		final int MAX_Limit=500;
		if(MAX_Limit>amt)
		{
			
			super.withdraw(amt);
		}
	}	
	
}

public class BankSystem1{
	public static void main(String args[])
	{
		BankAccount b= new BankAccount();
		BankAccount b1 = new BankAccount("Pallavi Sahay",30000.0);
		BankAccount b3=new BankAccount(b1);
		b.displayBalance();
		b.withdraw(1000);
		
		b.displayBalance();
		b.deposit(231);
		/*b.displayBalance();
		b1.withdraw(1000);
		b1.displayBalance();
		b.deposit(231);
		b1.displayBalance();
		*/
		b.withdraw(1000,123);
		b.displayBalance();
		
		
		
	}
	
}