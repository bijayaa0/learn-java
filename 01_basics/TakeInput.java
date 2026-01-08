import java.util.Scanner;

public class TakeInput {
    public static void main( String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = scanner.nextLine(); //String input

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); //integer input

        System.out.print("Enter your gpa: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter your hobby: ");
        String hobby = scanner.nextLine();

        System.out.print("Are you a Student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("\nHello "+ name);
        System.out.println("You are "+age +" years old");
        System.out.println("Your gpa is "+ gpa);
        System.out.println("Your hobby is "+hobby);
        if(isStudent){
            System.out.println("You are enrolled as student.");
        }
        else{
            System.out.println("You are not enrolled.");
        }

        scanner.close();
    }
}
