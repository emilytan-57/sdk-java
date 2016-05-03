/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Product 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5559234322381923806L;
    private String additionalInfo;
    private String additionalInfoTranslated;
    private List<Addon> addons;
    private List<Language> audioHeadsetLanguages;
    private double basePrice;
    private String businessHoursFrom;
    private String businessHoursTo;
    private List<Category> categories;
    private Currency currency;
    private String description;
    private String descriptionTranslated;
    private List<Language> guideLanguages;
    private String highlights;
    private String highlightsTranslated;
    private boolean hotelPickup;
    private boolean isFlatPaxPrice;
    private String itinerary;
    private String itineraryTranslated;
    private String latitude;
    private List<Location> locations;
    private String longitude;
    private int maxPax;
    private String meetingLocation;
    private String meetingLocationTranslated;
    private String meetingTime;
    private int minPax;
    private List<Photo> photos;
    private String photosUrl;
    private String priceExcludes;
    private String priceExcludesTranslated;
    private String priceIncludes;
    private String priceIncludesTranslated;
    private List<ProductType> productTypes;
    private double reviewAverageScore;
    private int reviewCount;
    private String safety;
    private String safetyTranslated;
    private String staticUrl;
    private String title;
    private String titleTranslated;
    private String typeName;
    private String typeUuid;
    private String url;
    private String uuid;
    private String warnings;
    private String warningsTranslated;
    private List<Language> writtenLanguages;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("additionalInfo")
    public String getAdditionalInfo ( ) { 
        return this.additionalInfo;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("additionalInfo")
    public void setAdditionalInfo (String value) { 
        this.additionalInfo = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("additionalInfoTranslated")
    public String getAdditionalInfoTranslated ( ) { 
        return this.additionalInfoTranslated;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("additionalInfoTranslated")
    public void setAdditionalInfoTranslated (String value) { 
        this.additionalInfoTranslated = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("addons")
    public List<Addon> getAddons ( ) { 
        return this.addons;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("addons")
    public void setAddons (List<Addon> value) { 
        this.addons = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("audioHeadsetLanguages")
    public List<Language> getAudioHeadsetLanguages ( ) { 
        return this.audioHeadsetLanguages;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("audioHeadsetLanguages")
    public void setAudioHeadsetLanguages (List<Language> value) { 
        this.audioHeadsetLanguages = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("basePrice")
    public double getBasePrice ( ) { 
        return this.basePrice;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("basePrice")
    public void setBasePrice (double value) { 
        this.basePrice = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("businessHoursFrom")
    public String getBusinessHoursFrom ( ) { 
        return this.businessHoursFrom;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("businessHoursFrom")
    public void setBusinessHoursFrom (String value) { 
        this.businessHoursFrom = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("businessHoursTo")
    public String getBusinessHoursTo ( ) { 
        return this.businessHoursTo;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("businessHoursTo")
    public void setBusinessHoursTo (String value) { 
        this.businessHoursTo = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("categories")
    public List<Category> getCategories ( ) { 
        return this.categories;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("categories")
    public void setCategories (List<Category> value) { 
        this.categories = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("currency")
    public Currency getCurrency ( ) { 
        return this.currency;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("currency")
    public void setCurrency (Currency value) { 
        this.currency = value;
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
    @JsonGetter("guideLanguages")
    public List<Language> getGuideLanguages ( ) { 
        return this.guideLanguages;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("guideLanguages")
    public void setGuideLanguages (List<Language> value) { 
        this.guideLanguages = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("highlights")
    public String getHighlights ( ) { 
        return this.highlights;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("highlights")
    public void setHighlights (String value) { 
        this.highlights = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("highlightsTranslated")
    public String getHighlightsTranslated ( ) { 
        return this.highlightsTranslated;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("highlightsTranslated")
    public void setHighlightsTranslated (String value) { 
        this.highlightsTranslated = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("hotelPickup")
    public boolean getHotelPickup ( ) { 
        return this.hotelPickup;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("hotelPickup")
    public void setHotelPickup (boolean value) { 
        this.hotelPickup = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("isFlatPaxPrice")
    public boolean getIsFlatPaxPrice ( ) { 
        return this.isFlatPaxPrice;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("isFlatPaxPrice")
    public void setIsFlatPaxPrice (boolean value) { 
        this.isFlatPaxPrice = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("itinerary")
    public String getItinerary ( ) { 
        return this.itinerary;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("itinerary")
    public void setItinerary (String value) { 
        this.itinerary = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("itineraryTranslated")
    public String getItineraryTranslated ( ) { 
        return this.itineraryTranslated;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("itineraryTranslated")
    public void setItineraryTranslated (String value) { 
        this.itineraryTranslated = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("latitude")
    public String getLatitude ( ) { 
        return this.latitude;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("latitude")
    public void setLatitude (String value) { 
        this.latitude = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("locations")
    public List<Location> getLocations ( ) { 
        return this.locations;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("locations")
    public void setLocations (List<Location> value) { 
        this.locations = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("longitude")
    public String getLongitude ( ) { 
        return this.longitude;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("longitude")
    public void setLongitude (String value) { 
        this.longitude = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("maxPax")
    public int getMaxPax ( ) { 
        return this.maxPax;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("maxPax")
    public void setMaxPax (int value) { 
        this.maxPax = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("meetingLocation")
    public String getMeetingLocation ( ) { 
        return this.meetingLocation;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("meetingLocation")
    public void setMeetingLocation (String value) { 
        this.meetingLocation = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("meetingLocationTranslated")
    public String getMeetingLocationTranslated ( ) { 
        return this.meetingLocationTranslated;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("meetingLocationTranslated")
    public void setMeetingLocationTranslated (String value) { 
        this.meetingLocationTranslated = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("meetingTime")
    public String getMeetingTime ( ) { 
        return this.meetingTime;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("meetingTime")
    public void setMeetingTime (String value) { 
        this.meetingTime = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("minPax")
    public int getMinPax ( ) { 
        return this.minPax;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("minPax")
    public void setMinPax (int value) { 
        this.minPax = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("photos")
    public List<Photo> getPhotos ( ) { 
        return this.photos;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("photos")
    public void setPhotos (List<Photo> value) { 
        this.photos = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("photosUrl")
    public String getPhotosUrl ( ) { 
        return this.photosUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("photosUrl")
    public void setPhotosUrl (String value) { 
        this.photosUrl = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("priceExcludes")
    public String getPriceExcludes ( ) { 
        return this.priceExcludes;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("priceExcludes")
    public void setPriceExcludes (String value) { 
        this.priceExcludes = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("priceExcludesTranslated")
    public String getPriceExcludesTranslated ( ) { 
        return this.priceExcludesTranslated;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("priceExcludesTranslated")
    public void setPriceExcludesTranslated (String value) { 
        this.priceExcludesTranslated = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("priceIncludes")
    public String getPriceIncludes ( ) { 
        return this.priceIncludes;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("priceIncludes")
    public void setPriceIncludes (String value) { 
        this.priceIncludes = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("priceIncludesTranslated")
    public String getPriceIncludesTranslated ( ) { 
        return this.priceIncludesTranslated;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("priceIncludesTranslated")
    public void setPriceIncludesTranslated (String value) { 
        this.priceIncludesTranslated = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("productTypes")
    public List<ProductType> getProductTypes ( ) { 
        return this.productTypes;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("productTypes")
    public void setProductTypes (List<ProductType> value) { 
        this.productTypes = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("reviewAverageScore")
    public double getReviewAverageScore ( ) { 
        return this.reviewAverageScore;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("reviewAverageScore")
    public void setReviewAverageScore (double value) { 
        this.reviewAverageScore = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("reviewCount")
    public int getReviewCount ( ) { 
        return this.reviewCount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("reviewCount")
    public void setReviewCount (int value) { 
        this.reviewCount = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("safety")
    public String getSafety ( ) { 
        return this.safety;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("safety")
    public void setSafety (String value) { 
        this.safety = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("safetyTranslated")
    public String getSafetyTranslated ( ) { 
        return this.safetyTranslated;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("safetyTranslated")
    public void setSafetyTranslated (String value) { 
        this.safetyTranslated = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("staticUrl")
    public String getStaticUrl ( ) { 
        return this.staticUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("staticUrl")
    public void setStaticUrl (String value) { 
        this.staticUrl = value;
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
    @JsonGetter("typeName")
    public String getTypeName ( ) { 
        return this.typeName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("typeName")
    public void setTypeName (String value) { 
        this.typeName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("typeUuid")
    public String getTypeUuid ( ) { 
        return this.typeUuid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("typeUuid")
    public void setTypeUuid (String value) { 
        this.typeUuid = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("url")
    public void setUrl (String value) { 
        this.url = value;
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
    @JsonGetter("warnings")
    public String getWarnings ( ) { 
        return this.warnings;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("warnings")
    public void setWarnings (String value) { 
        this.warnings = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("warningsTranslated")
    public String getWarningsTranslated ( ) { 
        return this.warningsTranslated;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("warningsTranslated")
    public void setWarningsTranslated (String value) { 
        this.warningsTranslated = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("writtenLanguages")
    public List<Language> getWrittenLanguages ( ) { 
        return this.writtenLanguages;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("writtenLanguages")
    public void setWrittenLanguages (List<Language> value) { 
        this.writtenLanguages = value;
    }
 
}
 