public class HouseholdObject
{
    private final int       yearPurchased;
    private final String    householdObjectName;
    private final String    householdObjectBrand;
    private final String    mainColor;
    private final boolean   isElectric;
    private final int       weightKgs;
    private final double    priceCad;

    /**
    * Constructor
    */
    public HouseholdObject(final int yearPurchased,
                           final String householdObjectName,
                           final String householdObjectBrand,
                           final String mainColor,
                           final boolean isElectric,
                           final int weightKgs,
                           final double priceCad)
    {
        this.yearPurchased = yearPurchased;
        this.householdObjectName     = householdObjectName;
        this.householdObjectBrand     = householdObjectBrand;
        this.mainColor     = mainColor;
        this.isElectric    = isElectric;
        this.weightKgs     = weightKgs;
        this.priceCad      = priceCad;
    }

    public String getHomeObjectName()
    {
        return homeObjectName;
    }

    return String getType()
    {
        return "Household Object";
    }
    
    public int getYearPurchased()
    {
        return yearPurchased;
    }

    public String getCreatedBy()
    {
        return createdBy;
    }

    public String getMainColor()
    {
        return mainColor;
    }

    public boolean isElectric()
    {
        return isElectric;
    }

    public int getWeightKgs()
    {
        return weightKgs;
    }
}
