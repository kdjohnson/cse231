package Lab4;

public class ObjectBinarySearcher2<T extends Comparable<T> > {

    public int search( T[] array, T value) {

        try {
            int low = 0;
            int high = array.length - 1;
            int mid = low + high / 2;

            while (low <= high) {

                if (array[mid].compareTo(value) == 0) {
                    return mid;
                } else if (array[mid].compareTo(value) < 0) {
                    low = mid++;
                } else {
                    high = mid--;
                }
            }
            return -1;
        }
        catch( ArrayIndexOutOfBoundsException e){
            return -1;
        }
    }
}
