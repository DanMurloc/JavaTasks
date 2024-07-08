import java.text.Format;


/*
2.0. Проектирование и создание класса, описывающего вектор
    Задача:
    Создайте класс, который описывает вектор (в трёхмерном пространстве).
 */
public class Vector {
   private double x;
   private double y;
   private double z;

    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double VectorLength(){
        return Math.sqrt(x*x+y*y+z*z);
    }
    public double ScalarProduct(Vector vector1, Vector vector2){
        return vector1.x*vector2.x+vector1.y*vector2.y+vector1.z*vector2.z;
    }
    public Vector MultVector(Vector vector1, Vector vector2){
        return new Vector(vector1.y*vector2.z-vector1.z*vector2.y,
                vector1.z*vector2.x+vector1.x*vector2.z,
                vector1.x*vector2.y-vector1.y*vector2.x);
    }
    public double cosVectors(Vector v1, Vector v2){

        return (ScalarProduct(v1,v2))/(v1.VectorLength()*v2.VectorLength());
    }

    public Vector sumVectors(Vector v1, Vector v2){
        return new Vector(v1.x+v2.x, v1.y+v2.y, v1.z+v2.z);
    }
    public Vector difVectors(Vector v1, Vector v2){
        return new Vector(v1.x-v2.x, v1.y-v2.y,v1.z-v2.z);
    }

    public Vector[] arrVecotrs(int N){
        Vector[] vectors = new Vector[N];
        for (int i =0; i<vectors.length; i++){
            vectors[i] = new Vector(Math.random(),Math.random(),Math.random());
        }
        return vectors;
    }
    @Override
    public String toString(){
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
