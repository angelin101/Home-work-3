package HomeWork.homeWork3;

/**
 * Created by Ангелин on 26.07.2015.
 */
public class Task4 {
    private int res = 0;
    private int fact = 1;
    private int sign = 1;
    // Метод считает сумму ряда 1!-2!+3!-4!+ ... - n! для введенного числа n.
    public int getSumOfFactorials(int val){
        for (int i = 1; i <= val; i++){
            fact *= i*sign;
            res += fact;
            sign = -1;
        }
        return res;
    }
}
