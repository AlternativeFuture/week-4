package day_16.shop02;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("Firdus", "", 50, 500, 0);
        double countOfProduct = shop.insertCount();
        if (shop.checkOrder(countOfProduct)) {
            if (shop.finalApproval()) {
                shop.addToShopBalance(shop.calculateOrder(countOfProduct));
            }
        } else shop.rejection();
        shop.printTotal(countOfProduct);
        shop.printReport();


    }
}
