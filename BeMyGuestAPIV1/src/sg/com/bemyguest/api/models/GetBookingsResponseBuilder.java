/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class GetBookingsResponseBuilder 
        extends BaseResponseBuilder {
    //the instance to build
    private GetBookingsResponse getBookingsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetBookingsResponseBuilder() {
        getBookingsResponse = new GetBookingsResponse();
    }

    public GetBookingsResponseBuilder meta(LinkedHashMap<String, Object> meta) {
        getBookingsResponse.setMeta(meta);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetBookingsResponse build() {
        return getBookingsResponse;
    }
}