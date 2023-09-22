//4. Covert a string created with String class to a mutable string.//

public class q4 {
    public static void main(String[] args) {
        // Create a String object.
        String str = "Sujal Patel";

        // Convert the String object to a StringBuffer object.
        StringBuffer sb = new StringBuffer(str);

        // Print the StringBuffer object.
        System.out.println(sb);
    }
}

