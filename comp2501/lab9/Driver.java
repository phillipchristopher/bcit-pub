class driver{
  public static void main(final String[] args){
    HouseholdObjectCollection houseInventory; 
    houseInventory = new HouseholdObjectCollection();

    Computer computer1;
    Computer computer2;
    Dishwasher dishwasher1;
    Speaker livingRoomSpeakers;
    Speaker officeSpeakers;
    Television livingRoomTv;
    Sofa livingRoomSofa;
    
    computer1 = new Computer();
    computer2 = new Computer();
    dishwasher1 = new Dishwasher();
    livingRoomSpeakers = new Speaker();
    officeSpeakers = new Speaker();
    livingRoomTv = new Television();
    livingRoomSofa = new Sofa();

    houseInventory.addItem(computer1);
    houseInventory.addItem(computer2);
    houseInventory.addItem(dishwasher1);
    houseInventory.addItem(livingRoomSpeakers);
    houseInventory.addItem(officeSpeakers);
    houseInventory.addItem(livingRoomTv);
    houseInventory.addItem(livingRoomSofa);

    houseInventory.displayItems;
    System.out.println("Number of items: " + houseInventory.getNumberOfItems());
  }
}
