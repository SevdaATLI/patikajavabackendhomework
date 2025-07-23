package week1.Pratikaritmetikislemler;

import java.util.Scanner;
public class Pratik {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number a: ");
        int a = scanner.nextInt();

        System.out.println("Enter the number b: ");
        int b = scanner.nextInt();

        System.out.println("Enter the number c: ");
        int c = scanner.nextInt();

        int result = a + b * c - b;

        System.out.println("Result of the transaction :" + result);

        scanner.close();

    }
}
