
/**
 * Created by kdrudy on 8/29/16.
 */
public class Person {

    private String name;
    private int age;
    private boolean isAlive;

    public static String hair = "Brown";

    public Person() {
        name = "Kyle";
    }

    public Person(String n) {
        if(isValidName(n)) {
            name = n;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        if(isValidName(n)) {
            name = n;
        }
    }

    public static boolean isValidName(String name) {
        return name.contains(" ") && !name.isEmpty() && name.length() <= 20;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        if(a > 0 && a < 150) {
            age = a;
        }
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
