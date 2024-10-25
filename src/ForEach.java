import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args){
        //for-each = traversing technique to iterate through the elements in an array/collection, without using an index. less steps, more readable,less flexible
//        String[] cars = {"BMW", "Audi", "Mercedes", "Toyota", "Honda"};
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mercedes");
        for (String car : cars){
            System.out.println(car);
        }
    }
}
