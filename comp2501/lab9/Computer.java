public class Computer extends Electronic
{
    private final int    ramGigabytes;
    private final int    hardDriveCapactityGigabytes;
    private final String operatingSystem;

    public Computer(final int yearPurchased,
                    final String createdBy,
                    final String mainColor,
                    final boolean isElectric,
                    final int weightKgs,
                    final int voltageV,
                    final String powerSource,
                    final String brandName,
                    final String modelName,
                    final int ramGigabytes,
                    final int hardDriveCapacityGigabytes,
                    final String operatingSystem)
    {
        super(yearPurchased, createdBy, mainColor, isElectric, weightKgs, voltage, powerSource, brandName, modelName);
        
        
        this.ramGigabytes                = ramGigabytes;
        this.hardDriveCapactityGigabytes = hardDriveCapacityGigabytes;
        this.operatingSystem             = operatingSystem;
    }
}
