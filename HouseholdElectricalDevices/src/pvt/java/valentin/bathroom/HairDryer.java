package pvt.java.valentin.bathroom;

import pvt.java.valentin.ElectricalDevice;

public class HairDryer extends ElectricalDevice {
    public HairDryer(String name, int powerConsumption, boolean networkConnection, int monthlyUse, int ageOfDeviceInMonths, int priceInDollars, String placeOfUSe) {
        super(name, powerConsumption, networkConnection, monthlyUse, ageOfDeviceInMonths, priceInDollars, placeOfUSe);
    }
}
