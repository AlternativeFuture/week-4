package day_18.itCompany;

public class FinancialAccount extends TaxAccounting {

    public FinancialAccount(int countOfEmployers, String departmentName) {
        super(countOfEmployers, departmentName);
    }

    @Override
    public void account() {
        super.account();
        System.out.println("salryOfEployeers");
    }
}
