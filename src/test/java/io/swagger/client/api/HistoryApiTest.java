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
import io.swagger.client.model.GetHistoricalCandleResponse;
import io.swagger.client.model.GetIntraDayCandleResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for HistoryApi
 */
@Ignore
public class HistoryApiTest {

    private final HistoryApi api = new HistoryApi();

    /**
     * Historical candle data
     *
     * Get OHLC values for all instruments across various timeframes. Historical data can be fetched for the following durations. 1minute: last 1 month candles till endDate 30minute: last 1 year candles till endDate day: last 1 year candles till endDate week: last 10 year candles till endDate month: last 10 year candles till endDate
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getHistoricalCandleDataTest() throws Exception {
        String instrumentKey = null;
        String interval = null;
        String toDate = null;
        String apiVersion = null;
        GetHistoricalCandleResponse response = api.getHistoricalCandleData(instrumentKey, interval, toDate, apiVersion);

        // TODO: test validations
    }
    /**
     * Historical candle data
     *
     * Get OHLC values for all instruments across various timeframes. Historical data can be fetched for the following durations. 1minute: last 1 month candles till endDate 30minute: last 1 year candles till endDate day: last 1 year candles till endDate week: last 10 year candles till endDate month: last 10 year candles till endDate
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getHistoricalCandleData1Test() throws Exception {
        String instrumentKey = null;
        String interval = null;
        String toDate = null;
        String fromDate = null;
        String apiVersion = null;
        GetHistoricalCandleResponse response = api.getHistoricalCandleData1(instrumentKey, interval, toDate, fromDate, apiVersion);

        // TODO: test validations
    }
    /**
     * Intra day candle data
     *
     * Get OHLC values for all instruments for the present trading day
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getIntraDayCandleDataTest() throws Exception {
        String instrumentKey = null;
        String interval = null;
        String apiVersion = null;
        GetIntraDayCandleResponse response = api.getIntraDayCandleData(instrumentKey, interval, apiVersion);

        // TODO: test validations
    }
}