/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Location 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5632483133427797098L;
    private String city;
    private String cityUuid;
    private String country;
    private String countryUuid;
    private String state;
    private String stateUuid;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("city")
    public String getCity ( ) { 
        return this.city;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("city")
    public void setCity (String value) { 
        this.city = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cityUuid")
    public String getCityUuid ( ) { 
        return this.cityUuid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cityUuid")
    public void setCityUuid (String value) { 
        this.cityUuid = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("country")
    public void setCountry (String value) { 
        this.country = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("countryUuid")
    public String getCountryUuid ( ) { 
        return this.countryUuid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("countryUuid")
    public void setCountryUuid (String value) { 
        this.countryUuid = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("state")
    public String getState ( ) { 
        return this.state;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("state")
    public void setState (String value) { 
        this.state = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("stateUuid")
    public String getStateUuid ( ) { 
        return this.stateUuid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("stateUuid")
    public void setStateUuid (String value) { 
        this.stateUuid = value;
    }
 
}
 