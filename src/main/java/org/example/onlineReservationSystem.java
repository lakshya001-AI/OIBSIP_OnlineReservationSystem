package org.example;

import java.util.Objects;
import java.util.Scanner;

public class onlineReservationSystem {
    //condition of the project
    //login form
    //under reservation system: fields like = basic details, train number, train name, class type, date of journey, from and to
    //cancellation form: get the pnr number from the user

    public static void main(String[] args){
        System.out.println();
        System.out.println("<<<------welcome to the online Reservation system------>>>");
        System.out.println();
        System.out.println("_____Login to Continue _____");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Email(Default email : reservationsystem@gmail.com): ");
        String loginId = scanner.nextLine();
        System.out.print("Enter your password(Default Password : reservationsystem): ");
        String password = scanner.nextLine();

        if (Objects.equals(loginId, "reservationsystem@gmail.com") && Objects.equals(password, "reservationsystem")){
            System.out.println();
            System.out.println("_____Welcome to Main System _____");
            System.out.println();
            System.out.print("what you want ? (New Reservation or Cancel Reservation): ");
            System.out.println();
            String operation = scanner.nextLine();

            if (Objects.equals(operation, "New Reservation")){
                System.out.println();
                System.out.println("_____New Reservation _____");
                System.out.print("Enter Your Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Your Train No. :  ");
                String trainNo = scanner.nextLine();
                System.out.print("Enter Your Date: ");
                String date = scanner.nextLine();
                System.out.print("Enter your class Type (AC class , Sleeper class, General class ): ");
                String Class = scanner.nextLine();
                System.out.print("From(place): ");
                String from = scanner.nextLine();
                System.out.print("Destination: ");
                String destination = scanner.nextLine();
                System.out.println();
                System.out.println("Are you sure you want to book Ticket(Yes or No): ");
                String response = scanner.nextLine();
                if (Objects.equals(response, "Yes")){
                    System.out.println();
                    System.out.println("<<<<<<<< Booking Confirmed >>>>>>>>>>");
                    System.out.println();
                    System.out.println("PNR NO: 2212356745");
                    System.out.println("Name: " + name);
                    System.out.println("TrainNo. " + trainNo);
                    System.out.println("Date:  " + date);
                    System.out.println("Class:  " + Class + "Booking Status: Waiting List");
                    System.out.println("From  " + from);
                    System.out.println("Destination:   " + destination);
                    System.out.println();
                    System.out.println("<<<<<<<< Thank You, Happy Journey >>>>>>>>>>");
                }
            }
            if (Objects.equals(operation, "Cancel Reservation")) {
                System.out.println();
                System.out.println("_____Cancel Reservation _____");
                System.out.print("Please Enter Your PNR Number(Default PNR: 2212356745) : ");
                String pnr = scanner.nextLine();
                if (Objects.equals(pnr, "2212356745")){
                    System.out.print("Are You Sure You Want to Cancel the Reservation (YES OR NO): ");
                    String status = scanner.nextLine();
                    if (Objects.equals(status, "YES")){
                        System.out.println();
                        System.out.println("Booking Cancelled");
                        System.out.println();
                        System.out.println("<------ Thank You ------>");
                    }
                    else {
                        System.out.println();
                        System.out.println("Happy Journey");
                    }

                }
                else {
                    System.out.println();
                    System.out.println("Entered PNR not matches the default PNR, Please Enter the Default PNR number");
                }



            }
        }
        else {
            System.out.println();
            System.out.println("XXXX___LoginId and Password are wrong , Please enter Default emailId and password provided___XXXX");
        }

    }
}


