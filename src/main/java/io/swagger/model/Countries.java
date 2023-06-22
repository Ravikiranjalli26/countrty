package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Countries
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-06-22T09:48:47.521790573Z[GMT]")


public class Countries   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("phoneCode")
  private Integer phoneCode = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("subRegion")
  private String subRegion = null;

  @JsonProperty("timeZone")
  private String timeZone = null;

  @JsonProperty("latitude")
  private Double latitude = null;

  @JsonProperty("longitude")
  private Double longitude = null;

  public Countries name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Countries phoneCode(Integer phoneCode) {
    this.phoneCode = phoneCode;
    return this;
  }

  /**
   * Get phoneCode
   * @return phoneCode
   **/
  @Schema(description = "")
  
    public Integer getPhoneCode() {
    return phoneCode;
  }

  public void setPhoneCode(Integer phoneCode) {
    this.phoneCode = phoneCode;
  }

  public Countries currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   **/
  @Schema(description = "")
  
    public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Countries region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
   **/
  @Schema(description = "")
  
    public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public Countries subRegion(String subRegion) {
    this.subRegion = subRegion;
    return this;
  }

  /**
   * Get subRegion
   * @return subRegion
   **/
  @Schema(description = "")
  
    public String getSubRegion() {
    return subRegion;
  }

  public void setSubRegion(String subRegion) {
    this.subRegion = subRegion;
  }

  public Countries timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Get timeZone
   * @return timeZone
   **/
  @Schema(description = "")
  
    public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public Countries latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   **/
  @Schema(description = "")
  
    public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Countries longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   **/
  @Schema(description = "")
  
    public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Countries countries = (Countries) o;
    return Objects.equals(this.name, countries.name) &&
        Objects.equals(this.phoneCode, countries.phoneCode) &&
        Objects.equals(this.currency, countries.currency) &&
        Objects.equals(this.region, countries.region) &&
        Objects.equals(this.subRegion, countries.subRegion) &&
        Objects.equals(this.timeZone, countries.timeZone) &&
        Objects.equals(this.latitude, countries.latitude) &&
        Objects.equals(this.longitude, countries.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phoneCode, currency, region, subRegion, timeZone, latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Countries {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneCode: ").append(toIndentedString(phoneCode)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    subRegion: ").append(toIndentedString(subRegion)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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
