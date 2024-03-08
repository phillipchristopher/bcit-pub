class Driver{
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

        computer1 = new Computer(2024, "Laptop", "Apple", "black", true, 3, 3000.00, 120, "n/a", "battery", 18, 512, "Mac");
        computer2 = new Computer(2016, "Chris PC", "Custom", "black", true, 10, 2200.00, 120, "n/a", "ac", 16, 4000, "Windows");
        dishwasher1 = new Dishwasher(2019, "Dishwasher", "Bosch", "silver", true, 20, 1200.99, 120, "n/a", "ac", 8, 70);
        livingRoomSpeakers = new Speaker(2023, "TV speakers", "Klipsch", "black", true, 15, 800.00, 120, "n/a", "other", 850, "floor");
        officeSpeakers = new Speaker(2017, "Office speakers", "Kanto", "blue", true, 8, 250.99, 120, "n/a", "ac", 120, "bookshelf");
        livingRoomTv = new Television(2018, "Living room TV", "Samsung", "black", true, 12, 1899.99, 120, "wifi", "ac", 55, "4k", 120, true);
        livingRoomSofa = new Sofa(2023, "Living room sofa", "Cindy Crawford", "grey", false, 70, 1799.99, false, "wood", "cloth");

        houseInventory.addItem(computer1);
        houseInventory.addItem(computer2);
        houseInventory.addItem(dishwasher1);
        houseInventory.addItem(livingRoomSpeakers);
        houseInventory.addItem(officeSpeakers);
        houseInventory.addItem(livingRoomTv);
        houseInventory.addItem(livingRoomSofa);

        houseInventory.displayItems();
        System.out.println("Number of items: " + houseInventory.getNumberOfItems());
    }
}