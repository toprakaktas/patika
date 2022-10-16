import java.util.Scanner;
public class CiftSayi {
    public static void main(String[] args) {
        int end, counter=0, total=0, i=1;
        double average = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        end = sc.nextInt();

        while(i <= end){
            if (i % 2 == 0){
                if (i % 3 == 0 && i % 4 == 0){
                    total +=i;
                    counter++;
                    System.out.print(i + " ");
                }
            }
            i++;
        }
        average = total/counter;

        System.out.println("\nSayıların ortalaması: " + average);
    }
}
