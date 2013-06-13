
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
    "affiliation_name",
    "alias_list",
    "birthplace",
    "blog_feed_url",
    "blog_url",
    "born_day",
    "born_month",
    "born_year",
    "created_at",
    "crunchbase_url",
    "degrees",
    "external_links",
    "first_name",
    "homepage_url",
    "image",
    "investments",
    "last_name",
    "milestones",
    "overview",
    "permalink",
    "relationships",
    "tag_list",
    "twitter_username",
    "updated_at",
    "video_embeds",
    "web_presences"
})
public class PersonEntity {

    /**
     * 
     */
    @JsonProperty("affiliation_name")
    private String affiliation_name;
    /**
     * 
     */
    @JsonProperty("alias_list")
    private String alias_list;
    /**
     * 
     */
    @JsonProperty("birthplace")
    private String birthplace;
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
    @JsonProperty("born_day")
    private Double born_day;
    /**
     * 
     */
    @JsonProperty("born_month")
    private Double born_month;
    /**
     * 
     */
    @JsonProperty("born_year")
    private Double born_year;
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
    @JsonProperty("degrees")
    private List<Object> degrees = new ArrayList<Object>();
    /**
     * 
     */
    @JsonProperty("external_links")
    private List<External_link> external_links = new ArrayList<External_link>();
    /**
     * 
     */
    @JsonProperty("first_name")
    private String first_name;
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
    @JsonProperty("last_name")
    private String last_name;
    /**
     * 
     */
    @JsonProperty("milestones")
    private List<Object> milestones = new ArrayList<Object>();
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
    private List<Object> video_embeds = new ArrayList<Object>();
    /**
     * 
     */
    @JsonProperty("web_presences")
    private List<Object> web_presences = new ArrayList<Object>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    @JsonProperty("affiliation_name")
    public String getAffiliation_name() {
        return affiliation_name;
    }

    /**
     * 
     */
    @JsonProperty("affiliation_name")
    public void setAffiliation_name(String affiliation_name) {
        this.affiliation_name = affiliation_name;
    }

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
    @JsonProperty("birthplace")
    public String getBirthplace() {
        return birthplace;
    }

    /**
     * 
     */
    @JsonProperty("birthplace")
    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
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
    @JsonProperty("born_day")
    public Double getBorn_day() {
        return born_day;
    }

    /**
     * 
     */
    @JsonProperty("born_day")
    public void setBorn_day(Double born_day) {
        this.born_day = born_day;
    }

    /**
     * 
     */
    @JsonProperty("born_month")
    public Double getBorn_month() {
        return born_month;
    }

    /**
     * 
     */
    @JsonProperty("born_month")
    public void setBorn_month(Double born_month) {
        this.born_month = born_month;
    }

    /**
     * 
     */
    @JsonProperty("born_year")
    public Double getBorn_year() {
        return born_year;
    }

    /**
     * 
     */
    @JsonProperty("born_year")
    public void setBorn_year(Double born_year) {
        this.born_year = born_year;
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
    @JsonProperty("degrees")
    public List<Object> getDegrees() {
        return degrees;
    }

    /**
     * 
     */
    @JsonProperty("degrees")
    public void setDegrees(List<Object> degrees) {
        this.degrees = degrees;
    }

    /**
     * 
     */
    @JsonProperty("external_links")
    public List<External_link> getExternal_links() {
        return external_links;
    }

    /**
     * 
     */
    @JsonProperty("external_links")
    public void setExternal_links(List<External_link> external_links) {
        this.external_links = external_links;
    }

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
    @JsonProperty("milestones")
    public List<Object> getMilestones() {
        return milestones;
    }

    /**
     * 
     */
    @JsonProperty("milestones")
    public void setMilestones(List<Object> milestones) {
        this.milestones = milestones;
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
    public List<Object> getVideo_embeds() {
        return video_embeds;
    }

    /**
     * 
     */
    @JsonProperty("video_embeds")
    public void setVideo_embeds(List<Object> video_embeds) {
        this.video_embeds = video_embeds;
    }

    /**
     * 
     */
    @JsonProperty("web_presences")
    public List<Object> getWeb_presences() {
        return web_presences;
    }

    /**
     * 
     */
    @JsonProperty("web_presences")
    public void setWeb_presences(List<Object> web_presences) {
        this.web_presences = web_presences;
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
