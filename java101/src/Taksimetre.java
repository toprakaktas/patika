import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, finalPrice, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km = input.nextInt();

        finalPrice=startPrice+(km*perKm);
        finalPrice = (finalPrice<20)?20:finalPrice;
        System.out.println("Toplam tutar: "+finalPrice);
    }
}
