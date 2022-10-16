import java.util.Scanner;
public class KatlarinToplami {
    public static void main(String[] args) {
        int n, total = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Toplamayı durdurmak isterseniz tek sayı giriniz.");
        do{
            System.out.print("Bir sayı giriniz: ");
            n = sc.nextInt();
            if (n % 4 == 0) total += n;
        }while (n % 2 == 0);

        System.out.println("Sayıların toplamı: " + total);
    }
}
