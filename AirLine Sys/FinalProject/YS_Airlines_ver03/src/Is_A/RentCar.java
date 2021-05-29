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
public class RentCar extends SpecialServices {

    private String carModel;

    public RentCar(String serviceID, String durationInDays,
            String carModel) {
        super(serviceID, durationInDays);
        this.carModel = carModel;
    }

    public void calcFee() {

        double fee = 0;

        if (carModel.equalsIgnoreCase("Rolls Royce")) {
            fee = getDurationInDays() * 999.99;
        } else if (carModel.equalsIgnoreCase("Mercedes")) {
            fee = getDurationInDays() * 899.99;
        } else if (carModel.equalsIgnoreCase("Bentley")) {
            fee = getDurationInDays() * 799.99;
        } else if (carModel.equalsIgnoreCase("Porsche")) {
            fee = getDurationInDays() * 699.99;
        } else if (carModel.equalsIgnoreCase("Tesla")) {
            fee = getDurationInDays() * 599.99;
        }

        setServiceFee(fee);

    }

    public String getCarModel() {
        return carModel;
    }

    @Override
    public String toString() {
        return "Rent Car" + "\nCar Model: " + carModel + '\n';
    }

}
