package HomeWork.homeWork3;

/**
 * Created by Ангелин on 27.07.2015.
 */
public class Task9 {
    public void print6DArray(){
        // Метод который заполняет шестимерный массив (с двумя значениями в каждом измерении)
        // числами из натурального ряда и выводит на консоль!
        int[][][][][][] array = new int[2][2][2][2][2][2];
        int val = 1;
        for (int a = 0; a < array.length; a++)
            for (int n = 0; n < array.length; n++)
                for (int d = 0; d < array.length; d++)
                    for (int r = 0; r < array.length; r++)
                        for (int e = 0; e < array.length; e++)
                            for (int y = 0; y < array.length; y++)
                                array[a][n][d][r][e][y] = val++;
        for (int a = 0; a < array.length; a++)
            for (int n = 0; n < array.length; n++)
                for (int d = 0; d < array.length; d++)
                    for (int r = 0; r < array.length; r++)
                        for (int e = 0; e < array.length; e++)
                            for (int y = 0; y < array.length; y++)
                                System.out.print(array[a][n][d][r][e][y]+" ");
    }
}
