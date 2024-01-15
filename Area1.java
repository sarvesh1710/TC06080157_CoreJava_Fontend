package Practise;

import java.util.Scanner;

class Area1 {
    private double length;
    private double breadth;

    // Method to set the dimensions (length and breadth) of the rectangle
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public double getArea() {
        return length * breadth;
    }
}