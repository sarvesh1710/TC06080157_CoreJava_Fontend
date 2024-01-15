/*Write a program to print the
area of two rectangles having sides (4,5) and (5,8) respectively by 
creating a class named 'Rectangle' with a 
method named 'Area' which 
returns the area and length and breadth passed as parameters to its constructor.*/
package Practise;

public class Rectangle {
	float len,breadth;
	public Rectangle(float len, float breadth){
		this.len=len;
		this.breadth=breadth;
	}
	
	public float Area() {
		return len*breadth;
	}
	

}
