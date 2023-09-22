//5. Convert a string created with StringBuffer to immutable string.//

public class q5{
    public static void main(String[] args) {
        // Create a StringBuffer object.
        StringBuffer sb = new StringBuffer("Sujal Patel");

        // Convert the StringBuffer object to a String object.
        String str = sb.toString();

        // Print the String object.
        System.out.println(str);
    }
}
