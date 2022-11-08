import java.util.Scanner;
@SuppressWarnings("ALL")
public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N sayısı: ");
        int n = sc.nextInt();
        System.out.print("Çıktısı: ");
        pattern(n,n,0);
    }

    static int pattern(int number, int temp, int cnt){
        //sayı 0 veya 0dan küçükse sayıya 5 ekle counterı 1 arttır
      if (number <= 0 ) {
          System.out.print(number + " ");
          return pattern(number + 5, temp, +1);
      }
      //sayı 0dan büyükse ve counter 0sa sayıdan 5 çıkart
      else if (number > 0 && cnt == 0){
          System.out.print(number + " ");
          return pattern(number-5,temp,cnt);
      }
      //sayı 0dan büyükse ve başlangıçtaki sayıdan küçük veya eşitse counter 1 ise sayıya 5 ekle
      else if (number > 0 && number <= temp && cnt == 1) {
          System.out.print(number + " ");
          return pattern(number+5,temp,cnt);
      }
      return number;
    }
}

/*
Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi
sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme
işleminde sayının son değerini ekrana yazdırın.
N Sayısı : 16
Çıktısı : 16 11 6 1 -4 1 6 11 16
 */