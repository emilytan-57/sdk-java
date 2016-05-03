/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class AddonBuilder {
    //the instance to build
    private Addon addon;

    /**
     * Default constructor to initialize the instance
     */
    public AddonBuilder() {
        addon = new Addon();
    }

    public AddonBuilder description(String description) {
        addon.setDescription(description);
        return this;
    }

    public AddonBuilder descriptionTranslated(String descriptionTranslated) {
        addon.setDescriptionTranslated(descriptionTranslated);
        return this;
    }

    public AddonBuilder pricePerPerson(double pricePerPerson) {
        addon.setPricePerPerson(pricePerPerson);
        return this;
    }

    public AddonBuilder title(String title) {
        addon.setTitle(title);
        return this;
    }

    public AddonBuilder titleTranslated(String titleTranslated) {
        addon.setTitleTranslated(titleTranslated);
        return this;
    }

    public AddonBuilder uuid(String uuid) {
        addon.setUuid(uuid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Addon build() {
        return addon;
    }
}