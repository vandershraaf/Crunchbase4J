package com.ashrafishak.crunchbase4j;

/**
 * Internal class to identify a key-value mapping. 
 * @author Muhammad Ashraf Ishak
 *
 */
public class Key {

	private String name;
	private String permalink;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPermalink() {
		return permalink;
	}
	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((permalink == null) ? 0 : permalink.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (permalink == null) {
			if (other.permalink != null)
				return false;
		} else if (!permalink.equals(other.permalink))
			return false;
		return true;
	}
	
	
	
	
}
