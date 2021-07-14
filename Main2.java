package udemyTutorials;

public class Main2 {
	public static void main (String[]args) {
		BankAccount ba = new BankAccount("449000742127", 4034.34, "Kshitish Chandra Sahu", "myemail@gmail.com", "9078322780");
		ba.deposit(3000.12);
		ba.withdrawal(9000.89);
	}

}
