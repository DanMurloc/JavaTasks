/*
2.1. Генерация случайного элемента с весом

Задача:

Напишите класс, конструктор которого принимает два массива: массив значений и массив весов значений.
Класс должен содержать метод, который будет возвращать элемент из первого массива случайным образом,
с учётом его веса.
 */
public class RandomFromArray2 {

    private int[] extended_values;
    public RandomFromArray2(int[] values, int[] weights){
        int sum = 0;
        for (int i:weights){
            sum+=i;
        }
        extended_values = new int[sum];
        int cursor = 0;

        for(int i = 0; i<weights.length;i++){
            for (int j = 0; j<weights[i];j++){
                extended_values[cursor++]= values[i];
            }
        }
    }

    public int getRandom(){
        int random = (int)(Math.random()*(extended_values.length-1));
        return extended_values[random];
    }
}
