import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName, password;
        int perLog = 3, balance = 1500, selection, price;


        while (perLog > 0) {
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = sc.nextLine();
            System.out.print("Parolanızı giriniz: ");
            password = sc.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, X Bankası'na hoş geldiniz!");

                do{
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    System.out.println("1- Para yatırma\n2- Para çekme\n3- Bakiye sorgulama\n4- Çıkış yap");
                    selection = sc.nextInt();

                    switch (selection) {
                        case 1:
                            System.out.print("Yatırılacak tutar: ");
                            price = sc.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekilecek tutar: ");
                            price = sc.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz!");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere...");
                            break;
                        default:
                            System.out.println("Geçersiz işlem seçtiniz!");
                            break;
                    }
                } while(selection != 4);
                break;
            }else{
                perLog--;
                System.out.println("Hatalı bir giriş yaptınız! Tekrar deneyiniz.");
                if (perLog == 0){
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                }else System.out.println("Kalan hakkınız: " + perLog);
            }
        }
    }
}
