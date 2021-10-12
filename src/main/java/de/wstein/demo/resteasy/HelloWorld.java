package de.wstein.demo.resteasy;

import javax.ws.rs.*;

@Path("hello")
public class HelloWorld {

    @GET
    @Path("world")
    public String helloworld() {
        return "Hello World!";
    }

    @GET
    @Path("{name}")
    public String hello(@PathParam("name") final String name) {
        return "Hello <b>" + name + "</b>";
    }
}