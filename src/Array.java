public class Array {
    public static void main(String[] args){

        String[] cars = new String[5];
        cars[0] = "BMW";
        cars[1] = "Audi";
        cars[2] = "Mercedes";
        cars[3] = "Toyota";
        cars[4] = "Honda";

        for (int i = 0; i < cars.length; i++){
            System.out.println((i+1)+" "+ cars[i]);
        }
    }
}
