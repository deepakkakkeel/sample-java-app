package com.atlas.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.atlas.api.Atlas;
import com.atlas.api.Country;
import com.atlas.biz.*;

@Path("/atlas")
public class AtlasController {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/country")
	public Response add(Country country) {
		/* Add country using the business logic */
		Atlas atlas = new SimpleAtlas();
		atlas.insertCountry(country);
		return Response.ok().entity("successfully added").build();
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/country/{name}")
	public Response read(@PathParam("name") String countryName) {
		Atlas atlas = new SimpleAtlas();
		Country country = atlas.getCountry(countryName);
		return Response.ok().entity(country).build();
	}
}
