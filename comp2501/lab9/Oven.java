public class Oven extends Electronic
{
    private final int interiorCapacityCubicFeet;
    private final int maxTemperature;
    private final int minTemperature;

    public Oven(final int yearPurchased, final String householdObjectName, final String householdObjectBrand, final String mainColour, final boolean isElectric, final int weightKgs, final double priceCad, final int voltageV, final String itemConnectivity, final String powerSource, final int interiorCapacityCubicFeet, final int maxTemperature, final int minTemperature)
    {
        super(yearPurchased, householdObjectName, householdObjectBrand, mainColour, isElectric, weightKgs, priceCad, voltageV, itemConnectivity, powerSource);
        this.interiorCapacityCubicFeet = interiorCapacityCubicFeet;
        this.maxTemperature            = maxTemperature;
        this.minTemperature            = minTemperature;
    }
}
