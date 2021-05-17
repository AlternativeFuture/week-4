package day_16.employer01;

public class Main {
    public static void main(String[] args) {
        Employer employer1 = new Employer("Hovhannes",33,"Anitex", 400000);
        Employer employer2 = new Employer("Ara", 26, "ACA", 250000);
        employer1.printClassFields();
        System.out.println();
        employer2.printClassFields();

    }
}
