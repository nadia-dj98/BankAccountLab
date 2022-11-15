import java.time.LocalDate;

public class BankAccount {

    //properties
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth = LocalDate.of(1998, 9, 12);
    private int accountNumber;
    private double balance = 0;


    //constructor
    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, int accountNumber, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }


    //methods



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
