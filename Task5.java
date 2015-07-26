
/**
 * Created by student on 25.07.2015.
 */
public class Task5 {
    private int res = 0;

    // Метод считает сколько шестизначных чисел имеет равную сумму трех первых и трех последних цифр.
    // Возвращает результат.
    public int getSumOfThree() {
        for (int i = 100000; i <= 999999; i++) {
            int sumFirst = 0;
            int sumSecond = 0;
            int valueFirst = i / 1000;
            for (int j = valueFirst; j > 0; j /= 10)
                sumFirst += j % 10;
            int valueSecond = i % 1000;
            for (int j = valueSecond; j > 0; j /= 10)
                sumSecond += j % 10;
            if (sumFirst == sumSecond) {
                res++;
            }
        }
        return res;
    }
}
