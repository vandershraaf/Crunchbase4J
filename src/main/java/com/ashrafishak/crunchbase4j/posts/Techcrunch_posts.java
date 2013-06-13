
package com.ashrafishak.crunchbase4j.posts;

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
    "crunchbase_url",
    "name",
    "num_posts",
    "permalink",
    "posts_url"
})
public class Techcrunch_posts {

    /**
     * 
     */
    @JsonProperty("crunchbase_url")
    private String crunchbase_url;
    /**
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     */
    @JsonProperty("num_posts")
    private Double num_posts;
    /**
     * 
     */
    @JsonProperty("permalink")
    private String permalink;
    /**
     * 
     */
    @JsonProperty("posts_url")
    private String posts_url;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
    @JsonProperty("num_posts")
    public Double getNum_posts() {
        return num_posts;
    }

    /**
     * 
     */
    @JsonProperty("num_posts")
    public void setNum_posts(Double num_posts) {
        this.num_posts = num_posts;
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
    @JsonProperty("posts_url")
    public String getPosts_url() {
        return posts_url;
    }

    /**
     * 
     */
    @JsonProperty("posts_url")
    public void setPosts_url(String posts_url) {
        this.posts_url = posts_url;
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
