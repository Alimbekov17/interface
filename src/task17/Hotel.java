package task17;

public class Hotel extends Person{

    public Hotel() {
    }

    public Hotel(String fullName, int age, String gender) {
        super(fullName, age, gender);
    }

    @Override
    public void living(int quantity) {
        System.out.println("In the hotel live " + quantity + " people");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void getPropertyInfo(Person[] guests) {
        for (Person person:guests) {
            System.out.println(person);
        }
    }

    @Override
    public void payRent(int price) {
        System.out.println("Price of the hotel for 1 night: " + price);
    }

    @Override
    public void payUtilities(int amount) {

    }
}
