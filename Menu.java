import java.util.ArrayList;

public class Menu {
    public ArrayList<Menu_Item> items;

    public Menu() {
        this.items = new ArrayList<>();
    }

    public void add_item(Menu_Item item) {
        items.add(item);
    }

    public void remove_item(Menu_Item item) {
        items.remove(item);
    }

    public Menu_Item search_item(Menu_Item SearchItem) {
        for (Menu_Item item : items) {
            if (item.menu_item_name.equalsIgnoreCase(SearchItem.menu_item_name)) {
                return item;
            }
        }
        System.out.println("Item not found.");
        return null;
    }

}

