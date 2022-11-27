import java.util.Arrays;
import java.util.Scanner;
public class NearestValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = {1, 5, 876, -23, 34, 6, 31, 9};
        System.out.println("Dizi: " + Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("Sıralanmış dizi: " + Arrays.toString(list));

        System.out.print("Girilen sayı: ");
        int value = sc.nextInt();

        list = addValue(list, value);
        Arrays.sort(list);
        //yeni sayı eklenmiş haliyle dizi
        System.out.println("Girilen sayı ile birlikte dizi: " + Arrays.toString(list));

        int leftValue = 0, rightValue = 0;
        for (int i = 0; i < list.length; i++){
            if (list[i] == value){
                rightValue = list[i+1];
                leftValue = list[i-1];
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + leftValue);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + rightValue);
    }

    //diziye yeni sayı ekleyen metot
    public static int[] addValue(int[] arr, int x){
        int[] newArr = new int[arr.length+1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = x;

        return newArr;
    }
}
