package Interfacefigurs;

import java.util.ArrayList;

public class Box implements Shape{
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double availabel;
    private double volume;

    public Box(double availabel){
        this.availabel=availabel;
    }

    public boolean add(Shape shape){
        if (availabel>=shape.getVolume()){
            shapes.add(shape);
            availabel-=shape.getVolume();
            return true;
        } else {
            return false;
        }
    }
    @Override
    public double getVolume(){
        return volume;
    }

    public ArrayList<Shape> getShapes(){
        return  shapes;
    }
}
