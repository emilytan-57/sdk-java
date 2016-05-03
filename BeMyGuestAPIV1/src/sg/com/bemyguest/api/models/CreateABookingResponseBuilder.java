/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class CreateABookingResponseBuilder {
    //the instance to build
    private CreateABookingResponse createABookingResponse;

    /**
     * Default constructor to initialize the instance
     */
    public CreateABookingResponseBuilder() {
        createABookingResponse = new CreateABookingResponse();
    }

    public CreateABookingResponseBuilder data(List<String> data) {
        createABookingResponse.setData(data);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateABookingResponse build() {
        return createABookingResponse;
    }
}