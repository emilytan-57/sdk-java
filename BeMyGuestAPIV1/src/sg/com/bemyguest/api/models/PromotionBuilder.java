/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class PromotionBuilder {
    //the instance to build
    private Promotion promotion;

    /**
     * Default constructor to initialize the instance
     */
    public PromotionBuilder() {
        promotion = new Promotion();
    }

    public PromotionBuilder adult(LinkedHashMap<String, Object> adult) {
        promotion.setAdult(adult);
        return this;
    }

    public PromotionBuilder cancellationPolicy(List<CancellationPolicy> cancellationPolicy) {
        promotion.setCancellationPolicy(cancellationPolicy);
        return this;
    }

    public PromotionBuilder child(int child) {
        promotion.setChild(child);
        return this;
    }

    public PromotionBuilder daysInAdvance(Integer daysInAdvance) {
        promotion.setDaysInAdvance(daysInAdvance);
        return this;
    }

    public PromotionBuilder discountPercent(int discountPercent) {
        promotion.setDiscountPercent(discountPercent);
        return this;
    }

    public PromotionBuilder hoursInAdvance(Integer hoursInAdvance) {
        promotion.setHoursInAdvance(hoursInAdvance);
        return this;
    }

    public PromotionBuilder name(String name) {
        promotion.setName(name);
        return this;
    }

    public PromotionBuilder type(PromotionTypeEnum type) {
        promotion.setType(type);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Promotion build() {
        return promotion;
    }
}