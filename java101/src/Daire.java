import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        int r;
        double pi=3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();

        double area = pi * Math.pow(r,2);
        double cir = 2 * pi * r;

        System.out.println("Dairenin alanı: "+area);
        System.out.println("Dairenin çevresi: "+cir);

        //Ödev
        int angle;

        System.out.print("Dairenin merkez açısını giriniz: ");
        angle = input.nextInt();

        double sectorArea = (area * angle)/360;
        System.out.println("Daire diliminin alanı: "+sectorArea);
    }
}
