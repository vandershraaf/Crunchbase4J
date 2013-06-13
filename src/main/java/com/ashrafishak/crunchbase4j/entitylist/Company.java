package com.ashrafishak.crunchbase4j.entitylist;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "category_code"
})
public class Company extends Entity{

	@JsonProperty("category_code")
	private String categoryCode;

	@JsonProperty("category_code")
	public String getCategoryCode() {
		return categoryCode;
	}

	@JsonProperty("category_code")
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	
}
