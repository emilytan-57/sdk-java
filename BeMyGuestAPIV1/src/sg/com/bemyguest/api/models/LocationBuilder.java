/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class LocationBuilder {
    //the instance to build
    private Location location;

    /**
     * Default constructor to initialize the instance
     */
    public LocationBuilder() {
        location = new Location();
    }

    public LocationBuilder city(String city) {
        location.setCity(city);
        return this;
    }

    public LocationBuilder cityUuid(String cityUuid) {
        location.setCityUuid(cityUuid);
        return this;
    }

    public LocationBuilder country(String country) {
        location.setCountry(country);
        return this;
    }

    public LocationBuilder countryUuid(String countryUuid) {
        location.setCountryUuid(countryUuid);
        return this;
    }

    public LocationBuilder state(String state) {
        location.setState(state);
        return this;
    }

    public LocationBuilder stateUuid(String stateUuid) {
        location.setStateUuid(stateUuid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Location build() {
        return location;
    }
}