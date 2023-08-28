package homeworks.homework4.geometric_figures;

public class Triangle implements Areable {
    int base;
    int height;
    int area;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public Integer searchArea() {
        area = (base * height) / 2;
        return area;
    }

    @Override
    public void showArea() {
        System.out.println("the area of triangle = " + area);
    }

    public int getArea() {
        return area;
    }
}
