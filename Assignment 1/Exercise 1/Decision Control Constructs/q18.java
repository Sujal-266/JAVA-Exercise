//18. Write a program to find whether a year is leap or not.//

public class q18 {
    public static void main(String[] args) {
        int year = 2024; // You can change this year to test
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
