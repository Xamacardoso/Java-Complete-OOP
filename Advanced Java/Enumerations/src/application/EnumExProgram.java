package application;

import entities.OrderEnumEx;
import entities.enums.OrderStatusEnumEx;

import java.util.Date;

public class EnumExProgram {
    public static void main(String[] args) {
        OrderEnumEx order = new OrderEnumEx(1000, new Date(), OrderStatusEnumEx.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatusEnumEx os2 = OrderStatusEnumEx.DELIVERED;

        // Transforming a string to a enum instance
        OrderStatusEnumEx os1 = OrderStatusEnumEx.valueOf("DELIVERED");
    }
}
