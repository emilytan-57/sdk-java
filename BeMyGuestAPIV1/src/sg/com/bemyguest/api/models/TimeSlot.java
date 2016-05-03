/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TimeSlot 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5621271310248165558L;
    private String endTime;
    private String startTime;
    private String uuid;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("endTime")
    public String getEndTime ( ) { 
        return this.endTime;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("endTime")
    public void setEndTime (String value) { 
        this.endTime = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("startTime")
    public String getStartTime ( ) { 
        return this.startTime;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("startTime")
    public void setStartTime (String value) { 
        this.startTime = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("uuid")
    public String getUuid ( ) { 
        return this.uuid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("uuid")
    public void setUuid (String value) { 
        this.uuid = value;
    }
 
}
 