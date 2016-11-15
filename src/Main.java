
public class Main {

    public static void main(String[] args) {

        boolean isKyle = true;
        int score = 900;

        String name = "Kyle";


        /*

        switch(name) {
            case "Kyle":
            case "Bob":
                System.out.println("Less than or equal to one");
                break;
            case "Gerald":
                System.out.println("Greater than 1");
                break;
            default:
                System.out.println("ANother number");
        }
*/

        try {
            mightThrowException(false);
        } catch(Exception e) {
            e.printStackTrace();
        }



        System.out.println("The end");

    }

    public static void mightThrowException(boolean shouldThrow) throws Exception {
        if (shouldThrow) {
             throw new Exception("exception!");
        }
        System.out.println("No Exception");
    }
}