import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //kullanıcıdan sayı alalım
        System.out.print("Sayı giriniz: ");
        int num = sc.nextInt();
        int dvd = 0;

        //sayının çarpanlarını bulma döngüsü
        for (int i = 1; i < num; i++){
            if (num % i == 0) {
                dvd += i; //çarpanların toplanması
            }
        }

        if (dvd == num) System.out.println(num + " sayısı mükemmel sayıdır.");
        else System.out.println(num + " sayısı mükemmel sayı değildir.");

    }
}
