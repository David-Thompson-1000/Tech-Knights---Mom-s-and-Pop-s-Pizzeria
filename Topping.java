public class Topping extends Menu_Item {
    private static int idCounter = 0;
    public String Category;
    public String topping_name;
    public float extra_cost;
    public int Topping_id;

    public Topping(String name, String category, float extraCost) {
        this.Topping_id = idCounter++;
        this.topping_name = name;
        this.Category = category;
        this.extra_cost = extraCost;
    }
}
