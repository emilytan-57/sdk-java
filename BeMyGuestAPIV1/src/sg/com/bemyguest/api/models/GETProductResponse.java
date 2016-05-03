/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GETProductResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5616691923745968172L;
    private Product data;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("data")
    public Product getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("data")
    public void setData (Product value) { 
        this.data = value;
    }
 
}
 