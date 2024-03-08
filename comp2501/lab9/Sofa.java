public class Sofa extends Furniture
{
    private final String upholsteryMaterial;

    private static final String LEATHER_UPHOLSTERY = "leather";
    private static final String CLOTH_UPHOLSTERY = "cloth";

    public Sofa(final int yearPurchased, final String householdObjectName, final String householdObjectBrand, final String mainColour, final boolean isElectric, final int weightKgs, final double priceCad, final boolean isAssemblyRequired, final String frameMaterial, final String upholstryMaterial)
    {
        super(yearPurchased, householdObjectName, householdObjectBrand, mainColour, isElectric, weightKgs, priceCad, isAssemblyRequired, frameMaterial);
        this.upholsteryMaterial = upholstryMaterial;
    }

    public String getUpholsteryMaterial()
    {
        return upholsteryMaterial;
    }
}
