
/**
 * Created by ������� on 26.07.2015.
 */
public class Task1 {
    private int a, b, res;
    // ����� ������� ������� ���������� ����� �������� ���� ����� ������������� ����� � ���������� ���.
    public int getGenericDenominator(int firstNumber, int secondNumber){
        a = firstNumber;
        b = secondNumber;
        for(int i = (a<=b) ? b : a; i > 0; i--){
            if (a%i == 0 && b%i== 0) {
                res = i;
                break;
            }
        }
        return res;
    }
}
