public class HouseholdObject
{
    private final int       yearPurchased;
    private final String    createdBy;
    private final String    mainColor;
    private final boolean   isElectric;
    private final int       weightKgs;

    public HouseholdObject(final int yearPurchased,
                           final String createdBy,
                           final String mainColor,
                           final boolean isElectric,
                           final int weightKgs)
    {
        this.yearPurchased = yearPurchased;
        this.createdBy     = createdBy;
        this.mainColor     = mainColor;
        this.isElectric    = isElectric;
        this.weightKgs     = weightKgs;
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
