
/**
 * Created by ������� on 26.07.2015.
 */
public class Task3 {
    // ����� ��������� ��������� �� ������� ����� �������.
    // ���� ����� ������� (�������� ������ �� ���� � �� 1), ����� ����� ���������� true!
    public boolean isPrimeNumber(int val){
        for (int i = 2; i < val; i++)
            if (val % i == 0)
                return false;
        return true;
    }
}
