import java.time.LocalDate;

public class BankAccount {

    //properties
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth = LocalDate.of(1998, 9, 12);
    private int accountNumber;
    private double balance = 500;


    //constructor
    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, int accountNumber, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }




    //methods
    public double deposit(double depositAmount) {
        balance += depositAmount;
        System.out.println( "You've successfully deposited your money. Your new balance is: " + balance);
        return depositAmount;
    };

    public void withdrawal(double withdrawalAmount) {
        balance -= withdrawalAmount;
        System.out.println("You've successfully withdrawn your money. Your new balance is: " + balance);
    }
    public void interestPay(double interestPercentage) {
        double multiplier = (100 + interestPercentage)/100; //turns our percentage increase into a decimal and stored in the multiplier value
        balance = balance * multiplier  ;
        System.out.println("A " + interestPercentage + "% interest has been added to your account. Your new balance is " + balance);
    }


    //Getters & Setters
    public String getFirstName() {return this.firstName;}
    public void setFirstName(String newFirstName) { this.firstName = newFirstName;}

    public String getLastName() {return this.lastName;}
    public void setLastName(String newLastName) {this.lastName = newLastName;}

    public LocalDate getDateOfBirth() {return this.dateOfBirth;}
    public void  setDateOfBirth(LocalDate newDateOfBirth) {this.dateOfBirth = newDateOfBirth;}

    public int getAccountNumber() {return this.accountNumber;}
    public void setAccountNumber(int newAccountNumber) {this.accountNumber = newAccountNumber;}

    public double getBalance() {return this.balance;}
    public void setBalance(double newBalance) {this.balance = newBalance;}



}
