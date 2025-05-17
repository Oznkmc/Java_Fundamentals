public class Methods {

    // Değer Döndüren Metot
    static int FaktoriyelHesapla(int n) {
        int sonuc = 1;
        for (int i = 2; i <= n; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    // Değer Döndürmeyen Metot
    public static void SicaklikRaporlayici(int derece) {
        if (derece <= 0) {
            System.out.println("Dondurucu soğuk!");
        } else if (derece <= 4) {
            System.out.println("Soğuk, kalın giyin!");
        } else if (derece <= 14) {
            System.out.println("Biraz serin.");
        } else if (derece <= 24) {
            System.out.println("Ilık hava.");
        } else if (derece <= 34) {
            System.out.println("Hava sıcak ama güzel.");
        } else {
            System.out.println("Aşırı sıcak! Bol su içmeyi unutma!");
        }
    }

    public static void main(String[] args) {
        int sonuc = FaktoriyelHesapla(5); // Sonucu al
        System.out.println("5! = " + sonuc); // Yazdır

        SicaklikRaporlayici(-1); // Örnek sıcaklık durumu
        SicaklikRaporlayici(3);  // Diğer örnek
        SicaklikRaporlayici(20);
        SicaklikRaporlayici(36);
    }
}

