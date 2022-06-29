package vttp.d3;

import java.util.List;
import java.util.LinkedList;
import java.util.UUID;

public class BankAccount {
    protected String accName;
    private String accNumber = UUID.randomUUID().toString().substring(0,8);
    protected Float accBalance = .00f;
    private List<String> transactions = new LinkedList<>();
    //private Boolean closed = false;
    private String creationDate;
    private String closingDate;

    //Constructors 
    public BankAccount(String name) {
        this.accName = name;
    }

    public BankAccount(String name, float iniBalance) {
        this.accName = name;
        this.accBalance = iniBalance;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public Float getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(Float accBalance) {
        this.accBalance = accBalance;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }

    // Methods
    public void deposit(Float add) {
        if (add >= 0) {
            this.accBalance = accBalance + add;
            System.out.printf("deposit $%.2f at <date time>\n", add); 
        } else {
            System.out.printf("Illegal Argument Exception\n");
        }

    }

    public void withdraw(Float deduct) {
        if (deduct <= this.accBalance) {
            if (deduct >= 0) {
                this.accBalance = accBalance - deduct;
                System.out.printf("withdraw $%.2f at <date time>\n", deduct);
            } else {
                System.out.printf("Illegal Argument Exception\n");
            }
        } else {
            System.out.printf("There is not enough money in the account!\n");
        }
    }
}

