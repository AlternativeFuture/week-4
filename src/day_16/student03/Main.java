package day_16.student03;

public class Main {
    public static void main(String[] args) {
        University university = new University("MIT", 0, 20, 30, 18);
        university.printInfo();
        university.admission();
        if (university.checkAge(university.inputAge())) {
            university.register();
            university.display();
        }
    }
}
