package rest;

import java.io.IOException;
import java.net.MalformedURLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;



import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;



@Path("/find")
public class UserController {
	
	@POST @Consumes(MediaType.APPLICATION_JSON) @Produces(MediaType.APPLICATION_JSON)
	public void fetch (@FormParam("sn1") String sn1, @FormParam("sn2") String sn2, @FormParam("sn3") String sn3, @FormParam("sn4") String sn4, @FormParam("sn5") String sn5) throws MalformedURLException, IOException, InterruptedException, JSONException  {
		
        
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
