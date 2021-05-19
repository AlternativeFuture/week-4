package day_17.person;

public class Person {
    private String firstName, lastName, passportId, sex, nationality;
    int age;

    public Person() {

    }

    public Person(String firstName, String lastName, String passportId, String sex, String nationality, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.sex = sex;
        this.nationality = nationality;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() > 3 && firstName.length() <= 15) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 6 && lastName.length() <= 20) {
            this.lastName = lastName;
        }
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        if (passportId.matches("^[A][N][0-9]{6}$")) {
            this.passportId = passportId;
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.compareToIgnoreCase("male") == 0  || sex.compareToIgnoreCase("female") == 0){
            this.sex = sex;
        }
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age<=99){
            this.age = age;
        }
    }

    public void display() {
        System.out.println("First name is " + firstName + "\nLast name is " + lastName + "\nID "
                           + passportId + "\nGender " + sex + "\nNationality " + nationality + "\nAge " + age);
    }
}
