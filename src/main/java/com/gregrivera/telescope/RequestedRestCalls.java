package com.gregrivera.telescope;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/helloWorldREST")
public class RequestedRestCalls {
	
	/**
	 * Consume and return JSON that matches Person class
	 * @param p
	 * @return
	 */
	@POST
	@Path("/sayHi")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response displayJson( Person p) {
		return Response.status(200).entity(p).build();
	}
	
	/**
	 * Greet a person
	 * @param name
	 * @return
	 */
	@POST
	@Path("/sayHi/{name}")
	public Response greetAPerson( @PathParam("name") String name) {

		String output = "Hello " + name + "!";
		return Response.status(200).entity(output).build();
	}
	
	/**
	 * default greeting.
	 * @return
	 */
	@Path("/hello")
	@GET
	public Response defaultGreeting() {
		String output = "Hello there!";
		return Response.status(200).entity(output).build();
	}
	
	/**
	 * Run tests 
	 */
	@Path("/test")
	@GET
	public Response runtests() {
		String output = "Hello there! Please check stdout for any messages.";
		RestTests.runRestTest();
		RestTests.runShapesTest();
		return Response.status(200).entity(output).build();
	}
	
	/**
	 * Run shapes tasks.
	 */
	@Path("/runShapes")
	@GET
	public Response makeAndDisplayShapes() {
		String output = "Shapes demo was just run. Please check stdout for details.";
		ShapesDriver shapesdriver = new ShapesDriver();
		shapesdriver.demo();
		return Response.status(200).entity(output).build();
	}
	
	
	
}
