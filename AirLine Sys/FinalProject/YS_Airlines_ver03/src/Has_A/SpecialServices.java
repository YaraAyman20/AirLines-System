/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Has_A;

/**
 *
 * @author User
 */
public class SpecialServices implements Comparable<SpecialServices> {

    private int serviceID;
    private int durationInDays;
    private double serviceFee;

    public SpecialServices(String serviceID, String durationInDays) {
        this.serviceID = Integer.parseInt(serviceID);
        this.durationInDays = Integer.parseInt(durationInDays);
    }

    public double getServiceFee() {
        return serviceFee;
    }

    public int getDurationInDays() {
        return durationInDays;
    }

    public void setDurationInDays(int durationInDays) {
        this.durationInDays = durationInDays;
    }

    public void setServiceFee(double serviceFee) {
        this.serviceFee = serviceFee;
    }

    public int getServiceID() {
        return serviceID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.serviceID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SpecialServices other = (SpecialServices) obj;
        if (this.serviceID != other.serviceID) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(SpecialServices t) {
        return serviceID - t.serviceID;
    }

    @Override
    public String toString() {
        return "\n\nSpecial Services"
                + "\nServiceID: " + serviceID
                + "\nDuration In Days: " + durationInDays
                + "\nService Fee: " + serviceFee + '\n';
    }

}
