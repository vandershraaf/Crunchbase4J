
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
    "firm",
    "is_past",
    "title"
})
public class Relationship {

    /**
     * 
     */
    @JsonProperty("firm")
    private Firm firm;
    /**
     * 
     */
    @JsonProperty("is_past")
    private Boolean is_past;
    /**
     * 
     */
    @JsonProperty("title")
    private String title;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    @JsonProperty("firm")
    public Firm getFirm() {
        return firm;
    }

    /**
     * 
     */
    @JsonProperty("firm")
    public void setFirm(Firm firm) {
        this.firm = firm;
    }

    /**
     * 
     */
    @JsonProperty("is_past")
    public Boolean getIs_past() {
        return is_past;
    }

    /**
     * 
     */
    @JsonProperty("is_past")
    public void setIs_past(Boolean is_past) {
        this.is_past = is_past;
    }

    /**
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
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
