import java.util.ArrayList;

public class Order {
    private int orderCounter = 0;
    public int order_id;
    public String date;
    public ArrayList<Menu_Item> items;

    public Order(String date) {
        this.order_id = orderCounter++;
        this.date = date;
        this.items = new ArrayList<>();
    }

    public void add_item(Menu_Item item) {
        items.add(item);
    }

    public void remove_item(Menu_Item item) {
        items.remove(item);
    }

    public float total_cost() {
        float total = 0.0f;
        for (Menu_Item item : items) {

            total += item.price;

            //Adding toppings cost as well if extra
            if (item instanceof Pizza) {
                Pizza pizza = (Pizza) item;
                if (pizza.toppings != null) {
                    for (Topping topping : pizza.toppings) {
                        total += topping.extra_cost;
                    }
                }
            }
        }

        return total;
    }
}
