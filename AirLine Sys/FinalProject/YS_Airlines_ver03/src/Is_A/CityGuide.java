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
public class CityGuide extends SpecialServices{
    
    private String language;

    public CityGuide(String serviceID, String durationInDays, String language) {
        super(serviceID, durationInDays);
        this.language = language;
    }
    

    public void calcFee(){
        double fee;
        fee = getDurationInDays() * 449.99;
        setServiceFee(fee);
    }
    
    @Override
    public String toString() {
        return "City Guide" + "\nLanguage: " + language + '\n';
    }
    
    
    
}
