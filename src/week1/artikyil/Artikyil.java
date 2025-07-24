package week1.artikyil;

import java.util.Scanner;
public class Artikyil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir yıl giriniz: ");
        int yil = scanner.nextInt();

        boolean artikYilMi = false;

        // Artık yıl kontrolü
        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    artikYilMi = true; // 400'e tam bölünebiliyorsa
                }
            } else {
                artikYilMi = true; // 4'e tam bölünüyorsa
            }
        }
        // Sonucu yazdırır
        if (artikYilMi) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }

        scanner.close();
    }
}