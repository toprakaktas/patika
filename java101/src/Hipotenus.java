import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci kenarı giriniz: ");
        a = input.nextInt();
        System.out.print("İkinci kenarı giriniz: ");
        b = input.nextInt();

        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("Hipotenüs: " + c);

        //Ödev Kısmı
        int first,second,third;
        Scanner cvr=new Scanner(System.in);
        System.out.print("Birinci kenarı giriniz: ");
        first = cvr.nextInt();
        System.out.print("İkinci kenarı giriniz: ");
        second = cvr.nextInt();
        System.out.print("Üçüncü kenarı giriniz: ");
        third = cvr.nextInt();

        double u = (first+second+third)/2;
        double area = Math.sqrt(u*(u-first)*(u-second)*(u-third));
        System.out.println("Üçgenin alanı: "+area);
    }
}
