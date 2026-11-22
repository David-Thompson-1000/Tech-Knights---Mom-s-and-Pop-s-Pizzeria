class Employee {

    public String name;
    public String address;
    public int age;
    public String timeOnStaff;
    public String accessLevel;
    public String notes;

    public void setName(String name){

        this.name = name;

    }

    public String getName(){

        return name;

    }

    public void setAddress(String address){

        this.address = address;

    }

    public String getAddress(){

        return address;

    }

    public void setAge (int age){

        this.age = age;

    }

    public int getAge(){

        return age;

    }

    public void setTimeOnStaff(String timeOnStaff){

        this.timeOnStaff = timeOnStaff;

    }

    public String getTimeOnStaff(){

        return timeOnStaff;

    }

    public void setAccessLevel(String accessLevel){

        this.accessLevel = accessLevel;

    }

    public String getAccessLevel(){

        return accessLevel;

    }

    public void setNotes(String notes){

        this.notes = notes;

    }

    public String getNotes(){

        return notes;

    }

}

class Customer{

    public String name;
    public String phoneNumber;
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

}

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

class cash extends Customer{

    //not really sure what to put here.

}