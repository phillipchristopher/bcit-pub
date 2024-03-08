/**
* HouseholdObject class
* @author Chris Helmhold
* @version 1.0
*/

public class HouseholdObject
{
    private final int       yearPurchased;
    private final String    householdObjectName;
    private final String    householdObjectBrand;
    private final String    mainColour;
    private final boolean   isElectric;
    private final int       weightKgs;
    private final double    priceCad;

    private static final int MIN_YEAR_PURCHASED = 1900;
    private static final int MAX_YEAR_PURCHASED = 2100;
    private static final int MIN_WEIGHT_KG = 0;
    private static final int MAX_WEIGHT_KG = 10000;
    private static final double MIN_PRICE_CAD = 0.0;
    private static final double MAX_PRICE_CAD = 10000000.0;
    
    /**
     * Constructor for the HouseholdObject class.
     * @param yearPurchased The year the household object was purchased.
     * @param householdObjectName The name of the household object.
     * @param householdObjectBrand The brand of the household object.
     * @param mainColour The main colour of the household object.
     * @param isElectric Whether the household object is electric.
     * @param weightKgs The weight of the household object in kilograms.
     * @param priceCad The price of the household object in Canadian dollars.
     */
    public HouseholdObject(final int yearPurchased,
                           final String householdObjectName,
                           final String householdObjectBrand,
                           final String mainColour,
                           final boolean isElectric,
                           final int weightKgs,
                           final double priceCad)
    {
        if(yearPurchased < MIN_YEAR_PURCHASED || yearPurchased > MAX_YEAR_PURCHASED)
        {
          throw new IllegalArguumentException("Year purchased must be between " + MIN_YEAR_PURCHASED + " and " + MAX_YEAR_PURCHASED);
        }
        if(weightKgs < MIN_WEIGHT_KG || weightKgs > MAX_WEIGHT_KG)
        {
          throw new IllegalArguumentException("Weight must be between " + MIN_WEIGHT_KG + " and " + MAX_WEIGHT_KG);
        }

        if(priceCad < MIN_PRICE_CAD || priceCad > MAX_PRICE_CAD)
        {
          throw new IllegalArguumentException("Price must be between " + MIN_PRICE_CAD + " and " + MAX_PRICE_CAD);
        }
        
        this.yearPurchased = yearPurchased;
        this.householdObjectName = householdObjectName;
        this.householdObjectBrand = householdObjectBrand;
        this.mainColour     = mainColour;
        this.isElectric    = isElectric;
        this.weightKgs     = weightKgs;
        this.priceCad      = priceCad;
    }

    /**
    * Getter for the purchase year.
    * @return The year the household object was purchased.
    */
    public int getYearPurchased()
    {
        return yearPurchased;
    }

    /**
    * Getter for the name of the household object.
    * @return The name of the household object.
    */
    public String getHouseholdObjectName()
    {
        return householdObjectName;
    }

    /**
    * Getter for the brand of the household object.
    * @return The brand of the household object.
    */
    public String getHouseholdObjectBrand()
    {
        return householdObjectBrand;
    }

    /**
    * Getter for the main colour of the household object.
    * @return The main colour of the household object.
    */
    public String getMainColour()
    {
        return mainColour;
    }

    /**
    * Getter for whether the household object is electric.
    * @return True if electric, false otherwise.
    */
    public boolean isElectric()
    {
        return isElectric;
    }

    /**
    * Getter for the weight of the household object in kilograms.
    * @return The weight of the household object in kilograms.
    */
    public int getWeightKgs()
    {
        return weightKgs;
    }

    /**
    * Getter for the price of the household object in Canadian dollars.
    * @return The price of the household object in Canadian dollars.
    */
    public double getPriceCad()
    {
        return priceCad;
    }
}
