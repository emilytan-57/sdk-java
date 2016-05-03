/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CheckABookingRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5702826598095367342L;
    private List<LinkedHashMap<String, Object>> addons;
    private String arrivalDate;
    private int children;
    private int pax;
    private String productTypeUuid;
    private String timeSlotUuid;
    private boolean usePromotion;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("addons")
    public List<LinkedHashMap<String, Object>> getAddons ( ) { 
        return this.addons;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("addons")
    public void setAddons (List<LinkedHashMap<String, Object>> value) { 
        this.addons = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("arrivalDate")
    public String getArrivalDate ( ) { 
        return this.arrivalDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("arrivalDate")
    public void setArrivalDate (String value) { 
        this.arrivalDate = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("children")
    public int getChildren ( ) { 
        return this.children;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("children")
    public void setChildren (int value) { 
        this.children = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("pax")
    public int getPax ( ) { 
        return this.pax;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("pax")
    public void setPax (int value) { 
        this.pax = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("productTypeUuid")
    public String getProductTypeUuid ( ) { 
        return this.productTypeUuid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("productTypeUuid")
    public void setProductTypeUuid (String value) { 
        this.productTypeUuid = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("timeSlotUuid")
    public String getTimeSlotUuid ( ) { 
        return this.timeSlotUuid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("timeSlotUuid")
    public void setTimeSlotUuid (String value) { 
        this.timeSlotUuid = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("usePromotion")
    public boolean getUsePromotion ( ) { 
        return this.usePromotion;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("usePromotion")
    public void setUsePromotion (boolean value) { 
        this.usePromotion = value;
    }
 
}
 