package com.gregrivera.telescope;

/**
* <h1>ShapesDriver</h1>
* The Shapes Driver class builds some shapes and outputs information about those Shapes
* as per the requirements specified in "Programming Questions.java"
*
* @author  Greg Rivera
* @version 1.0
* @since   2014-09-08 
*/
public class ShapesDriver {
	public void demo() {
		
		//Define a circle, output info
		Circle circle1 = new Circle();
		System.out.println("Outputting a circle's info:");
		System.out.println("Circle's name is: "   + circle1.getName());
		System.out.println("Circle's radius is: " + circle1.getRadius());
		System.out.println("Circle's surface area is: " + circle1.computeSurfaceArea());
		System.out.println("Circle's perimeter is: " + circle1.computePerimeter());
		
		
		//Define a triangle, output info
		Triangle traingle1 = new Triangle();
		System.out.println("Outputting a triangle's info:");
		System.out.println("Triangle's name is: " + traingle1.getName());
		System.out.println("Triangle's surface area is: " + traingle1.computeSurfaceArea());
		System.out.println("Triangle's perimeter is: " + traingle1.computePerimeter());
		
		
	}

}
