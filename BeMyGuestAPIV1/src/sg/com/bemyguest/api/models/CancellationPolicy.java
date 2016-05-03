/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CancellationPolicy 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5479045307617569063L;
    private int numberOfDays;
    private int refundPercentage;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("numberOfDays")
    public int getNumberOfDays ( ) { 
        return this.numberOfDays;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("numberOfDays")
    public void setNumberOfDays (int value) { 
        this.numberOfDays = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("refundPercentage")
    public int getRefundPercentage ( ) { 
        return this.refundPercentage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("refundPercentage")
    public void setRefundPercentage (int value) { 
        this.refundPercentage = value;
    }
 
}
 