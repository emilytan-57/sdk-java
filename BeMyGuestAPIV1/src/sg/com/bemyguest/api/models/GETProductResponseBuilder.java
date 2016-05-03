/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class GETProductResponseBuilder {
    //the instance to build
    private GETProductResponse gETProductResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GETProductResponseBuilder() {
        gETProductResponse = new GETProductResponse();
    }

    public GETProductResponseBuilder data(Product data) {
        gETProductResponse.setData(data);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GETProductResponse build() {
        return gETProductResponse;
    }
}