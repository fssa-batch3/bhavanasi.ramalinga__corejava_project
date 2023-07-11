package day02.solved;

public class TestBankAccount {

	public static void main(String[] args) {
        
        
		Person1 acct1 = new Person1 ();
        acct1.setAccNo("A101");
        acct1.setName( "Krishna" );
        acct1.setBalance(1000);
 
        System.out.println(acct1.getAccNo());
        System.out.println(acct1.getName());
        System.out.println(acct1.getBalance());
    }
}
