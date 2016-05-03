/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class PriceBuilder {
    //the instance to build
    private Price price;

    /**
     * Default constructor to initialize the instance
     */
    public PriceBuilder() {
        price = new Price();
    }

    public PriceBuilder promotion(Promotion promotion) {
        price.setPromotion(promotion);
        return this;
    }

    public PriceBuilder regular(PriceSet regular) {
        price.setRegular(regular);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Price build() {
        return price;
    }
}