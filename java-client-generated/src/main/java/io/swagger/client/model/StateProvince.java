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

/**
 * StateProvince
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-26T23:47:35.032Z")
public class StateProvince {
  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  public StateProvince code(String code) {
    this.code = code;
    return this;
  }

   /**
   * code identifying state or province associated to address
   * @return code
  **/
  @ApiModelProperty(example = "FL", value = "code identifying state or province associated to address")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public StateProvince name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of state or province associated to address
   * @return name
  **/
  @ApiModelProperty(example = "Florida", value = "name of state or province associated to address")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateProvince stateProvince = (StateProvince) o;
    return Objects.equals(this.code, stateProvince.code) &&
        Objects.equals(this.name, stateProvince.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateProvince {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

