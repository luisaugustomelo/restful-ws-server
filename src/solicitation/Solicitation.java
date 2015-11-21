package solicitation;

import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/solicitation")
public class Solicitation {

	//http://localhost:8080/RestfulWS/solicitation/xml
	@GET
	@Produces(MediaType.TEXT_XML)
	@Path("/xml")
	public String sayHelloXML(){
		String response = "<?xml version='1.0'?>" +
				"<hello>Hello XML</hello>";
		return response;
	}
	
	//http://localhost:8080/RestfulWS/solicitation/html
	@GET
	@Produces(MediaType.TEXT_HTML) //ou MediaType.APPLICATION_JSON
	@Path("/html")
	public String sayHelloHTML(){
		String response = "<h1>Hello HTML</h1>";
		return response;
	}
	
	//http://localhost:8080/RestfulWS/solicitation/xml/oi
	//Envia o parametro oi para o retorno do XML
	@GET
	@Produces(MediaType.TEXT_XML)
	
	@Path("/xml/{name}")
	public String sayHelloXML( @PathParam("name") String a){
		String response = "<?xml version='1.0'?>" +
							"<hello>Hello "+a+"</hello>";
		return response;
	}
	
}
