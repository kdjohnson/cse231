package Lab2.problem1;

public class AckermanClient{

    public static void main ( String[] args){
	print( "0", "0" );
	print( "0", "1" );
	print( "1", "1" );
	print( "1", "2" );
	print( "1", "3" );
	print( "2", "2" );
	print( "3", "2" );
    }


    public static int Ackerman( int m, int n ){

	if( m == 0 ){
	    return n + 1;
	}

	if( n == 0 ){
	    return Ackerman( m - 1, 1 );
	}

	else{
	    return Ackerman( m - 1, Ackerman( m, n - 1 ) );	
	}
    }

    public static void print( String m, String n){
	System.out.println( "Ackerman( " + m + ", " + n + " ) = " + Ackerman( Integer.parseInt( m ), Integer.parseInt( n ) ) );
    }

}
