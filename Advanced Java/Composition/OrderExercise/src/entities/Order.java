package OrderExercise.src.entities;

import OrderExercise.src.entities.enums.OrderStatusComp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatusComp status;
    private Customer customer;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {}
    public Order(Date moment, OrderStatusComp status, Customer customer) {
        this.moment = moment;
        this.status = status;
        this.customer = customer;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatusComp getStatus() {
        return status;
    }

    public void setStatus(OrderStatusComp status) {
        this.status = status;
    }

    public Customer getClient() {
        return customer;
    }

    public void setClient(Customer customer) {
        this.customer = customer;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total(){
        Double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }

        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + customer + "\n");
        sb.append("Order items:" + "\n");
        for (OrderItem item : items) {
            sb.append("\t" + item + "\n");
        }
        sb.append("Total price: $%.2f".formatted(total()) + "\n");

        return sb.toString();
    }
}
