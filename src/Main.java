import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insert your name ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Insert your last name ");
        String last_name = sc.next();
        System.out.println(name + "\n" + last_name);
        System.out.println("Finish");
    }
}
