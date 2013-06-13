
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
    "pub_day",
    "pub_month",
    "pub_year",
    "stock_symbol",
    "valuation_amount",
    "valuation_currency_code"
})
public class Ipo {

    /**
     * 
     */
    @JsonProperty("pub_day")
    private Double pub_day;
    /**
     * 
     */
    @JsonProperty("pub_month")
    private Double pub_month;
    /**
     * 
     */
    @JsonProperty("pub_year")
    private Double pub_year;
    /**
     * 
     */
    @JsonProperty("stock_symbol")
    private String stock_symbol;
    /**
     * 
     */
    @JsonProperty("valuation_amount")
    private Double valuation_amount;
    /**
     * 
     */
    @JsonProperty("valuation_currency_code")
    private String valuation_currency_code;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    @JsonProperty("pub_day")
    public Double getPub_day() {
        return pub_day;
    }

    /**
     * 
     */
    @JsonProperty("pub_day")
    public void setPub_day(Double pub_day) {
        this.pub_day = pub_day;
    }

    /**
     * 
     */
    @JsonProperty("pub_month")
    public Double getPub_month() {
        return pub_month;
    }

    /**
     * 
     */
    @JsonProperty("pub_month")
    public void setPub_month(Double pub_month) {
        this.pub_month = pub_month;
    }

    /**
     * 
     */
    @JsonProperty("pub_year")
    public Double getPub_year() {
        return pub_year;
    }

    /**
     * 
     */
    @JsonProperty("pub_year")
    public void setPub_year(Double pub_year) {
        this.pub_year = pub_year;
    }

    /**
     * 
     */
    @JsonProperty("stock_symbol")
    public String getStock_symbol() {
        return stock_symbol;
    }

    /**
     * 
     */
    @JsonProperty("stock_symbol")
    public void setStock_symbol(String stock_symbol) {
        this.stock_symbol = stock_symbol;
    }

    /**
     * 
     */
    @JsonProperty("valuation_amount")
    public Double getValuation_amount() {
        return valuation_amount;
    }

    /**
     * 
     */
    @JsonProperty("valuation_amount")
    public void setValuation_amount(Double valuation_amount) {
        this.valuation_amount = valuation_amount;
    }

    /**
     * 
     */
    @JsonProperty("valuation_currency_code")
    public String getValuation_currency_code() {
        return valuation_currency_code;
    }

    /**
     * 
     */
    @JsonProperty("valuation_currency_code")
    public void setValuation_currency_code(String valuation_currency_code) {
        this.valuation_currency_code = valuation_currency_code;
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
