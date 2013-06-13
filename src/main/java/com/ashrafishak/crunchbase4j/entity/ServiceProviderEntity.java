
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
    "alias_list",
    "created_at",
    "crunchbase_url",
    "email_address",
    "external_links",
    "homepage_url",
    "image",
    "name",
    "offices",
    "overview",
    "permalink",
    "phone_number",
    "providerships",
    "tag_list",
    "updated_at"
})
public class ServiceProviderEntity {

    /**
     * 
     */
    @JsonProperty("alias_list")
    private Object alias_list;
    /**
     * 
     */
    @JsonProperty("created_at")
    private String created_at;
    /**
     * 
     */
    @JsonProperty("crunchbase_url")
    private String crunchbase_url;
    /**
     * 
     */
    @JsonProperty("email_address")
    private Object email_address;
    /**
     * 
     */
    @JsonProperty("external_links")
    private List<Object> external_links = new ArrayList<Object>();
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
    @JsonProperty("offices")
    private List<Object> offices = new ArrayList<Object>();
    /**
     * 
     */
    @JsonProperty("overview")
    private Object overview;
    /**
     * 
     */
    @JsonProperty("permalink")
    private String permalink;
    /**
     * 
     */
    @JsonProperty("phone_number")
    private Object phone_number;
    /**
     * 
     */
    @JsonProperty("providerships")
    private List<Providership> providerships = new ArrayList<Providership>();
    /**
     * 
     */
    @JsonProperty("tag_list")
    private Object tag_list;
    /**
     * 
     */
    @JsonProperty("updated_at")
    private String updated_at;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    @JsonProperty("alias_list")
    public Object getAlias_list() {
        return alias_list;
    }

    /**
     * 
     */
    @JsonProperty("alias_list")
    public void setAlias_list(Object alias_list) {
        this.alias_list = alias_list;
    }

    /**
     * 
     */
    @JsonProperty("created_at")
    public String getCreated_at() {
        return created_at;
    }

    /**
     * 
     */
    @JsonProperty("created_at")
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
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
    @JsonProperty("email_address")
    public Object getEmail_address() {
        return email_address;
    }

    /**
     * 
     */
    @JsonProperty("email_address")
    public void setEmail_address(Object email_address) {
        this.email_address = email_address;
    }

    /**
     * 
     */
    @JsonProperty("external_links")
    public List<Object> getExternal_links() {
        return external_links;
    }

    /**
     * 
     */
    @JsonProperty("external_links")
    public void setExternal_links(List<Object> external_links) {
        this.external_links = external_links;
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
    @JsonProperty("offices")
    public List<Object> getOffices() {
        return offices;
    }

    /**
     * 
     */
    @JsonProperty("offices")
    public void setOffices(List<Object> offices) {
        this.offices = offices;
    }

    /**
     * 
     */
    @JsonProperty("overview")
    public Object getOverview() {
        return overview;
    }

    /**
     * 
     */
    @JsonProperty("overview")
    public void setOverview(Object overview) {
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

    /**
     * 
     */
    @JsonProperty("phone_number")
    public Object getPhone_number() {
        return phone_number;
    }

    /**
     * 
     */
    @JsonProperty("phone_number")
    public void setPhone_number(Object phone_number) {
        this.phone_number = phone_number;
    }

    /**
     * 
     */
    @JsonProperty("providerships")
    public List<Providership> getProviderships() {
        return providerships;
    }

    /**
     * 
     */
    @JsonProperty("providerships")
    public void setProviderships(List<Providership> providerships) {
        this.providerships = providerships;
    }

    /**
     * 
     */
    @JsonProperty("tag_list")
    public Object getTag_list() {
        return tag_list;
    }

    /**
     * 
     */
    @JsonProperty("tag_list")
    public void setTag_list(Object tag_list) {
        this.tag_list = tag_list;
    }

    /**
     * 
     */
    @JsonProperty("updated_at")
    public String getUpdated_at() {
        return updated_at;
    }

    /**
     * 
     */
    @JsonProperty("updated_at")
    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
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
