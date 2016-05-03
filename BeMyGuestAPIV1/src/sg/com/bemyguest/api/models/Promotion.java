/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Promotion 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5321101928703394858L;
    private LinkedHashMap<String, Object> adult;
    private List<CancellationPolicy> cancellationPolicy;
    private int child;
    private Integer daysInAdvance;
    private int discountPercent;
    private Integer hoursInAdvance;
    private String name;
    private PromotionTypeEnum type;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("adult")
    public LinkedHashMap<String, Object> getAdult ( ) { 
        return this.adult;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("adult")
    public void setAdult (LinkedHashMap<String, Object> value) { 
        this.adult = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cancellationPolicy")
    public List<CancellationPolicy> getCancellationPolicy ( ) { 
        return this.cancellationPolicy;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cancellationPolicy")
    public void setCancellationPolicy (List<CancellationPolicy> value) { 
        this.cancellationPolicy = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("child")
    public int getChild ( ) { 
        return this.child;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("child")
    public void setChild (int value) { 
        this.child = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("daysInAdvance")
    public Integer getDaysInAdvance ( ) { 
        return this.daysInAdvance;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("daysInAdvance")
    public void setDaysInAdvance (Integer value) { 
        this.daysInAdvance = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("discountPercent")
    public int getDiscountPercent ( ) { 
        return this.discountPercent;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("discountPercent")
    public void setDiscountPercent (int value) { 
        this.discountPercent = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("hoursInAdvance")
    public Integer getHoursInAdvance ( ) { 
        return this.hoursInAdvance;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("hoursInAdvance")
    public void setHoursInAdvance (Integer value) { 
        this.hoursInAdvance = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("type")
    public PromotionTypeEnum getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("type")
    public void setType (PromotionTypeEnum value) { 
        this.type = value;
    }
 
}
 