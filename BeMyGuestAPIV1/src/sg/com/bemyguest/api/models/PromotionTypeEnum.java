/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;
public enum PromotionTypeEnum {
    early_booking, //TODO: Write general description for this element
    last_minute, //TODO: Write general description for this element
    discount; //TODO: Write general description for this element
    /**
    * Returns the enum member associated with the given integer value
    * @return	The enum member against the given integer value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static PromotionTypeEnum fromString(String toConvert) {
        return PromotionTypeEnum.valueOf(toConvert);
    }

    /**
    * Returns the integer value associated with the enum member
    * @return	The integer value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return this.name();
    }
} 