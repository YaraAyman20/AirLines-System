package Main_Sys;

import Has_A.*;
import Is_A.*;
import java.util.ArrayList;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yara
 */
public class TicketSys {

    public static ArrayList<Ticket> fArray = new ArrayList();

    public static boolean isUserNameExists(String username) {
        for (int i = 0; i < fArray.size(); i++) {
            Ticket f = fArray.get(i);
            if (f.checkUsername(username)) {
                return true;
            }
        }
        return false;
    }

    public static boolean addEconomy(String from, String to,
            String departureDay, String departureTime,
            String name, String surname, String age, String username, String phoneNumber, String seatType,
            boolean purchaseMeal, String luggage) {

        Economy flight;
        if (!isUserNameExists(username)) {
            flight = new Economy(from, to,
                    departureDay, departureTime,
                    name, surname, age, username, phoneNumber, seatType,
                    purchaseMeal, luggage);
            fArray.add(flight);
            return true;
        }
        return false;
    }

    public static boolean addBusiness(String from, String to, String departureDay,
            String departureTime, String name, String surname, String age, String username, String phoneNumber,
            String movie,
            String book,
            String food,
            String drink,
            String luggage) {

        Business b;
        if (!isUserNameExists(username)) {
            b = new Business(from, to, departureDay, departureTime, name, surname, age, username, 
                    phoneNumber, movie, book, food, drink, luggage);
            fArray.add(b);
            return true;
        }
        return false;
    }


    public static Ticket searchFlight(String username) {

        for (int i = 0; i < fArray.size(); i++) {
            String usernameObj = fArray.get(i).getUsername();
            if (usernameObj.equalsIgnoreCase(username)) {
                return fArray.get(i);
            }
        }
        return null;

    }

    public static boolean cancelFlight(String username) {

        for (int i = 0; i < fArray.size(); i++) {
            Ticket f = fArray.get(i);
            if (f.checkUsername(username)) {
                fArray.remove(i);
                return true;
            }
        }
        return false;
    }

    
    
    public static String[] getUserNames() {
        String usernames[] = new String[fArray.size()];
        for (int i = 0; i < fArray.size(); i++) {
            usernames[i] = fArray.get(i).getUsername();
        }
        return usernames;
    }

    
    public static void calcAllFees() {
        for (int i = 0; i < fArray.size(); i++) {
            Ticket f = fArray.get(i);
            f.calcFee();
        }
    }

    public static String display() {
        String res = "";
        for (int i = 0; i < fArray.size(); i++) {
            Ticket f = fArray.get(i);
            res += f.toString();
        }
        return res;
    }

    public static ArrayList<Ticket> getfArray() {
        return fArray;
    }

    
    
    
}
