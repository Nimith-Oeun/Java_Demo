public class StringMethod {
    public static void main(String[] args){
        String name = "Nimith";

//        boolean result = name.equalsIgnoreCase("nimith");
//        int result = name.length(); // length of the string
//        char result = name.charAt(0); // index starts from 0, length of the name, index of the character
//        int result = name.indexOf("h"); // index of the character
//        boolean result = name.isEmpty(); // checks if the string is empty or not
 //       String result = name.toUpperCase();   // converts the string to uppercase
//        String result = name.toLowerCase(); // converts the string to lowercase
//        String result = name.trim(); // removes the white spaces from the beginning and the end of the string
        String result = name.replace('i', 'o'); // replaces the character
        System.out.println(result);
    }

}
