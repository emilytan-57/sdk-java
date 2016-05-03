/*
 * BeMyGuestAPIV1
 *
 * This file was automatically generated for BeMyGuest by APIMATIC v2.0 on 05/03/2016
 */
package sg.com.bemyguest.api.interfaces;

import java.util.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import sg.com.bemyguest.api.models.*;

public interface ConfigInterface {
    /**
     * A Config object has the following attributes:+ `timezone` - Our sever timezone+ `now` - Our server timestamp+ `version` - Current version is "1.0"+ `serverUrl` - Main API URL+ `photosUrl` - Base Path to server where we store our images+ `productsSorting` - Available Products lists sorting options (can be combined with commas, for example &sort=date,-price )    + `date` - Date ascending    + `-date` - Date descending    + `price` - Price ascending    + `-price` - Price descending    + `distance` - Distance ascending (works only if `latitude`,`longitude` & `distance` parameters are provided, ignored otherwise)     + `-distance` - Distance descending (works only if `latitude`,`longitude` & `distance` parameters are provided, ignored otherwise)+ user - All important userdata for provided API key    + `name` - Name / Company / Organization    + `email` - E-Mail Address    + `uuid` - Unique ID    + `continueUrl` - Continue URL (not in use now)    + `notifyUrl` - Notify URL (not in use now)    + `suggestedMarkup` - Suggested markup, % decimal value, for example 7.5    + `defaultPagination` - Default Pagination value (per page), between 1-100    + `defaultSortBy` - Default sort by for /products (if not specified)    + `defaultCurrencyUuid` - Default currency UUID for /products (if not specified)    + `defaultCurrencyCode` - Default currency code for /products (if not specified)    + `defaultLanguageUuid` - Default language UUID  /products (if not specified)    + `defaultLanguageCode` - Default language code  /products (if not specified)    + `walletBalance` - Partner's available wallet balance, based on his deposits    + `walletAvailableBalance` - Wallet balance which is a combination of partner's deposit and assigned credit amount    + `wallet_alert_value` - Threshold value in SGD, when `walletBallance` reach this value then BMG and partner will be notified on this event+ `languages` - A list of supported languages.+ `currencies` - An array of supported currencies.+ `types` - An array of supported products types.+ `categories` - A tree of supported product categories.+ `locations` - A tree of supported locations. (Continent -> Country -> State -> City)
	 * @return	Returns the RetrieveConfigResponse response from the API call*/
    @GET
    @Path("/v1/config")
    @Produces(MediaType.APPLICATION_JSON)
    public RetrieveConfigResponse retrieveConfigAsync();
}