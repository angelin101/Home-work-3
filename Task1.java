/**
 * Created by Ангелин on 24.07.2015.
 */
public class Task1 {
    private int a, b, res;
    // Метод который находит наибольший общий делитель двух целых положительных чисел и возвращает его.
    public int getGenericDenominator(int firstNumber, int secondNumber){
        a = firstNumber;
        b = secondNumber;
        for(int i = 10; i > 1; i--){
            if (a%i == 0 && b%i== 0) {
                res = i;
                return;
            }
        }
        return res;
    }
}
