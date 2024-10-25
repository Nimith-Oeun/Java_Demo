public class MethodCall {
    public static void main(String[] args){
        // Method = a block of code that is executed whenever it is called upon

        String name = "Nimith";
        int age = 25;
        int x = 5;
        int y = 10;
        int z = add(x,y);
        call(name,age);
        System.out.println(z);
    }
    static void call(String name , int age){
        System.out.println("let's ay Hello"+" " + name);
        System.out.println("Your age is"+" " + age);
    }
    static int add(int x, int y){
        int z = x * y;
        return z;
    }
}
