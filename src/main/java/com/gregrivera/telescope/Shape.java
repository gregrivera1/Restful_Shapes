package com.gregrivera.telescope;

/**
* <h1>Shape</h1>
* The Shapes class is to be extended by objects that are a specific kind of shape.
*
* @author  Greg Rivera
* @version 1.0
* @since   2014-09-08 
*/
public abstract	class Shape {
	private final String name;
	
	public Shape() {
		name = "i am a shape";
	}
	
	public Shape(String name) {
		this.name = name;
	}
	
	abstract double computeSurfaceArea();
	abstract double computePerimeter();

	public String getName() {
		return name;
	}
	
	
}
