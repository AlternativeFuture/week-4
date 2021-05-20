package day_18.itCompany;

public class SMM extends Marketing {

    public SMM(int countOfEmployers,String departmentName){
        super(departmentName,countOfEmployers);
    }
    @Override
    public void marketing(){
        System.out.println("override marketing for SMM");
    }


}
