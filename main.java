import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int bakiye = 5500;
        String islemler = "1.İşlem : Bakiye sorgulama\n"
                + "2.İşlem : Para çekme\n"
                + "3.İşlem : Para yatırma\n"
                + "Çıkış yapmak için q'ya basınız.";

        System.out.println("*****************************");
        System.out.println(islemler);
        System.out.println("*****************************");

        while (true) {

            System.out.println("İşlemi seçiniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Sistemden çıkılıyor.");
                break;
            }
                else if (islem.equals("1")) {
                System.out.println("Bakiyeniz : " + bakiye);

            }
                else if (islem.equals("2")) {
                System.out.println("Çekmek istediğiniz tutar :");
                int tutar = scanner.nextInt();
                scanner.nextLine();

                if (bakiye - tutar < 0) {
                    System.out.println("Yeterli bakiyeniz yok. Bakiye : " + bakiye);

                }
                else {
                    bakiye -= tutar;
                    System.out.println("Yeni bakiyeniz : " + bakiye);
                }
            }
                else if (islem.equals("3")) {
                System.out.println("Yatırmak istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();

                bakiye += tutar;
                System.out.println("Yeni bakiyeniz : " + bakiye);
            }
                else
            {
                System.out.println("Geçersiz işlem. ");
            }
        }
    }
}
//erdemacar6
