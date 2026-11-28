class User {

    public String name;
    public String username;
    public String password;
    public int userID;
    public boolean signedIn;


    public void setName(String name){this.name = name;}

    public String getName(){return name;}

    public void setUsername(String Username){this.username = username;}

    public String getUsername(){return username;}

    public void setPassword(String password){this.password = password;} //can also be used for updating a password

    public String getPassword(){return password;}

    public void setUserID(int userID){this.userID = userID;}

    public void logout(){signedIn = false;}

    public void add_customer(Customer customer){customer = new Customer();}

    public void create_order(Order order){order = new Order();}

    public void edit_order(Order order){
        //needs to be filled with order properties edit commands}
    }

    public void checkout(Order order){
        //need a point of reference to make this
    }

}

class Employee extends User{}

class Manager extends User{

    public void update_customer(Customer customer,String cName, String cPhoneNumber, String cAddress, String cPaymentType){

        customer.setName(cName);
        customer.setPhoneNumber(cPhoneNumber);
        customer.setAddress(cAddress);
        customer.setPaymentType(cPaymentType);

    }

    public void deleteCustomer(Customer customer){

        customer = null;

    }

    public void add_employee(String eName, int eUserID, String ePassword, String eUserName) {

        Employee employee = new Employee();
        employee.setName(eName);
        employee.setUsername(eUserName);
        employee.setPassword(ePassword);
        employee.setUserID(eUserID);

    }

    public void viewSales(){

        //need the sales code to make this work.

    };

}

/*
class Customer{

    public String name;
    public String phoneNumber; //I didn't put this in as an int due to the dashes, parentheses, and spaces.
    public String address;
    public String paymentType;

    public void setName(String name){this.name = name;}

    public String getName(){return name;}

    public void setPhoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;}

    public String getPhoneNumber(){return phoneNumber;}

    public void setAddress(String address){this.address = address;}

    public String getAddress(){return address;}

    public void setPaymentType(String paymentType){this.paymentType = paymentType;}

    public String getPaymentType(){return paymentType;}

} */

class card extends Customer{

    public String cardNumber; //I made it a string because of the spaces.
    public String cardMonthAndYear;
    public int CVV;
    public int zipCode;

    public void setCardNumber(String cardNumber){this.cardNumber = cardNumber;}

    public String getCardNumber(){return cardNumber;}

    public void setCardMonthAndYear(String cardMonthAndYear){this.cardMonthAndYear = cardMonthAndYear;}

    public String getCardMonthAndYear(){return cardMonthAndYear;}

    public void setCVV(int CVV){this.CVV = CVV;}

    public int getCVV(){return CVV;}

    public void setZipCode(int zipCode){this.zipCode= zipCode;}

    public int getZipCode(){return zipCode;}

}

