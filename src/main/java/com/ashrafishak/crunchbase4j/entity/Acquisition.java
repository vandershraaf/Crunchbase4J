
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
    "acquired_day",
    "acquired_month",
    "acquired_year",
    "company",
    "price_amount",
    "price_currency_code",
    "source_description",
    "source_url",
    "term_code"
})
public class Acquisition {

    /**
     * 
     */
    @JsonProperty("acquired_day")
    private Double acquired_day;
    /**
     * 
     */
    @JsonProperty("acquired_month")
    private Double acquired_month;
    /**
     * 
     */
    @JsonProperty("acquired_year")
    private Double acquired_year;
    /**
     * 
     */
    @JsonProperty("company")
    private Company company;
    /**
     * 
     */
    @JsonProperty("price_amount")
    private Object price_amount;
    /**
     * 
     */
    @JsonProperty("price_currency_code")
    private String price_currency_code;
    /**
     * 
     */
    @JsonProperty("source_description")
    private String source_description;
    /**
     * 
     */
    @JsonProperty("source_url")
    private String source_url;
    /**
     * 
     */
    @JsonProperty("term_code")
    private String term_code;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    @JsonProperty("acquired_day")
    public Double getAcquired_day() {
        return acquired_day;
    }

    /**
     * 
     */
    @JsonProperty("acquired_day")
    public void setAcquired_day(Double acquired_day) {
        this.acquired_day = acquired_day;
    }

    /**
     * 
     */
    @JsonProperty("acquired_month")
    public Double getAcquired_month() {
        return acquired_month;
    }

    /**
     * 
     */
    @JsonProperty("acquired_month")
    public void setAcquired_month(Double acquired_month) {
        this.acquired_month = acquired_month;
    }

    /**
     * 
     */
    @JsonProperty("acquired_year")
    public Double getAcquired_year() {
        return acquired_year;
    }

    /**
     * 
     */
    @JsonProperty("acquired_year")
    public void setAcquired_year(Double acquired_year) {
        this.acquired_year = acquired_year;
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
    @JsonProperty("price_amount")
    public Object getPrice_amount() {
        return price_amount;
    }

    /**
     * 
     */
    @JsonProperty("price_amount")
    public void setPrice_amount(Object price_amount) {
        this.price_amount = price_amount;
    }

    /**
     * 
     */
    @JsonProperty("price_currency_code")
    public String getPrice_currency_code() {
        return price_currency_code;
    }

    /**
     * 
     */
    @JsonProperty("price_currency_code")
    public void setPrice_currency_code(String price_currency_code) {
        this.price_currency_code = price_currency_code;
    }

    /**
     * 
     */
    @JsonProperty("source_description")
    public String getSource_description() {
        return source_description;
    }

    /**
     * 
     */
    @JsonProperty("source_description")
    public void setSource_description(String source_description) {
        this.source_description = source_description;
    }

    /**
     * 
     */
    @JsonProperty("source_url")
    public String getSource_url() {
        return source_url;
    }

    /**
     * 
     */
    @JsonProperty("source_url")
    public void setSource_url(String source_url) {
        this.source_url = source_url;
    }

    /**
     * 
     */
    @JsonProperty("term_code")
    public String getTerm_code() {
        return term_code;
    }

    /**
     * 
     */
    @JsonProperty("term_code")
    public void setTerm_code(String term_code) {
        this.term_code = term_code;
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
