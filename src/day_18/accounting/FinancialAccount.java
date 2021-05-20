package day_18.accounting;

public class FinancialAccount extends TaxAccounting {


    public FinancialAccount(int countOfEmployers, String departmentName) {
        super(countOfEmployers, departmentName);
    }
    @Override
    public void account() {
        System.out.println("salryOfEployeers");
    }
}
