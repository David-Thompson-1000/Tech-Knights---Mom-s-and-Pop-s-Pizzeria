import java.util.ArrayList;

public class Pizza extends Menu_Item{
    public ArrayList<Topping> toppings;
    public int size;
    public String sauce_type;
    public String crust_type;

    public Pizza(int id, String name, float price, int size, String sauce, String crust) {
        this.menu_item_id = idCounter++;
        this.menu_item_name = name;
        this.price = price;
        this.size = size;
        this.sauce_type = sauce;
        this.crust_type = crust;
        this.toppings = new ArrayList<>();
    }

    public void add_topping(Topping topping) {
        toppings.add(topping);
    }

    public void remove_topping(Topping topping) {
        toppings.remove(topping);
    }
}
