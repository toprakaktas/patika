import java.util.Scanner;
public class PowRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban sayısını giriniz: ");
        int num = sc.nextInt();
        System.out.print("Üs sayısını giriniz: ");
        int pwr = sc.nextInt();
        System.out.println("Sonuç: " + pow(num,pwr));
    }

    static int pow(int value, int power){
        //0. kuvvet 1dir
        if (power == 0) return 1;
        //kuvvetleri azaltarak çarpma
        else return (value * pow(value,power-1));
    }
}
