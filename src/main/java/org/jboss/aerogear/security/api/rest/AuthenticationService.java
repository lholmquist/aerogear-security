package org.jboss.aerogear.security.api.rest;

import org.jboss.aerogear.security.impl.model.BasicAeroGearUser;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/auth")
public interface AuthenticationService {

    @Path("/otp")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(final BasicAeroGearUser aeroGearUser);

    @Path("/login")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response otpLogin(final BasicAeroGearUser aeroGearUser);

    @Path("/logout")
    @GET
    public void logout();

    @Path("/otp/secret")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSecret();

    @Path("/userinfo")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUserInfo();
}
