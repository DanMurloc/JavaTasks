package Inheritance;

import java.util.ArrayList;

public class Box extends Shape {

    private ArrayList<Shape> shapes = new ArrayList<>();
    private double availbale;
    private double volume;
    public Box(double available){
        this.availbale=available;
        this.volume= available;

    }
    public boolean Add(Shape shape){
        if (availbale>=shape.getVolume()){
            shapes.add(shape);
            availbale-=shape.getVolume();
            return true;
        }
        else
            return false;
    }

    @Override
    public double getVolume() {
        return volume;
    }
}
