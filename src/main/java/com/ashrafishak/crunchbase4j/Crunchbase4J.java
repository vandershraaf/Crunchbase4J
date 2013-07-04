package com.ashrafishak.crunchbase4j;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Properties;

import com.ashrafishak.crunchbase4j.entity.*;
import com.ashrafishak.crunchbase4j.entitylist.*;
import com.ashrafishak.crunchbase4j.posts.Posts;
import com.ashrafishak.crunchbase4j.search.Search;
import com.ashrafishak.crunchbase4j.util.ConfigProperties;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The main class to be used for this Crunchbase4J library. Initialize this class
 * with your API key.
 * 
 * <strong>NOTE: </strong>To improve performance, a request will get the instance
 * from cache if a similar request has already been done. 
 * 
 * @author Muhammad Ashraf Ishak
 *
 */
public class Crunchbase4J {
	
	public enum EntityListType {
		COMPANIES ("companies"), 
		PEOPLE ("people"), 
		FINANCIAL_ORGANIZATIONS ("financial-organizations"), 
		PRODUCTS ("products"), 
		SERVICE_PROVIDERS("service-providers");
		
		private String permalink;
		
		EntityListType(String permalink){
			this.setPermalink(permalink);
		}

		public String getPermalink() {
			return permalink;
		}

		public void setPermalink(String permalink) {
			this.permalink = permalink;
		}
		
		
	}
	
	public enum PostsType {
		COMPANIES ("companies"), 
		PEOPLE ("people"), 
		FINANCIAL_ORGANIZATIONS ("financial-organizations"), 
		PRODUCTS ("products");
		
		private String namespace;
		
		PostsType (String namespace){
			this.setNamespace(namespace);
		}

		public String getNamespace() {
			return namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}
	}
	
	private String apiKey = null;
	
	private Properties properties = null;
	
	// mapping: permalink --> entity
	private HashMap<String, CompanyEntity> companyEntityMap = null;
	private HashMap<String, PersonEntity> personEntityMap = null;
	private HashMap<String, FinancialOrganizationEntity> financialOrgEntityMap = null;
	private HashMap<String, ProductEntity> productEntityMap = null;
	private HashMap<String, ServiceProviderEntity> svcProviderEntityMap = null;
	
	// mapping: permalink --> entitylist
	private HashMap<String, Entity[]> entityListMap = null;
	
	// mapping: keyword --> search
	private HashMap<String, Search> searchMap = null;
	
	// mapping: if person, (first name + last name, permalink) --> posts
			//  if companies etc, 
	private HashMap<Key, Posts> postsMap = null;
	
	
	public Crunchbase4J (String apiKey){
		this.setApiKey(apiKey);
		this.setProperties(ConfigProperties.getInstance());
		this.companyEntityMap = new HashMap<String, CompanyEntity>();
		this.personEntityMap = new HashMap<String, PersonEntity>();
		this.financialOrgEntityMap = new HashMap<String, FinancialOrganizationEntity>();
		this.productEntityMap = new HashMap<String, ProductEntity>();
		this.svcProviderEntityMap = new HashMap<String, ServiceProviderEntity>();
		this.entityListMap = new HashMap<String, Entity[]>();
		this.searchMap = new HashMap<String, Search>();
		this.postsMap = new HashMap<Key, Posts>();
	}
	
	/**
	 * Retrieves the <strong>Company</strong> entity from the API
	 * @param companyPermalink Permalink of the company as defined in the API
	 * @return A {@link com.ashrafishak.crunchbase4j.entity.CompanyEntity} instance 
	 * 		
	 */
	public CompanyEntity getEntityCompany(String companyPermalink){
		if (this.companyEntityMap.get(companyPermalink) != null){
			return this.companyEntityMap.get(companyPermalink);
		} else {
			String urlFormat = this.properties.getProperty("entity.company.url");
			String url = String.format(urlFormat, companyPermalink, this.apiKey);
			CompanyEntity entity = (CompanyEntity) this.pullCrunchbaseApi(url, CompanyEntity.class);
			this.companyEntityMap.put(companyPermalink, entity);
			return entity;
		}
	}
	
	/**
	 * Retrieves the <strong>Person</strong> entity from the API
	 * @param companyPermalink Permalink of Person as defined in the API
	 * @return A {@link com.ashrafishak.crunchbase4j.entity.PersonEntity} instance 
	 * 		
	 */
	public PersonEntity getEntityPerson(String personPermalink){
		if (this.personEntityMap.get(personPermalink) != null){
			return this.personEntityMap.get(personPermalink);
		} else {
			String urlFormat = this.properties.getProperty("entity.person.url");
			String url = String.format(urlFormat, personPermalink, this.apiKey);
			PersonEntity entity = (PersonEntity) this.pullCrunchbaseApi(url, PersonEntity.class);
			this.personEntityMap.put(personPermalink, entity);
			return entity;
		}
	}
	
	/**
	 * Retrieves the <strong>Financial Organization</strong> entity from the API
	 * @param companyPermalink Permalink of financial organization as defined in the API
	 * @return A {@link com.ashrafishak.crunchbase4j.entity.FinancialOrganizationEntity} instance 
	 * 		
	 */
	public FinancialOrganizationEntity getEntityFinancialOrg(String financialOrgPermalink){
		if (this.financialOrgEntityMap.get(financialOrgPermalink) != null){
			return this.financialOrgEntityMap.get(financialOrgPermalink);
		} else {
			String urlFormat = this.properties.getProperty("entity.financial.url");
			String url = String.format(urlFormat, financialOrgPermalink, this.apiKey);
			FinancialOrganizationEntity entity = (FinancialOrganizationEntity) 
													this.pullCrunchbaseApi(url, 
																			FinancialOrganizationEntity.class);
			this.financialOrgEntityMap.put(financialOrgPermalink, entity);
			return entity;
		}
	}
	
	/**
	 * Retrieves the <strong>Product</strong> entity from the API
	 * @param companyPermalink Permalink of product as defined in the API
	 * @return A {@link com.ashrafishak.crunchbase4j.entity.ProductEntity} instance 
	 * 		
	 */
	public ProductEntity getEntityProduct(String productPermalink){
		if (this.productEntityMap.get(productPermalink) != null){
			return this.productEntityMap.get(productPermalink);
		} else {
			String urlFormat = this.properties.getProperty("entity.product.url");
			String url = String.format(urlFormat, productPermalink, this.apiKey);
			ProductEntity entity = (ProductEntity) this.pullCrunchbaseApi(url, ProductEntity.class);
			this.productEntityMap.put(productPermalink, entity);
			return entity;
		}
	}
	
	/**
	 * Retrieves the <strong>Service Provider</strong> entity from the API
	 * @param companyPermalink Permalink of service provider as defined in the API
	 * @return A {@link com.ashrafishak.crunchbase4j.entity.ServiceProviderEntity} instance 
	 * 		
	 */
	public ServiceProviderEntity getEntityServiceProvider(String svcProviderPermalink){
		if (this.svcProviderEntityMap.get(svcProviderPermalink) != null){
			return this.svcProviderEntityMap.get(svcProviderPermalink);
		} else {
			String urlFormat = this.properties.getProperty("entity.service.url");
			String url = String.format(urlFormat, svcProviderPermalink, this.apiKey);
			ServiceProviderEntity entity = (ServiceProviderEntity) this.pullCrunchbaseApi(url, ServiceProviderEntity.class);
			this.svcProviderEntityMap.put(svcProviderPermalink, entity);
			return entity;
		}
	}
	
	/**
	 * Retrieves the list of all names and its permalink of a category of entity 
	 * defined by {@code type} parameter. If the user has no knowledge on the specific
	 * permalink to be used in other methods, then this method comes in handy. 
	 * 
	 * @param type A {@link com.ashrafishak.crunchbase4j.Crunchbase4J.EntityListType} type
	 * @return An array of {@link com.ashrafishak.crunchbase4j.entitylist.Entity} instance
	 */
	public Entity[] getEntityList(EntityListType type){
		if (this.entityListMap.get(type.getPermalink()) != null){
			return this.entityListMap.get(type.getPermalink());
		} else {
			String urlFormat = this.properties.getProperty("entitylist.url");
			String url = String.format(urlFormat, type.getPermalink(), this.apiKey);
			Entity[] list = (Entity[]) this.pullCrunchbaseApi(url, Entity[].class);
			this.entityListMap.put(type.getPermalink(), list);
			return list;
		}
		
	}
	
	/**
	 * Return result of search from the API based on {@code keyword} entered. 
	 * Note that for now, the method only serves for the 'query' parameter of the 
	 * request. 
	 * @param keyword Value of the 'query' parameter of the API request
	 * @return A {@link com.ashrafishak.crunchbase4j.search.Search} instance
	 */
	public Search getSearch(String keyword){
		if (this.searchMap.get(keyword) != null){
			return this.searchMap.get(keyword);
		} else {
			String urlFormat = this.properties.getProperty("search.url");
			String url = String.format(urlFormat, keyword, this.apiKey);
			Search search = (Search) this.pullCrunchbaseApi(url, Search.class);
			this.searchMap.put(keyword, search);
			return search;
		}
	}
	
	/**
	 * Retrieves the link of Post related to an Entity. If {@code postsType} is PEOPLE, 
	 * then {@code strings} parameter should have 2 elements. Else, only 1 element
	 * is needed as input. 
	 * @param postsType A {@link com.ashrafishak.crunchbase4j.Crunchbase4J.PostsType} instance
	 * @param strings 
	 * @return A {@link com.ashrafishak.crunchbase4j.posts.Posts} instance
	 */
	public Posts getPosts(PostsType postsType, String... strings){
		String url = null;
		if (postsType == PostsType.PEOPLE){
			String urlFormat = this.properties.getProperty("posts.people");
			url = String.format(urlFormat, strings[0], strings[1], this.apiKey);
		} else {
			String urlFormat = this.properties.getProperty("posts.noncompany");
			url = String.format(urlFormat, postsType.getNamespace(), strings[0], this.apiKey);
		}
		Posts posts = (Posts) this.pullCrunchbaseApi(url, Posts.class);
		return posts;
	}
	
	private Object pullCrunchbaseApi(String url, Class<?> clazz){
		ObjectMapper mapper = new ObjectMapper();
		try {
			Object obj = mapper.readValue(new URL(url).openStream(), clazz);
			return obj;
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Clear the cache. Useful if the user needs to retrieves a fresher data. 
	 */
	public void clearCache(){
		this.companyEntityMap.clear();
		this.personEntityMap.clear();
		this.financialOrgEntityMap.clear();
		this.productEntityMap.clear();
		this.svcProviderEntityMap.clear();
		this.entityListMap.clear();
		this.searchMap.clear();
	}
	
	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}


	
	
	
	
	
	
	
	
	

}
