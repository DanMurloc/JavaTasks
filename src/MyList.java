import java.util.Arrays;
//2.2. ArrayList
public class MyList<T> {

    private T[] arr;
    @SuppressWarnings("unchecked")
    public MyList(){
        arr = (T[]) new Object[0];
    }
    @SuppressWarnings("unchecked")
    public void Add(T obj){
        T[] arr2 = (T[]) new Object[arr.length+1];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        arr2[arr2.length-1]=obj;
        arr = Arrays.copyOf(arr2,arr2.length);
    }
    @SuppressWarnings("unchecked")
    public void Add(int index, T obj){
        T[] arr2 = (T[]) new Object[arr.length+1];
        for (int i =0; i<index; i++)
        {
            arr2[i]=arr[i];
        }
        arr2[index]= obj;
        for (int i = index+1; i<arr2.length;i++){
            arr2[i]=arr[i-1];
        }
        arr = Arrays.copyOf(arr2,arr2.length);

    }
    public void Remove(int index){
        T[] arr2 = (T[]) new Object[arr.length-1];
        for (int i = 0; i< index; i++){
            arr2[i] =arr[i];
        }
        for (int i = index+1; i < arr.length; i++){
            arr2[i-1]=arr[i];
        }
        arr= Arrays.copyOf(arr2,arr2.length);
    }
    public void Remove(T value){
        for (int i=0; i<arr.length;i++){
            if (arr[i].equals(value)){
                Remove(i);
                break;
            }
        }
    }

    public int Size(){
        return arr.length;
    }

    public T Element(int index){
        return arr[index];
    }
}
