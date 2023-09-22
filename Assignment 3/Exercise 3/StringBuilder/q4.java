/*4. Write a program which uses the following methods:
a) public StringBuilder append(String s)
b) public StringBuilder insert(int offset, String s)
c) public StringBuilder replace(int startIndex, int endIndex, String str)
d) public StringBuilder delete(int startIndex, int endIndex)
e) public StringBuilder reverse()
f) public int capacity()
g) public void ensureCapacity(int minimumCapacity)
h) public char charAt(int index)
i) public int length()
j) public String substring(int beginIndex)
k) public String substring(int beginIndex, int endIndex)*/

public class q4{
    public static void main(String[] args) {
        // Create a StringBuffer object.
        StringBuffer stringBuffer = new StringBuffer("Hello, ");

        // a) Append a string to the StringBuffer.
        stringBuffer.append("World!");
        System.out.println("a) Append: " + stringBuffer);

        // b) Insert a string at a specific position in the StringBuffer.
        stringBuffer.insert(7, "Java ");
        System.out.println("b) Insert: " + stringBuffer);

        // c) Replace a portion of the StringBuffer with another string.
        stringBuffer.replace(0, 6, "Greetings");
        System.out.println("c) Replace: " + stringBuffer);

        // d) Delete a portion of the StringBuffer.
        stringBuffer.delete(0, 9);
        System.out.println("d) Delete: " + stringBuffer);

        // e) Reverse the StringBuffer.
        stringBuffer.reverse();
        System.out.println("e) Reverse: " + stringBuffer);

        // f) Get the current capacity of the StringBuffer.
        int capacity = stringBuffer.capacity();
        System.out.println("f) Capacity: " + capacity);

        // g) Ensure that the capacity is at least 20.
        stringBuffer.ensureCapacity(20);
        System.out.println("g) Ensured Capacity: " + stringBuffer.capacity());

        // h) Get the character at a specific index.
        char charAtIndex = stringBuffer.charAt(5);
        System.out.println("h) Char at index 5: " + charAtIndex);

        // i) Get the length of the StringBuffer.
        int length = stringBuffer.length();
        System.out.println("i) Length: " + length);

        // j) Get a substring starting from a specific index.
        String substring = stringBuffer.substring(7);
        System.out.println("j) Substring: " + substring);
    }
}
