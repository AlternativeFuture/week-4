package day_18.itCompany;

public class SEO extends Marketing {

    public SEO(int countOfEmployers, String departmentName){
        super(departmentName,countOfEmployers);
    }
    public void marketing(){
        System.out.println("override marketing for SEO");
    }
}
