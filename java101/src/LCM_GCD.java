import java.util.Scanner;
public class LCM_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum, secondNum;
        boolean stat = false;

        //kullanıcıdan pozitif değerler alınır
        do{
            System.out.print("İlk sayıyı giriniz: ");
            firstNum = sc.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            secondNum = sc.nextInt();

            if (firstNum <= 0 || secondNum <= 0) System.out.println("Lütfen pozitif sayılar giriniz!");
            else stat = true;
        }while(!stat);

        //EBOB hesaplama
        int gcd = firstNum;
        while (gcd >= 1){
            if (firstNum % gcd == 0 && secondNum % gcd == 0) {
                System.out.println(firstNum + " ve " + secondNum + " sayılarının EBOBu: " + gcd);
                break;
            }
            else gcd--;
        }

        //EKOK hesaplama
        int lcm = secondNum;
        while (lcm <= (firstNum * secondNum)/gcd){
            if (lcm % firstNum == 0 && lcm % secondNum == 0){
                System.out.println(firstNum + " ve " + secondNum + " sayılarının EKOKu: " + lcm);
                break;
            }
            else lcm++;
        }

    }
}
