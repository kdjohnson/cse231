package Lab1;

import java.util.ArrayList;

public class Train{
	ArrayList<Passenger> travelers;

	@Override 
	public boolean equals( Object o ){
		if( ! ( o instanceof Train) ){
			return false;
		    }
		else{
			Train car = ( Train ) o;
			return( travelers.equals(car.travelers));
		    }
	    }
	
	public ArrayList<Passenger> getTravelers(){
		ArrayList<Passenger> gottenTravelers = new ArrayList<Passenger>();
		for( Passenger currentPassenger: travelers){
			gottenTravelers.add( currentPassenger );
		    }
		
		gottenTravelers.trimToSize();
		return gottenTravelers;
	    }

	public boolean isOnTrain( String person ){
		for( Passenger currentPerson: travelers){
			if( currentPerson.getName().equals( person ) ){
				return true;
			    }
		    }
		    return false;
	    }

	public double percentageFirstClassPassengers(){
		double  count = 0.0;
		for( Passenger currentPass: travelers ){
			if( currentPass.getService() == 1 ){
				count++;
			    }	
		    }			

		return  count / travelers.size();
	    }

	public void setTravelers( ArrayList<Passenger> newTravelers){
		newTravelers.trimToSize();

		for( Passenger currentPassenger: travelers ){
			travelers = newTravelers;
		    }

		    travelers.trimToSize();
	    }

	@Override
	public String toString(){
		String result = "";
		for( Passenger tempPass : travelers ){
			result += tempPass.toString() + "\n";
		    }

		return result;
	    }

	public double trainRevenues( double firstClass, double secondClass ){
		int first = 0;
		int second = 0;

		for( Passenger currentPass: travelers ){
			if( currentPass.getService() == 1 ){
				first++;
			    }	
			else{
				second++;
			    }
		    }			
		return (first * firstClass) + (second * secondClass); 	    
	    }

	public Train( ArrayList<Passenger> newTravelers ){
		if( !( newTravelers.isEmpty() ) ){
			travelers = newTravelers;	
		    }
	    }
    }
