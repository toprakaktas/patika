import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int number1, number2, selection;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        number1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        number2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
        selection = input.nextInt();

        switch (selection){
            case 1:
                System.out.println("Toplam: "+(number1+number2));
                break;
            case 2:
                System.out.println("Fark: "+(number1-number2));
                break;
            case 3:
                System.out.println("Çarpım: "+(number1*number2));
                break;
            case 4:
                System.out.println("Bölüm: "+(number1/number2));
                break;
            default:
                System.out.println("İşlem seçmediniz!");
                break;
        }
    }
}
