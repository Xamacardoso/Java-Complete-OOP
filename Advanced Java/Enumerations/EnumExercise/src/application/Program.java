package EnumExercise.src.application;

import EnumExercise.src.entities.Order;
import EnumExercise.src.entities.enums.OrderStatusEnum;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(1000, new Date(), OrderStatusEnum.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatusEnum os2 = OrderStatusEnum.DELIVERED;

        // Transforming a string to a enum instance
        OrderStatusEnum os1 = OrderStatusEnum.valueOf("DELIVERED");
    }
}
