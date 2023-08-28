package homeworks.homework4.geometric_figures;

public class Main {

    public static void main(String[] args) {

        Square square = new Square(1,2);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);

        Areable[] figures = {square,circle,triangle};
        for (Areable figure : figures) {
            figure.searchArea();
            figure.showArea();
        }


    }

}
