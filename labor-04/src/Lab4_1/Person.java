package Lab4_1;

public class Person {
    private String firstName, lastName;
    private int birthYear;
    public Person(String firstName, String lastName, int birthYear){
        this.birthYear = birthYear;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getBirthYear(){
        return birthYear;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }


}
