/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class GETProductsResponseBuilder {
    //the instance to build
    private GETProductsResponse gETProductsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GETProductsResponseBuilder() {
        gETProductsResponse = new GETProductsResponse();
    }

    public GETProductsResponseBuilder data(List<Product> data) {
        gETProductsResponse.setData(data);
        return this;
    }

    public GETProductsResponseBuilder meta(LinkedHashMap<String, Object> meta) {
        gETProductsResponse.setMeta(meta);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GETProductsResponse build() {
        return gETProductsResponse;
    }
}