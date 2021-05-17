package day_16.employer01;

public class Employer {
    String name;
    int age;
    String workSpace;
    int salary;

    public Employer() {
    }

    public Employer(String name, int age, String workSpace, int salary) {
        this.name = name;
        this.age = age;
        this.workSpace = workSpace;
        this.salary = salary;
    }
    void printClassFields(){
        System.out.println("Name _ " + name);
        System.out.println("Age _ " + age);
        System.out.println("WorkSpace _ " + workSpace);
        System.out.println("Salary _ " + salary);
    }
}
