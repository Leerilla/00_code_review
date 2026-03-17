package com.aladdin.chap01;

public class Order {
    private String orderId;
    private String orderName;
    private int price;

    public Order() {
    }

    public Order(String orderId, String orderName, int price) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.price = price;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderName='" + orderName + '\'' +
                ", price=" + price +
                '}';
    }
}
