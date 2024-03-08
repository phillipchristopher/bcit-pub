public class Television extends Electronic
{
    private final double  screenSizeInches;
    private final String  resolution;
    private final int     refreshRateHz;
    private final boolean smartTv;

    private static final int MIN_SCREEN_SIZE_INCHES = 19;
    private static final int MAX_SCREEN_SIZE_INCHES = 300;
    private static final int MIN_REFRESH_RATE_HZ = 30;
    private static final int MAX_REFRESH_RATE_HZ = 600;
    private static final String FULL_HD = "1080p";
    private static final String ULTRA_HD = "4k";
    public Television(final int yearPurchased,
                      final String householdObjectName,
                      final String householdObjectBrand,
                      final String mainColour,
                      final boolean isElectric,
                      final int weightKgs,
                      final double priceCad,
                      final int voltageV,
                      final String itemConnectivity,
                      final String powerSource,
                      final double screenSizeInches,
                      final String resolution,
                      final int refreshRateHz,
                      final boolean smartTv)
    {
        super(yearPurchased, householdObjectName, householdObjectBrand, mainColour, isElectric, weightKgs, priceCad,
              voltageV, itemConnectivity, powerSource);

        if(screenSizeInches < MIN_SCREEN_SIZE_INCHES || screenSizeInches > MAX_SCREEN_SIZE_INCHES)
        {
            throw new IllegalArgumentException("Invalid screen size: " + screenSizeInches);
        }

        if(!resolution.equalsIgnoreCase(FULL_HD) &&
        !resolution.equalsIgnoreCase(ULTRA_HD))
        {
            throw new IllegalArgumentException("Invalid resolution: " + resolution);
        }

        if(refreshRateHz < MIN_REFRESH_RATE_HZ || refreshRateHz > MAX_REFRESH_RATE_HZ)
        {
            throw new IllegalArgumentException("Invalid refresh rate: " + refreshRateHz);
        }

        this.screenSizeInches = screenSizeInches;
        this.resolution       = resolution;
        this.refreshRateHz    = refreshRateHz;
        this.smartTv          = smartTv;
    }
}
