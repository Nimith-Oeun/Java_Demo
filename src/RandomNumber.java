import java.util.Random;
public class RandomNumber {
    public static void main(String[] args){
        Random random = new Random();
        //int x = random.nextInt(6)+1; // when you run this code, it will generate a random number between 1 and 6
        //double y = random.nextDouble();
        boolean z = random.nextBoolean();
        System.out.println(z);
    }
}
