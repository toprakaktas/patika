import java.util.Scanner;
public class Kuvvetler {
    public static void main(String[] args) {
        int end, i = 1, j = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        end = sc.nextInt();

        while (j < end) {
            if (j % 5 == 0) System.out.println("5'in kuvveti: " + j);
            while (i < end) {
                if (i % 4 == 0) System.out.println("4'ün kuvveti: "+ i);
                i *= 4;
            }
            j *= 5;
        }
    }
}