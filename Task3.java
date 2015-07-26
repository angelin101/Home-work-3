
/**
 * Created by јнгелин on 26.07.2015.
 */
public class Task3 {
    // ћетод провер€ет €вл€етьс€ ли заданое число простым.
    // ≈сли число простое (делитьс€ только на себ€ и на 1), тогда метод возвращает true!
    public boolean isPrimeNumber(int val){
        for (int i = 2; i < val; i++)
            if (val % i == 0)
                return false;
        return true;
    }
}
