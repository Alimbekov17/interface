package task17;

public abstract class Person implements Payable, Livable{
    private String fullName;
    private int age;
    private String gender;

    public Person() {
    }

    public Person(String fullName, int age, String gender) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person: " +
                "\nFull name: " + fullName +
                "\nage      : " + age +
                "\ngender   : " + gender;
    }
    public abstract void getPropertyInfo(Person[] array);
}
