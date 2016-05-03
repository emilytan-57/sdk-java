/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class ProductBuilder {
    //the instance to build
    private Product product;

    /**
     * Default constructor to initialize the instance
     */
    public ProductBuilder() {
        product = new Product();
    }

    public ProductBuilder additionalInfo(String additionalInfo) {
        product.setAdditionalInfo(additionalInfo);
        return this;
    }

    public ProductBuilder additionalInfoTranslated(String additionalInfoTranslated) {
        product.setAdditionalInfoTranslated(additionalInfoTranslated);
        return this;
    }

    public ProductBuilder addons(List<Addon> addons) {
        product.setAddons(addons);
        return this;
    }

    public ProductBuilder audioHeadsetLanguages(List<Language> audioHeadsetLanguages) {
        product.setAudioHeadsetLanguages(audioHeadsetLanguages);
        return this;
    }

    public ProductBuilder basePrice(double basePrice) {
        product.setBasePrice(basePrice);
        return this;
    }

    public ProductBuilder businessHoursFrom(String businessHoursFrom) {
        product.setBusinessHoursFrom(businessHoursFrom);
        return this;
    }

    public ProductBuilder businessHoursTo(String businessHoursTo) {
        product.setBusinessHoursTo(businessHoursTo);
        return this;
    }

    public ProductBuilder categories(List<Category> categories) {
        product.setCategories(categories);
        return this;
    }

    public ProductBuilder currency(Currency currency) {
        product.setCurrency(currency);
        return this;
    }

    public ProductBuilder description(String description) {
        product.setDescription(description);
        return this;
    }

    public ProductBuilder descriptionTranslated(String descriptionTranslated) {
        product.setDescriptionTranslated(descriptionTranslated);
        return this;
    }

    public ProductBuilder guideLanguages(List<Language> guideLanguages) {
        product.setGuideLanguages(guideLanguages);
        return this;
    }

    public ProductBuilder highlights(String highlights) {
        product.setHighlights(highlights);
        return this;
    }

    public ProductBuilder highlightsTranslated(String highlightsTranslated) {
        product.setHighlightsTranslated(highlightsTranslated);
        return this;
    }

    public ProductBuilder hotelPickup(boolean hotelPickup) {
        product.setHotelPickup(hotelPickup);
        return this;
    }

    public ProductBuilder isFlatPaxPrice(boolean isFlatPaxPrice) {
        product.setIsFlatPaxPrice(isFlatPaxPrice);
        return this;
    }

    public ProductBuilder itinerary(String itinerary) {
        product.setItinerary(itinerary);
        return this;
    }

    public ProductBuilder itineraryTranslated(String itineraryTranslated) {
        product.setItineraryTranslated(itineraryTranslated);
        return this;
    }

    public ProductBuilder latitude(String latitude) {
        product.setLatitude(latitude);
        return this;
    }

    public ProductBuilder locations(List<Location> locations) {
        product.setLocations(locations);
        return this;
    }

    public ProductBuilder longitude(String longitude) {
        product.setLongitude(longitude);
        return this;
    }

    public ProductBuilder maxPax(int maxPax) {
        product.setMaxPax(maxPax);
        return this;
    }

    public ProductBuilder meetingLocation(String meetingLocation) {
        product.setMeetingLocation(meetingLocation);
        return this;
    }

    public ProductBuilder meetingLocationTranslated(String meetingLocationTranslated) {
        product.setMeetingLocationTranslated(meetingLocationTranslated);
        return this;
    }

    public ProductBuilder meetingTime(String meetingTime) {
        product.setMeetingTime(meetingTime);
        return this;
    }

    public ProductBuilder minPax(int minPax) {
        product.setMinPax(minPax);
        return this;
    }

    public ProductBuilder photos(List<Photo> photos) {
        product.setPhotos(photos);
        return this;
    }

    public ProductBuilder photosUrl(String photosUrl) {
        product.setPhotosUrl(photosUrl);
        return this;
    }

    public ProductBuilder priceExcludes(String priceExcludes) {
        product.setPriceExcludes(priceExcludes);
        return this;
    }

    public ProductBuilder priceExcludesTranslated(String priceExcludesTranslated) {
        product.setPriceExcludesTranslated(priceExcludesTranslated);
        return this;
    }

    public ProductBuilder priceIncludes(String priceIncludes) {
        product.setPriceIncludes(priceIncludes);
        return this;
    }

    public ProductBuilder priceIncludesTranslated(String priceIncludesTranslated) {
        product.setPriceIncludesTranslated(priceIncludesTranslated);
        return this;
    }

    public ProductBuilder productTypes(List<ProductType> productTypes) {
        product.setProductTypes(productTypes);
        return this;
    }

    public ProductBuilder reviewAverageScore(double reviewAverageScore) {
        product.setReviewAverageScore(reviewAverageScore);
        return this;
    }

    public ProductBuilder reviewCount(int reviewCount) {
        product.setReviewCount(reviewCount);
        return this;
    }

    public ProductBuilder safety(String safety) {
        product.setSafety(safety);
        return this;
    }

    public ProductBuilder safetyTranslated(String safetyTranslated) {
        product.setSafetyTranslated(safetyTranslated);
        return this;
    }

    public ProductBuilder staticUrl(String staticUrl) {
        product.setStaticUrl(staticUrl);
        return this;
    }

    public ProductBuilder title(String title) {
        product.setTitle(title);
        return this;
    }

    public ProductBuilder titleTranslated(String titleTranslated) {
        product.setTitleTranslated(titleTranslated);
        return this;
    }

    public ProductBuilder typeName(String typeName) {
        product.setTypeName(typeName);
        return this;
    }

    public ProductBuilder typeUuid(String typeUuid) {
        product.setTypeUuid(typeUuid);
        return this;
    }

    public ProductBuilder url(String url) {
        product.setUrl(url);
        return this;
    }

    public ProductBuilder uuid(String uuid) {
        product.setUuid(uuid);
        return this;
    }

    public ProductBuilder warnings(String warnings) {
        product.setWarnings(warnings);
        return this;
    }

    public ProductBuilder warningsTranslated(String warningsTranslated) {
        product.setWarningsTranslated(warningsTranslated);
        return this;
    }

    public ProductBuilder writtenLanguages(List<Language> writtenLanguages) {
        product.setWrittenLanguages(writtenLanguages);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Product build() {
        return product;
    }
}