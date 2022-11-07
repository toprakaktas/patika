import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci serisinde kaç eleman olsun: ");
        int number = sc.nextInt();
        int firstStep = 0, secondStep = 1, next;

        int loop = 1;
        do {
            //serinin ilk adımını yazdırma
            if (loop == 1) System.out.print(firstStep + " ");
            //serinin ikinci adımını yazdırma
            else if (loop == 2) System.out.print(secondStep + " ");
            else {
                //sayının kendinden öncesiyle toplanıp yeni değişkene tanımlanması
                next = firstStep + secondStep;
                //önceki sayı bir sonraki sayıya geçer
                firstStep = secondStep;
                //var olan sayı bir sonraki sayıya geçer
                secondStep = next;
                System.out.print(next + " ");
            }
            loop++;
        } while (loop <= number);
    }
}