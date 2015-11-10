//LAB #4
//SEMESTER NAME: Fall 2015
//STUDENT: KaJuan, Johnson
//I fully understand the following statement. 
//OU PLAGIARISM POLICY
//All members of the academic community at Oakland are expected to practice and uphold 
//standards of academic integrity and honesty. An instructor is expected to inform and instruct 
//students about the procedures and standards of research and documentation required of students 
//in fulfilling course work. A student is expected to follow such instructions and be sure the rules 
//and procedures are understood in order to avoid inadvertent misrepresentation of his work. 
//Students must assume that individual (unaided) work on exams and lab reports and documentation 
//of sources is expected unless the instructor specifically says that is not necessary.
//The following definitions are some examples of academic dishonesty:
//Plagiarizing from work of others. Plagiarism is using someone else's work or ideas without 
//giving the other person credit; by doing this, a student is, in effect, claiming credit for 
//someone else's thinking. Whether the student has read or heard the information he uses, 
//the student must document the source of information. When dealing with written sources, 
//a clear distinction would be made between quotations (which reproduce information from 
//the source word-for-word within quotation marks) and paraphrases (which digest the 
//source information and produce it in the student's own words). Both direct quotations and 
//paraphrases must be documented. Just because a student rephrases, condenses or selects 
//from another person's work, the ideas are still the other person's, and failure to give 
//credit constitutes misrepresentation of the student's actual work and plagiarism of 
//another's ideas. Naturally, buying a paper and handing it in as one's own work is plagiarism.
//Cheating on lab reports falsifying data or submitting data not based on student's own work.
package Lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Lab4Tester {

    @SuppressWarnings("unchecked")
    public static void main( String[] args){

        System.out.println( "Testing Problem #1\n--------------------------------------- ");

        Scanner scan = new Scanner( System.in );
        Scanner in = new Scanner( System.in );

        Comparable [] names = { "Zeb", "Deb", "Will", "Karen", "Aaron", "Chris", "Barb", "Kenny"};

        System.out.println("Original order: " + Arrays.toString( names ) );

        ObjectQuickSorter quick = new ObjectQuickSorter();

        quick.quickSort( names );

        System.out.println("Sorted order: "  + Arrays.toString(names));


        System.out.println();
        System.out.println( "Testing Problem #2\n--------------------------------------- ");

        ObjectBinarySearcher looker = new ObjectBinarySearcher();


        System.out.println( "Do you want to search for a value ( Y / N ): ");

        String read = scan.next();

        while( read.equals("Y") || read.equals("y") ){

            System.out.println( "Enter a value to search: ");

            String read2 = in.next();

            System.out.println( looker.search( names, read2 ) );

            System.out.println( "Do you want to search for a value ( Y / N ): ");

            read = scan.next();

        }

        System.out.println();
        System.out.println( "Testing Problem #3\n--------------------------------------- ");

        Scanner scan2 = new Scanner( System.in );
        Scanner in2 = new Scanner( System.in );

        ObjectBinarySearcher2 genSearch = new ObjectBinarySearcher2();

        System.out.println( "Do you want to search for a value ( Y / N ): ");

        String reader = scan2.next();

        while( reader.equals("Y") || reader.equals("y") ){

            System.out.println( "Enter a value to search: ");

            String reader2 = in2.next();

            System.out.println( genSearch.search( names, reader2 ) );

            System.out.println( "Do you want to search for a value ( Y / N ): ");

            reader = scan2.next();

        }

        System.out.println();
        System.out.println( "Testing Problem #4\n--------------------------------------- ");

        Integer[] nums = {39, 79, 51, 41, 64, 16, 54, 63, 13, 57};

        HighLow pick = new HighLow();

        pick.HighLow( nums );

        System.out.print( pick.toString() );
    }

}
