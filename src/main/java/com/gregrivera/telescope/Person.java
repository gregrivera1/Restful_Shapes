package com.gregrivera.telescope;

/**
* <h1>Person</h1>
* Holds the JSON for name
*
* @author  Greg Rivera
* @version 1.0
* @since   2014-09-08 
*/
public class Person {
	private String name;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return new StringBuffer(" name: ").append(this.name).toString();
	}
}
