package day_16.shop02;

import java.util.Scanner;

public class Shop {
    String  name, address;
    double countOfProduct, priceForProduct, shopBalance;

    public Shop(){

    }
    public Shop(String name, String  address, double countOfProduct, double priceForProduct,double shopBalance){
        this.name =name;
        this.address = address;
        this.countOfProduct = countOfProduct;
        this.priceForProduct = priceForProduct;
        this.shopBalance = shopBalance;
    }
    public boolean checkOrder(double orderCount) {
         return countOfProduct - orderCount >= 0;
    }
    public boolean finalApproval(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("if you want to buy it, Please press 1 , if you don’t want to buy it press any bottom");
        int input = scanner.nextInt();
        return input == 1;
    }
    public void rejection(){
        System.out.println("Now we don’t have so much product,sorry.");
    }
    public double calculateOrder(double orderCount){
        return priceForProduct * orderCount;
    }
    public void addToShopBalance(double revenue) {
        shopBalance += revenue;
    }
    public double insertCount(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert count of product_");
        return scanner.nextInt();
    }
    public void printReport(){
        System.out.println("--------------------------------");
        System.out.println("Balance of quantity " + countOfProduct);
        System.out.println("Balance of money " + shopBalance + "$");
    }
    public void printTotal(double countOfProduct){
        System.out.println("Total price of product" + calculateOrder(countOfProduct) + "$");
    }

}
