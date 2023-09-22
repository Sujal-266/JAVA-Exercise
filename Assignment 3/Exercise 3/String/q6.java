/*6. Write a program which uses the following methods:
a) char charAt(int index)
b) int length()
c) String substring(int beginIndex)
d) boolean contains(CharSequence s)
e) boolean equals(Object another)
f) boolean isEmpty()
g) String concat(String str)
h) String replace(char old, char new)
i) int indexOf(int ch)
j) String toLowerCase()
k) String toLowerCase(Locale l)
l) String toUpperCase()
m) String toUpperCase(Locale l)
n) String trim()*/

import java.util.Locale;
public class q6 {
    public static void main(String[] args) {
        // Create a string.
        String str = "sujal";

        // Use the charAt() method to get the character at a specific index.
        char c = str.charAt(0);
        System.out.println("The character at index 0 is: " + c);

        // Use the length() method to get the length of the string.
        int length = str.length();
        System.out.println("The length of the string is: " + length);

        // Use the substring() method to get a substring of the string.
        String substring = str.substring(1);
        System.out.println("The substring from index 1 is: " + substring);

        // Use the contains() method to check if the string contains a specific sequence of characters.
        boolean contains = str.contains("JAL");
        System.out.println("Does the string contain the sequence 'JAL'? " + contains);

        // Use the equals() method to check if the string is equal to another string.
        boolean equals = str.equals("SUJAL");
        System.out.println("Is the string equal to 'SUJAL'? " + equals);

        // Use the isEmpty() method to check if the string is empty.
        boolean isEmpty = str.isEmpty();
        System.out.println("Is the string empty? " + isEmpty);

        // Use the concat() method to concatenate two strings.
        String concatenatedString = str.concat(" is my name.");
        System.out.println("The concatenated string is: " + concatenatedString);

        // Use the replace() method to replace all occurrences of a character with another character.
        String replacedString = str.replace('U', 'a');
        System.out.println("The replaced string is: " + replacedString);

        // Use the indexOf() method to find the index of the first occurrence of a character in the string.
        int indexOf = str.indexOf('J');
        System.out.println("The index of the first occurrence of 'J' in the string is: " + indexOf);

        // Use the toLowerCase() method to convert the string to lowercase.
        String lowercaseString = str.toLowerCase();
        System.out.println("The lowercase string is: " + lowercaseString);

        // Use the toLowerCase(Locale) method to convert the string to lowercase using a specific locale.
		Locale locale = Locale.ENGLISH;
        String lowercaseStringWithLocale = str.toLowerCase(locale);
        System.out.println("The lowercase string with locale US is: " + lowercaseStringWithLocale);

        // Use the toUpperCase() method to convert the string to uppercase.
        String uppercaseString = str.toUpperCase();
        System.out.println("The uppercase string is: " + uppercaseString);

        // Use the toUpperCase(Locale) method to convert the string to uppercase using a specific locale.
        String uppercaseStringWithLocale = str.toUpperCase(Locale.US);
        System.out.println("The uppercase string with locale US is: " + uppercaseStringWithLocale);

        // Use the trim() method to remove any leading or trailing whitespace from the string.
        String trimmedString = str.trim();
        System.out.println("The trimmed string is: " + trimmedString);
    }
}
