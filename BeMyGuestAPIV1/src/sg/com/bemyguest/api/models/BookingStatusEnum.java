/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;
public enum BookingStatusEnum {
    confirm, //Confirms given booking
    cancel, //Cancels given booking
    resend; //If confirmationEmailSentAt value is not null then copy of the confirmation email sent to partner will be sent again and the timestamp value of this field will be updated
    /**
    * Returns the enum member associated with the given integer value
    * @return	The enum member against the given integer value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static BookingStatusEnum fromString(String toConvert) {
        return BookingStatusEnum.valueOf(toConvert);
    }

    /**
    * Returns the integer value associated with the enum member
    * @return	The integer value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return this.name();
    }
} 