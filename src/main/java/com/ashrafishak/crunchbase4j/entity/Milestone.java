
package com.ashrafishak.crunchbase4j.entity;

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
    "description",
    "source_description",
    "source_text",
    "source_url",
    "stoneable_type",
    "stoneable",
    "stoned_acquirer",
    "stoned_day",
    "stoned_month",
    "stoned_value_type",
    "stoned_value",
    "stoned_year"
})
public class Milestone {

    /**
     * 
     */
    @JsonProperty("description")
    private String description;
    /**
     * 
     */
    @JsonProperty("source_description")
    private String source_description;
    /**
     * 
     */
    @JsonProperty("source_text")
    private String source_text;
    /**
     * 
     */
    @JsonProperty("source_url")
    private String source_url;
    /**
     * 
     */
    @JsonProperty("stoneable_type")
    private String stoneable_type;
    /**
     * 
     */
    @JsonProperty("stoneable")
    private Stoneable stoneable;
    /**
     * 
     */
    @JsonProperty("stoned_acquirer")
    private Object stoned_acquirer;
    /**
     * 
     */
    @JsonProperty("stoned_day")
    private Double stoned_day;
    /**
     * 
     */
    @JsonProperty("stoned_month")
    private Double stoned_month;
    /**
     * 
     */
    @JsonProperty("stoned_value_type")
    private Object stoned_value_type;
    /**
     * 
     */
    @JsonProperty("stoned_value")
    private Object stoned_value;
    /**
     * 
     */
    @JsonProperty("stoned_year")
    private Double stoned_year;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
    @JsonProperty("source_description")
    public String getSource_description() {
        return source_description;
    }

    /**
     * 
     */
    @JsonProperty("source_description")
    public void setSource_description(String source_description) {
        this.source_description = source_description;
    }

    /**
     * 
     */
    @JsonProperty("source_text")
    public String getSource_text() {
        return source_text;
    }

    /**
     * 
     */
    @JsonProperty("source_text")
    public void setSource_text(String source_text) {
        this.source_text = source_text;
    }

    /**
     * 
     */
    @JsonProperty("source_url")
    public String getSource_url() {
        return source_url;
    }

    /**
     * 
     */
    @JsonProperty("source_url")
    public void setSource_url(String source_url) {
        this.source_url = source_url;
    }

    /**
     * 
     */
    @JsonProperty("stoneable_type")
    public String getStoneable_type() {
        return stoneable_type;
    }

    /**
     * 
     */
    @JsonProperty("stoneable_type")
    public void setStoneable_type(String stoneable_type) {
        this.stoneable_type = stoneable_type;
    }

    /**
     * 
     */
    @JsonProperty("stoneable")
    public Stoneable getStoneable() {
        return stoneable;
    }

    /**
     * 
     */
    @JsonProperty("stoneable")
    public void setStoneable(Stoneable stoneable) {
        this.stoneable = stoneable;
    }

    /**
     * 
     */
    @JsonProperty("stoned_acquirer")
    public Object getStoned_acquirer() {
        return stoned_acquirer;
    }

    /**
     * 
     */
    @JsonProperty("stoned_acquirer")
    public void setStoned_acquirer(Object stoned_acquirer) {
        this.stoned_acquirer = stoned_acquirer;
    }

    /**
     * 
     */
    @JsonProperty("stoned_day")
    public Double getStoned_day() {
        return stoned_day;
    }

    /**
     * 
     */
    @JsonProperty("stoned_day")
    public void setStoned_day(Double stoned_day) {
        this.stoned_day = stoned_day;
    }

    /**
     * 
     */
    @JsonProperty("stoned_month")
    public Double getStoned_month() {
        return stoned_month;
    }

    /**
     * 
     */
    @JsonProperty("stoned_month")
    public void setStoned_month(Double stoned_month) {
        this.stoned_month = stoned_month;
    }

    /**
     * 
     */
    @JsonProperty("stoned_value_type")
    public Object getStoned_value_type() {
        return stoned_value_type;
    }

    /**
     * 
     */
    @JsonProperty("stoned_value_type")
    public void setStoned_value_type(Object stoned_value_type) {
        this.stoned_value_type = stoned_value_type;
    }

    /**
     * 
     */
    @JsonProperty("stoned_value")
    public Object getStoned_value() {
        return stoned_value;
    }

    /**
     * 
     */
    @JsonProperty("stoned_value")
    public void setStoned_value(Object stoned_value) {
        this.stoned_value = stoned_value;
    }

    /**
     * 
     */
    @JsonProperty("stoned_year")
    public Double getStoned_year() {
        return stoned_year;
    }

    /**
     * 
     */
    @JsonProperty("stoned_year")
    public void setStoned_year(Double stoned_year) {
        this.stoned_year = stoned_year;
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
