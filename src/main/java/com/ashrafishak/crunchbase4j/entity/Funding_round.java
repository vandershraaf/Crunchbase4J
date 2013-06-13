
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
    "company",
    "funded_day",
    "funded_month",
    "funded_year",
    "raised_amount",
    "raised_currency_code",
    "round_code",
    "source_description",
    "source_url"
})
public class Funding_round {

    /**
     * 
     */
    @JsonProperty("company")
    private Company company;
    /**
     * 
     */
    @JsonProperty("funded_day")
    private Double funded_day;
    /**
     * 
     */
    @JsonProperty("funded_month")
    private Double funded_month;
    /**
     * 
     */
    @JsonProperty("funded_year")
    private Double funded_year;
    /**
     * 
     */
    @JsonProperty("raised_amount")
    private Double raised_amount;
    /**
     * 
     */
    @JsonProperty("raised_currency_code")
    private String raised_currency_code;
    /**
     * 
     */
    @JsonProperty("round_code")
    private String round_code;
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
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
    @JsonProperty("funded_day")
    public Double getFunded_day() {
        return funded_day;
    }

    /**
     * 
     */
    @JsonProperty("funded_day")
    public void setFunded_day(Double funded_day) {
        this.funded_day = funded_day;
    }

    /**
     * 
     */
    @JsonProperty("funded_month")
    public Double getFunded_month() {
        return funded_month;
    }

    /**
     * 
     */
    @JsonProperty("funded_month")
    public void setFunded_month(Double funded_month) {
        this.funded_month = funded_month;
    }

    /**
     * 
     */
    @JsonProperty("funded_year")
    public Double getFunded_year() {
        return funded_year;
    }

    /**
     * 
     */
    @JsonProperty("funded_year")
    public void setFunded_year(Double funded_year) {
        this.funded_year = funded_year;
    }

    /**
     * 
     */
    @JsonProperty("raised_amount")
    public Double getRaised_amount() {
        return raised_amount;
    }

    /**
     * 
     */
    @JsonProperty("raised_amount")
    public void setRaised_amount(Double raised_amount) {
        this.raised_amount = raised_amount;
    }

    /**
     * 
     */
    @JsonProperty("raised_currency_code")
    public String getRaised_currency_code() {
        return raised_currency_code;
    }

    /**
     * 
     */
    @JsonProperty("raised_currency_code")
    public void setRaised_currency_code(String raised_currency_code) {
        this.raised_currency_code = raised_currency_code;
    }

    /**
     * 
     */
    @JsonProperty("round_code")
    public String getRound_code() {
        return round_code;
    }

    /**
     * 
     */
    @JsonProperty("round_code")
    public void setRound_code(String round_code) {
        this.round_code = round_code;
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
