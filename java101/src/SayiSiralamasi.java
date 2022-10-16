import java.util.Scanner;
public class SayiSiralamasi {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        n1 = sc.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        n2 = sc.nextInt();
        System.out.print("3. sayıyı giriniz: ");
        n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3){
            if (n2 > n3) System.out.println(n1+" > "+n2+" > "+n3);
            else if (n3 > n2) System.out.println(n1+" > "+n3+" > "+n2);
            else System.out.println(n1+" > "+n2+" = "+n3);
        }else if (n2 > n1 && n2 > n3){
            if (n3 > n1) System.out.println(n2+" > "+n3+" > "+n1);
            else if (n1 > n3) System.out.println(n2+" > "+n1+" > "+n3);
            else System.out.println(n2+" > "+n1+" = "+n3);
        }else if (n3 > n1 && n3 > n2){
            if (n1 > n2) System.out.println(n3+" > "+n1+" > "+n2);
            else if (n2 > n1) System.out.println(n3+" > "+n2+" > "+n1);
            else System.out.println(n3+" > "+n1+" = "+n2);
        }else if (n1 == n2 && n1 > n3) System.out.println(n1+" = "+n2+" > "+n3);
        else if (n1 == n3 && n1 > n2) System.out.println(n1+" = "+n3+" > "+n2);
        else if (n2 == n3 && n2 > n1) System.out.println(n2+" = "+n3+" > "+n1);
        else System.out.println(n1+" = "+n2+" = "+n3);
    }
}
