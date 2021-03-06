package udemyTutorials;

public class BankAccount {
	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public void deposit(double depositedAmmount) {
		this.balance +=depositedAmmount;
		System.out.println("Deposited amount is "+ depositedAmmount + "and the balance is " + this.balance);
	}
	public void withdrawal(double withdrawAmount) {
		if(this.balance-withdrawAmount<0) {
			System.out.println("Balance is "+ this.balance + ". Withdrawal is not possible." );
		}
		else {
			this.balance -=withdrawAmount;
			System.out.println("Withdrawal of amount "+withdrawAmount +"made. Reamaining balance is "+ this.balance );
		}
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long number) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	 

}
