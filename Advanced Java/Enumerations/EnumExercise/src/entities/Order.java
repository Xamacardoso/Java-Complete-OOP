package EnumExercise.src.entities;

import EnumExercise.src.entities.enums.OrderStatusEnum;

import java.util.Date;

public class Order {
    private Integer id;
    private Date moment;
    private OrderStatusEnum orderStatus;

    public Order(){

    }

    public Order(Integer id, Date moment, OrderStatusEnum orderStatus) {
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

    public OrderStatusEnum getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatusEnum orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String toString(){
        return "Order [id = %d, moment = %s, orderStatus = %s]".formatted(id, moment, orderStatus);
    }
}
