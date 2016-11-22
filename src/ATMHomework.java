import java.util.Scanner;

public class ATMHomework {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        if(name.isEmpty()) {
            throw new Exception("No name entered");
        }

        System.out.println("What would you like to do:");
        System.out.println("[1] Check my balance.");
        System.out.println("[2] Withdraw funds.");
        System.out.println("[3] Cancel");

        String selection = scanner.nextLine();

        if(selection.equalsIgnoreCase("1")) {
            System.out.println("Your balance is $100");
        } else if(selection.equalsIgnoreCase("2")) {
            System.out.println("How much would you like to withdraw?");
            String amount = scanner.nextLine();
            if(Integer.parseInt(amount) > 100) {
                throw new Exception("Amount entered larger than balance");
            } else {
                System.out.println("Please take your money.");
            }
        } else if(selection.equalsIgnoreCase("3")) {
            System.out.println("Thank you and please come again.");
        }
    }
}
