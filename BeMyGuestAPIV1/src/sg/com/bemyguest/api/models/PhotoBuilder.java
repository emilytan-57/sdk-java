/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class PhotoBuilder {
    //the instance to build
    private Photo photo;

    /**
     * Default constructor to initialize the instance
     */
    public PhotoBuilder() {
        photo = new Photo();
    }

    public PhotoBuilder caption(String caption) {
        photo.setCaption(caption);
        return this;
    }

    public PhotoBuilder paths(PhotoPaths paths) {
        photo.setPaths(paths);
        return this;
    }

    public PhotoBuilder uuid(String uuid) {
        photo.setUuid(uuid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Photo build() {
        return photo;
    }
}