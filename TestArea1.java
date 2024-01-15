package Practise;

import java.util.Scanner;

public class TestArea1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area1 a1 = new Area1();

        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        a1.setDim(length, breadth);

        double area = a1.getArea();
        System.out.println("The area of the rectangle is: " + area);

    }
}