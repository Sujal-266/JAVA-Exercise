//2. Convert the above string to StringBuffer type.//

public class q2 {
    public static void main(String[] args) {
        // Create a StringBuilder object.
        StringBuilder sb = new StringBuilder("Sujal");

        // Convert the StringBuilder object to a StringBuffer object.
        StringBuffer sb2 = new StringBuffer(sb);

        // Print the StringBuffer object.
        System.out.println(sb2);
    }
}
