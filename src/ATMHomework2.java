import java.util.HashMap;
import java.util.Scanner;

public class ATMHomework2 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> balances = new HashMap<>();

        do {
            System.out.println("Please enter your name:");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                throw new Exception("No name entered");
            }

            if (!balances.containsKey(name)) {
                System.out.println("Would you like to create an account? [y/n]");
                String input = scanner.nextLine();
                if(input.equalsIgnoreCase("y")) {
                    System.out.println("Creating account for " + name);
                    balances.put(name, 100.0);
                } else {
                    System.out.println("Goodbye");
                    continue;
                }
            }

            boolean run = true;
            do {

                System.out.println("What would you like to do:");
                System.out.println("[1] Check my balance.");
                System.out.println("[2] Withdraw funds.");
                System.out.println("[3] Cancel");
                System.out.println("[4] Remove bank account");

                String selection = scanner.nextLine();

                switch (selection) {
                    case "1":
                        System.out.println("Your balance is $" + balances.get(name));
                        break;
                    case "2":
                        System.out.println("How much would you like to withdraw?");
                        String amount = scanner.nextLine();
                        if (Double.parseDouble(amount) > balances.get(name)) {
                            throw new Exception("Amount entered larger than balance");
                        } else {
                            System.out.println("Please take your money.");
                            double balance = balances.get(name) - Double.parseDouble(amount);
                            balances.replace(name, balance);
                        }
                        break;
                    case "3":
                        System.out.println("Thank you and please come again.");
                        run = false;
                        break;
                    case "4":
                        System.out.println("Removing bank account");
                        balances.remove(name);
                        run = false;
                        break;
                }
            } while (run);
        } while(true);
    }
}
