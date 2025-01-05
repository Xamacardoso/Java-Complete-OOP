package entities;

import entities.enums.OrderStatusEnumEx;

import java.util.Date;

public class OrderEnumEx {
    private Integer id;
    private Date moment;
    private OrderStatusEnumEx orderStatus;

    public OrderEnumEx(){

    }

    public OrderEnumEx(Integer id, Date moment, OrderStatusEnumEx orderStatus) {
        this.id = id;
        this.moment = moment;
        this.orderStatus = orderStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatusEnumEx getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatusEnumEx orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String toString(){
        return "Order [id = %d, moment = %s, orderStatus = %s]".formatted(id, moment, orderStatus);
    }
}
