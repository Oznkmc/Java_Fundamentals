import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Muz:100 Lira, Elma:80 Lira, Çilek:120 Lira, Domates:50 Lira, Salata:30 Lira, Patates:75 Lira");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ürün Yazınız: ");
        String urunsecim = scanner.nextLine();

        System.out.print("Kilo Giriniz: ");
        double kilo = scanner.nextDouble();

        switch (urunsecim) {
            case "Elma":
                System.out.println("Ödeyeceğiniz Ücret: " + (kilo * 80) + " Lira");
                break;
            case "Muz":
                System.out.println("Ödeyeceğiniz Ücret: " + (kilo * 100) + " Lira");
                break;
            case "Çilek":
                System.out.println("Ödeyeceğiniz Ücret: " + (kilo * 120) + " Lira");
                break;
            case "Domates":
                System.out.println("Ödeyeceğiniz Ücret: " + (kilo * 50) + " Lira");
                break;
            case "Salata":
                System.out.println("Ödeyeceğiniz Ücret: " + (kilo * 30) + " Lira");
                break;
            case "Patates":
                System.out.println("Ödeyeceğiniz Ücret: " + (kilo * 75) + " Lira");
                break;
            default:
                System.out.println("Geçersiz ürün girdiniz.");
        }


    }
}
