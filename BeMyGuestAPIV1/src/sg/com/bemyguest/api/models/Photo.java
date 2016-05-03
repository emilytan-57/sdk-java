/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Photo 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4700851231938392660L;
    private String caption;
    private PhotoPaths paths;
    private String uuid;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("caption")
    public String getCaption ( ) { 
        return this.caption;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("caption")
    public void setCaption (String value) { 
        this.caption = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("paths")
    public PhotoPaths getPaths ( ) { 
        return this.paths;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("paths")
    public void setPaths (PhotoPaths value) { 
        this.paths = value;
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
 