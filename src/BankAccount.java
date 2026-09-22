import org.jspecify.annotations.Nullable;

public class BankAccount {
    private String name;
    private double balance;





    public void setName(String name) {
       this.name = name;
    }

    public  String getName() {
        return name;
    }

    public void setBalance (){
        if(balance > 0.0){
           this.balance = balance;
        }
    }

    public double getBalance(){
        return balance;
    }


    public void deposit(int depositAmount) {
        if(depositAmount < 0){
            balance = 0;
        }else
            balance = balance + depositAmount;
    }

    public void withdraw(int withdrawalAmount) {
        balance = balance - withdrawalAmount;
    }
}
