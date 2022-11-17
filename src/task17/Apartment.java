package task17;

public class Apartment extends Person{
    private String address;


    public Apartment(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Apartment(String fullName, int age, String gender) {
        super(fullName, age, gender);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void living(int quantity) {
        System.out.println("In the apartment live " + quantity + " people. Address: " + getAddress());
    }

    @Override
    public void payRent(int price) {
    }

    @Override
    public void payUtilities(int amount) {
        System.out.println("Total amount to pay for utilities per month: " + amount);
    }

    @Override
    public void getPropertyInfo(Person[] family) {
        for (Person person:family) {
            System.out.println(person);
        }
    }
}
