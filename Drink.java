public class Drink extends Menu_Item{
    public int size;

    public Drink(int id, String name, float price, int size) {
        this.menu_item_id = idCounter++;
        this.menu_item_name = name;
        this.price = price;
        this.size = size;
    }
}
