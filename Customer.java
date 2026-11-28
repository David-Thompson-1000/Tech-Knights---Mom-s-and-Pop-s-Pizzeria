public class Customer {

    private int Phone_number;
    private String Name;
    private String Address;

    public Customer(int Phone_number, String Name, String Address){
        this.Phone_number = Phone_number;
        this.Name = Name;
        this.Address = Address;
    }

    public int getPhone_number() {
        return Phone_number;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }
}
