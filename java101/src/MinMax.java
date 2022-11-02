import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0, min = 0;
        System.out.print("Kaç sayı gireceksiniz: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.print(i + ". sayıyı giriniz: ");
            int temp = sc.nextInt();
            //tek sayı girilmesi koşulunda minimum ve maksimum değer girilen sayıya eşittir
             if (i == 1){
                 max = temp;
                 min = temp;
             }
             //girilen sayı bir önceki maksimum değerden yüksekse yeni maximum değer atanır
             else if (temp > max) max=temp;
             //girilen sayı bir önceki mininmum değerden düşükse yeni minimum atanır
             else if (temp < min) min = temp;
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
