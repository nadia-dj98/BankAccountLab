import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {

        BankAccount nadia = new BankAccount("Nadia",  "Djeridi", LocalDate.of(1998,9,12), 394573825, 105);

        System.out.println(nadia.getBalance());

        nadia.deposit(500);
        nadia.withdrawal(500);
        nadia.deposit(4000);


    }
}
