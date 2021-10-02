public class Employee {
    private String name;
    private int hours;
    private double rate;
    private Address[] address = new Address[6];

    public Employee(){}

    public Employee(String name, int hours, double rate){
        this.name = name;
        this.hours = hours;
        this.rate = rate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void addAddress(Address newAddress, int index) {
        this.address[index] = newAddress;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public double getRate() {
        return rate;
    }

    public Address getAdress(int index) {
        return address[index];
    }

    public void display(){
        System.out.println(name);
        System.out.println(hours);
        System.out.println(rate);

        int length = 0;

        while (length < 6){
            length++;
            if (address[length] != null){
                break;
            }
        }

        System.out.println("");

        for (int i = 0; i <= length; i++) {
            System.out.println("Address "+i+":");
            System.out.println(this.getAdress(i).getStreet()+" "+this.address[i].getNumber());
            System.out.println(this.getAdress(i).getPostal());
            System.out.println("");

        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Faleao");
        employee.setHours(40);
        employee.setRate(15.50);

        Address address1 = new Address();
        address1.setStreet("Queen");
        address1.setNumber(48);
        address1.setPostal("K1P1N2");

        Address address2 = new  Address();
        address2.setStreet("King Edward");
        address2.setNumber(800);
        address2.setPostal("K1N6N5");

        employee.addAddress(address1, 0);
        employee.addAddress(address2, 1);

        employee.display();
    }    
}