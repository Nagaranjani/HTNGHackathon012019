/*
 * HAPI Repository API
 * API for retrieving objects from HAPI repository
 *
 * OpenAPI spec version: 2
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * RateInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-26T23:47:35.032Z")
public class RateInfo {
  @SerializedName("guests")
  private Integer guests = null;

  @SerializedName("guestType")
  private String guestType = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  public RateInfo guests(Integer guests) {
    this.guests = guests;
    return this;
  }

   /**
   * rate occupancy
   * @return guests
  **/
  @ApiModelProperty(example = "1", value = "rate occupancy")
  public Integer getGuests() {
    return guests;
  }

  public void setGuests(Integer guests) {
    this.guests = guests;
  }

  public RateInfo guestType(String guestType) {
    this.guestType = guestType;
    return this;
  }

   /**
   * rate occupancy type
   * @return guestType
  **/
  @ApiModelProperty(example = "Adult", value = "rate occupancy type")
  public String getGuestType() {
    return guestType;
  }

  public void setGuestType(String guestType) {
    this.guestType = guestType;
  }

  public RateInfo amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * amount of rate
   * @return amount
  **/
  @ApiModelProperty(example = "59.5", value = "amount of rate")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateInfo rateInfo = (RateInfo) o;
    return Objects.equals(this.guests, rateInfo.guests) &&
        Objects.equals(this.guestType, rateInfo.guestType) &&
        Objects.equals(this.amount, rateInfo.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guests, guestType, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateInfo {\n");
    
    sb.append("    guests: ").append(toIndentedString(guests)).append("\n");
    sb.append("    guestType: ").append(toIndentedString(guestType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

