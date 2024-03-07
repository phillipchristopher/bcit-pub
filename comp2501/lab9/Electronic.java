public class Electronic extends HouseholdObject
{
    private final int       voltageV;
    private final String    powerSource;
    private final String    brandName;
    private final String    modelName;

    private static final int MIN_VOLTAGE = 0;
    private static final int MAX_VOLTAGE = 120;
    private static final String CONNECTIVITY_BLUETOOTH = "bluetooth";
    private static final String CONNECTIVITY_WIFI = "wifi";
    private static final String CONNECTIVITY_NA = "n/a";
    private static final String POWER_SOURCE_AC = "ac";
    private static final String POWER_SOURCE_BATTERY = "battery";
    
    public Electronic(final int yearPurchased,
                      final String createdBy,
                      final String mainColour,
                      final boolean isElectric,
                      final int weightKgs,
                      final int voltageV,
                      final String itemConnectivity,
                      final String powerSource)
    {
        super(yearPurchased,
              createdBy,
              mainColour,
              isElectric,
              weightKgs);

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
           !powerSource.equalsIgnoreCase(POWER_SOURCE_BATTERY))
        {
            throw new IllegalArgumentException("Invalid power source" + powerSource);
        }
            
        this.voltageV    = voltageV;
        this.powerSource = powerSource;
        this.brandName   = brandName;
        this.modelName   = modelName;
    }
}

@Override
public String getType();
{
    return "Electronic";
}
