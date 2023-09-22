//29. Write a program to print 1-5 only using break. (Loop goes from 1 – 10).//

public class q29 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i > 5) {
                break;
            }
            System.out.println(i + " ");
        }
    }
}
