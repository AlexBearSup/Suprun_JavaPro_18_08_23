package java.homeworks.homework.homework7.coffee_order;

import java.util.*;

public class CoffeeOrderBoard {
    Queue<Order> orders = new PriorityQueue<>(Comparator.comparingInt(Order::getNumberOrder));
    Set<Integer> exam = new HashSet<>();
    public void orderAdd (Order order){
        int numberOrder = order.getNumberOrder();
        if (!exam.contains(numberOrder)) {
            orders.add(order);
            exam.add(numberOrder);
        } else {
            System.out.println("already has " + numberOrder);
        }
    }
    public void deliverFirst(){
        Order firstOrder = orders.poll();
        System.out.println("First in pull Order is : " + firstOrder.getClient() + "  " + firstOrder.getNumberOrder() );
    }
    public void deliverOnDemand(int demand){
        Order orderDemaind = null;
        for (Order order : orders) {
            if (order.getNumberOrder() == demand) {
                orderDemaind = order;
                break;
            }
        }
        if (orderDemaind != null) {
            System.out.println("Order on demand is : " + orderDemaind.getClient() + " " + orderDemaind.getNumberOrder());
        } else {
            System.out.println("Order with number " + demand + " not found.");
        }
        orders.remove(orderDemaind);
    }

    public void draw() {
        System.out.println("list for issue");
        while (!orders.isEmpty()) {
            Order qwe = orders.poll();
            System.out.println(qwe.getClient() + " - " + qwe.getNumberOrder());
        }
    }

}
