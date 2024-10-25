import java.util.ArrayList;

public class Arrays2D {
    public static void main(String[] args){

        ArrayList<ArrayList<String>> items = new ArrayList<ArrayList<String>>();

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("Toyota");

        ArrayList<String> bikes = new ArrayList<String>();
        bikes.add("Honda");
        bikes.add("Yamaha");
        bikes.add("Suzuki");
        bikes.add("Kawasaki");

        ArrayList<String> planes = new ArrayList<String>();
        planes.add("Boeing");
        planes.add("Airbus");
        planes.add("Embraer");
        planes.add("Bombardier");

        items.add(cars);
        items.add(bikes);
        items.add(planes);

        System.out.println(items.get(2).get(1));
    }
}
