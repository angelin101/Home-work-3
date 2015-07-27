package HomeWork.homeWork3;

/**
 * Created by Ангелин on 26.07.2015.
 */
public class Task2 {
    private int sum = 0;
    // Метод принимает целочисленное значение и возвращает сумму его цифр.
    public int getSum(int val){
        for (int i = val; i > 0; i /= 10)
            sum += i % 10;
        return sum;
    }
}
