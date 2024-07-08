/*
    Задача:
    Напишите метод, который проверяет, входит ли в массив заданный элемент или нет.
    Используйте перебор и двоичный поиск для решения этой задачи.
    Сравните время выполнения обоих решений для больших массивов (например, 100000000 элементов).
*/

public class Search {

    public boolean bruteForce(double[] arr, double value){
        for (int i=0;i <arr.length;i++)
        {
            if (arr[i]==value)
                return true;
        }
        return false;
    }
    public int bruteForceIndex(double[] arr, double value){
        for (int i=0;i <arr.length;i++)
        {
            if (arr[i]==value)
                return i;
        }
        return -1;
    }

    public int binarySearchRecursively(double[] sortedArray, double key){
        return binarySearchRecursively(sortedArray,key,0,sortedArray.length);
    }
    private  int binarySearchRecursively(double[] sortedArray, double key, int low, int high){

        int middle =(low+high)/2;
        if(high<low){
            return -1;
        }
        if (key == sortedArray[middle]){
            return middle;
        } else if(key< sortedArray[middle]){
           return binarySearchRecursively(sortedArray,key,low,middle-1);
        } else{
            return binarySearchRecursively(sortedArray,key,middle+1,high);
        }

    }
    public static double[] generatedArray(int lenght){
        double[] array = new double[lenght];
        for (int i=0; i<lenght;i++){
            array[i]=Math.random();
        }
        return array;
    }

}
