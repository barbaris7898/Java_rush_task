import com.sun.istack.internal.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Массивный максимум

1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/
public class LinkedListTest {
    public static void main(String[] args) throws Exception{
        int[] arr = initializeArray();
        int max = max(arr);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] array = new int[20];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<array.length; i++){
            array[i] = Integer.valueOf(reader.readLine());
        }
        return array;
    }
    public static int max(@NotNull int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] < arr[j+1]){
                    int m = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=m;
                }
            }
        }
        return arr[0];
    }
}

