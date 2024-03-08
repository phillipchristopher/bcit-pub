import java.util.List;
import java.util.ArrayList;

public class HouseholdObjectCollection{

    private List<HouseholdObject> items;

    public HouseholdObjectCollection()
    {
        items = new ArrayList<>();
    }

    public void addItem(final HouseholdObject item)
    {
        if(item == null)
        {
            throw new IllegalArgumentException("Item cannot be null");
        }
        items.add(item);
    }

    public void removeItem(final HouseholdObject item)
    {
        if (item == null || !items.contains(item))
        {
            throw new IllegalArgumentException("Invalid ");
        }
        items.remove(item);
    }

    public void displayItems()
    {
        for(final HouseholdObject item : items)
        {
            System.out.println("Household Object: " + item.getHouseholdObjectName() + " - " + item.getClass().getSimpleName());
        }
    }

    public int getNumberOfItems()
    {
        return items.size();
    }

}
