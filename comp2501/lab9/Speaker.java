class Speaker extends Electronic
{
    private final int    wattageWatts;
    private final String speakerType;

    private static final int    MIN_WATTS               = 50;
    private static final int    MAX_WATTS               = 10000;
    private static final String BOOKSHELF_SPEAKER_TYPE  = "bookshelf";
    private static final String FLOOR_SPEAKER_TYPE      = "floor";
    private static final String CEILING_SPEAKER_TYPE    = "ceiling";
    private static final String PORTABLE_SPEAKER_TYPE   = "portable";
    private static final String INVALID_WATTAGE_MESSAGE = "Invalid wattage: ";
    private static final String INVALID_TYPE_MESSAGE    = "Invalid speaker type: ";

    public Speaker(final int yearPurchased,
                   final String householdObjectName,
                   final String householdObjectBrand,
                   final String mainColour,
                   final boolean isElectric,
                   final int weightKgs,
                   final double priceCad,
                   final int voltageV,
                   final String itemConnectivity,
                   final String powerSource,
                   final int wattageWatts,
                   final String speakerType)
    {
        super(yearPurchased, householdObjectName, householdObjectBrand, mainColour, isElectric, weightKgs, priceCad,
              voltageV, itemConnectivity, powerSource);

        if(wattageWatts < MIN_WATTS || wattageWatts > MAX_WATTS)
        {
            throw new IllegalArgumentException(INVALID_WATTAGE_MESSAGE + wattageWatts);
        }

        if(!speakerType.equalsIgnoreCase(BOOKSHELF_SPEAKER_TYPE) &&
                !speakerType.equalsIgnoreCase(FLOOR_SPEAKER_TYPE) &&
                !speakerType.equalsIgnoreCase(CEILING_SPEAKER_TYPE) &&
                !speakerType.equalsIgnoreCase(PORTABLE_SPEAKER_TYPE)
        )
        {
            throw new IllegalArgumentException(INVALID_TYPE_MESSAGE + speakerType);
        }

        this.wattageWatts = wattageWatts;
        this.speakerType  = speakerType;
    }

    public int getWattageWatts()
    {
        return wattageWatts;
    }

    public String getSpeakerType()
    {
        return speakerType;
    }
}