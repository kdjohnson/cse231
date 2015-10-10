/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.Stack;
import java.util.Scanner;

public class ReverseStack {
    
    @SuppressWarnings("unchecked")
    public static void main( String [] args ){

	Stack stack = new Stack();
	Scanner scan = new Scanner( System.in );
	System.out.println( "Enter a sentence" );

	String input = scan.nextLine();
	char[] reverse = input.toCharArray();

	for( char reverse1 : reverse ){
		stack.push( reverse1 );
	    }

	for( char reverse1: reverse ){
		System.out.print( stack.pop() );
	    }
    }
}
