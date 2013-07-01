package com.ashrafishak.crunchbase4j;


import org.junit.Assert;
import org.junit.Test;

import com.ashrafishak.crunchbase4j.search.Search;

public class TestSearch {

	@Test
	public void testSearch(){
		Crunchbase4J cb = new Crunchbase4J("7htrpb32qpg6ztnevh2bdsmv");
		Search s = cb.getSearch("facebook");
		Assert.assertNotNull(s);
		Assert.assertEquals("http://www.crunchbase.com/search?query=facebook", s.getCrunchbase_url());
	}
}
