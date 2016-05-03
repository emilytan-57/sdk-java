/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class CategoryBuilder {
    //the instance to build
    private Category category;

    /**
     * Default constructor to initialize the instance
     */
    public CategoryBuilder() {
        category = new Category();
    }

    public CategoryBuilder name(String name) {
        category.setName(name);
        return this;
    }

    public CategoryBuilder uuid(String uuid) {
        category.setUuid(uuid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Category build() {
        return category;
    }
}