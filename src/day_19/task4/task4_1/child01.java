package day_19.task4.task4_1;

import day_19.task4.Abstract;

public class child01 extends Abstract {
    public child01(double num) {
        this.number = (int)num;
    }

    public child01(int num) {
    super(num);
    }

    @Override
    protected void abstractX() {

    }


    public static void main(String[] args) {
        child01 child01 = new child01(67);
        child01.number=80;
    }
}

