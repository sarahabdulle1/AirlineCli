import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {


        Passenger passenger;
        Airport airport;
        Flight flight;


        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter your flightID");

//        while(true){
            String input1 = scanner1.nextLine();

            if (input1.equals("BA123")){
                System.out.println("Your flight boards at 10AM");
            }
            else {
                System.out.println("Flight not found");
            }

//    second scanner

           Scanner sc = new Scanner(System.in);
            System.out.println("Enter your contact details");


            while (true) {
                String input2 = sc.nextLine();
                try {
                    if (Integer.parseInt(input2) == 44) {
                        System.out.println("Your contact details are in the system");
                        break;
                    } else {
                        System.out.println("Contact not found. Try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a number");
                }
            }

    }

}
