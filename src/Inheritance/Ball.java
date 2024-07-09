package Inheritance;

public class Ball extends SolidOfRevolution { // конкретный класс

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 3) * 4 / 3;
    }

    public Ball(double radius) {
        super(radius);
    }
}
