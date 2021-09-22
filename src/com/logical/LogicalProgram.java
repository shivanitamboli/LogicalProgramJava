package com.logical;
import java.util.Scanner;

public class LogicalProgram {

    public static int num1 = 0;
    public static int num2 = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fibonacciSeries(sc);
    }
    /* Method use:
     * use for loop for iterates loop to given
     * range and print outcome values of Fibonacci series
     */
    public static void fibonacciSeries(Scanner sc){
        System.out.println("Enter range Fibonacci Series number :");
        int Num = sc.nextInt();
        for (int i=1; i<=Num; i++){
            System.out.print(+num1+" + "+num2);
           int fib = num1 + num2;
           num1=num2;
           num2=fib;
           System.out.println(" = "+fib);

        }
        sc.close();

	}

}
