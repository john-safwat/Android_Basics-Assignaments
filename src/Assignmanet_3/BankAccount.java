package Assignmanet_3;

//Implement Class BankAccount with these specifications
//It holds the following data:
// account ID
// balance
//The following methods apply to this class:
// Constructor There are 2 constructors. The first sets the balance to a given
//value. The second is a no-argument constructor, and it sets the
//balance to 0.
// Setters and getters These methods allow accessing the private data fields.
// withdraw withdraws an amount of money from the account if the balance
//is sufficient.
// deposit deposits an amount of money in the account

public class BankAccount {

    // define the variables
    private int accountId;
    private double balance ;

    // the default constructor (no-argument constructor) to define make the values of the accountId = 0 and balance = 0
    BankAccount(){
        accountId = 0;
        balance = 0;
    }

    // second constructor that take to initial value of the accountId and balance
    BankAccount(int accountId , double balance){
        // validate on the accountId is not negative
        this.accountId = accountId >= 0 ? accountId : 0;
        // validate on the balance is not negative
        this.balance = balance >= 0 ? balance : 0;
    }

    // setters and getters for the balance and account id
    // setters and getters for accountId
    public void setAccountId(int accountId){
        // validate on the accountId is not negative
        this.accountId = accountId >= 0 ? accountId : 0;
    }

    public int getAccountId(){
        return accountId;
    }

    // setters and getters for balance
    public void setBalance(double balance){
        // validate on the balance is not negative
        this.balance = balance >= 0 ? balance : 0;
    }

    public double getBalance(){
        return balance;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Withdrawal failed. Insufficient funds.");
        }
    }

}
