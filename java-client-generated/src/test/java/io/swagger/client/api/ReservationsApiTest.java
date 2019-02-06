/*
 * HAPI Repository API
 * API for retrieving objects from HAPI repository
 *
 * OpenAPI spec version: 2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Error;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.Reservation;
import io.swagger.client.model.SearchRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReservationsApi
 */
@Ignore
public class ReservationsApiTest {

    private final ReservationsApi api = new ReservationsApi();

    
    /**
     * Get reservation by reservation id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReservationTest() throws ApiException {
        String propertyCode = "SHASTA";
        String id = null;
        Reservation response = api.getReservation(propertyCode, id);

        // TODO: test validations
    }
    
    /**
     * Get reservations by date range. Paging is included. Maximum value of returned reservations is 1000
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReservationsTest() throws ApiException {
        SearchRequest searchRequest = null;
        InlineResponse200 response = api.getReservations(searchRequest);

        // TODO: test validations
    }
    
}
