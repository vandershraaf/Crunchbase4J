
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
    "first_name",
    "image",
    "last_name",
    "permalink"
})
public class Person {

    /**
     * 
     */
    @JsonProperty("first_name")
    private String first_name;
    /**
     * 
     */
    @JsonProperty("image")
    private Image image;
    /**
     * 
     */
    @JsonProperty("last_name")
    private String last_name;
    /**
     * 
     */
    @JsonProperty("permalink")
    private String permalink;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    @JsonProperty("first_name")
    public String getFirst_name() {
        return first_name;
    }

    /**
     * 
     */
    @JsonProperty("first_name")
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * 
     */
    @JsonProperty("image")
    public Image getImage() {
        return image;
    }

    /**
     * 
     */
    @JsonProperty("image")
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * 
     */
    @JsonProperty("last_name")
    public String getLast_name() {
        return last_name;
    }

    /**
     * 
     */
    @JsonProperty("last_name")
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * 
     */
    @JsonProperty("permalink")
    public String getPermalink() {
        return permalink;
    }

    /**
     * 
     */
    @JsonProperty("permalink")
    public void setPermalink(String permalink) {
        this.permalink = permalink;
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
