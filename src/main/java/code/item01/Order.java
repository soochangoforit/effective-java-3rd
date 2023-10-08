package code.item01;

public class Order {

    private boolean prime;
    private boolean urgent;
    private Product product;

    private Order(boolean prime, boolean urgent, Product product) {
        this.prime = prime;
        this.urgent = urgent;
        this.product = product;
    }

    public static Order primeOrder(Product product) {
        return new Order(true, false, product);
    }

    public static Order urgentOrder(Product product) {
        return new Order(false, true, product);
    }

}
