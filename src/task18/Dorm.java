package task18;

public class Dorm extends Person{
    public Dorm() {
    }

    public Dorm(String fullName, int age, String gender) {
        super(fullName, age, gender);
    }

    @Override
    public void living(int quantity) {
        System.out.println("In the dormitory live " + quantity + " people");
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void getPropertyInfo(Person[] residents) {
        for (Person person:residents) {
            System.out.println(person);
        }
    }

    @Override
    public void payRent(int price) {
        System.out.println("Rent of dorm per month per person: " + price);
    }

    @Override
    public void payUtilities(int amount) {

    }
}
