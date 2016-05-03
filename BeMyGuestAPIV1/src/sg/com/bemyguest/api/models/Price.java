/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Price 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5372867635007081189L;
    private Promotion promotion;
    private PriceSet regular;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("promotion")
    public Promotion getPromotion ( ) { 
        return this.promotion;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("promotion")
    public void setPromotion (Promotion value) { 
        this.promotion = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("regular")
    public PriceSet getRegular ( ) { 
        return this.regular;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("regular")
    public void setRegular (PriceSet value) { 
        this.regular = value;
    }
 
}
 