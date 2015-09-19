/*
LAB #1
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

package Lab1;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;

public class TrainClient{
      public static void main ( String[] args) throws FileNotFoundException {
            File file = new File("/Users/kajuan/cse231/Lab1/passengers.txt");

	    ArrayList<Passenger> list = new ArrayList<Passenger>();

            try{
                  Scanner read = new Scanner(file);
                  while ( read.hasNext() ){
                        String pass = read.next(); 
			byte serv = read.nextByte();

			System.out.println( "name: " + pass + "; " + "service: " + serv);
			Passenger passenger = new Passenger( pass, serv );
			list.add( passenger );
                      }

		  read.close();
		  Train train = new Train( list );

		  System.out.println( new DecimalFormat( "00.00%" ).format( train.percentageFirstClassPassengers() ) 
			  + " of the passengers travel in first class.");

		  System.out.print( "Enter the ticket price for first class: "); 

		  Scanner scan = new Scanner( System.in );
		  double i = scan.nextDouble();


		  System.out.print( "Enter the ticket price for second class: "); 

		  double j = scan.nextDouble();
		  
		  System.out.println( "Total train revenue: $" + new DecimalFormat( "####.00" ).format( train.trainRevenues( i, j ) ) );

		  System.out.print( "Enter the name of a passenger: " );

		  String k = scan.next();

		  if( train.isOnTrain( k ) == true ){
			System.out.println( k + " is on the train " ); 
		      } 

		  else{
			System.out.println( k + " is not on the train " );
		      }
		  
                }
            catch( FileNotFoundException e){
                  e.printStackTrace();
                }
          }
    }
