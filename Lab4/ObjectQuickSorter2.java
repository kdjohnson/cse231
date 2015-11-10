package Lab4;

public class ObjectQuickSorter2< T extends Comparable<T>> {

    private void doQuickSort( T[] array, int start, int end){

        quickSort( array, start, end);

    }

    private void quickSort( T[] array, int start , int end) {
        if ( start < end ) {
            int pivotValue = partition( array, start, end);
            quickSort( array, start, pivotValue - 1);
            quickSort( array, pivotValue + 1, end );
        }
    }

    private int partition( T[] array, int start, int end) {
        T pivot = array[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if ( array[j].compareTo(pivot) <= 0) {
                i++;
                swap( array, i, j);
            }
        }

        swap( array, i+1, end);

        return i+1;
    }

    private void swap( T[] array, int start, int end) {
        T t = array[start];
        array[start] = array[end];
        array[end] = t;
    }

    public void quickSort(T[] array){
        doQuickSort( array, 0, array.length - 1);
    }
}
