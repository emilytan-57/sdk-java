/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ProductType 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5053286768402530508L;
    private boolean allowChildren;
    private int daysInAdvance;
    private String description;
    private String descriptionTranslated;
    private int durationDays;
    private int durationHours;
    private int durationMinutes;
    private boolean hasChildPrice;
    private boolean instantConfirmation;
    private boolean isNonRefundable;
    private int maxAdultAge;
    private String maxChildAge;
    private int minAdultAge;
    private String minChildAge;
    private int paxMax;
    private int paxMin;
    private LinkedHashMap<String, Object> prices;
    private double recommendedMarkup;
    private List<TimeSlot> timeSlots;
    private String title;
    private String titleTranslated;
    private String uuid;
    private String voucherRedemptionAddress;
    private String voucherRedemptionAddressTranslated;
    private String voucherUse;
    private String voucherUseTranslated;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("allowChildren")
    public boolean getAllowChildren ( ) { 
        return this.allowChildren;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("allowChildren")
    public void setAllowChildren (boolean value) { 
        this.allowChildren = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("daysInAdvance")
    public int getDaysInAdvance ( ) { 
        return this.daysInAdvance;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("daysInAdvance")
    public void setDaysInAdvance (int value) { 
        this.daysInAdvance = value;
    }
 
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
    @JsonGetter("durationDays")
    public int getDurationDays ( ) { 
        return this.durationDays;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("durationDays")
    public void setDurationDays (int value) { 
        this.durationDays = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("durationHours")
    public int getDurationHours ( ) { 
        return this.durationHours;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("durationHours")
    public void setDurationHours (int value) { 
        this.durationHours = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("durationMinutes")
    public int getDurationMinutes ( ) { 
        return this.durationMinutes;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("durationMinutes")
    public void setDurationMinutes (int value) { 
        this.durationMinutes = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("hasChildPrice")
    public boolean getHasChildPrice ( ) { 
        return this.hasChildPrice;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("hasChildPrice")
    public void setHasChildPrice (boolean value) { 
        this.hasChildPrice = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("instantConfirmation")
    public boolean getInstantConfirmation ( ) { 
        return this.instantConfirmation;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("instantConfirmation")
    public void setInstantConfirmation (boolean value) { 
        this.instantConfirmation = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("isNonRefundable")
    public boolean getIsNonRefundable ( ) { 
        return this.isNonRefundable;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("isNonRefundable")
    public void setIsNonRefundable (boolean value) { 
        this.isNonRefundable = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("maxAdultAge")
    public int getMaxAdultAge ( ) { 
        return this.maxAdultAge;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("maxAdultAge")
    public void setMaxAdultAge (int value) { 
        this.maxAdultAge = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("maxChildAge")
    public String getMaxChildAge ( ) { 
        return this.maxChildAge;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("maxChildAge")
    public void setMaxChildAge (String value) { 
        this.maxChildAge = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("minAdultAge")
    public int getMinAdultAge ( ) { 
        return this.minAdultAge;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("minAdultAge")
    public void setMinAdultAge (int value) { 
        this.minAdultAge = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("minChildAge")
    public String getMinChildAge ( ) { 
        return this.minChildAge;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("minChildAge")
    public void setMinChildAge (String value) { 
        this.minChildAge = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("paxMax")
    public int getPaxMax ( ) { 
        return this.paxMax;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("paxMax")
    public void setPaxMax (int value) { 
        this.paxMax = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("paxMin")
    public int getPaxMin ( ) { 
        return this.paxMin;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("paxMin")
    public void setPaxMin (int value) { 
        this.paxMin = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("prices")
    public LinkedHashMap<String, Object> getPrices ( ) { 
        return this.prices;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("prices")
    public void setPrices (LinkedHashMap<String, Object> value) { 
        this.prices = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("recommendedMarkup")
    public double getRecommendedMarkup ( ) { 
        return this.recommendedMarkup;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("recommendedMarkup")
    public void setRecommendedMarkup (double value) { 
        this.recommendedMarkup = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("timeSlots")
    public List<TimeSlot> getTimeSlots ( ) { 
        return this.timeSlots;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("timeSlots")
    public void setTimeSlots (List<TimeSlot> value) { 
        this.timeSlots = value;
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
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("voucherRedemptionAddress")
    public String getVoucherRedemptionAddress ( ) { 
        return this.voucherRedemptionAddress;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("voucherRedemptionAddress")
    public void setVoucherRedemptionAddress (String value) { 
        this.voucherRedemptionAddress = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("voucherRedemptionAddressTranslated")
    public String getVoucherRedemptionAddressTranslated ( ) { 
        return this.voucherRedemptionAddressTranslated;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("voucherRedemptionAddressTranslated")
    public void setVoucherRedemptionAddressTranslated (String value) { 
        this.voucherRedemptionAddressTranslated = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("voucherUse")
    public String getVoucherUse ( ) { 
        return this.voucherUse;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("voucherUse")
    public void setVoucherUse (String value) { 
        this.voucherUse = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("voucherUseTranslated")
    public String getVoucherUseTranslated ( ) { 
        return this.voucherUseTranslated;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("voucherUseTranslated")
    public void setVoucherUseTranslated (String value) { 
        this.voucherUseTranslated = value;
    }
 
}
 