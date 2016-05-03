/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class UpdateBookingRequestBuilder {
    //the instance to build
    private UpdateBookingRequest updateBookingRequest;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateBookingRequestBuilder() {
        updateBookingRequest = new UpdateBookingRequest();
    }

    public UpdateBookingRequestBuilder status(BookingStatusEnum status) {
        updateBookingRequest.setStatus(status);
        return this;
    }

    public UpdateBookingRequestBuilder uuid(String uuid) {
        updateBookingRequest.setUuid(uuid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateBookingRequest build() {
        return updateBookingRequest;
    }
}