
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
    "blog_feed_url",
    "blog_url",
    "created_at",
    "crunchbase_url",
    "description",
    "email_address",
    "external_links",
    "founded_day",
    "founded_month",
    "founded_year",
    "funds",
    "homepage_url",
    "image",
    "investments",
    "milestones",
    "name",
    "number_of_employees",
    "offices",
    "overview",
    "permalink",
    "phone_number",
    "providerships",
    "relationships",
    "tag_list",
    "twitter_username",
    "updated_at",
    "video_embeds"
})
public class FinancialOrganizationEntity {

    /**
     * 
     */
    @JsonProperty("alias_list")
    private String alias_list;
    /**
     * 
     */
    @JsonProperty("blog_feed_url")
    private String blog_feed_url;
    /**
     * 
     */
    @JsonProperty("blog_url")
    private String blog_url;
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
    @JsonProperty("description")
    private String description;
    /**
     * 
     */
    @JsonProperty("email_address")
    private String email_address;
    /**
     * 
     */
    @JsonProperty("external_links")
    private List<Object> external_links = new ArrayList<Object>();
    /**
     * 
     */
    @JsonProperty("founded_day")
    private Object founded_day;
    /**
     * 
     */
    @JsonProperty("founded_month")
    private Double founded_month;
    /**
     * 
     */
    @JsonProperty("founded_year")
    private Double founded_year;
    /**
     * 
     */
    @JsonProperty("funds")
    private List<Fund> funds = new ArrayList<Fund>();
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
    @JsonProperty("investments")
    private List<Investmants> investments = new ArrayList<Investmants>();
    /**
     * 
     */
    @JsonProperty("milestones")
    private List<Milestone> milestones = new ArrayList<Milestone>();
    /**
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     */
    @JsonProperty("number_of_employees")
    private Object number_of_employees;
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
    /**
     * 
     */
    @JsonProperty("phone_number")
    private String phone_number;
    /**
     * 
     */
    @JsonProperty("providerships")
    private List<Object> providerships = new ArrayList<Object>();
    /**
     * 
     */
    @JsonProperty("relationships")
    private List<Relationship> relationships = new ArrayList<Relationship>();
    /**
     * 
     */
    @JsonProperty("tag_list")
    private String tag_list;
    /**
     * 
     */
    @JsonProperty("twitter_username")
    private String twitter_username;
    /**
     * 
     */
    @JsonProperty("updated_at")
    private String updated_at;
    /**
     * 
     */
    @JsonProperty("video_embeds")
    private List<Video_embed> video_embeds = new ArrayList<Video_embed>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    @JsonProperty("alias_list")
    public String getAlias_list() {
        return alias_list;
    }

    /**
     * 
     */
    @JsonProperty("alias_list")
    public void setAlias_list(String alias_list) {
        this.alias_list = alias_list;
    }

    /**
     * 
     */
    @JsonProperty("blog_feed_url")
    public String getBlog_feed_url() {
        return blog_feed_url;
    }

    /**
     * 
     */
    @JsonProperty("blog_feed_url")
    public void setBlog_feed_url(String blog_feed_url) {
        this.blog_feed_url = blog_feed_url;
    }

    /**
     * 
     */
    @JsonProperty("blog_url")
    public String getBlog_url() {
        return blog_url;
    }

    /**
     * 
     */
    @JsonProperty("blog_url")
    public void setBlog_url(String blog_url) {
        this.blog_url = blog_url;
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
    @JsonProperty("email_address")
    public String getEmail_address() {
        return email_address;
    }

    /**
     * 
     */
    @JsonProperty("email_address")
    public void setEmail_address(String email_address) {
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
    @JsonProperty("founded_day")
    public Object getFounded_day() {
        return founded_day;
    }

    /**
     * 
     */
    @JsonProperty("founded_day")
    public void setFounded_day(Object founded_day) {
        this.founded_day = founded_day;
    }

    /**
     * 
     */
    @JsonProperty("founded_month")
    public Double getFounded_month() {
        return founded_month;
    }

    /**
     * 
     */
    @JsonProperty("founded_month")
    public void setFounded_month(Double founded_month) {
        this.founded_month = founded_month;
    }

    /**
     * 
     */
    @JsonProperty("founded_year")
    public Double getFounded_year() {
        return founded_year;
    }

    /**
     * 
     */
    @JsonProperty("founded_year")
    public void setFounded_year(Double founded_year) {
        this.founded_year = founded_year;
    }

    /**
     * 
     */
    @JsonProperty("funds")
    public List<Fund> getFunds() {
        return funds;
    }

    /**
     * 
     */
    @JsonProperty("funds")
    public void setFunds(List<Fund> funds) {
        this.funds = funds;
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
    @JsonProperty("investments")
    public List<Investmants> getInvestments() {
        return investments;
    }

    /**
     * 
     */
    @JsonProperty("investments")
    public void setInvestments(List<Investmants> investments) {
        this.investments = investments;
    }

    /**
     * 
     */
    @JsonProperty("milestones")
    public List<Milestone> getMilestones() {
        return milestones;
    }

    /**
     * 
     */
    @JsonProperty("milestones")
    public void setMilestones(List<Milestone> milestones) {
        this.milestones = milestones;
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
    @JsonProperty("number_of_employees")
    public Object getNumber_of_employees() {
        return number_of_employees;
    }

    /**
     * 
     */
    @JsonProperty("number_of_employees")
    public void setNumber_of_employees(Object number_of_employees) {
        this.number_of_employees = number_of_employees;
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

    /**
     * 
     */
    @JsonProperty("phone_number")
    public String getPhone_number() {
        return phone_number;
    }

    /**
     * 
     */
    @JsonProperty("phone_number")
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    /**
     * 
     */
    @JsonProperty("providerships")
    public List<Object> getProviderships() {
        return providerships;
    }

    /**
     * 
     */
    @JsonProperty("providerships")
    public void setProviderships(List<Object> providerships) {
        this.providerships = providerships;
    }

    /**
     * 
     */
    @JsonProperty("relationships")
    public List<Relationship> getRelationships() {
        return relationships;
    }

    /**
     * 
     */
    @JsonProperty("relationships")
    public void setRelationships(List<Relationship> relationships) {
        this.relationships = relationships;
    }

    /**
     * 
     */
    @JsonProperty("tag_list")
    public String getTag_list() {
        return tag_list;
    }

    /**
     * 
     */
    @JsonProperty("tag_list")
    public void setTag_list(String tag_list) {
        this.tag_list = tag_list;
    }

    /**
     * 
     */
    @JsonProperty("twitter_username")
    public String getTwitter_username() {
        return twitter_username;
    }

    /**
     * 
     */
    @JsonProperty("twitter_username")
    public void setTwitter_username(String twitter_username) {
        this.twitter_username = twitter_username;
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

    /**
     * 
     */
    @JsonProperty("video_embeds")
    public List<Video_embed> getVideo_embeds() {
        return video_embeds;
    }

    /**
     * 
     */
    @JsonProperty("video_embeds")
    public void setVideo_embeds(List<Video_embed> video_embeds) {
        this.video_embeds = video_embeds;
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
