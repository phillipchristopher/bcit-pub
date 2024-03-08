/**
* Furniture class
* @author Chris Helmhold
* @version 1.0
*/

public class Furniture extends HouseholdObject
{
    private final boolean isAssemblyRequired;
    private final String  frameMaterial;

    private static final String FRAME_WOOD  = "wood";
    private static final String FRAME_METAL = "metal";
    private static final String FRAME_OTHER = "other";

    /**
    * Constructor for the Furniture class.
    * @param yearPurchased The year the furniture was purchased.
    * @param householdObjectName The name of the furniture.
    * @param householdObjectBrand The brand of the furniture.
    * @param mainColour The main colour of the furniture.
    * @param isElectric Whether the furniture is electric.
    * @param weightKgs The weight of the furniture in kilograms.
    * @param priceCad The price of the furniture in Canadian dollars.
    * @param isAssemblyRequired Whether the furniture requires assembly.
    * @param frameMaterial The frame material of the furniture.
    */
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

    /**
    * Getter for assembly required.
    * @return True if assembly is required, false otherwise.
    */
    public boolean isAssemblyRequired()
    {
        return isAssemblyRequired;
    }

    /**
    * Getter for frame material.
    * @return The frame material of the furniture.
    */
    public String getFrameMaterial()
    {
        return frameMaterial;
    }
}
