package Lab3;

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;

public class ReverseArrayStack{
    
	@SuppressWarnings( "unchecked")
	public static void main( String[] args ){
		Stack stack = new Stack();
		Scanner scan = new Scanner( System.in );
		ArrayList words = new ArrayList();

		for( int i = 0; i < 7; i++ ){

		    System.out.println( "Enter a word when prompted");
		    words.add( scan.nextLine() );
		    stack.push( words.get(i) ); 
		}

		System.out.println( "In reverse order: " );

		for( int i = 0; i < 7; i++ ){
			System.out.println( stack.pop() );
		    }
	    }
    }
