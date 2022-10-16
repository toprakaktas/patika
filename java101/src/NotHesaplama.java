import java.util.Scanner;
public class NotHesaplama {
    public static void main(String[] args) {
        //values
        int math, physics, chem, turkish, music;

        //Scanner object instantiated
        Scanner input = new Scanner(System.in);

        //getting input from user
        System.out.print("Please enter the Mathematics grade: ");
        math = input.nextInt();
        System.out.print("Please enter the Physics grade: ");
        physics = input.nextInt();
        System.out.print("Please enter the Chemistry grade: ");
        chem = input.nextInt();
        System.out.print("Please enter the Turkish grade: ");
        turkish = input.nextInt();
        System.out.print("Please enter the Musics grade: ");
        music = input.nextInt();

        int total = (math+physics+chem+turkish+music);
        double average = total / 5;
        System.out.println("Your GPA is: "+ average);

        if (average>=55 && average <= 100) System.out.println("Congratulations, you are passed!");
        else if (average > 100 || average <0) System.out.println("Something is wrong.. Grades must be between 0 and 100!");
        else System.out.println("You are failed, study better!");
    }
}