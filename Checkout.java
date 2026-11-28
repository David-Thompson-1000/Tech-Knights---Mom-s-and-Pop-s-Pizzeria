public class Checkout {

    private String payment_type;
    private boolean is_card;
    private boolean requires_signature;
    private boolean for_delivery;
    private String signature;
    private float totalAmount;
    private float amountPaid;
    private float change;

    public Checkout(String paymentType, boolean is_card, boolean requires_signature, boolean for_delivery, float totalAmount){
        this.payment_type = paymentType;
        this.is_card = is_card;
        this.requires_signature = requires_signature;
        this.for_delivery = for_delivery;
        this.totalAmount = totalAmount;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public boolean getIs_card() {
        return is_card;
    }

    public boolean getRequires_signature() {
        return requires_signature;
    }

    public boolean getFor_delivery() {
       return this.for_delivery;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public float getAmountPaid() {
        return amountPaid;
    }

    public float getChange() {
        return change;
    }

    public void capture_signature(String signature){
       if(is_card){
           this.signature = signature;
       }
    }

    public String getSignature() {
        return signature;
    }

    public float process_payment(float amountPaid){

        this.amountPaid = amountPaid;

        if(this.amountPaid >= totalAmount){
            this.change = this.amountPaid - this.totalAmount;
            System.out.println("Payment Complete");
            return 0;
        }
        else{
            this.change = 0;
            System.out.println("Insufficient Payment");
            return this.totalAmount - this.amountPaid;
        }
    }
}
