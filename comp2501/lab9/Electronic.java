/**
* Electronic class
* @author Chris Helmhold
* @version 1.0
*/

public class Electronic extends HouseholdObject
{
    private final int    voltageV;
    private final String itemConnectivity;
    private final String powerSource;

    private static final int    MIN_VOLTAGE            = 0;
    private static final int    MAX_VOLTAGE            = 250;
    private static final String CONNECTIVITY_BLUETOOTH = "bluetooth";
    private static final String CONNECTIVITY_WIFI      = "wifi";
    private static final String CONNECTIVITY_NA        = "n/a";
    private static final String POWER_SOURCE_AC        = "ac";
    private static final String POWER_SOURCE_BATTERY   = "battery";
    private static final String POWER_SOURCE_OTHER     = "other";

    /**
    * Constructor for the Electronic class.
    * @param yearPurchased The year the electronic was purchased.
    * @param householdObjectName The name of the electronic.
    * @param householdObjectBrand The brand of the electronic.
    * @param mainColour The main colour of the electronic.
    * @param isElectric Whether the electronic is electric.
    * @param weightKgs The weight of the electronic in kilograms.
    * @param priceCad The price of the electronic in Canadian dollars.
    * @param voltageV The voltage of the electronic in volts.
    * @param itemConnectivity The item connectivity of the electronic.
    * @param powerSource The power source of the electronic.
    */
    public Electronic(final int yearPurchased,
                      final String householdObjectName,
                      final String householdObjectBrand,
                      final String mainColour,
                      final boolean isElectric,
                      final int weightKgs,
                      final double priceCad,
                      final int voltageV,
                      final String itemConnectivity,
                      final String powerSource)
    {
        super(yearPurchased,
              householdObjectName,
              householdObjectBrand,
              mainColour,
              isElectric,
              weightKgs,
              priceCad);

        if(voltageV < MIN_VOLTAGE || voltageV > MAX_VOLTAGE)
        {
            throw new IllegalArgumentException("Invalid voltage: " + voltageV);
        }

        if(itemConnectivity != null &&
                !itemConnectivity.equalsIgnoreCase(CONNECTIVITY_BLUETOOTH) &&
                !itemConnectivity.equalsIgnoreCase(CONNECTIVITY_WIFI) &&
                !itemConnectivity.equalsIgnoreCase(CONNECTIVITY_NA))
        {
            throw new IllegalArgumentException("Invalid electronic connectivity: " + itemConnectivity);
        }

        if(powerSource != null &&
                !powerSource.equalsIgnoreCase(POWER_SOURCE_AC) &&
                !powerSource.equalsIgnoreCase(POWER_SOURCE_BATTERY) &&
                !powerSource.equalsIgnoreCase(POWER_SOURCE_OTHER))
        {
            throw new IllegalArgumentException("Invalid power source" + powerSource);
        }

        this.voltageV    = voltageV;
        this.itemConnectivity = itemConnectivity;
        this.powerSource = powerSource;
    }
    /**
    * Getter for the voltage of the electronic in volts.
    * @return The voltage of the electronic in volts.
    */
    public int getVoltageV()
    {
        return voltageV;
    }

    /**
    * Getter for the item connectivity of the electronic.
    * @return The item connectivity of the electronic.
    */
    public String getItemConnectivity()
    {
        return itemConnectivity;
    }

    /**
    * Getter for the power source of the electronic.
    * @return The power source of the electronic.
    */
    public String getPowerSource()
    {
        return powerSource;
    }
}
