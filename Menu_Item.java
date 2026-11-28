public class Menu_Item {
    public static int idCounter = 0;
    public int menu_item_id;
    public String menu_item_name;
    public float price;


    public float update_price(float newPrice) {
        this.price = newPrice;
        return this.price;
    }

}
