/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Is_A;

import Has_A.FamilyMember;
import Has_A.SpecialServices;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author User
 */
public class Business extends Ticket {

    private String movie;
    private String book;
    private String food;
    private String drink;
    private double luggage;
    private HashSet<SpecialServices> services = new HashSet();

    public Business(String from, String to, String departureDay,
            String departureTime, String name, String surname, 
            String age, String username, String phoneNumber,
            String movie,
            String book,
            String food,
            String drink,
            String luggage) {
        super(from, to, departureDay, departureTime, name, surname, age, username, phoneNumber);
        this.movie = movie;
        this.book = book;
        this.food = food;
        this.drink = drink;
        this.luggage = Double.parseDouble(luggage);

    }

    public boolean addHotelReservaion(String ID, String duration, String hotelStars) {
        return services.add(new HotelReservation(ID, duration, hotelStars));
    }

    public boolean addCityGuide(String ID, String duration, String language) {
        return services.add(new CityGuide(ID, duration, language));
    }

    public boolean addRentCar(String ID, String duration, String carModel) {
        return services.add(new RentCar(ID, duration, carModel));
    }

    @Override
    public void calcFee() {
        fee = 3790.2;
        if (age < 18) {
            fee -= 100.0;
        }
        if (luggage > 20) {
            fee += 50;
        }
    }

    public void calcServiceFee() {
        for (SpecialServices s : services) {
            if (s instanceof CityGuide) {
                ((CityGuide) s).calcFee();
            } else if (s instanceof RentCar) {
                ((RentCar) s).calcFee();
            }else  if (s instanceof HotelReservation) {
                ((HotelReservation) s).calcFee();
            } 
        }
    }

    public HashSet<SpecialServices> getServices() {
        return services;
    }

    @Override
    public String toString() {
        String res = "";
        res += super.toString() + "\n\nBusiness"
                + "\nMovie: " + movie
                + "\nBook: " + book
                + "\nFood: " + food
                + "\nDrink: " + drink
                + "\nLuggage: " + luggage
                + "\n\n";

        if (services.isEmpty()) {
            res += "No Special Service is added.";
        } else {
            for (SpecialServices s : services) {
                res += "Services" + "\nService ID: " + s.getServiceID()
                        + "\nService Fee: " + s.getServiceFee()
                        + "\nService Duration: " + s.getDurationInDays();

                if (s instanceof HotelReservation) {
                    res += "\n" + ((HotelReservation) s).toString();
                } else if (s instanceof CityGuide) {
                    res += "\n" + ((CityGuide) s).toString();
                } else if (s instanceof RentCar) {
                    res += "\n" + ((RentCar) s).toString();
                }

            }
        }

        return res;
    }

}
