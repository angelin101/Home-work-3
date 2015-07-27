package HomeWork.homeWork3;

/**
 * Created by Ангелин on 26.07.2015.
 */
public class Task6 {
    // Метод получает в качестве параметра размер массива и возвращает массив заполненый рядом Фибоначчи.
    public int[] getArrayOfFibonacci(int length){
        int[] array = new int[length];
        if (length == 1)
            return new int[]{1};
        else if (length == 2)
            return new int[]{1, 1};
        else {
            array[0] = array[1] = 1;
            for (int i = 2; i < length; i++)
                array[i] = array[i-1] + array[i-2];
        }
        return array;
    }
}
