package de.wstein.demo.resteasy;

import javax.ws.rs.*;

@Path("tutorial")
public class HelloWorld
{

    @GET
    @Path("helloworld")
    public String helloworld() {
        return "Hello World!";
    }
}