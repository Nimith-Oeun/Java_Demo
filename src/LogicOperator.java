import java.util.Scanner;

public class LogicOperator {
    public static void main(String[] args){
//        int x = 5;
//        int y = 3;
//        System.out.println(x > y && x < 10); // true
//        System.out.println(x > y || x < 3); // true
//        System.out.println(!(x > y)); // false

        Scanner scanner = new Scanner(System.in);
        System.out.print("You are plalying the game! Press q or Q to Quit: ");
        String response = scanner.next();
//        if (response.equals("q") || response.equals("Q")){
//            System.out.println("You quit the game!");
//        } else {
//            System.out.println("You are still playing the game!");
//        }
        if (!response.equals("q") && !response.equals("Q")){
            System.out.println("You are still playing the game!");

        } else {
            System.out.println("You quit the game!");
        }
    }
}
