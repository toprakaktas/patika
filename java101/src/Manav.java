import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00;
        double armut, elma, domates, muz, patlican, toplam;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo? : ");
        armut = input.nextDouble();
        System.out.print("Elma kaç kilo? : ");
        elma = input.nextDouble();
        System.out.print("Domates kaç kilo? : ");
        domates = input.nextDouble();
        System.out.print("Muz kaç kilo? : ");
        muz = input.nextDouble();
        System.out.print("Patlıcan kaç kilo? : ");
        patlican = input.nextDouble();

        toplam = (armut*armutFiyat) + (elma*elmaFiyat) + (domates*domatesFiyat) + (muz*muzFiyat) + (patlican*patlicanFiyat);
        System.out.println("Toplam ödeyeceğiniz tutar: " + toplam);
    }
}
