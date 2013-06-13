
package com.ashrafishak.crunchbase4j.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "attribution",
    "available_sizes"
})
public class Image {

    /**
     * 
     */
    @JsonProperty("attribution")
    private Object attribution;
    /**
     * 
     */
    @JsonProperty("available_sizes")
    private List<List<Object>> available_sizes = new ArrayList<List<Object>>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    @JsonProperty("attribution")
    public Object getAttribution() {
        return attribution;
    }

    /**
     * 
     */
    @JsonProperty("attribution")
    public void setAttribution(Object attribution) {
        this.attribution = attribution;
    }

    /**
     * 
     */
    @JsonProperty("available_sizes")
    public List<List<Object>> getAvailable_sizes() {
        return available_sizes;
    }

    /**
     * 
     */
    @JsonProperty("available_sizes")
    public void setAvailable_sizes(List<List<Object>> available_sizes) {
        this.available_sizes = available_sizes;
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
