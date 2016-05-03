/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PhotoPaths 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5267577720961384758L;
    private String m1280x720;
    private String m175x112;
    private String m1920x1080;
    private String m2048x1536;
    private String m680x325;
    private String m75x50;
    private String original;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("1280x720")
    public String getM1280x720 ( ) { 
        return this.m1280x720;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("1280x720")
    public void setM1280x720 (String value) { 
        this.m1280x720 = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("175x112")
    public String getM175x112 ( ) { 
        return this.m175x112;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("175x112")
    public void setM175x112 (String value) { 
        this.m175x112 = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("1920x1080")
    public String getM1920x1080 ( ) { 
        return this.m1920x1080;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("1920x1080")
    public void setM1920x1080 (String value) { 
        this.m1920x1080 = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("2048x1536")
    public String getM2048x1536 ( ) { 
        return this.m2048x1536;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("2048x1536")
    public void setM2048x1536 (String value) { 
        this.m2048x1536 = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("680x325")
    public String getM680x325 ( ) { 
        return this.m680x325;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("680x325")
    public void setM680x325 (String value) { 
        this.m680x325 = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("75x50")
    public String getM75x50 ( ) { 
        return this.m75x50;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("75x50")
    public void setM75x50 (String value) { 
        this.m75x50 = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("original")
    public String getOriginal ( ) { 
        return this.original;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("original")
    public void setOriginal (String value) { 
        this.original = value;
    }
 
}
 