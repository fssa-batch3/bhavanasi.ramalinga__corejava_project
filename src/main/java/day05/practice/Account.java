package day05.practice;

class Account {
    private String accNo;
    private double balance;

    // Constructor
    public Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    // Getters and Setters
    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
