package HomeWork.homeWork3;

/**
 * Created by ������� on 26.07.2015.
 */
public class Task7 {
    // ����� ����������� � �������� ��������� ������ �������
    // � ����������� ������ ������� ����� �������� ������� 2, 3, 5, 7, 11 ...
    public int[] getArrayOfPrimeNumber(int length) {
        int[] array = new int[length];
        Task3 t3 = new Task3();
        int j = 1;
        for (int i = 0; i < length; i++) {
            // ��� �������� ��������� �� ����� ������� ������������� ����� �� ������ �3
                while (!t3.isPrimeNumber(j)){
                    j++;
                }
            array[i] = j;
            j++;
        }
        return array;
    }
}
