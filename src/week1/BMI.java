package week1;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = input.nextDouble();

        System.out.print("lütfen kilonuzu giriniz :");
        double kilo = input.nextDouble();

        double bmi = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + bmi);
    }

}
