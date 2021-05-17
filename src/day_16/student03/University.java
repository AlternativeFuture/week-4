package day_16.student03;

import java.util.Scanner;

public class University {
    String name;
    int countOfStudents, maxCountOfStudents, maxAgeOfStudent, minAgeOfStudent;

    public University() {
    }

    public University(String name, int countOfStudents, int maxCountOfStudents, int maxAgeOfStudent,
                      int minAgeOfStudent) {
        this.name = name;
        this.countOfStudents = countOfStudents;
        this.maxCountOfStudents = maxCountOfStudents;
        this.maxAgeOfStudent = maxAgeOfStudent;
        this.minAgeOfStudent = minAgeOfStudent;
    }

    public void printInfo() {
        System.out.println("Name _ " + name);
        System.out.println("Count Of Students _ " + countOfStudents);
        System.out.println("Max Count Of Students _ " + maxCountOfStudents);
        System.out.println("Max Age Of Student _ " + maxAgeOfStudent);
        System.out.println("Min Age Of Student _ " + minAgeOfStudent);
        System.out.println("--------------------------------------");
    }
    public boolean checkAge(int age) {
        return age - minAgeOfStudent >= 0;
    }
    public int admission(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("“Applied Mathematics -- 1”\n“Computer science -- 2”\n_");
        return scanner.nextInt();
    }
    public int inputAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your age_");
        return scanner.nextInt();
    }
    public void register(){
        countOfStudents ++;
    }
    public void display(){
        System.out.println("Max Count Of Students _ " + countOfStudents);
    }
}
