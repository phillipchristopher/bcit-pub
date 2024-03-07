public class Computer extends Electronic
{
    private final int    memoryGb;
    private final int    storageCapactityGb;
    private final String operatingSystem;

    private static final int MIN_MEMORY_GB = 2;
    private static final int MAX_MEMORY_GB = 256;
    private static final String WINDOWS_OS = "windows";
    private static final String LINUX_OS = "linux";
    private static final String MAC_OS = "mac";

    public Computer(final int yearPurchased,
                    final String createdBy,
                    final String mainColor,
                    final boolean isElectric,
                    final int weightKgs,
                    final int voltageV,
                    final String powerSource,
                    final String brandName,
                    final String modelName,
                    final int memoryGb,
                    final int storageCapactityGb,
                    final String operatingSystem)
    {
        super(yearPurchased, createdBy, mainColor, isElectric, weightKgs, voltage, powerSource, brandName, modelName);
        
        if(memoeryGb < MIN_MEMORY_GB || memoryGb > MAX_MEMORY_GB)
        {
            throw new IllegalArgumentException("Invalid memory: " + memoryGb);
        }
        this.memoryGb                    = memoryGb;
        this.storageCapactityGb          = storageCapactityGb;
        this.operatingSystem             = operatingSystem;
    }

    @Override
    public String getType()
    {
        return "Computer";
    }
}
