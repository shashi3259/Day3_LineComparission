package com.bridgelab.LineComparisonProblem;

import java.util.Scanner;

public class UC1CalLength {
	public static void lengthOfLine() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the co-ordinates for 1st point: ");
		double X1 = sc.nextDouble();
		double Y1 = sc.nextDouble();
		System.out.println("Enter the co-ordinates for 2nd point: ");
		double X2 = sc.nextDouble();
		double Y2 = sc.nextDouble();
		
		double x = Math.pow(X2-X1, 2);
		double y = Math.pow(Y2-Y1, 2);
		
		double Length = Math.sqrt(x+y);
		System.out.println("Length of Line between two co-ordinates are: " + Length);
		sc.close();
		
		
				
		
	}
	
	
	public static void main(String[] args) {
//		A line based on a point consisting of (x, y) co-ordinates using the Cartesian system,So that I can calculate it's length
//		A Length as 2 Points (x1, y1) and (x2, y2) -
//		Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2)
		
		lengthOfLine();
		
	}
	

}
