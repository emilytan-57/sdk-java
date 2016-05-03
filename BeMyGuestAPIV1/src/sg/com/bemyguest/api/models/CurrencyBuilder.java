/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.models;

import java.util.*;

public class CurrencyBuilder {
    //the instance to build
    private Currency currency;

    /**
     * Default constructor to initialize the instance
     */
    public CurrencyBuilder() {
        currency = new Currency();
    }

    public CurrencyBuilder code(String code) {
        currency.setCode(code);
        return this;
    }

    public CurrencyBuilder symbol(String symbol) {
        currency.setSymbol(symbol);
        return this;
    }

    public CurrencyBuilder uuid(String uuid) {
        currency.setUuid(uuid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Currency build() {
        return currency;
    }
}