package java.homeworks.homework.homework7.coffee_order;

public class Order {
    private String  client;
    private int numberOrder;

    @Override
    public String toString() {
        return "Order{" +
                "client='" + client + '\'' +
                ", numberOrder=" + numberOrder +
                '}';
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setNumberOrder(int numberOrder) {
        this.numberOrder = numberOrder;
    }

    public String getClient() {
        return client;
    }

    public int getNumberOrder() {
        return numberOrder;
    }

    public Order(String client, int numberOrder) {
        this.client = client;
        this.numberOrder = numberOrder;
    }
}
