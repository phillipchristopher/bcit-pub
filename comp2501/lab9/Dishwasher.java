public class Dishwasher extends Electronic
{
    private final int numberOfCycles;
    private final int    decibelRating;

    private static final int MIN_NUM_CYCLES = 1;
    private static final int MAX_NUM_CYCLES = 50;
    private static final int MIN_DECIBEL_RATING = 0;
    private static final int MAX_DECIBEL_RATING = 120;

    public Dishwasher(final int yearPurchased,
                      final String householdObjectName,
                      final String householdObjectBrand,
                      final String mainColour,
                      final boolean isElectric,
                      final int weightKgs,
                      final double priceCad, // should this change to purchasePriceCad???? --> revisit
                      final int voltageV,
                      final String itemConnectivity,
                      final String powerSource,
                      final int numberOfCycles,
                      final int decibelRating)

    {
        super(yearPurchased, householdObjectName, householdObjectBrand, mainColour, isElectric, weightKgs, priceCad, voltageV, itemConnectivity, powerSource);

        if(decibelRating < MIN_DECIBEL_RATING || decibelRating > MAX_DECIBEL_RATING)
        {
            throw new IllegalArgumentException("Invalid decibel rating: " + decibelRating);
        }

        if(numberOfCycles < MIN_NUM_CYCLES || numberOfCycles > MAX_NUM_CYCLES)
        {
            throw new IllegalArgumentException("Invalid number of cycles: " + numberOfCycles);
        }

        this.numberOfCycles    = numberOfCycles;
        this.decibelRating = decibelRating;
    }
}