/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class CheckABookingResponseBuilder {
    //the instance to build
    private CheckABookingResponse checkABookingResponse;

    /**
     * Default constructor to initialize the instance
     */
    public CheckABookingResponseBuilder() {
        checkABookingResponse = new CheckABookingResponse();
    }

    public CheckABookingResponseBuilder data(List<String> data) {
        checkABookingResponse.setData(data);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CheckABookingResponse build() {
        return checkABookingResponse;
    }
}