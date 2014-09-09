package com.gregrivera.telescope;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

/**
* <h1>RestTests</h1>
* Class for testing.
*
* @author  Greg Rivera
* @version 1.0
* @since   2014-09-08 
*/
public class RestTests {

	/**
	 * Quick test to make sure the JSON can be passed in and consumed properly
	 */
	public static void runRestTest() {
		try {

			Person p1 = new Person("greg");

			ClientConfig clientConfig = new DefaultClientConfig();

			clientConfig.getFeatures().put(
					JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);

			Client client = Client.create(clientConfig);

			WebResource webResource = client
					.resource("http://localhost:8080/Restful-Shapes/helloWorldREST/sayHi/");

			ClientResponse response = webResource.accept("application/json")
					.type("application/json").post(ClientResponse.class, p1);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			String output = response.getEntity(String.class);

			System.out.println("Server response .... \n");
			System.out.println(output);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
	
	/**
	 * Just a quick shapes test to make sure everything is working, for the most part at least :)
	 */
	public static void runShapesTest() {
		//make circles constructor 1
		runCirclesTest();
		runTrianglesTest();
		
		
	}

	/**
	 * Run tests for the triangle object
	 */
	private static void runTrianglesTest() {
		Triangle equilateral = new Triangle();
		Triangle scalene     = new Triangle("scalene", 3, 4, 5, 4, 3);
		Triangle isosceles   = new Triangle("isosceles", 2, 2, 1, 1, 1.9364 );
		
		//name checks
		if(!equilateral.getName().equals("equilateral")) {
			System.out.println("Triangle default name not being properly set to 'equilateral'");
		}
		
		if(!scalene.getName().equals("scalene")) {
			System.out.println("Triangle specified name not being properly set, please check instantiation of scalene");
		}
		
		if(!isosceles.getName().equals("isosceles")) {
			System.out.println("Triangle specified name not being properly set, please check instantiation of isosceles");
		}
		
		//this will be a "soft" check for sides being set properly
		if(!isosceles.isIsosceles()) {
			System.out.println("Object/Triangle isosceles is supposed to be isosceles");
		}
		
		if(!equilateral.isEquilateral()) {
			System.out.println("Object/Triangle equilateral is supposed to be equilateral");
		}
		
		if(!scalene.isScalene()) {
			System.out.println("Object/Triangle scalene is supposed to be scalene");
		}
		
		//perimeter checks
		if(equilateral.computePerimeter() != 3) {
			System.out.println("Object/Triangle equilateral is supposed to have perimeter 3");
		}
		
		if(scalene.computePerimeter() != 12) {
			System.out.println("Object/Triangle scalene is supposed to have perimeter 12");
		}
		
		if(isosceles.computePerimeter() != 5) {
			System.out.println("Object/Triangle isosceles is supposed to have perimeter 5");
		}
		
		//area checks
		if(equilateral.computeSurfaceArea() != .433) {
			System.out.println("Object/Triangle equilateral is supposed to have area .433");
		}
		
		if(scalene.computeSurfaceArea() != 6) {
			System.out.println("Object/Triangle scalene is supposed to have area 6");
		}
		
		if(isosceles.computeSurfaceArea() != .9682) {
			System.out.println("Object/Triangle isosceles is supposed to have area .9682");
		}
		
	}

	/**
	 * Run some test cases on the circle object
	 */
	private static void runCirclesTest() {
		Circle c1 = new Circle();

		//make circles constructor 2
		Circle c2 = new Circle("rad5circle", 5);
		
		if(!c1.getName().equals("Circle")) {
			System.out.println("Circle default name not being properly set to 'Circle'");
		}
		
		if(!c2.getName().equals("rad5circle")) {
			System.out.println("Circle specified name not being properly set, please check instantiation of c2");
		}
		
		if(c1.getRadius() != 1) {
			System.out.println("Circle default radius not being properly set to 1");
		}
		
		if(c2.getRadius() != 5) {
			System.out.println("Circle specified radius not being properly set to 5");
		}
		
		if(c1.computePerimeter() != Math.PI * 2) {
			System.out.println("Circle default perimeter not being properly set to 2*pi.");
		}
		
		if(c2.computePerimeter() != Math.PI * 10) {
			System.out.println("Circle specified perimeter not being properly set to 2*pi.");
		}
		
		if(c1.computeSurfaceArea() != Math.PI) {
			System.out.println("Circle default area not being properly set to pi.");
		}
		
		if(c2.computeSurfaceArea() != Math.PI * 25) {
			System.out.println("Circle specified area not being properly set to 25 * pi.");
		}
		
	}

}