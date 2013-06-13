
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
    "company",
    "created_at",
    "crunchbase_url",
    "deadpooled_day",
    "deadpooled_month",
    "deadpooled_url",
    "deadpooled_year",
    "external_links",
    "homepage_url",
    "image",
    "invite_share_url",
    "launched_day",
    "launched_month",
    "launched_year",
    "milestones",
    "name",
    "overview",
    "permalink",
    "stage_code",
    "tag_list",
    "twitter_username",
    "updated_at",
    "video_embeds"
})
public class ProductEntity {

    /**
     * 
     */
    @JsonProperty("alias_list")
    private Object alias_list;
    /**
     * 
     */
    @JsonProperty("blog_feed_url")
    private Object blog_feed_url;
    /**
     * 
     */
    @JsonProperty("blog_url")
    private Object blog_url;
    /**
     * 
     */
    @JsonProperty("company")
    private Company company;
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
    @JsonProperty("deadpooled_day")
    private Object deadpooled_day;
    /**
     * 
     */
    @JsonProperty("deadpooled_month")
    private Object deadpooled_month;
    /**
     * 
     */
    @JsonProperty("deadpooled_url")
    private Object deadpooled_url;
    /**
     * 
     */
    @JsonProperty("deadpooled_year")
    private Object deadpooled_year;
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
    private Object image;
    /**
     * 
     */
    @JsonProperty("invite_share_url")
    private Object invite_share_url;
    /**
     * 
     */
    @JsonProperty("launched_day")
    private Double launched_day;
    /**
     * 
     */
    @JsonProperty("launched_month")
    private Double launched_month;
    /**
     * 
     */
    @JsonProperty("launched_year")
    private Double launched_year;
    /**
     * 
     */
    @JsonProperty("milestones")
    private List<Object> milestones = new ArrayList<Object>();
    /**
     * 
     */
    @JsonProperty("name")
    private String name;
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
    @JsonProperty("stage_code")
    private String stage_code;
    /**
     * 
     */
    @JsonProperty("tag_list")
    private String tag_list;
    /**
     * 
     */
    @JsonProperty("twitter_username")
    private Object twitter_username;
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
    @JsonProperty("blog_feed_url")
    public Object getBlog_feed_url() {
        return blog_feed_url;
    }

    /**
     * 
     */
    @JsonProperty("blog_feed_url")
    public void setBlog_feed_url(Object blog_feed_url) {
        this.blog_feed_url = blog_feed_url;
    }

    /**
     * 
     */
    @JsonProperty("blog_url")
    public Object getBlog_url() {
        return blog_url;
    }

    /**
     * 
     */
    @JsonProperty("blog_url")
    public void setBlog_url(Object blog_url) {
        this.blog_url = blog_url;
    }

    /**
     * 
     */
    @JsonProperty("company")
    public Company getCompany() {
        return company;
    }

    /**
     * 
     */
    @JsonProperty("company")
    public void setCompany(Company company) {
        this.company = company;
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
    @JsonProperty("deadpooled_day")
    public Object getDeadpooled_day() {
        return deadpooled_day;
    }

    /**
     * 
     */
    @JsonProperty("deadpooled_day")
    public void setDeadpooled_day(Object deadpooled_day) {
        this.deadpooled_day = deadpooled_day;
    }

    /**
     * 
     */
    @JsonProperty("deadpooled_month")
    public Object getDeadpooled_month() {
        return deadpooled_month;
    }

    /**
     * 
     */
    @JsonProperty("deadpooled_month")
    public void setDeadpooled_month(Object deadpooled_month) {
        this.deadpooled_month = deadpooled_month;
    }

    /**
     * 
     */
    @JsonProperty("deadpooled_url")
    public Object getDeadpooled_url() {
        return deadpooled_url;
    }

    /**
     * 
     */
    @JsonProperty("deadpooled_url")
    public void setDeadpooled_url(Object deadpooled_url) {
        this.deadpooled_url = deadpooled_url;
    }

    /**
     * 
     */
    @JsonProperty("deadpooled_year")
    public Object getDeadpooled_year() {
        return deadpooled_year;
    }

    /**
     * 
     */
    @JsonProperty("deadpooled_year")
    public void setDeadpooled_year(Object deadpooled_year) {
        this.deadpooled_year = deadpooled_year;
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
    public Object getImage() {
        return image;
    }

    /**
     * 
     */
    @JsonProperty("image")
    public void setImage(Object image) {
        this.image = image;
    }

    /**
     * 
     */
    @JsonProperty("invite_share_url")
    public Object getInvite_share_url() {
        return invite_share_url;
    }

    /**
     * 
     */
    @JsonProperty("invite_share_url")
    public void setInvite_share_url(Object invite_share_url) {
        this.invite_share_url = invite_share_url;
    }

    /**
     * 
     */
    @JsonProperty("launched_day")
    public Double getLaunched_day() {
        return launched_day;
    }

    /**
     * 
     */
    @JsonProperty("launched_day")
    public void setLaunched_day(Double launched_day) {
        this.launched_day = launched_day;
    }

    /**
     * 
     */
    @JsonProperty("launched_month")
    public Double getLaunched_month() {
        return launched_month;
    }

    /**
     * 
     */
    @JsonProperty("launched_month")
    public void setLaunched_month(Double launched_month) {
        this.launched_month = launched_month;
    }

    /**
     * 
     */
    @JsonProperty("launched_year")
    public Double getLaunched_year() {
        return launched_year;
    }

    /**
     * 
     */
    @JsonProperty("launched_year")
    public void setLaunched_year(Double launched_year) {
        this.launched_year = launched_year;
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
    @JsonProperty("stage_code")
    public String getStage_code() {
        return stage_code;
    }

    /**
     * 
     */
    @JsonProperty("stage_code")
    public void setStage_code(String stage_code) {
        this.stage_code = stage_code;
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
    public Object getTwitter_username() {
        return twitter_username;
    }

    /**
     * 
     */
    @JsonProperty("twitter_username")
    public void setTwitter_username(Object twitter_username) {
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
