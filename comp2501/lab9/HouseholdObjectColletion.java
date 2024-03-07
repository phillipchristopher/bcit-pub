import java.util.List;
import java.util.ArrayList;

public class HouseholdObjectCollection{

  private List<HouseholdObjects> items;

  public HouseholdObjectCollection();
  {
    items = new ArrayList<>();
  }

  public void addItem(final HouseholdObject item)
  {
    items.add(item);
  }

  public void removeItem(final HouseholdObject item)
  {
    items.remove(item);
  }

  public void displayItems()
  {
    for(final HouseholdObject item : items)
      {
        System.out.println("Household Object: " + item.getHouseholdObjectName() + ", Household Object Type: " + item.getType());
      }
  }

  public int getNumberOfItems()
  {
    return items.size();
  }

}
