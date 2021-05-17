package day_16.student05;


public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("MIT", 25, 56);
        Student student2 = new Student("Harvard", 2, 60);
        Sort soort = new Sort();
        soort.sort(new int[]{student1.age, student2.age});
        soort.sort(new String[]{student1.name,student2.name});
        soort.sort(new double[]{student1.weight, student2.weight});
    }
}
