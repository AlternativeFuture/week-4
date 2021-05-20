package day_18.itCompany;

public class Accounting extends ItCompany {
    String departmentName;

    public Accounting(int countOfEmployers, String departmentName) {
        super(countOfEmployers);
        this.departmentName = departmentName;
    }

    public void account(){
        System.out.println("account");
    }
}
