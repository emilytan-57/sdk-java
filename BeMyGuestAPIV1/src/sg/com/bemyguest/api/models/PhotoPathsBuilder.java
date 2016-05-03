/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class PhotoPathsBuilder {
    //the instance to build
    private PhotoPaths photoPaths;

    /**
     * Default constructor to initialize the instance
     */
    public PhotoPathsBuilder() {
        photoPaths = new PhotoPaths();
    }

    public PhotoPathsBuilder m1280x720(String m1280x720) {
        photoPaths.setM1280x720(m1280x720);
        return this;
    }

    public PhotoPathsBuilder m175x112(String m175x112) {
        photoPaths.setM175x112(m175x112);
        return this;
    }

    public PhotoPathsBuilder m1920x1080(String m1920x1080) {
        photoPaths.setM1920x1080(m1920x1080);
        return this;
    }

    public PhotoPathsBuilder m2048x1536(String m2048x1536) {
        photoPaths.setM2048x1536(m2048x1536);
        return this;
    }

    public PhotoPathsBuilder m680x325(String m680x325) {
        photoPaths.setM680x325(m680x325);
        return this;
    }

    public PhotoPathsBuilder m75x50(String m75x50) {
        photoPaths.setM75x50(m75x50);
        return this;
    }

    public PhotoPathsBuilder original(String original) {
        photoPaths.setOriginal(original);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PhotoPaths build() {
        return photoPaths;
    }
}