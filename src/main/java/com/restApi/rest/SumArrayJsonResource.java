package com.restApi.rest;

import java.io.FileNotFoundException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.restApi.core.SumService;
import com.restApi.dto.SumResponseDTO;


@Path("/sum")
public class SumArrayJsonResource {
	private SumService service;
	public SumArrayJsonResource(){
		this.service = new SumService();
	}
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addAnalytics() {
		SumResponseDTO stats = null;
		try {
			stats = service.getSums();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return Response.status(Status.OK).entity(stats).build();
	}
}
