
/**
 * Created by Ангелин on 27.07.2015.
 */
public class Task8 {
    public char[][] getChessArray(int length){
        char[][] array = new char[length][length];
        char color = 'Ч';
        for (int i = 0; i < length; i ++){
            for (int j = 0; j < length; j++){
                array[i][j] = color;
                color = (color =='Ч') ? 'Б' : 'Ч';
            }
            color = (color =='Ч') ? 'Б' : 'Ч';
        }
        return array;
    }
}