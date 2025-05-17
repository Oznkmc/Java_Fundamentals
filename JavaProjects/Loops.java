import java.util.Random;


public class Loops {

    public static void ForExample(String kelime) {
        boolean dogruluk = true;
        for (int i = 0; i < kelime.length() / 2; i++) {
            if (kelime.charAt(i) != kelime.charAt(kelime.length() - 1 - i)) {
                dogruluk = false;
                break;
            }
        }
        if (dogruluk) {
            System.out.println(kelime + " palindromdur");
        } else {
            System.out.println(kelime + " palindrom değildir.");
        }
    }

    public static void ForEachExample(Integer[] notlar) {
        int toplam = 0;

        for (Integer not : notlar) {
            System.out.println(not);
            toplam += not;
        }

        int ortalama = toplam / notlar.length;
        System.out.println("Ortalama: " + ortalama);
    }
    public static void WhileExample(Integer sayi) {
        Random rnd = new Random();
        int rastgelesayi = rnd.nextInt(0, 20);

        System.out.println("Rastgele Sayı: " + rastgelesayi);

        while (sayi != rastgelesayi) {
            if (sayi < rastgelesayi) {
                System.out.println("Yukarı!");
            } else {
                System.out.println("Aşağı!");
            }
            return;
        }

        System.out.println("Doğru Tahmin!");
    }
    public static void DoWhileExample(String sifre)
    {
        int sayac = 3;

        do {
            if (sifre.equals("admin123")) {
                System.out.println("Şifreyi Doğru Bildiniz.");
                break;
            } else {
                sayac--;
                System.out.println("Şifre yanlış. Kalan deneme hakkınız: " + sayac);

                break;
            }
        } while (sayac > 0);

    }

    public static void main(String[] args) {
       // ForExample("kayak");

      //  Integer[] notlar = {20, 80, 100, 45, 80};
      //  ForEachExample(notlar);
        // WhileExample(15);
      //  DoWhileExample("admin");
    }

}
