public class Speaker extends Electronic
{
    private final int wattage;
    private final String connectivityType;
    private final String type;

    public Speaker(final int yearPurchased, final String createdBy, final String mainColor, final boolean isElectric, final int weightKgs, final int voltage, final String powerSource, final String brandName, final String modelName, final int wattage, final String connectivityType, final String type)
    {
        super(yearPurchased, createdBy, mainColor, isElectric, weightKgs, voltage, powerSource, brandName, modelName);
        this.wattage          = wattage;
        this.connectivityType = connectivityType;
        this.type             = type;
    }
}
