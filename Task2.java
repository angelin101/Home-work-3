package HomeWork.homeWork3;

/**
 * Created by ������� on 26.07.2015.
 */
public class Task2 {
    private int sum = 0;
    // ����� ��������� ������������� �������� � ���������� ����� ��� ����.
    public int getSum(int val){
        for (int i = val; i > 0; i /= 10)
            sum += i % 10;
        return sum;
    }
}
