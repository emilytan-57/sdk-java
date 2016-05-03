/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class LanguageBuilder {
    //the instance to build
    private Language language;

    /**
     * Default constructor to initialize the instance
     */
    public LanguageBuilder() {
        language = new Language();
    }

    public LanguageBuilder name(String name) {
        language.setName(name);
        return this;
    }

    public LanguageBuilder uuid(String uuid) {
        language.setUuid(uuid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Language build() {
        return language;
    }
}