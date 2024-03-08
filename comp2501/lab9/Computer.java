public class Computer extends Electronic
{
    private final int    memoryGb;
    private final int    storageCapacityGb;
    private final String operatingSystem;

    private static final int MIN_MEMORY_GB = 2;
    private static final int MAX_MEMORY_GB = 256;
    private static final String WINDOWS_OS = "windows";
    private static final String LINUX_OS = "linux";
    private static final String MAC_OS = "mac";

    public Computer(final int yearPurchased,
                    final String householdObjectName,
                    final String householdObjectBrand,
                    final String mainColor,
                    final boolean isElectric,
                    final int weightKgs,
                    final double priceCad,
                    final int voltageV,
                    final String itemConnectivity,
                    final String powerSource,
                    final int memoryGb,
                    final int storageCapacityGb,
                    final String operatingSystem)
    {
        super(yearPurchased, householdObjectName, householdObjectBrand, mainColor, isElectric, weightKgs, priceCad, voltageV, itemConnectivity, powerSource);

        if(memoryGb < MIN_MEMORY_GB || memoryGb > MAX_MEMORY_GB)
        {
            throw new IllegalArgumentException("Invalid memory: " + memoryGb);
        }
        this.memoryGb                    = memoryGb;
        this.storageCapacityGb          = storageCapacityGb;
        this.operatingSystem             = operatingSystem;
    }

    public int getMemoryGb()
    {
        return memoryGb;
    }

    public int getStorageCapacityGb()
    {
        return storageCapacityGb;
    }

    public String getOperatingSystem()
    {
        return operatingSystem;
    }

    @Override
    public String toString()
    {
        return "Computer{" +
                "memoryGb=" + memoryGb +
                ", storageCapacityGb=" + storageCapacityGb +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}