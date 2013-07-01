package com.ashrafishak.crunchbase4j;


import org.junit.Assert;
import org.junit.Test;

import com.ashrafishak.crunchbase4j.Crunchbase4J.EntityListType;
import com.ashrafishak.crunchbase4j.entitylist.Entity;

public class TestEntityList {

	@Test
	public void testEntityList(){
		Crunchbase4J cr = new Crunchbase4J("7htrpb32qpg6ztnevh2bdsmv");
		Entity[] entity = cr.getEntityList(EntityListType.FINANCIAL_ORGANIZATIONS);
		Assert.assertNotEquals(0, entity.length);
		boolean found = false;
		for (Entity e: entity){
			if (e.getPermalink().equals("accel-partners")){
				found = true;
			}
		}
		Assert.assertTrue(found);
	}
}
