package day_18.itCompany;

public class Marketing extends ItCompany {
    String departmentName;

    public Marketing(String departmentName, int countOfEmployers) {
        super(countOfEmployers);
        this.departmentName=departmentName;
    }


    public void marketing(){
        System.out.println("marketing");

    }
}
