package com.ashrafishak.crunchbase4j;

import com.ashrafishak.crunchbase4j.entity.CompanyEntity;

import org.junit.*;

public class TestEntity {

	@Test
	public void testCompany(){
		Crunchbase4J cr = new Crunchbase4J("7htrpb32qpg6ztnevh2bdsmv");
		CompanyEntity ce = cr.getEntityCompany("facebook");
		Assert.assertEquals("http://blog.facebook.com/atom.php", ce.getBlog_feed_url());
	}
}
