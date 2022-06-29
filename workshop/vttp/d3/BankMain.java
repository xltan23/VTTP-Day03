package vttp.d3;

public class BankMain {
    public static void main(String[] args) {
        // Instantiating Bank Account
        BankAccount firstAccount = new BankAccount("Ralph");

        firstAccount.setAccBalance(35000f);
        System.out.printf("The account number for %s: %s\n", firstAccount.getAccName(), firstAccount.getAccNumber());
        System.out.printf("The account balance for %s: %.2f\n", firstAccount.getAccName(), firstAccount.getAccBalance());
        firstAccount.deposit(3600f);
        System.out.printf("The new account balance for %s: %.2f\n", firstAccount.getAccName(), firstAccount.getAccBalance());

        BankAccount secondAccount = new BankAccount("Terry",2000);
        System.out.printf("The account number for %s: %s\n", secondAccount.getAccName(), secondAccount.getAccNumber());
        System.out.printf("The account balance for %s: %s\n", secondAccount.getAccName(), secondAccount.getAccBalance());
        secondAccount.withdraw(1200f);
        System.out.printf("The new account balance for %s: %.2f\n", secondAccount.getAccName(),secondAccount.getAccBalance());
    
        FixedDepositAccount thirdAccount = new FixedDepositAccount("Cristiano",678000f);
        System.out.printf("The account number for %s: %s\n", thirdAccount.getAccName(), thirdAccount.getAccNumber());
        System.out.printf("The account balance for %s: %.2f\n", thirdAccount.getAccName(),thirdAccount.getAccBalance());
        thirdAccount.setInterest(9f);
        thirdAccount.setDuration(24);
        thirdAccount.balanceIncrement();
        System.out.printf("The new account balance after interest: %.2f\n", thirdAccount.getAccBalance());


        FixedDepositAccount forthAccount = new FixedDepositAccount("Ronaldo",1000f,3f,18);
        System.out.printf("The account balance for %s: %.2f\n", forthAccount.getAccName(),forthAccount.getAccBalance());
        forthAccount.balanceIncrement();
        System.out.printf("The new account balance after interest: %.2f\n", forthAccount.getAccBalance());
        

    
    }    

}
