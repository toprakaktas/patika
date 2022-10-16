import java.util.Scanner;
public class FlightTicket {
    public static void main(String[] args) {
        double costPerKM = 0.10, ticketPrice, sale;
        int type, age, distance;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the distance(km): ");
        distance = sc.nextInt();

        System.out.print("Please enter your age: ");
        age = sc.nextInt();

        System.out.print("Please enter your flight type(1 => One way, 2 => Round trip): ");
        type = sc.nextInt();

        if (distance < 0 || age < 0 || (type > 2 || type < 1)) {
            System.out.println("Error, wrong information!");
        }

        ticketPrice = distance * costPerKM;

        if (age < 12) {
            sale = ticketPrice / 2;
            ticketPrice = ticketPrice - sale;
            System.out.println("Total cost is: "+ticketPrice+"TL");
        }
        else if (age > 12 && age <= 24){
            sale = ticketPrice*0.1;
            ticketPrice = ticketPrice - sale;
            System.out.println("Total cost is: "+ticketPrice+"TL");
        }
        else if (age > 65){
            sale = ticketPrice * 0.3;
            ticketPrice = ticketPrice - sale;
            System.out.println("Total cost is: "+ticketPrice+"TL");
        }
        else if (type == 2){
            sale = ticketPrice * 0.2;
            ticketPrice = ticketPrice - sale;
            System.out.println("Total cost is: "+ticketPrice+"TL");
        }
        else System.out.println("Total cost is: "+ticketPrice+"TL");
    }
}
