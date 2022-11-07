import java.util.Scanner;
public class Palindromic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int number = sc.nextInt();
        if (isPalindrome(number)) System.out.println(number + " sayısı palindrom bir sayıdır.");
        else System.out.println(number + " sayısı palindrom bir sayı değildir.");
    }
    static boolean isPalindrome(int number){
        //numbera eşit geçici bir değişken tanımlanır
        int temp = number;
        int reverseNumber = 0, lastNumber;

        //sayının tersine dönüştürülme döngüsü
        while (temp != 0){
            //son basamaktaki sayının bulunuşu
            lastNumber = temp % 10;
            //basamakları arttırarak sayıları yerleştirme
            reverseNumber = (reverseNumber * 10) + lastNumber;
            //sayının basamağının azaltılması
            temp /= 10;
        }
        return reverseNumber == number;
    }
}
