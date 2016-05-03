/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class CancellationPolicyBuilder {
    //the instance to build
    private CancellationPolicy cancellationPolicy;

    /**
     * Default constructor to initialize the instance
     */
    public CancellationPolicyBuilder() {
        cancellationPolicy = new CancellationPolicy();
    }

    public CancellationPolicyBuilder numberOfDays(int numberOfDays) {
        cancellationPolicy.setNumberOfDays(numberOfDays);
        return this;
    }

    public CancellationPolicyBuilder refundPercentage(int refundPercentage) {
        cancellationPolicy.setRefundPercentage(refundPercentage);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CancellationPolicy build() {
        return cancellationPolicy;
    }
}