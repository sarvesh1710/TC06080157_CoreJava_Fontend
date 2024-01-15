/*Write a constructor in the Car class given below that initializes 
the brand class field with the string “Ford”.
Call the getBrand() method in the main method of the Sample class  and store 
the value of the brand in a variable, and print the value.*/


package Practise;

public class Car {
	String Brand;
	Car(){
		Brand="FORD";
	}
	
	public String getBrand(){
		return Brand;
	}
	

}
