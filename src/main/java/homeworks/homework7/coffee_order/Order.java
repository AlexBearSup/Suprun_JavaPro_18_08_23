package homeworks.homework7.coffee_order;

public class Order {
    private String  name;
    private int numberOrder;
    public Order(String name, int numberOrder) {
        this.name = name;
        this.numberOrder = numberOrder;
    }
    public String getName() {
        return name;
    }
    public int getNumberOrder() {
        return numberOrder;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOrder(int numberOrder) {
        this.numberOrder = numberOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", numberOrder=" + numberOrder +
                '}';
    }
}
