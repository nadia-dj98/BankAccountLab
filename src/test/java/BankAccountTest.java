import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    private BankAccount nadia;

        @BeforeEach
        public void setUp() { nadia = new BankAccount("Nadia", "Djeridi", LocalDate.of(1998,9,12), 394573825, 500);}


        @Test
         public void deposit500Test() {
            nadia.deposit(500);
            assertThat(nadia.getBalance()).isEqualTo(1000);
        }

        @Test
        public void deposit20Test() {
            nadia.deposit(20);
            assertThat(nadia.getBalance()).isEqualTo(520);
        }

        @Test
        public void withdraw500Test() {
            nadia.withdrawal(500);
            assertThat(nadia.getBalance()).isEqualTo(0);
        }

        @Test
        public void payTenPercentInterestTest() {
            nadia.interestPay(10);
            assertThat(nadia.getBalance()).isEqualTo(550);
        }


        @Test
        public void canSetLastName() {
            nadia.setLastName("Smith");
            assertThat(nadia.getLastName()).isEqualTo("Smith");
        }

        @Test
        public void hasDOB() {
            assertThat(nadia.getDateOfBirth()).isEqualTo("1998, 9, 12");

        }
        //not sure about the local date one.
}

