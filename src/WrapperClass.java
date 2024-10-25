public class WrapperClass {
    public static void main(String[] args){
        //wrapper class = provides a way to use primitive data types as reference data types
        //reference data types contain useful methods
        //primitive data types are not objects
        //wrapper classes convert primitive data types into objects
        //autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        //unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

        boolean a = true;
        char b = 'x';
        double c = 1.1;
        int d = 12;
        String e = "hello";

        if (a == true){
            System.out.println("This is true");
        }
    }
}
