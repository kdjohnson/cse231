package Lab2.problem2;

import java.util.Scanner;

public class Population{

    public static void displayPopulation( double startingOrganisms, double increase, int days ){

	Scanner read = new Scanner( System.in );

	while( startingOrganisms < 2 ){
	    try{

		System.out.print( print( 0 ) ); 
		startingOrganisms = Double.parseDouble( read.next() );
	    }
	    catch( NumberFormatException e){
		    System.out.print( print( 0 ) );
		}
	    catch( NullPointerException e){
		    System.out.print( print( 0 ) );
		}
	}

	while( increase < 0){
	    try{
		System.out.println( print( 1 ) );
		increase = Double.parseDouble( read.next() );
	    }
	    catch( NumberFormatException e){
		System.out.print( print( 0 ) );
		increase = Double.parseDouble( read.next() );
	    }
	    catch( NullPointerException e){
		    System.out.print( print( 0 ) );
		}
	}

	while( days < 1){
	    try{
		System.out.println( print( 1 ) );
		days = Integer.parseInt( read.next() );
	    }
	    catch( NumberFormatException e){
		System.out.print( print( 0 ) );
		increase = Double.parseDouble( read.next() );
	    }
	    catch( NullPointerException e){
		    System.out.print( print( 0 ) );
		}
	}
	
	System.out.println( print( 6 ) ); 
	showPopulation( startingOrganisms, increase, days, 0 );
    }

    private static void showPopulation( double organisms, double dailyIncrease, int days, int dayNum ){

	if( dayNum != days ){
	    System.out.print( "\n" + (dayNum + 1) + "\t\t\t\t" + organisms );
	    showPopulation(  ( organisms * ( dailyIncrease / 100.0 ) + organisms ), dailyIncrease, days, dayNum + 1);

	}
    }

    public static void main( String[] args ){
	Scanner scan = new Scanner( System.in );

	System.out.print( print( 3 ) );
	Double startO  = Double.parseDouble( scan.next() ); 

	System.out.print( print( 4 ) );
	Double dailyInc = Double.parseDouble( scan.next() );

	System.out.print( print( 5 ) );
	Integer daysCount = Integer.parseInt( scan.next() );

	displayPopulation( startO, dailyInc, daysCount ); 
    } 

    private static String print( int x ){
	switch( x ){
	    case 0 : return "\nPlease enter a number greater than or equal to 2 for starting organisms: ";

	    case 1 : return "\nPlease enter a number greater than 0 for daily increase: ";

	    case 2 : return "\nPlease enter a number equal to or greater than 1 for days: ";

	    case 3 : return "Enter starting organisms: ";

	    case 4 : return "Enter daily increase: ";

	    case 5 : return "Enter days: "; 

	    case 6 : 
		    return "Day\t\t\t\tOrganisms  " + "\n-------------------------------------------------------";

	    default: return "Sorry";
	}

    }
}
