package homeworks.homework4.geometric_figures;

import java.util.PrimitiveIterator;

import static java.lang.Math.PI;

public class Circle implements Areable{

    int diameter;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    int area;
    @Override
    public Integer searchArea() {
        area =(int)(PI * Math.pow(diameter,2)) ;
       return area;
    }

    @Override
    public void showArea() {
        System.out.println("the area of circle = " + area);
    }

    public int getArea() {
        return area;
    }
}
