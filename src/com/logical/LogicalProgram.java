package com.logical;
import java.util.Scanner;

public class LogicalProgram {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fibonacciSeries(sc);
    }
    /* Method use:
     * When the number is equal to the sum of its positive divisors
     * excluding the number, it is called a Perfect Number.
     */
    public static void fibonacciSeries(Scanner sc){
        long sum = 0;
        int i = 1;
        System.out.println("Enter number :");
        int n = sc.nextInt();
        while (i <= n / 2) {
            if (n % i == 0) {
                sum += i;
            }
            i++;
        }
        if (sum == n) {
            System.out.println(n + " is a Perfect Number ");
        } else
            System.out.println(n + " is not a Perfect Number ");
        sc.close();
	}

}
