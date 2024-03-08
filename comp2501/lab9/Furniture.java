public class Furniture extends HouseholdObject
{
    private final boolean isAssemblyRequired;
    private final String  frameMaterial;

    private static final String FRAME_WOOD  = "wood";
    private static final String FRAME_METAL = "metal";
    private static final String FRAME_OTHER = "other";

    public Furniture(final int yearPurchased,
                     final String householdObjectName,
                     final String householdObjectBrand,
                     final String mainColour,
                     final boolean isElectric,
                     final int weightKgs,
                     final double priceCad,
                     final boolean isAssemblyRequired,
                     final String frameMaterial)
    {
        super(yearPurchased, householdObjectName, householdObjectBrand, mainColour, isElectric, weightKgs, priceCad);

        if(frameMaterial != null &&
                (!frameMaterial.equalsIgnoreCase(FRAME_WOOD) &&
                        !frameMaterial.equalsIgnoreCase(FRAME_METAL) &&
                        !frameMaterial.equalsIgnoreCase(FRAME_OTHER)))

        {
            throw new IllegalArgumentException("Invalid frame material" + frameMaterial);
        }
        this.isAssemblyRequired = isAssemblyRequired;
        this.frameMaterial      = frameMaterial;
    }

    public boolean isAssemblyRequired()
    {
        return isAssemblyRequired;
    }

    public String getFrameMaterial()
    {
        return frameMaterial;
    }
}
