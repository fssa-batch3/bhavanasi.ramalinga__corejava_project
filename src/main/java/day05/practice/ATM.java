package day05.practice;

//Modify the below interface to include setters, getters, and constructors
public interface ATM {
 boolean deposit(Account account, double amount);
 boolean withdraw(Account account, double amount) throws Exception;
 double getBalance();
}

