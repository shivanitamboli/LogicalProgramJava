package com.logical;
import java.util.Scanner;

public class LogicalProgram {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        primeNUmber(num);
        sc.close();
    }
    /* Method use:
     * the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
     * number. 0 and 1 are not counted as prime numbers.
     */
    public static void primeNUmber(int num){
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
	}

}
