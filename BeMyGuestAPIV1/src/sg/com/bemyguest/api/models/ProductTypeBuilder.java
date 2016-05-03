/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class ProductTypeBuilder {
    //the instance to build
    private ProductType productType;

    /**
     * Default constructor to initialize the instance
     */
    public ProductTypeBuilder() {
        productType = new ProductType();
    }

    public ProductTypeBuilder allowChildren(boolean allowChildren) {
        productType.setAllowChildren(allowChildren);
        return this;
    }

    public ProductTypeBuilder daysInAdvance(int daysInAdvance) {
        productType.setDaysInAdvance(daysInAdvance);
        return this;
    }

    public ProductTypeBuilder description(String description) {
        productType.setDescription(description);
        return this;
    }

    public ProductTypeBuilder descriptionTranslated(String descriptionTranslated) {
        productType.setDescriptionTranslated(descriptionTranslated);
        return this;
    }

    public ProductTypeBuilder durationDays(int durationDays) {
        productType.setDurationDays(durationDays);
        return this;
    }

    public ProductTypeBuilder durationHours(int durationHours) {
        productType.setDurationHours(durationHours);
        return this;
    }

    public ProductTypeBuilder durationMinutes(int durationMinutes) {
        productType.setDurationMinutes(durationMinutes);
        return this;
    }

    public ProductTypeBuilder hasChildPrice(boolean hasChildPrice) {
        productType.setHasChildPrice(hasChildPrice);
        return this;
    }

    public ProductTypeBuilder instantConfirmation(boolean instantConfirmation) {
        productType.setInstantConfirmation(instantConfirmation);
        return this;
    }

    public ProductTypeBuilder isNonRefundable(boolean isNonRefundable) {
        productType.setIsNonRefundable(isNonRefundable);
        return this;
    }

    public ProductTypeBuilder maxAdultAge(int maxAdultAge) {
        productType.setMaxAdultAge(maxAdultAge);
        return this;
    }

    public ProductTypeBuilder maxChildAge(String maxChildAge) {
        productType.setMaxChildAge(maxChildAge);
        return this;
    }

    public ProductTypeBuilder minAdultAge(int minAdultAge) {
        productType.setMinAdultAge(minAdultAge);
        return this;
    }

    public ProductTypeBuilder minChildAge(String minChildAge) {
        productType.setMinChildAge(minChildAge);
        return this;
    }

    public ProductTypeBuilder paxMax(int paxMax) {
        productType.setPaxMax(paxMax);
        return this;
    }

    public ProductTypeBuilder paxMin(int paxMin) {
        productType.setPaxMin(paxMin);
        return this;
    }

    public ProductTypeBuilder prices(LinkedHashMap<String, Object> prices) {
        productType.setPrices(prices);
        return this;
    }

    public ProductTypeBuilder recommendedMarkup(double recommendedMarkup) {
        productType.setRecommendedMarkup(recommendedMarkup);
        return this;
    }

    public ProductTypeBuilder timeSlots(List<TimeSlot> timeSlots) {
        productType.setTimeSlots(timeSlots);
        return this;
    }

    public ProductTypeBuilder title(String title) {
        productType.setTitle(title);
        return this;
    }

    public ProductTypeBuilder titleTranslated(String titleTranslated) {
        productType.setTitleTranslated(titleTranslated);
        return this;
    }

    public ProductTypeBuilder uuid(String uuid) {
        productType.setUuid(uuid);
        return this;
    }

    public ProductTypeBuilder voucherRedemptionAddress(String voucherRedemptionAddress) {
        productType.setVoucherRedemptionAddress(voucherRedemptionAddress);
        return this;
    }

    public ProductTypeBuilder voucherRedemptionAddressTranslated(String voucherRedemptionAddressTranslated) {
        productType.setVoucherRedemptionAddressTranslated(voucherRedemptionAddressTranslated);
        return this;
    }

    public ProductTypeBuilder voucherUse(String voucherUse) {
        productType.setVoucherUse(voucherUse);
        return this;
    }

    public ProductTypeBuilder voucherUseTranslated(String voucherUseTranslated) {
        productType.setVoucherUseTranslated(voucherUseTranslated);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ProductType build() {
        return productType;
    }
}