public class Address extends Employee{
    private String street;
    private int number;
    private String postal;

    public Address(){}

    public Address(String street, int number, String postal){
        this.street = street;
        this.number = number;
        this.postal = postal;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public String getPostal() {
        return postal;
    }

    public String getStreet() {
        return street;
    }
}