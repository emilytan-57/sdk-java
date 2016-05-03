/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Addon 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5660962324068712456L;
    private String description;
    private String descriptionTranslated;
    private double pricePerPerson;
    private String title;
    private String titleTranslated;
    private String uuid;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("descriptionTranslated")
    public String getDescriptionTranslated ( ) { 
        return this.descriptionTranslated;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("descriptionTranslated")
    public void setDescriptionTranslated (String value) { 
        this.descriptionTranslated = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("pricePerPerson")
    public double getPricePerPerson ( ) { 
        return this.pricePerPerson;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("pricePerPerson")
    public void setPricePerPerson (double value) { 
        this.pricePerPerson = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("title")
    public String getTitle ( ) { 
        return this.title;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("title")
    public void setTitle (String value) { 
        this.title = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("titleTranslated")
    public String getTitleTranslated ( ) { 
        return this.titleTranslated;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("titleTranslated")
    public void setTitleTranslated (String value) { 
        this.titleTranslated = value;
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
 