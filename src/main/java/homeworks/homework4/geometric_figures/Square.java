package homeworks.homework4.geometric_figures;

import homeworks.homework4.geometric_figures.Areable;

public class Square implements Areable {

    private int lenght;
    private int height;
    private int area;

    public Square(int lenght, int height) {
        this.lenght = lenght;
        this.height = height;
    }
    @Override
    public Integer searchArea() {
        area = lenght * height;
        return area;
    }

    @Override
    public void showArea() {
        System.out.println("the area of square = " + area);
    }

    public int getArea() {
        return area;
    }


}
