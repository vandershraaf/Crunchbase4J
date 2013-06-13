package com.ashrafishak.crunchbase4j.entitylist;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "permalink"
})
public class Entity {

	@JsonProperty("name")
	private String name;
	
	@JsonProperty("permalink")
	private String permalink;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("permalink")
	public String getPermalink() {
		return permalink;
	}

	@JsonProperty("permalink")
	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}
}
