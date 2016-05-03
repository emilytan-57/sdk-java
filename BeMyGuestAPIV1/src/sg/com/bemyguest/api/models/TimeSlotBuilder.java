/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class TimeSlotBuilder {
    //the instance to build
    private TimeSlot timeSlot;

    /**
     * Default constructor to initialize the instance
     */
    public TimeSlotBuilder() {
        timeSlot = new TimeSlot();
    }

    public TimeSlotBuilder endTime(String endTime) {
        timeSlot.setEndTime(endTime);
        return this;
    }

    public TimeSlotBuilder startTime(String startTime) {
        timeSlot.setStartTime(startTime);
        return this;
    }

    public TimeSlotBuilder uuid(String uuid) {
        timeSlot.setUuid(uuid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TimeSlot build() {
        return timeSlot;
    }
}