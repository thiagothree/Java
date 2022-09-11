package application;

import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = sc.nextInt();
        System.out.print("Check-in date (dd/mm/yyyy): ");
        Date chechIn = sdf.parse(sc.next());
        System.out.print("Check-out date (dd/mm/yyyy): ");
        Date chechOut = sdf.parse(sc.next());

        if (!chechOut.after(chechIn)) {
            System.out.println("Error in resevation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(number, chechIn, chechOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.print("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/mm/yyyy): ");
            chechIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/mm/yyyy): ");
            chechOut = sdf.parse(sc.next());

            String error = reservation.updateDate(chechIn, chechOut);
            if (error != null) {
                System.out.println("Error in reservation: " + error);
            } else {
                System.out.println("Reservation: " + reservation);
            }
        }
        sc.close();
    }
}
