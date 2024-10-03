import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please type your name");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("hello "+ name);
        
        System.out.println("please type your age");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("congratulations on being " + age + " years old");
        int untilRetirement = 67-age;
        System.out.println("you can retire in " + untilRetirement);

    }

}