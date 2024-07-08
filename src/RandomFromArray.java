import java.util.Arrays;


/*
2.1. Генерация случайного элемента с весом

Задача:

Напишите класс, конструктор которого принимает два массива: массив значений и массив весов значений.
Класс должен содержать метод, который будет возвращать элемент из первого массива случайным образом,
с учётом его веса.
 */
public class RandomFromArray {

    private int[] values; //значения
    private int[] weights; //веса
    private int[] ranges; // Левые границы отрезков
    private int sum; //общая длина отрезков

    public RandomFromArray(int[] values, int[] weights) {
        this.values = values;
        this.weights = weights;
        ranges = new int[values.length];

        sum=0;
        for (int i : this.weights){
            sum+=i;
        }

        int lastSum = 0;
        for (int i = 0; i<ranges.length;i++){
            ranges[i] =lastSum;
            lastSum+=this.weights[i];
        }
    }

    public int getRandom(){
        int random  = (int) (Math.random()*(sum-1));
        int ourRangeIndex = 0;
        for (int i =0; i< ranges.length; i++){
            if (ranges[i]>random){
                break;
            }
            ourRangeIndex=i;
        }
        return values[ourRangeIndex];
    }
    public int getRandom2(){
        int random= (int) (Math.random()*(sum-1));
        int index = Arrays.binarySearch(ranges,random);
        return values[index>=0 ? index :-index-2];
    }
}
