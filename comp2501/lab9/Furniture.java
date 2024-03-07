public class Furniture extends HouseholdObject {
  private final boolean isAssemblyRequired;
  private final String frameMaterial;

  private static final String FRAME_WOOD = "wood";
  private static final String FRAME_METAL = "metal";
  private static final String FRAME_OTHER = "other";

  public Furniture(final String homeObjectName,
    final String homeObjectBrand,
    final double priceCad,
    final String mainColour,
    final boolean isAssemblyRequired,
    final String frameMaterial) {
    super(homeObjectName, homeObjectBrand, priceCad, mainColour)
  }

  if (frameMaterial != null &&
    (!frameMaterial.equalsIgnoreCase(FRAME_WOOD) &&
      !frameMaterial.equalsIgnoreCase(FRAME_METAL) &&
      !frameMaterial.equalsIgnoreCase(FRAME_OTHER))) 
  {
    throw new IllegalArgumentException("Invalid frame material" + frameMaterial);
  }
  this.isAssemblyRequired = isAssemblyRequired;
  this.frameMaterial = frameMaterial;

@Override
public String getType() {
  return "Furniture";
}

}


