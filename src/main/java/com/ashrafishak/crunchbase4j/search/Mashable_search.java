
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
    "crunchbase_url",
    "page",
    "results",
    "total"
})
public class Mashable_search {

    /**
     * 
     */
    @JsonProperty("crunchbase_url")
    private String crunchbase_url;
    /**
     * 
     */
    @JsonProperty("page")
    private Double page;
    /**
     * 
     */
    @JsonProperty("results")
    private List<Result> results = new ArrayList<Result>();
    /**
     * 
     */
    @JsonProperty("total")
    private Double total;
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
    @JsonProperty("page")
    public Double getPage() {
        return page;
    }

    /**
     * 
     */
    @JsonProperty("page")
    public void setPage(Double page) {
        this.page = page;
    }

    /**
     * 
     */
    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    /**
     * 
     */
    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    /**
     * 
     */
    @JsonProperty("total")
    public Double getTotal() {
        return total;
    }

    /**
     * 
     */
    @JsonProperty("total")
    public void setTotal(Double total) {
        this.total = total;
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
