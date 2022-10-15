import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        int weight;
        double height;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        height = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        weight = input.nextInt();

        double bmi = weight/Math.pow(height,2);
        System.out.println("Vücut kitle indeksiniz: " + bmi);
    }
}
