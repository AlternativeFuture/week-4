package day_18.accounting;

public class TaxAccounting extends Accounting {
    public TaxAccounting(int countOfEmployers, String departmentName) {
        super(countOfEmployers, departmentName);
    }

    @Override
    public void account() {
        System.out.println("taxOfCompany");
    }
}

