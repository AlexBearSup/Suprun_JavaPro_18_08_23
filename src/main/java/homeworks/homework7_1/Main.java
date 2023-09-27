package homeworks.homework7_1;

public class Main {
    public static void main(String[] args) {

        CoffeeOrderBoard board = new CoffeeOrderBoard();

        board.orderAdd(new Order("Obi-Van", 4));
        board.orderAdd(new Order("R2D2", 4));
        board.orderAdd(new Order("Duku", 72));
        board.orderAdd(new Order("C3PO", 22));
        board.orderAdd(new Order("Enakin", 70));
        board.orderAdd(new Order("Padme", 14));
        board.orderAdd(new Order("Yoda", 33));

        System.out.println("---------------------------------");

        board.deliverFirst();
        System.out.println("---------------------------------");

        board.deliverOnDemand(15);
        System.out.println("---------------------------------");

        board.draw();





















    }

}
