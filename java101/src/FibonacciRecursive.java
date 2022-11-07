import java.util.Scanner;
public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = sc.nextInt();
        System.out.println("Fibonacci serisinin " + number + ". sayısı : " + fib(number));
    }

    static int fib(int n){
        if (n == 0) return 0;

        if ((n == 1) || (n == 2))  return 1;

        //fib(n) = fib(n-1) + fib(n-2)
        return fib(n-1)+ fib(n-2);
    }
}
