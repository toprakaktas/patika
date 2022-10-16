import java.util.Scanner;
public class HavaSicakligi {
    public static void main(String[] args) {
        int temperature;

        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen sıcaklığı giriniz: ");
        temperature = sc.nextInt();

        if (temperature<5) System.out.println("Kayak yapabilirsiniz.");
        else if (temperature>=5 && temperature<=15) System.out.println("Sinemaya gidebilirsiniz.");
        else if (temperature>15 && temperature<=25) System.out.println("Piknik yapabilirsiniz.");
        else System.out.println("Yüzmeye gidebilirsiniz.");
    }
}
