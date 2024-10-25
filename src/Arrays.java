import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args){

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("Toyota");

        cars.set(1, "Honda"); // replace Audi to Honda
        cars.remove(3); // remove Toyota
        cars.clear(); // remove all elements
        for (int i = 0; i < cars.size(); i++){
            System.out.println((i+1)+" "+ cars.get(i));
        }
    }
}
