package model;

import java.sql.Date;

public class order {
    private int orderId;
    private int customerId;
    private Date orderDate;

    public order(int orderId, int customerId, Date orderDate) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderDate = orderDate;
    }

    public order(int customerId) {
        this.customerId = customerId;
    }

    public int getOrderId() { return orderId; }
    public int getCustomerId() { return customerId; }
    public Date getOrderDate() { return orderDate; }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Customer ID: " + customerId + ", Date: " + orderDate;
    }
}
