package day04.Solved;

public class ToStringDemo {
	public static void main(String[] args) {
		// create Account using Setter methods and Default constructor
		Account3 acct1 = new Account3();
		acct1.setAccNo("A101");
		acct1.setName("Naresh");
		acct1.setBalance(1000);
		
		System.out.println(acct1);
		
		Account4 acct2 = new Account4();
		acct2.setAccNo("A101");
		acct2.setName("Naresh");
		acct2.setBalance(1000);
		
		System.out.println(acct2);
	}

}
