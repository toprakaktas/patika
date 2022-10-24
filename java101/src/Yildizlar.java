import java.util.Scanner;
public class Yildizlar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--){
            for (int j = (n - i); j >= 1; j--)
                System.out.print(" ");
            for (int k = (2 * i) - 1; k >= 1; k--)
                System.out.print("*");
            System.out.println();
        }

    }
}