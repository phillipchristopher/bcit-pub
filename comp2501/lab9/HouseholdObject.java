public class HouseholdObject
{
    private final int       yearPurchased;
    private final String    householdObjectName;
    private final String    householdObjectBrand;
    private final String    mainColour;
    private final boolean   isElectric;
    private final int       weightKgs;
    private final double    priceCad;

    /**
     * Constructor
     */
    public HouseholdObject(final int yearPurchased,
                           final String householdObjectName,
                           final String householdObjectBrand,
                           final String mainColour,
                           final boolean isElectric,
                           final int weightKgs,
                           final double priceCad)
    {
        this.yearPurchased = yearPurchased;
        this.householdObjectName     = householdObjectName;
        this.householdObjectBrand     = householdObjectBrand;
        this.mainColour     = mainColour;
        this.isElectric    = isElectric;
        this.weightKgs     = weightKgs;
        this.priceCad      = priceCad;
    }

    public int getYearPurchased()
    {
        return yearPurchased;
    }

    public String getHouseholdObjectName()
    {
        return householdObjectName;
    }

    public String getHouseholdObjectBrand()
    {
        return householdObjectBrand;
    }

    public String getMainColour()
    {
        return mainColour;
    }

    public boolean isElectric()
    {
        return isElectric;
    }

    public int getWeightKgs()
    {
        return weightKgs;
    }

    public double getPriceCad()
    {
        return priceCad;
    }
}