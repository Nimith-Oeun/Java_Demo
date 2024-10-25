public class OverloadMethod {
    public static void main(String[] args){
        // Method overloading is when you have multiple methods with the same name but different parameters, methos name + parameters = method signature
        int x = add(1,2,3,4);
        System.out.println(x);
    }
    static int add(int a, int b ){
        System.out.println("This is the first method");
        return a + b;
    }
    static int add(int a, int b, int c){
        System.out.println("This is the second method");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("This is the third method");
        return a + b + c + d;
    }

}
