/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;
public enum BookingStatusesEnum {
    reserved, //TODO: Write general description for this element
    waiting, //TODO: Write general description for this element
    cancelled, //TODO: Write general description for this element
    approved, //TODO: Write general description for this element
    expired, //TODO: Write general description for this element
    rejected, //TODO: Write general description for this element
    released, //TODO: Write general description for this element
    refunded; //TODO: Write general description for this element
    /**
    * Returns the enum member associated with the given integer value
    * @return	The enum member against the given integer value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static BookingStatusesEnum fromString(String toConvert) {
        return BookingStatusesEnum.valueOf(toConvert);
    }

    /**
    * Returns the integer value associated with the enum member
    * @return	The integer value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return this.name();
    }
} 