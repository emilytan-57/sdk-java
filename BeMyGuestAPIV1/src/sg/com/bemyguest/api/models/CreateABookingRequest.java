/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateABookingRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4756080867365142991L;
    private List<LinkedHashMap<String, Object>> addons;
    private String arrivalDate;
    private int children;
    private String email;
    private String firstName;
    private String lastName;
    private String message;
    private String partnerReference;
    private int pax;
    private String phone;
    private String productTypeUuid;
    private String salutation;
    private String timeSlotUuid;
    private boolean usePromotion;
    /** GETTER
     * Add-ons for product (array of uuid/quantity values)
     */
    @JsonGetter("addons")
    public List<LinkedHashMap<String, Object>> getAddons ( ) { 
        return this.addons;
    }
    
    /** SETTER
     * Add-ons for product (array of uuid/quantity values)
     */
    @JsonSetter("addons")
    public void setAddons (List<LinkedHashMap<String, Object>> value) { 
        this.addons = value;
    }
 
    /** GETTER
     * Arrival date in YYYY-MM-DD format
     */
    @JsonGetter("arrivalDate")
    public String getArrivalDate ( ) { 
        return this.arrivalDate;
    }
    
    /** SETTER
     * Arrival date in YYYY-MM-DD format
     */
    @JsonSetter("arrivalDate")
    public void setArrivalDate (String value) { 
        this.arrivalDate = value;
    }
 
    /** GETTER
     * Number of children
     */
    @JsonGetter("children")
    public int getChildren ( ) { 
        return this.children;
    }
    
    /** SETTER
     * Number of children
     */
    @JsonSetter("children")
    public void setChildren (int value) { 
        this.children = value;
    }
 
    /** GETTER
     * Guest's email address
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * Guest's email address
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
    }
 
    /** GETTER
     * Guest's first name
     */
    @JsonGetter("firstName")
    public String getFirstName ( ) { 
        return this.firstName;
    }
    
    /** SETTER
     * Guest's first name
     */
    @JsonSetter("firstName")
    public void setFirstName (String value) { 
        this.firstName = value;
    }
 
    /** GETTER
     * Guest's last name
     */
    @JsonGetter("lastName")
    public String getLastName ( ) { 
        return this.lastName;
    }
    
    /** SETTER
     * Guest's last name
     */
    @JsonSetter("lastName")
    public void setLastName (String value) { 
        this.lastName = value;
    }
 
    /** GETTER
     * Message to the host
     */
    @JsonGetter("message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * Message to the host
     */
    @JsonSetter("message")
    public void setMessage (String value) { 
        this.message = value;
    }
 
    /** GETTER
     * Maximum 36 characters partner reference code or number
     */
    @JsonGetter("partnerReference")
    public String getPartnerReference ( ) { 
        return this.partnerReference;
    }
    
    /** SETTER
     * Maximum 36 characters partner reference code or number
     */
    @JsonSetter("partnerReference")
    public void setPartnerReference (String value) { 
        this.partnerReference = value;
    }
 
    /** GETTER
     * Number of adults
     */
    @JsonGetter("pax")
    public int getPax ( ) { 
        return this.pax;
    }
    
    /** SETTER
     * Number of adults
     */
    @JsonSetter("pax")
    public void setPax (int value) { 
        this.pax = value;
    }
 
    /** GETTER
     * Guest's phone number
     */
    @JsonGetter("phone")
    public String getPhone ( ) { 
        return this.phone;
    }
    
    /** SETTER
     * Guest's phone number
     */
    @JsonSetter("phone")
    public void setPhone (String value) { 
        this.phone = value;
    }
 
    /** GETTER
     * UUID of the ProductType
     */
    @JsonGetter("productTypeUuid")
    public String getProductTypeUuid ( ) { 
        return this.productTypeUuid;
    }
    
    /** SETTER
     * UUID of the ProductType
     */
    @JsonSetter("productTypeUuid")
    public void setProductTypeUuid (String value) { 
        this.productTypeUuid = value;
    }
 
    /** GETTER
     * One of Mr.|Ms.|Mrs.
     */
    @JsonGetter("salutation")
    public String getSalutation ( ) { 
        return this.salutation;
    }
    
    /** SETTER
     * One of Mr.|Ms.|Mrs.
     */
    @JsonSetter("salutation")
    public void setSalutation (String value) { 
        this.salutation = value;
    }
 
    /** GETTER
     * Selected timeslot. If the product has timeslots, the "timeslotUUID" of the product is REQUIRED in "Check a Booking" and "Create a new booking" methods. Otherwise, it can be excluded
     */
    @JsonGetter("timeSlotUuid")
    public String getTimeSlotUuid ( ) { 
        return this.timeSlotUuid;
    }
    
    /** SETTER
     * Selected timeslot. If the product has timeslots, the "timeslotUUID" of the product is REQUIRED in "Check a Booking" and "Create a new booking" methods. Otherwise, it can be excluded
     */
    @JsonSetter("timeSlotUuid")
    public void setTimeSlotUuid (String value) { 
        this.timeSlotUuid = value;
    }
 
    /** GETTER
     * f API should check price against "promotion" and not "regular" , default is set to "false"
     */
    @JsonGetter("usePromotion")
    public boolean getUsePromotion ( ) { 
        return this.usePromotion;
    }
    
    /** SETTER
     * f API should check price against "promotion" and not "regular" , default is set to "false"
     */
    @JsonSetter("usePromotion")
    public void setUsePromotion (boolean value) { 
        this.usePromotion = value;
    }
 
}
 