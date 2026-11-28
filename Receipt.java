public class Receipt {

    private Order order;
    private Customer customer;
    private Checkout checkout;
    private String employeeName;


    public Receipt(Order order, Customer customer, Checkout checkout, String employeeName){
        this.order = order;
        this.customer = customer;
        this.checkout = checkout;
        this.employeeName = employeeName;
    }

    public void print(){
        System.out.println("---Mom and Pop's Pizzeria---");
        System.out.println("Order:\t#" + order.getOrderID());
        System.out.println("Name:\t" + customer.getName());
        System.out.println("Phone:\t" + customer.getPhone_number());
        System.out.println("Employee:\t" + this.employeeName);
        if(checkout.getFor_delivery()){
            System.out.println("Type:\tDelivery To:");
            System.out.println("Address:\t" + customer.getAddress());
        } else{
            System.out.println("Type:\tPickup");
        }

        System.out.println("Qty  Item");
        System.out.println("----------------------------");
        for(Item item : order.getItems()) {
            System.out.println(item.getQuantity() + " " + item.getName() + "\t$" + item.getPrice());
        }
        System.out.println("----------------------------");

        System.out.println("Total amount:\t$" + checkout.getTotalAmount());
        System.out.println("Transaction Type:\t" + checkout.getPayment_type());
        System.out.println("Amount Paid:\t$" + checkout.getAmountPaid());
        System.out.println("Change:\t$" + checkout.getChange());
        if(checkout.getIs_card()) {
            System.out.println("Signature:\t" + checkout.getSignature());
        }
        System.out.println("----------------------------");
    }
}
