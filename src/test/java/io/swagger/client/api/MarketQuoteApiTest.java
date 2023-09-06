/*
 * Upstox Developer API
 * Build your App on the Upstox platform  ![Banner](https://api-v2.upstox.com/api-docs/images/banner.jpg \"banner\")  # Introduction  Upstox API is a set of rest APIs that provide data required to build a complete investment and trading platform. Execute orders in real time, manage user portfolio, stream live market data (using Websocket), and more, with the easy to understand API collection.  All requests are over HTTPS and the requests are sent with the content-type ‘application/json’. Developers have the option of choosing the response type as JSON or CSV for a few API calls.  To be able to use these APIs you need to create an App in the Developer Console and generate your **apiKey** and **apiSecret**. You can use a redirect URL which will be called after the login flow.  If you are a **trader**, you can directly create apps from Upstox mobile app or the desktop platform itself from **Apps** sections inside the **Account** Tab. Head over to <a href=\"http://account.upstox.com/developer/apps\" target=\"_blank\">account.upstox.com/developer/apps</a>.</br> If you are a **business** looking to integrate Upstox APIs, reach out to us and we will get a custom app created for you in no time.  It is highly recommended that you do not embed the **apiSecret** in your frontend app. Create a remote backend which does the handshake on behalf of the frontend app. Marking the apiSecret in the frontend app will make your app vulnerable to threats and potential issues. 
 *
 * OpenAPI spec version: v2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.ApiGatewayErrorResponse;
import io.swagger.client.model.GetFullMarketQuoteResponse;
import io.swagger.client.model.GetMarketQuoteLastTradedPriceResponse;
import io.swagger.client.model.GetMarketQuoteOHLCResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for MarketQuoteApi
 */
@Ignore
public class MarketQuoteApiTest {

    private final MarketQuoteApi api = new MarketQuoteApi();

    /**
     * Market quotes and instruments - Full market quotes
     *
     * This API provides the functionality to retrieve the full market quotes for one or more instruments.This API returns the complete market data snapshot of up to 500 instruments in one go.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFullMarketQuoteTest() throws Exception {
        String symbol = null;
        String apiVersion = null;
        GetFullMarketQuoteResponse response = api.getFullMarketQuote(symbol, apiVersion);

        // TODO: test validations
    }
    /**
     * Market quotes and instruments - OHLC quotes
     *
     * This API provides the functionality to retrieve the OHLC quotes for one or more instruments.This API returns the OHLC snapshots of up to 1000 instruments in one go.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMarketQuoteOHLCTest() throws Exception {
        String symbol = null;
        String interval = null;
        String apiVersion = null;
        GetMarketQuoteOHLCResponse response = api.getMarketQuoteOHLC(symbol, interval, apiVersion);

        // TODO: test validations
    }
    /**
     * Market quotes and instruments - LTP quotes.
     *
     * This API provides the functionality to retrieve the LTP quotes for one or more instruments.This API returns the LTPs of up to 1000 instruments in one go.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ltpTest() throws Exception {
        String symbol = null;
        String apiVersion = null;
        GetMarketQuoteLastTradedPriceResponse response = api.ltp(symbol, apiVersion);

        // TODO: test validations
    }
}
