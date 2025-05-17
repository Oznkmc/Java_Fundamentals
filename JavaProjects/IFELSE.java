import java.util.Scanner;

public class IFELSE {
    static void main(String[] args)
    {
        String kad = "admin123";
        String ksif = "123";
        Scanner sc = new Scanner(System.in);

        System.out.println("Kullanıcı Adı:");
        String ad = sc.nextLine();

        System.out.println("Kullanıcı Şifresi:");
        String sifre = sc.nextLine();

        if (ad.equals(kad) && sifre.equals(ksif)) {
            System.out.println("Kullanıcı Adı ve Kullanıcı Şifresi Doğru!");
        } else if (!ad.equals(kad) && !sifre.equals(ksif)) {
            System.out.println("Kullanıcı Adı ve Kullanıcı Şifresi Yanlış!");
        } else if (!ad.equals(kad)) {
            System.out.println("Kullanıcı Adı Yanlış");
        } else {
            System.out.println("Kullanıcı Şifresi Yanlış");
        }
    }

}
