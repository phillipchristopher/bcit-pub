public class Electronic extends HouseholdObject
{
    private final int    voltageV;
    private final String itemConnectivity;
    private final String powerSource;

    private static final int    MIN_VOLTAGE            = 0;
    private static final int    MAX_VOLTAGE            = 120;
    private static final String CONNECTIVITY_BLUETOOTH = "bluetooth";
    private static final String CONNECTIVITY_WIFI      = "wifi";
    private static final String CONNECTIVITY_NA        = "n/a";
    private static final String POWER_SOURCE_AC        = "ac";
    private static final String POWER_SOURCE_BATTERY   = "battery";
    private static final String POWER_SOURCE_OTHER     = "other";

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

    public int getVoltageV()
    {
        return voltageV;
    }

    public String getItemConnectivity()
    {
        return itemConnectivity;
    }

    public String getPowerSource()
    {
        return powerSource;
    }
}