import java.io.*;
import java.lang.Math;
import java.lang.String;

public class TextFizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.format("%9s |", "FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.format("%9s |", "Fizz");
            } else if (i % 5 == 0) {
                System.out.format("%9s |", "Buzz");
            } else {
                System.out.format("%9d |", i);
            }

            if (i % 10 == 0) {
                System.out.format("%n");
            }
        }
    }
}
