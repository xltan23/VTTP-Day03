package vttp.d3;

public class FixedDepositAccount extends BankAccount {
    private Float interest;
    private Integer duration;
    //private float iniBalance;

    //Constructors
    public FixedDepositAccount(String accName, Float iniBalance) {
        super(accName, iniBalance);
    }

    public FixedDepositAccount(String accName, Float iniBalance, Float interest) {
        super(accName, iniBalance);
        this.interest = interest;
    }

    public FixedDepositAccount(String accName, Float iniBalance, Float interest, Integer duration) {
        super(accName, iniBalance);
        this.interest = interest;
        this.duration = duration;
    }

    //Getters and Setters
    public Float getInterest() {
        return interest;
    }
    public void setInterest(Float interest) {
        this.interest = interest;
    }

    public Integer getDuration() {
        return duration;
    }
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public Float getAccBalance() {
        return super.getAccBalance(); // Set a default number of decimal for float. %s printed will follow this format
    }

    // Method
    public void balanceIncrement() {
        if (this.duration >= 6) {
            Integer multiple = (this.duration/6); //Obtain number of times interest occur
            this.accBalance = (float)Math.pow(1+this.interest/100, multiple)*this.accBalance;
        } else {
            ;
        }
    }  
}

