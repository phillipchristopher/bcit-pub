public class Dishwasher extends Electronic
{
    private final String cycleTypes;
    private final int    decibalRating;

    private static final String NORMAL_CYCLE = "normal";
    private static final String HEAVY_DUTY_CYCLE = "heavy duty";
    private static final String ECO_CYCLE = "eco";

    private static final int MIN_DECIBAL_RATING = 0;
    private static final int MAX_DECIBAL_RATING = 120;

    public Dishwasher(final int yearPurchased,
                      final String householdObjectName,
                      final String householdObjectBrand,
                      final String mainColour;
                      final boolean isElectric,
                      final int weightKgs,
                      final double priceCad, // should this change to purchasePriceCad???? --> revisit
                      final int voltageV,
                      final String itemConnectivity;
                      final String powerSource,
                      final String cycleTypes,
                      final int decibalRating)
    {
        super(yearPurchased, createdBy, mainColor, isElectric, weightKgs, voltage, powerSource, brandName, modelName);
        
        if(decibalRating < MIN_DECIBAL_RATING || decibalRating > MAX_DECIBAL_RATING)
        {
            throw new IllegalArgumentException("Invalid decibal rating: " + decibalRating);
        }

        
        this.cycleTypes    = cycleTypes;
        this.decibalRating = decibalRating;
    }
}
