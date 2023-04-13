/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

public class InvalidRatingException extends Exception{

	private String ratingSent;
        
	private InvalidRatingException(){
		
	}

	public InvalidRatingException(String inString){
		this.ratingSent = inString;
	}
	
	public String getRatingSet(){
		return this.ratingSent;
	}
	
	public String toString(){
		String returnString;
		
		returnString = this.ratingSent + " format rating yang dimasukkan salah!\n";
		
		return returnString;
	}
	
}