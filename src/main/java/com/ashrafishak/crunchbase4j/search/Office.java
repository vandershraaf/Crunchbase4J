
package com.ashrafishak.crunchbase4j.search;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "address1",
    "address2",
    "city",
    "country_code",
    "description",
    "latitude",
    "longitude",
    "state_code",
    "zip_code"
})
public class Office {

    /**
     * 
     */
    @JsonProperty("address1")
    private String address1;
    /**
     * 
     */
    @JsonProperty("address2")
    private String address2;
    /**
     * 
     */
    @JsonProperty("city")
    private String city;
    /**
     * 
     */
    @JsonProperty("country_code")
    private String country_code;
    /**
     * 
     */
    @JsonProperty("description")
    private String description;
    /**
     * 
     */
    @JsonProperty("latitude")
    private Double latitude;
    /**
     * 
     */
    @JsonProperty("longitude")
    private Double longitude;
    /**
     * 
     */
    @JsonProperty("state_code")
    private String state_code;
    /**
     * 
     */
    @JsonProperty("zip_code")
    private String zip_code;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    @JsonProperty("address1")
    public String getAddress1() {
        return address1;
    }

    /**
     * 
     */
    @JsonProperty("address1")
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * 
     */
    @JsonProperty("address2")
    public String getAddress2() {
        return address2;
    }

    /**
     * 
     */
    @JsonProperty("address2")
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     */
    @JsonProperty("country_code")
    public String getCountry_code() {
        return country_code;
    }

    /**
     * 
     */
    @JsonProperty("country_code")
    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    /**
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     */
    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 
     */
    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     */
    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 
     */
    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 
     */
    @JsonProperty("state_code")
    public String getState_code() {
        return state_code;
    }

    /**
     * 
     */
    @JsonProperty("state_code")
    public void setState_code(String state_code) {
        this.state_code = state_code;
    }

    /**
     * 
     */
    @JsonProperty("zip_code")
    public String getZip_code() {
        return zip_code;
    }

    /**
     * 
     */
    @JsonProperty("zip_code")
    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
