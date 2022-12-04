import java.util.Scanner;
public class PalindromicWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen kelimeyi giriniz: ");
        String word = sc.nextLine();

        if (isPalindrome(word))
            System.out.println(word + " kelimesi palindrom bir kelimedir.");
        else
            System.out.println(word + " kelimesi palindrome bir kelime değildir.");


    }
    public static boolean isPalindrome(String str){
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--)
            reverse.append(str.charAt(i));

        return str.equals(reverse.toString());
    }
}
