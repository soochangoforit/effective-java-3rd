package code.item01;

public enum OrderStatus {

    ORDERED("주문됨"),
    PAYED("결제됨"),
    DELIVERED("배송됨"),
    RECEIVED("받음");

    private final String status;

    OrderStatus(String status) {
        this.status = status;
    }
}
