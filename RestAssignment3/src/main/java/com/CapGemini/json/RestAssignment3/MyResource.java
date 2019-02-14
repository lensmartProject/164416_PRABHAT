package com.CapGemini.json.RestAssignment3;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.prabhat.dao.AddressDAO;
import com.prabhat.pojo.AddressPOJO;

@Path("myresource")// http://localhost:8081/assignment/webapi/myresource
public
 class MyResource {
	private AddressDAO dao = new AddressDAO();
	@GET
	@Produces(MediaType.APPLICATION_JSON)	
public List<AddressPOJO> getAllData() {

	System.out.println("Showing all users");
		return dao.getAddressAllUsers();
	}	
@GET	
@Produces(MediaType.APPLICATION_JSON)
	
@Path("{zipcode}")// http://localhost:8081/assignment/webapi/myresource/{zipcode}

	public AddressPOJO getData(@PathParam ("zipcode") String zipcode) {		
		return dao.getAddress(zipcode);
	}
}

