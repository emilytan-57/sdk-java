/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class CreateABookingRequestBuilder {
    //the instance to build
    private CreateABookingRequest createABookingRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateABookingRequestBuilder() {
        createABookingRequest = new CreateABookingRequest();
    }

    /**
     * Add-ons for product (array of uuid/quantity values)
     */
    public CreateABookingRequestBuilder addons(List<LinkedHashMap<String, Object>> addons) {
        createABookingRequest.setAddons(addons);
        return this;
    }

    /**
     * Arrival date in YYYY-MM-DD format
     */
    public CreateABookingRequestBuilder arrivalDate(String arrivalDate) {
        createABookingRequest.setArrivalDate(arrivalDate);
        return this;
    }

    /**
     * Number of children
     */
    public CreateABookingRequestBuilder children(int children) {
        createABookingRequest.setChildren(children);
        return this;
    }

    /**
     * Guest's email address
     */
    public CreateABookingRequestBuilder email(String email) {
        createABookingRequest.setEmail(email);
        return this;
    }

    /**
     * Guest's first name
     */
    public CreateABookingRequestBuilder firstName(String firstName) {
        createABookingRequest.setFirstName(firstName);
        return this;
    }

    /**
     * Guest's last name
     */
    public CreateABookingRequestBuilder lastName(String lastName) {
        createABookingRequest.setLastName(lastName);
        return this;
    }

    /**
     * Message to the host
     */
    public CreateABookingRequestBuilder message(String message) {
        createABookingRequest.setMessage(message);
        return this;
    }

    /**
     * Maximum 36 characters partner reference code or number
     */
    public CreateABookingRequestBuilder partnerReference(String partnerReference) {
        createABookingRequest.setPartnerReference(partnerReference);
        return this;
    }

    /**
     * Number of adults
     */
    public CreateABookingRequestBuilder pax(int pax) {
        createABookingRequest.setPax(pax);
        return this;
    }

    /**
     * Guest's phone number
     */
    public CreateABookingRequestBuilder phone(String phone) {
        createABookingRequest.setPhone(phone);
        return this;
    }

    /**
     * UUID of the ProductType
     */
    public CreateABookingRequestBuilder productTypeUuid(String productTypeUuid) {
        createABookingRequest.setProductTypeUuid(productTypeUuid);
        return this;
    }

    /**
     * One of Mr.|Ms.|Mrs.
     */
    public CreateABookingRequestBuilder salutation(String salutation) {
        createABookingRequest.setSalutation(salutation);
        return this;
    }

    /**
     * Selected timeslot. If the product has timeslots, the "timeslotUUID" of the product is REQUIRED in "Check a Booking" and "Create a new booking" methods. Otherwise, it can be excluded
     */
    public CreateABookingRequestBuilder timeSlotUuid(String timeSlotUuid) {
        createABookingRequest.setTimeSlotUuid(timeSlotUuid);
        return this;
    }

    /**
     * f API should check price against "promotion" and not "regular" , default is set to "false"
     */
    public CreateABookingRequestBuilder usePromotion(boolean usePromotion) {
        createABookingRequest.setUsePromotion(usePromotion);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateABookingRequest build() {
        return createABookingRequest;
    }
}