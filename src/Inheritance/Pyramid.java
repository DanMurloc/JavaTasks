package Inheritance;

public class Pyramid extends Shape{
    private double s;
    private double heght;
     public Pyramid(double heght, double s){
         this.heght=heght;
         this.s=s;
     }

    @Override
    public double getVolume() {
        return heght*s*4/3;
    }
}
