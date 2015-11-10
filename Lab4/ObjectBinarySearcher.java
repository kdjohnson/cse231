package Lab4;

public class ObjectBinarySearcher{

    public int search( Comparable[] array, Comparable value) {

        try {
            int low = 0;
            int high = array.length - 1;
            int mid = low + high / 2;

            while (low <= high) {

                if( array[mid].compareTo(value) == 0){
                    return mid;
                }

                else if (array[mid].compareTo(value) < 0) {
                    low = mid++;
                }

                else {
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
