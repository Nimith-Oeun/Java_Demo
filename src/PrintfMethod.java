public class PrintfMethod {
    public static void main(String[] args){
        //printf =     an optional method to control, format, and display text to the console window
        //             two arguments = format string + (object/variable/value)
        //              % [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        char myChar = '@'  ;
        String myString = "Nimith";
        int myInt = 50;
        double myDouble = 1000;

        // [conversion-character]
        System.out.printf("%b", myBoolean); // %b = boolean
        System.out.printf("%c", myChar); // %c = char
        System.out.printf("%s", myString); // %s = string
        System.out.printf("%d", myInt); // %d = integer
        System.out.printf("%f", myDouble); // %f = floating point number

        //[width]
        //minimum number of characters to be written as output
        System.out.printf("\nhello %10s",myString); // %s = string, 10 = width , $10s = 10 space or 10 characters width

        //[precision]
        // sets number of digits of precision when outputting floating-point values
        System.out.printf("your have this much money %.1f", myDouble); // %f = floating point number, .1 = precision

        //[flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        //, : comma grouping separator if numbers > 1000
        System.out.printf("\nYou have %,f rupees in your bank account", myDouble); // %d = integer, %,d = comma separator

    }
}
