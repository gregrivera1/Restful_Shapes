package com.gregrivera.telescope;

/**
* <h1>Circle</h1>
* The circle is a kind of shape that has a three sides, with area/perimeters calculated as below
* Triangles also have different classifications, also shown below. Note that there are no validations
* on putting sides that don't match up with base/height.
*
* @author  Greg Rivera
* @version 1.0
* @since   2014-09-08 
*/
public class Triangle extends Shape {
	private final double s1;
	private final double s2;
	private final double s3;
	private final double base;
	private final double height;
	
	public Triangle() {
		super("equilateral");
		s1     = 1;
		s2     = 1;
		s3     = 1;
		base   = 1;
		height = 0.866;
	}
	
	public Triangle(String name, double s1, double s2, double s3, double base, double height) {
		super(name);
		this.s1     = s1;
		this.s2     = s2;
		this.s3     = s3;
		this.base   = base;
		this.height = height;
	}
	
	public boolean isEquilateral() {
		return s1 == s2 && s1 == s3;
	}
	
	public boolean isIsosceles() {
		return s1 == s2 || s1 == s3 || s2 == s3;
	}
	
	public boolean isScalene() {
		return !isIsosceles() && !isEquilateral();
	}
	
	@Override
	double computeSurfaceArea() {
		return base * height * .5;
	}

	@Override
	double computePerimeter() {
		return s1 + s2 + s3;
	}

}
