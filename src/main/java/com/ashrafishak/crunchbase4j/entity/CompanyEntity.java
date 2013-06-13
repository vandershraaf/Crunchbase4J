
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
    "acquisition",
    "acquisitions",
    "alias_list",
    "blog_feed_url",
    "blog_url",
    "category_code",
    "competitions",
    "created_at",
    "crunchbase_url",
    "deadpooled_day",
    "deadpooled_month",
    "deadpooled_url",
    "deadpooled_year",
    "description",
    "email_address",
    "external_links",
    "founded_day",
    "founded_month",
    "founded_year",
    "funding_rounds",
    "homepage_url",
    "image",
    "investments",
    "ipo",
    "milestones",
    "name",
    "number_of_employees",
    "offices",
    "overview",
    "permalink",
    "phone_number",
    "products",
    "providerships",
    "relationships",
    "screenshots",
    "tag_list",
    "total_money_raised",
    "twitter_username",
    "updated_at",
    "video_embeds"
})
public class CompanyEntity {

    /**
     * 
     */
    @JsonProperty("acquisition")
    private Object acquisition;
    /**
     * 
     */
    @JsonProperty("acquisitions")
    private List<Acquisition> acquisitions = new ArrayList<Acquisition>();
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
    @JsonProperty("category_code")
    private String category_code;
    /**
     * 
     */
    @JsonProperty("competitions")
    private List<Competition> competitions = new ArrayList<Competition>();
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
    private String deadpooled_url;
    /**
     * 
     */
    @JsonProperty("deadpooled_year")
    private Object deadpooled_year;
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
    private List<External_link> external_links = new ArrayList<External_link>();
    /**
     * 
     */
    @JsonProperty("founded_day")
    private Double founded_day;
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
    @JsonProperty("funding_rounds")
    private List<Funding_round> funding_rounds = new ArrayList<Funding_round>();
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
    private List<Object> investments = new ArrayList<Object>();
    /**
     * 
     */
    @JsonProperty("ipo")
    private Ipo ipo;
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
    private Double number_of_employees;
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
    @JsonProperty("products")
    private List<Product> products = new ArrayList<Product>();
    /**
     * 
     */
    @JsonProperty("providerships")
    private List<Providership> providerships = new ArrayList<Providership>();
    /**
     * 
     */
    @JsonProperty("relationships")
    private List<Relationship> relationships = new ArrayList<Relationship>();
    /**
     * 
     */
    @JsonProperty("screenshots")
    private List<Screenshot> screenshots = new ArrayList<Screenshot>();
    /**
     * 
     */
    @JsonProperty("tag_list")
    private String tag_list;
    /**
     * 
     */
    @JsonProperty("total_money_raised")
    private String total_money_raised;
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
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    @JsonProperty("acquisition")
    public Object getAcquisition() {
        return acquisition;
    }

    /**
     * 
     */
    @JsonProperty("acquisition")
    public void setAcquisition(Object acquisition) {
        this.acquisition = acquisition;
    }

    /**
     * 
     */
    @JsonProperty("acquisitions")
    public List<Acquisition> getAcquisitions() {
        return acquisitions;
    }

    /**
     * 
     */
    @JsonProperty("acquisitions")
    public void setAcquisitions(List<Acquisition> acquisitions) {
        this.acquisitions = acquisitions;
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
    @JsonProperty("competitions")
    public List<Competition> getCompetitions() {
        return competitions;
    }

    /**
     * 
     */
    @JsonProperty("competitions")
    public void setCompetitions(List<Competition> competitions) {
        this.competitions = competitions;
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
    public String getDeadpooled_url() {
        return deadpooled_url;
    }

    /**
     * 
     */
    @JsonProperty("deadpooled_url")
    public void setDeadpooled_url(String deadpooled_url) {
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
    @JsonProperty("founded_day")
    public Double getFounded_day() {
        return founded_day;
    }

    /**
     * 
     */
    @JsonProperty("founded_day")
    public void setFounded_day(Double founded_day) {
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
    @JsonProperty("funding_rounds")
    public List<Funding_round> getFunding_rounds() {
        return funding_rounds;
    }

    /**
     * 
     */
    @JsonProperty("funding_rounds")
    public void setFunding_rounds(List<Funding_round> funding_rounds) {
        this.funding_rounds = funding_rounds;
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
    public List<Object> getInvestments() {
        return investments;
    }

    /**
     * 
     */
    @JsonProperty("investments")
    public void setInvestments(List<Object> investments) {
        this.investments = investments;
    }

    /**
     * 
     */
    @JsonProperty("ipo")
    public Ipo getIpo() {
        return ipo;
    }

    /**
     * 
     */
    @JsonProperty("ipo")
    public void setIpo(Ipo ipo) {
        this.ipo = ipo;
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
    public Double getNumber_of_employees() {
        return number_of_employees;
    }

    /**
     * 
     */
    @JsonProperty("number_of_employees")
    public void setNumber_of_employees(Double number_of_employees) {
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
    @JsonProperty("products")
    public List<Product> getProducts() {
        return products;
    }

    /**
     * 
     */
    @JsonProperty("products")
    public void setProducts(List<Product> products) {
        this.products = products;
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
    @JsonProperty("screenshots")
    public List<Screenshot> getScreenshots() {
        return screenshots;
    }

    /**
     * 
     */
    @JsonProperty("screenshots")
    public void setScreenshots(List<Screenshot> screenshots) {
        this.screenshots = screenshots;
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
    @JsonProperty("total_money_raised")
    public String getTotal_money_raised() {
        return total_money_raised;
    }

    /**
     * 
     */
    @JsonProperty("total_money_raised")
    public void setTotal_money_raised(String total_money_raised) {
        this.total_money_raised = total_money_raised;
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
