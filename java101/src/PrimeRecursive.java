import java.util.Scanner;
public class PrimeRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int num = sc.nextInt();
        if (prime(num, 2)) System.out.println(num + " sayısı ASALDIR!");
        else System.out.println(num + " sayısı ASAL değildir!");
    }

    static boolean prime(int number, int divisor){
        //sayı 1 ise asal değildir
        if (number == 1) return false;
        //sayı 2 değilse ve kendisinden ve 1den başka sayıya tam bölünüyorsa asal değildir
        if (number != 2 && number % divisor == 0) return false;
        //bölenin karesi sayıdan büyükse asaldır (3 için)
        if (divisor * divisor > number) return true;
        //sıradaki bölenin kontrolü
        return prime(number,divisor+1);
    }
}
