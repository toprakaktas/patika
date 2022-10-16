import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        int n,r, rFact=1, nFact=1, nrFact = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Kombinasyonun n sayısını giriniz: ");
        n = sc.nextInt();
        System.out.print("Kombinasyonun r sayısını giriniz: ");
        r = sc.nextInt();

        for (int i=1;i<=n;i++) nFact = nFact * i;
        for (int j=1;j<=r;j++) rFact = rFact * j;
        for (int k=1;k<=(n-r);k++) nrFact = nrFact * k;
        int comb = (nFact/(rFact*nrFact));
        System.out.println("C("+n+","+r+") = "+comb);
    }
}
