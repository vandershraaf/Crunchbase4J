
package com.ashrafishak.crunchbase4j.search;

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
    "category_code",
    "crunchbase_url",
    "description",
    "homepage_url",
    "image",
    "name",
    "namespace",
    "offices",
    "overview",
    "permalink"
})
public class Result {

    /**
     * 
     */
    @JsonProperty("category_code")
    private String category_code;
    /**
     * 
     */
    @JsonProperty("crunchbase_url")
    private String crunchbase_url;
    /**
     * 
     */
    @JsonProperty("description")
    private String description;
    /**
     * 
     */
    @JsonProperty("homepage_url")
    private String homepage_url;
    /**
     * 
     */
    @JsonProperty("image")
    private Image image;
    /**
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     */
    @JsonProperty("namespace")
    private String namespace;
    /**
     * 
     */
    @JsonProperty("offices")
    private List<Office> offices = new ArrayList<Office>();
    /**
     * 
     */
    @JsonProperty("overview")
    private String overview;
    /**
     * 
     */
    @JsonProperty("permalink")
    private String permalink;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    @JsonProperty("category_code")
    public String getCategory_code() {
        return category_code;
    }

    /**
     * 
     */
    @JsonProperty("category_code")
    public void setCategory_code(String category_code) {
        this.category_code = category_code;
    }

    /**
     * 
     */
    @JsonProperty("crunchbase_url")
    public String getCrunchbase_url() {
        return crunchbase_url;
    }

    /**
     * 
     */
    @JsonProperty("crunchbase_url")
    public void setCrunchbase_url(String crunchbase_url) {
        this.crunchbase_url = crunchbase_url;
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
    @JsonProperty("homepage_url")
    public String getHomepage_url() {
        return homepage_url;
    }

    /**
     * 
     */
    @JsonProperty("homepage_url")
    public void setHomepage_url(String homepage_url) {
        this.homepage_url = homepage_url;
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
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     */
    @JsonProperty("namespace")
    public String getNamespace() {
        return namespace;
    }

    /**
     * 
     */
    @JsonProperty("namespace")
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * 
     */
    @JsonProperty("offices")
    public List<Office> getOffices() {
        return offices;
    }

    /**
     * 
     */
    @JsonProperty("offices")
    public void setOffices(List<Office> offices) {
        this.offices = offices;
    }

    /**
     * 
     */
    @JsonProperty("overview")
    public String getOverview() {
        return overview;
    }

    /**
     * 
     */
    @JsonProperty("overview")
    public void setOverview(String overview) {
        this.overview = overview;
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
