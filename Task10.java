package HomeWork.homeWork3;

/**
 * Created by Ангелин on 27.07.2015.
 */
public class Task10 {
    // Метод который принимает в качестве параметра
    // колличество строк (они же размер массива) в треугольнике Паскаля,
    // заполняет массив биноминальными коэффициентами и выводит на печать!
    public void printTriangleOfPascal(int numStr){
        int[][] array = new int[numStr][numStr];
        for (int n = 0; n < numStr; n++)
            for (int m = 0; m < numStr; m++) {
                if (n == 0) {
                    array[0][0] = 1;
                    continue;
                }
                // Вычисляеться биноминальный коэффициент по формуле - n!/m!(n-m)!
                array[n][m] = getFact(n) / (getFact(m) * getFact((n - m)));
            }

        for (int n = 0; n < numStr; n++) {
            for (int m = 0; m < numStr; m++) {
                if (array[n][m] == 0) {
                    System.out.print("");
                    continue;
                }
                System.out.print(array[n][m] + " ");
            }
            System.out.println();
        }
    }
    // Метод вычисления фаткориала используеться для подсчета биноминального коэффициента
    public int getFact(int fac){
        int res = 1;
        for (int i = 1; i <= fac; i++)
            res *= i;
        return res;
    }
}
