package entities;

import entities.enums.OrderStatusComp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderComp {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatusComp status;
    private ClientComp client;
    private List<OrderItemComp> items = new ArrayList<>();

    public OrderComp() {}
    public OrderComp(Date moment, OrderStatusComp status) {
        this.moment = moment;
        this.status = status;
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

    public ClientComp getClient() {
        return client;
    }

    public void setClient(ClientComp client) {
        this.client = client;
    }

    public List<OrderItemComp> getItems() {
        return items;
    }

    public void addItem(OrderItemComp item) {
        items.add(item);
    }

    public void removeItem(OrderItemComp item) {
        items.remove(item);
    }

    public Double total(){
        Double sum = 0.0;
        for (OrderItemComp item : items) {
            sum += item.subTotal();
        }

        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client + "\n");
        sb.append("Order items:" + "\n");
        for (OrderItemComp item : items) {
            sb.append("\t" + item + "\n");
        }
        sb.append("Total price: $%.2f".formatted(total()) + "\n");

        return sb.toString();
    }
}
