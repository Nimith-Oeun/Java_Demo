import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your Score: ");
        float score = scanner.nextFloat();


        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        if(score>=50) {
            System.out.println(score + " " + "You have passed the exam");
        }else {
            System.out.println(score + "You have failed");
        }

    }
}
