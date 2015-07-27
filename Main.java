/**
 * Created by student on 25.07.2015.
 */
public class Main {
    public static void main(String[] args) {

        Task1 t1 = new Task1();
        System.out.println(t1.getGenericDenominator(15,21));

        Task2 t2 = new Task2();
        System.out.println(t2.getSum(33333));

        Task3 t3 = new Task3();
        System.out.println(t3.isPrimeNumber(6));

        Task4 t4 = new Task4();
        System.out.println(t4.getSumOfFactorials(7));

        Task5 t5 = new Task5();
        System.out.println(t5.getSumOfThree());

        Task6 t6 = new Task6();
        int [] array = t6.getArrayOfFibonacci(20);
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]+", ");

        Task7 t7 = new Task7();
        int[] array2 = t7.getArrayOfPrimeNumber(100);
        for (int i = 0; i < array2.length; i++)
            System.out.print(array2[i]+", ");

        Task8 t8 = new Task8();
        char[][] ar = t8.getChessArray(8);
        for (int i = 0; i < ar.length; i++){
            for (int j = 0; j < ar.length; j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }

        Task9 t9 = new Task9();
        t9.print6DArray();

        Task10 t10 = new Task10();
        t10.printTriangleOfPascal(10);
    }
}
