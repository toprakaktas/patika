import java.util.Scanner;
public class HarmonicSeries {
    public static void main(String[] args) {
        int n;
        double result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("N sayısı giriniz: ");
        n = sc.nextInt();

        for (double i=1; i<=n;i++){
            result += (1/i);
        }
        System.out.println("Sonuç: " + result);
    }
}
