//27. Write a program to calculate Simple Interest for all the rate of interest between 1% - 10%//

public class q27 {
    public static void main(String[] args) {
        double principal = 1000;
        double time = 2;

        for (int rate = 1; rate <= 10; rate++) {
            double interest = (principal * rate * time) / 100;
            System.out.println("Simple Interest at " + rate + "% rate: " + interest);
        }
    }
}
