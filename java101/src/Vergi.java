import java.util.Scanner;
public class Vergi {
    public static void main(String[] args) {
        double price, rate = 0.18, vatPrice, priceWithVat;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");
        price = input.nextDouble();

        vatPrice = price * rate;
        priceWithVat = price + vatPrice;

        rate = price <= 1000 ? 0.18:0.08;
        System.out.println("KDV'siz fiyat: "+ price);
        System.out.println("KDV oranı: "+rate);
        System.out.println("KDV fiyatı: "+vatPrice);
        System.out.println("KDV'li fiyat: "+priceWithVat);
    }
}
