/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GETProductsResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5045333745422118171L;
    private List<Product> data;
    private LinkedHashMap<String, Object> meta;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("data")
    public List<Product> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("data")
    public void setData (List<Product> value) { 
        this.data = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("meta")
    public LinkedHashMap<String, Object> getMeta ( ) { 
        return this.meta;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("meta")
    public void setMeta (LinkedHashMap<String, Object> value) { 
        this.meta = value;
    }
 
}
 