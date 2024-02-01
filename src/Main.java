import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    boolean access = false;
    Account account;

    Account Acc1 = new Account(12244, "Carl", 13000);


    Account createAccount = Account.create(28282, "Jerome", 2000);


    public boolean login(Account) {

        return access;
    }

    public void options() {
        System.out.println("Choose following options:\n" +
                "1. Check balance.\n" +
                "2. Transfer Credits." +
                "3. Withdraw credits.\n" +
                "4. Deposit credits."
                "5. Logout.");
    }


    public static void main(String[] args) {

        System.out.println("Initializing Budget Bank...\n" +
                "Brought to you by Suoy62.");

    }


}
