import java.util.Scanner;
import java.util.Arrays;
public class InOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int n = sc.nextInt();
        int[] list = new int[n];

        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < n; i++){
            System.out.print((i+1) + ". Elemanı: ");
            list[i] = sc.nextInt();
        }

        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Sıralama: " + Arrays.toString(arrayOrder(list)));

    }

    static int[] arrayOrder(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int min = i;
            for (int  j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
