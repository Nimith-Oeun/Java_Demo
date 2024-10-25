public class Array2D {
    public static void main(String[] args){

       // 2d array is an array of arrays

//         String [][] cars = new String[3][3];
//            cars[0][0] = "BMW";
//            cars[0][1] = "Audi";
//            cars[0][2] = "Mercedes";
//            cars[1][0] = "Toyota";
//            cars[1][1] = "Honda";
//            cars[1][2] = "Ford";
//            cars[2][0] = "Kia";
//            cars[2][1] = "Hyundai";
//            cars[2][2] = "Mazda";

        String[][] cars =   {
                                {"BMW", "Audi", "Mercedes"},
                                {"Toyota", "Honda", "Ford"},
                                {"Kia", "Hyundai", "Mazda"}
                            };

            for(int i =0; i<cars.length; i++){
                System.out.println();
                for(int j =0 ; j<cars[i].length;j++){
                    System.out.print(cars[i][j]+" ");
                }
            }
    }
}
