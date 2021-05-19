package day_17.store;

public class Store {
    int countOfWorkers;
    String name, phoneNumber;
    int[] arrayOfProductNumber;

    public Store() {

    }

    public Store(int countOfWorkers, String name, String phoneNumber, int[] arrayOfProductNumber) {
        this.countOfWorkers = countOfWorkers;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.arrayOfProductNumber = arrayOfProductNumber;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        if (countOfWorkers >= 2 && countOfWorkers <= 50) {
            this.countOfWorkers = countOfWorkers;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("^[0-9]{8}$"))
        this.phoneNumber = phoneNumber;
    }

    public int[] getArrayOfProductNumber() {
        return arrayOfProductNumber;
    }

    public void setArrayOfProductNumber(int[] arrayOfProductNumber) {
        this.arrayOfProductNumber = arrayOfProductNumber;
    }
}
