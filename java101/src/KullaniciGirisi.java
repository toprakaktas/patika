import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password;
        String newPassword, selection;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = sc.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = sc.nextLine();

        if (userName.equals("patika") && password.equals("java101"))
            System.out.println("Başarılı bir şekilde giriş yaptınız.");
        else {
            System.out.println("Kullanıcı adı ya da şifre yanlış girildi!");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (y/n): ");
            selection = sc.nextLine();
            if (selection.equals("y")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = sc.nextLine();
                if (newPassword.equals(password)) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz: ");
                    newPassword = sc.nextLine();
                    System.out.print("Yeni şifreniz: "+newPassword);
                } else System.out.println("Şifre başarıyla oluşturuldu.");
            }else System.out.print("Şifre sıfırlama talebi reddedildi...");
        }



    }
}
