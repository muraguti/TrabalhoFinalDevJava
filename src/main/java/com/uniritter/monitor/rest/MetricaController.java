package com.uniritter.monitor.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.springframework.stereotype.Component;

@Component
@Produces("application/json")
@Consumes("application/json")
@Path("metricas")
public class MetricaController {
	
	@GET
	public Response getMetricas(){
		String metrica = "{\"metrica\": \"Espaco em disco\"}";
		return Response.ok(metrica).build();
	}
	
	/*
	@POST
	public Response postMetrica(Metrica metrica){
		Metrica novaMetrica = service.CreateMetrica(metrica.getNome());
		return Response.ok(novaMetrica).build();
	}
	*/
	
}
