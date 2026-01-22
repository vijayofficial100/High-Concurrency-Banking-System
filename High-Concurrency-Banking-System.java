import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
   
   class BankAccount {
    private double balance = 1000.0;

    public synchronized void withdraw (String name, double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.print(name+"success! Remaining: " + balance);
        } else { 
            System.out.println(name + "failed! No balance.");
            
        }
    }

   }
   public class Main{
    public static void main (String[] args){

        BankAccount myAccount = new BankAccount();
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(() -> myAccount.withdraw("User-1 (ATM)",500));
        executor.execute(() -> myAccount.withdraw("User-1 (Ap)",500)); 
        executor.execute(() -> myAccount.withdraw("User-1 (GPay)",500)); 
        executor.shutdown();

    }
}