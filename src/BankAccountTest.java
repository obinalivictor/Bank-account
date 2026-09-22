import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    public void TestThatNameFieldIsTheSameInAccount(){
      BankAccount account = new BankAccount();
      account.setName("rose");
      assertEquals("rose",account.getName());
    }

    @Test
    public void TestThatDeositAddsToTheBalance(){
        BankAccount account = new BankAccount();
        account.deposit(5000);
        assertEquals(5000,account.getBalance());

    }

    @Test
    public void TestTThatIfDepositLessThanZeroBalanceIsZero(){
        BankAccount account = new BankAccount();

        account.deposit(-5000);
        assertEquals(0.0,account.getBalance());
    }

    @Test
    public void TestThatWithdrawWorks(){
        BankAccount account = new BankAccount();
        account.deposit(5000);
        account.withdraw(2400);
        assertEquals(2600,account.getBalance());
    }

}