/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class CheckABookingRequestBuilder {
    //the instance to build
    private CheckABookingRequest checkABookingRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CheckABookingRequestBuilder() {
        checkABookingRequest = new CheckABookingRequest();
    }

    public CheckABookingRequestBuilder addons(List<LinkedHashMap<String, Object>> addons) {
        checkABookingRequest.setAddons(addons);
        return this;
    }

    public CheckABookingRequestBuilder arrivalDate(String arrivalDate) {
        checkABookingRequest.setArrivalDate(arrivalDate);
        return this;
    }

    public CheckABookingRequestBuilder children(int children) {
        checkABookingRequest.setChildren(children);
        return this;
    }

    public CheckABookingRequestBuilder pax(int pax) {
        checkABookingRequest.setPax(pax);
        return this;
    }

    public CheckABookingRequestBuilder productTypeUuid(String productTypeUuid) {
        checkABookingRequest.setProductTypeUuid(productTypeUuid);
        return this;
    }

    public CheckABookingRequestBuilder timeSlotUuid(String timeSlotUuid) {
        checkABookingRequest.setTimeSlotUuid(timeSlotUuid);
        return this;
    }

    public CheckABookingRequestBuilder usePromotion(boolean usePromotion) {
        checkABookingRequest.setUsePromotion(usePromotion);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CheckABookingRequest build() {
        return checkABookingRequest;
    }
}