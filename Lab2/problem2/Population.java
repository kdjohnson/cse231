/*
LAB #2
SEMESTER NAME: Fall 2015
STUDENT NAME: KaJuan, Johnson 

I fully understand the following statement. OU PLAGIARISM POLICY
All members of the academic community at Oakland are expected to practice and uphold 
standards of academic integrity and honesty. An instructor is expected to inform and instruct 
students about the procedures and standards of research and documentation required of students 
in fulfilling course work. A student is expected to follow such instructions and be sure the rules 
and procedures are understood in order to avoid inadvertent misrepresentation of his work. 
Students must assume that individual (unaided) work on exams and lab reports and documentation 
of sources is expected unless the instructor specifically says that is not necessary.

The following definitions are some examples of academic dishonesty:
    Plagiarizing from work of others. Plagiarism is using someone else's work or ideas without 
    giving the other person credit; by doing this, a student is, in effect, claiming credit for 
    someone else's thinking. Whether the student has read or heard the information he uses, 
    the student must document the source of information. When dealing with written sources, 
    a clear distinction would be made between quotations (which reproduce information from 
    the source word-for-word within quotation marks) and paraphrases (which digest the 
    source information and produce it in the student's own words). Both direct quotations and 
    paraphrases must be documented. Just because a student rephrases, condenses or selects 
    from another person's work, the ideas are still the other person's, and failure to give 
    credit constitutes misrepresentation of the student's actual work and plagiarism of 
    another's ideas. Naturally, buying a paper and handing it in as one's own work is 
    plagiarism.

    Cheating on lab reports falsifying data or submitting data not based on student's own work.
*/

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
	    case 0 : 
		    return "\nPlease enter a number greater than or equal to 2 for starting organisms: ";

	    case 1 :
		    return "\nPlease enter a number greater than 0 for daily increase: ";

	    case 2 :
		    return "\nPlease enter a number equal to or greater than 1 for days: ";

	    case 3 : 
		    return "Enter starting organisms: ";

	    case 4 : 
		    return "Enter daily increase: ";

	    case 5 : 
		    return "Enter days: "; 

	    case 6 : 
		    return "Day\t\t\t\tOrganisms  " + "\n-------------------------------------------------------";

	    default: 
		    return "Sorry";
	}

    }
}
