import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        /*
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            // 1*1*1*1 = 1^4
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) System.out.println(number + " sayısı bir Armstrong sayıdır.");
        else System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        */
        //Ödev
        int number = sc.nextInt(), tempNumber = number, digitValue, result = 0;

        while (tempNumber != 0){
            digitValue = tempNumber % 10;
            result += digitValue;
            tempNumber /= 10;
        }

        System.out.println(number + " sayısının basamakları toplamı: " + result);
    }
}
