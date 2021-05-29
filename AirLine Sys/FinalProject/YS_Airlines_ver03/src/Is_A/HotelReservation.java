/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Is_A;

import Has_A.SpecialServices;

/**
 *
 * @author User
 */
public class HotelReservation extends SpecialServices {

    private String hotelStars;

    public HotelReservation(String serviceID, String durationInDays, String hotelStars) {
        super(serviceID, durationInDays);
        this.hotelStars = hotelStars;
    }

    public void calcFee() {
        double fee = 0;

        if (hotelStars.equalsIgnoreCase("5")) {
            fee = getDurationInDays() * 899.99;
        } else if (hotelStars.equalsIgnoreCase("4")) {
            fee = getDurationInDays() * 799.99;
        }

        setServiceFee(fee);

    }

    @Override
    public String toString() {
        return "Hotel Reservation" + "\nHotel Stars: " + hotelStars + '\n';
    }

}
