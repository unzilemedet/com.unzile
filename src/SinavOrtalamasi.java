import java.util.Scanner;

public class SinavOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik sınav puanınızı giriniz: ");
        double matematik = input.nextDouble();

        System.out.print("Fizik sınav puanınızı giriniz: ");
        double fizik = input.nextDouble();

        System.out.print("Kimya sınav puanınızı giriniz: ");
        double kimya = input.nextDouble();

        System.out.print("Türkçe sınav puanınızı giriniz: ");
        double turkce = input.nextDouble();

        System.out.print("Tarih sınav puanınızı giriniz: ");
        double tarih = input.nextDouble();

        System.out.print("Müzik sınav puanınızı giriniz: ");
        double muzik = input.nextDouble();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Ortalamanız: " + ortalama);

        String gecmeDurumu = ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(gecmeDurumu);
    }
}