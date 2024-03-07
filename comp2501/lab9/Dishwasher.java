public class Dishwasher extends Electronic
{
    private final String cycleTypes;
    private final int    decibalRating;

    public Dishwasher(final int yearPurchased,
                      final String createdBy,
                      final String mainColor,
                      final boolean isElectric,
                      final int weightKgs,
                      final int voltage,
                      final String powerSource,
                      final String brandName,
                      final String modelName,
                      final String cycleTypes,
                      final int decibalRating)
    {
        super(yearPurchased, createdBy, mainColor, isElectric, weightKgs, voltage, powerSource, brandName, modelName);
        this.cycleTypes    = cycleTypes;
        this.decibalRating = decibalRating;
    }
}
