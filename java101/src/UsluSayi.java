import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, total = 1;
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = sc.nextInt();
        System.out.print("Üssü giriniz: ");
        k = sc.nextInt();

        for (int i=1; i<= k;i++){
            total *= n;
        }
        System.out.println("Sonuç: " + total);
    }
}