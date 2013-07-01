package com.ashrafishak.crunchbase4j;


import org.junit.Assert;

import com.ashrafishak.crunchbase4j.Crunchbase4J.PostsType;
import com.ashrafishak.crunchbase4j.posts.Posts;

public class TestPosts {

	public void testPosts(){
		Crunchbase4J cb = new Crunchbase4J("7htrpb32qpg6ztnevh2bdsmv");
		Posts posts = cb.getPosts(PostsType.COMPANIES, "facebook");
		Assert.assertNotNull(posts);
		Assert.assertEquals("http://www.crunchbase.com/company/facebook/posts", posts.getPosts_url());
	}
}
