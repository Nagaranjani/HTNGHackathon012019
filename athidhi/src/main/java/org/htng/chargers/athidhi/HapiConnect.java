package org.htng.chargers.athidhi;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class HapiConnect {

	public static void main(String[] args) {
		
		DateClass date = new DateClass();
		
		//String entity = "{\"fromDate\": \""+date.getFromDate()+"\"}";
		Client client = ClientBuilder.newClient();
		WebTarget baseTarget = client.target(HapiProperties.BASE_TARGET);
		
		WebTarget reservationsTarget = baseTarget.path(HapiProperties.RESERVATIONS_SEARCH);
		
		String string = //client.target(HapiProperties.RESERVATIONS_SEARCH)
				reservationsTarget
				.request()
				.header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJzaGFzdGEiLCJyZXBvc2l0b3J5QWNjZXNzSWQiOiJzaGFzdGEiLCJleHAiOjE1NDg2MzI1NDN9.OLcGQC6A7-wJMW66BhtHxb7t1ILonLoHp0B9Tll1-yg8jmvIADeatCRpkbxgM3W8-JgV4cHK2HtEqGfth8LMrQ")
				.post(Entity.entity(date, MediaType.APPLICATION_JSON), String.class); 
				
		System.out.println(string);
	}

}
