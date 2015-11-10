package Lab4;

public class ObjectQuickSorter{

    private void doQuickSort(Comparable[] array, int start, int end){

        quickSort( array, start, end);
    }

    private void quickSort(Comparable [] array, int start, int end) {
        if (start < end) {
            int pivotValue = partition( array, start, end );
            quickSort( array, start, pivotValue - 1 );
            quickSort( array, pivotValue + 1, end );
        }
    }

    private int partition(Comparable [] array, int start, int end) {
        Comparable pivot = array[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if ( array[j].compareTo(pivot) <= 0) {
                i++;
                swap( array, i, j);
            }
        }

        swap(array, i+1, end);

        return i+1;
    }

    private void swap(Comparable [] array, int start, int end) {
        Comparable t = array[start];
        array[start] = array[end];
        array[end] = t;
    }

    public void quickSort( Comparable[] array){
        doQuickSort( array, 0, array.length - 1 );
    }
}



