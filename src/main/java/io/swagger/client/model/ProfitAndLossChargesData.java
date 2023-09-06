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
import io.swagger.client.model.ProfitAndLossChargesTaxes;
import io.swagger.client.model.ProfitAndLossOtherChargesTaxes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Response data for charges details
 */
@Schema(description = "Response data for charges details")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-09-06T18:06:19.973364914Z[GMT]")

public class ProfitAndLossChargesData {
  @SerializedName("total")
  private Float total = null;

  @SerializedName("brokerage")
  private Float brokerage = null;

  @SerializedName("taxes")
  private ProfitAndLossChargesTaxes taxes = null;

  @SerializedName("charges")
  private ProfitAndLossOtherChargesTaxes charges = null;

   /**
   *   Total charges for the user
   * @return total
  **/
  @Schema(example = "123.1", description = "  Total charges for the user")
  public Float getTotal() {
    return total;
  }

   /**
   * Brokerage charges for the order
   * @return brokerage
  **/
  @Schema(example = "432.1", description = "Brokerage charges for the order")
  public Float getBrokerage() {
    return brokerage;
  }

  public ProfitAndLossChargesData taxes(ProfitAndLossChargesTaxes taxes) {
    this.taxes = taxes;
    return this;
  }

   /**
   * Get taxes
   * @return taxes
  **/
  @Schema(description = "")
  public ProfitAndLossChargesTaxes getTaxes() {
    return taxes;
  }

  public void setTaxes(ProfitAndLossChargesTaxes taxes) {
    this.taxes = taxes;
  }

  public ProfitAndLossChargesData charges(ProfitAndLossOtherChargesTaxes charges) {
    this.charges = charges;
    return this;
  }

   /**
   * Get charges
   * @return charges
  **/
  @Schema(description = "")
  public ProfitAndLossOtherChargesTaxes getCharges() {
    return charges;
  }

  public void setCharges(ProfitAndLossOtherChargesTaxes charges) {
    this.charges = charges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfitAndLossChargesData profitAndLossChargesData = (ProfitAndLossChargesData) o;
    return Objects.equals(this.total, profitAndLossChargesData.total) &&
        Objects.equals(this.brokerage, profitAndLossChargesData.brokerage) &&
        Objects.equals(this.taxes, profitAndLossChargesData.taxes) &&
        Objects.equals(this.charges, profitAndLossChargesData.charges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, brokerage, taxes, charges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfitAndLossChargesData {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    brokerage: ").append(toIndentedString(brokerage)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
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
