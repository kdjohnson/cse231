package Lab4;

import java.lang.reflect.Array;

public class HighLow< T extends Comparable<T>> {

   private  T[] array;

    public void HighLow(T[] values){
        ObjectQuickSorter2 sort = new ObjectQuickSorter2();
        sort.quickSort( values );

        array = (T[]) Array.newInstance( values.getClass().getComponentType(), values.length );

        for( int i = 0; i < values.length; i++){
            array[i] = values[i];
        }
    }

    public T getHighest(){

        return array[ array.length - 1];
    }

    public T getLowest(){

        return array[0];
    }

    @Override
    public String toString(){
        return "Highest value: " + getHighest() + "\nLowest value: " + getLowest();
    }
}
