package com.gregrivera.telescope;

/**
* <h1>Circle</h1>
* The circle is a kind of shape that has a radius, with area/perimeters calculated as below
*
* @author  Greg Rivera
* @version 1.0
* @since   2014-09-08 
*/
public class Circle extends Shape {
	private final double radius;
	
	public Circle() {
		super("Circle");
		radius = 1;
	}
	
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	
	@Override
	double computeSurfaceArea() {
		return radius * radius * Math.PI ;
	}

	@Override
	double computePerimeter() {
		return 2 * Math.PI * radius;
	}

	public double getRadius() {
		return radius;
	}

}
