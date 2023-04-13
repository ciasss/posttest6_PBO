/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

public class InvalidDurasiException extends Exception{

	private String durasiSent;
        
	private InvalidDurasiException(){
		
	}

	public InvalidDurasiException(String inString){
		this.durasiSent = inString;
	}
	
	public String getLengthSet(){
		return this.durasiSent;
	}
	
	public String toString(){
		String returnString;
		
		returnString = this.durasiSent + " format durasi yang dimasukkan salah!\n";
		
		return returnString;
	}
	
}
