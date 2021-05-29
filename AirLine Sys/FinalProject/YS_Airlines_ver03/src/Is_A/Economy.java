/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Is_A;

import Has_A.FamilyMember;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Economy extends Ticket {

    private String seatType; //window, middle, passage
    private boolean purchaseMeal;
    private double luggage;

    public Economy(String from, String to,
            String departureDay, String departureTime,
            String name, String surname, String age, String username, 
            String phoneNumber, String seatType,
            boolean purchaseMeal, String luggage) {

        super(from, to, departureDay, departureTime, name, surname, age, username, phoneNumber);
        this.seatType = seatType;
        this.purchaseMeal = purchaseMeal;
        this.luggage = Double.parseDouble(luggage);
    }

    @Override
    public void calcFee() {
        fee = 399.99;
        if (age < 18) {
            fee -= 10;
        }

        if (luggage > 20) {
            fee += 20;
        }

        if (purchaseMeal) {
            fee += 50;
        }
    }

    //getters and setters
    @Override
    public String toString() {
        return super.toString() + "\n\nEconomy"
                + "\nSeat Type: " + seatType
                + "\nPurchase Meal: " + purchaseMeal
                + "\nLuggage: " + luggage
                + '\n';
    }

}
