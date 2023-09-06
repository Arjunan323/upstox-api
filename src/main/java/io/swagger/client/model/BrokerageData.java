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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.BrokerageTaxes;
import io.swagger.client.model.DpPlan;
import io.swagger.client.model.OtherTaxes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Response data for charges details
 */
@Schema(description = "Response data for charges details")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-09-06T18:06:19.973364914Z[GMT]")

public class BrokerageData {
  @SerializedName("total")
  private Float total = null;

  @SerializedName("brokerage")
  private Float brokerage = null;

  @SerializedName("taxes")
  private BrokerageTaxes taxes = null;

  @SerializedName("otherTaxes")
  private OtherTaxes otherTaxes = null;

  @SerializedName("dpPlan")
  private DpPlan dpPlan = null;

   /**
   * Total charges for the order
   * @return total
  **/
  @Schema(description = "Total charges for the order")
  public Float getTotal() {
    return total;
  }

   /**
   * Brokerage charges for the order
   * @return brokerage
  **/
  @Schema(description = "Brokerage charges for the order")
  public Float getBrokerage() {
    return brokerage;
  }

  public BrokerageData taxes(BrokerageTaxes taxes) {
    this.taxes = taxes;
    return this;
  }

   /**
   * Get taxes
   * @return taxes
  **/
  @Schema(description = "")
  public BrokerageTaxes getTaxes() {
    return taxes;
  }

  public void setTaxes(BrokerageTaxes taxes) {
    this.taxes = taxes;
  }

  public BrokerageData otherTaxes(OtherTaxes otherTaxes) {
    this.otherTaxes = otherTaxes;
    return this;
  }

   /**
   * Get otherTaxes
   * @return otherTaxes
  **/
  @Schema(description = "")
  public OtherTaxes getOtherTaxes() {
    return otherTaxes;
  }

  public void setOtherTaxes(OtherTaxes otherTaxes) {
    this.otherTaxes = otherTaxes;
  }

  public BrokerageData dpPlan(DpPlan dpPlan) {
    this.dpPlan = dpPlan;
    return this;
  }

   /**
   * Get dpPlan
   * @return dpPlan
  **/
  @Schema(description = "")
  public DpPlan getDpPlan() {
    return dpPlan;
  }

  public void setDpPlan(DpPlan dpPlan) {
    this.dpPlan = dpPlan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrokerageData brokerageData = (BrokerageData) o;
    return Objects.equals(this.total, brokerageData.total) &&
        Objects.equals(this.brokerage, brokerageData.brokerage) &&
        Objects.equals(this.taxes, brokerageData.taxes) &&
        Objects.equals(this.otherTaxes, brokerageData.otherTaxes) &&
        Objects.equals(this.dpPlan, brokerageData.dpPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, brokerage, taxes, otherTaxes, dpPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrokerageData {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    brokerage: ").append(toIndentedString(brokerage)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    otherTaxes: ").append(toIndentedString(otherTaxes)).append("\n");
    sb.append("    dpPlan: ").append(toIndentedString(dpPlan)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}