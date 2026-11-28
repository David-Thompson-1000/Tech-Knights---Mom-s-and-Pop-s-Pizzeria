public class Side extends Menu_Item{
    // Inherits from Menu_Item
    public Side(int id, String name, float price) {
        this.menu_item_id = idCounter++;
        this.menu_item_name = name;
        this.price = price;
    }
}
