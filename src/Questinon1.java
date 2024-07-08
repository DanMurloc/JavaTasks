import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Questinon1 {

    /*
    1.0. Максимальное, минимальное и среднее значение
    Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
    Для генерации случайного числа используйте метод Math.random(),
    который возвращает значение в промежутке [0, 1].
     */
    public void Quest1(){
        int n = 100;
        double[] arr  = new double[n];
        for(int i=0; i<n;i++){
            arr[i]= Math.random();
        }
        double max = arr[0];
        double min = arr[0];
        double sum = 0;
        for (int i=0; i < arr.length;i++){
            if (max < arr[i])
                max = arr[i];
            if (min>arr[i])
                min = arr[i];
            sum+=arr[i];
        }
        sum = sum/n;
        System.out.println("максимальное: "+ max);
        System.out.println("минимальное: "+ min);
        System.out.println("среднее: "+ sum);
    }

    //1.1. Реализуйте алгоритм сортировки пузырьком для сортировки массива
    public void Quest2(){
        int n = 10;
        double[] arr = new double[n];
        for (int i=0; i<arr.length;i++){
            arr[i]=Math.random()*10;
        }
        for (int i = 0; i<arr.length;i++){
            for (int j =0; j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(double l : arr){
            System.out.print(l+" ");
        }
    }

    /*
    1.2. Поиск простых чисел
    Задача:
    Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
    Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
     */
    public void Quest3(){
        for (int i = 2; i<=100;i++){
            boolean isPrima = true;

            for (int j = 2; j < i; j++){
                if (i%j==0){
                    isPrima = false;
                    break;
                }

            }
            if (isPrima)
                System.out.println(i);
        }
    }

    /*
    Задача:
    Дан массив целых чисел и ещё одно целое число.
    Удалите все вхождения этого числа из массива (пропусков быть не должно).
     */

    public void Quest4(){
        int test_array[] = {0,1,2,2,3,0,4,2};
        System.out.println(Arrays.toString(removeElement(test_array,3)));
    }
    /*
    Задача:

    Дан массив целых чисел и ещё одно целое число.
    Удалите все вхождения этого числа из массива (пропусков быть не должно).
     */
    private int [] removeElement(int[] nums, int val){
        int offset = 0;
        for (int i=0; i<nums.length;i++){
            if (nums[i]==val){
                offset++;
            }
            else {
                nums[i-offset] = nums[i];
            }
        }
        return Arrays.copyOf(nums,nums.length-offset);
    }

}
