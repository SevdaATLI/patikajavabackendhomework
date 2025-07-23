package week1.chinesezodiac;

import java.util.Scanner;
public class Chinesezodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan doğum tarihini alma
        System.out.print("Doğum yılınızı giriniz: ");
        int dogumYili = scanner.nextInt();

        // Çin Zodyağı hesaplama
        int kalan = dogumYili % 12;
        String zodyakHayvani;

        // Gelişmiş switch ifadesi
        switch (kalan) {
            case 0 -> zodyakHayvani = "Maymun";
            case 1 -> zodyakHayvani = "Horoz";
            case 2 -> zodyakHayvani = "Köpek";
            case 3 -> zodyakHayvani = "Domuz";
            case 4 -> zodyakHayvani = "Fare";
            case 5 -> zodyakHayvani = "Öküz";
            case 6 -> zodyakHayvani = "Kaplan";
            case 7 -> zodyakHayvani = "Tavşan";
            case 8 -> zodyakHayvani = "Ejderha";
            case 9 -> zodyakHayvani = "Yılan";
            case 10 -> zodyakHayvani = "At";
            case 11 -> zodyakHayvani = "Koyun";
            default -> zodyakHayvani = "Bilinmiyor"; // Bu durumda geçerli olamaz.
        }

        // Sonucu ekrana yazdırma
        System.out.println("Çin Zodyağı hayvanınız: " + zodyakHayvani);

        scanner.close();
    }
}