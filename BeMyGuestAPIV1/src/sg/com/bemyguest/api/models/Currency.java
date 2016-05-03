/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Currency 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5273659959994814379L;
    private String code;
    private String symbol;
    private String uuid;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("code")
    public void setCode (String value) { 
        this.code = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("symbol")
    public String getSymbol ( ) { 
        return this.symbol;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("symbol")
    public void setSymbol (String value) { 
        this.symbol = value;
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
 