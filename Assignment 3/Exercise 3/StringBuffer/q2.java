/*2. Create the following strings
String s1="Krishna";
String s2="Krishna";
String s3=new String("Krina");
String s4="Krupali";

Now compare them using following techniques.
By Using equals() Method
By Using == Operator
By compareTo() Method.*/

public class q2 {
    public static void main(String[] args) {
        // Create the strings.
        String s1 = "Krishna";
        String s2 = "Krishna";
        String s3 = new String("Krina");
        String s4 = "Krupali";

        // Compare the strings using the equals() method.
        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equals s3: " + s1.equals(s3));
        System.out.println("s1 equals s4: " + s1.equals(s4));

        // Compare the strings using the == operator.
        System.out.println("s1 is equal to s2: " + (s1 == s2));
        System.out.println("s1 is equal to s3: " + (s1 == s3));
        System.out.println("s1 is equal to s4: " + (s1 == s4));

        // Compare the strings using the compareTo() method.
        System.out.println("s1 compareTo s2: " + s1.compareTo(s2));
        System.out.println("s1 compareTo s3: " + s1.compareTo(s3));
        System.out.println("s1 compareTo s4: " + s1.compareTo(s4));
    }
}
