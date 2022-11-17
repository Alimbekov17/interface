package task18;

public class Main {
    public static void main(String[] args) {
        Person apartment = new Apartment("Bishkek, Djal");
        Person hotel = new Hotel();
        Person dorm = new Dorm();

        Person[] family = {
                new Apartment("Max", 25, "male"),
                new Apartment("Jane", 20, "female"),
                new Apartment("John", 50, "male"),
                new Apartment("Anna", 48, "female")
        };
        System.out.println("Apartment residents: ");
        apartment.getPropertyInfo(family);
        apartment.living(family.length);
        apartment.payUtilities(10000);
        System.out.println();

        Person[] hotelResidents = {
                new Hotel("Ricky", 15, "male"),
                new Hotel("Nicky", 20, "female")
        };
        System.out.println("Hotel guests: ");
        hotel.getPropertyInfo(hotelResidents);
        hotel.living(hotelResidents.length);
        hotel.payRent(2500);
        System.out.println();

        Person[] dormResidents = {
                new Dorm("Jenny",20,"female"),
                new Dorm("Selena", 21, "female"),
                new Dorm("David", 20, "male")
        };
        System.out.println("Dorm residents: ");
        dorm.getPropertyInfo(dormResidents);
        dorm.living(dormResidents.length);
        dorm.payRent(12000);
        System.out.println();

    }
}
