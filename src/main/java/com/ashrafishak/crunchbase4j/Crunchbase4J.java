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
		COMPANIES, PEOPLE, FINANCIAL_ORGANIZATIONS, PRODUCTS
	}
	
	private String apiKey = null;
	
	private Properties properties = null;
	
	// mapping: permalink --> entity
	private HashMap<String, CompanyEntity> companyEntityMap = null;
	private HashMap<String, PersonEntity> personEntityMap = null;
	private HashMap<String, FinancialOrganizationEntity> financialOrgEntityMap = null;
	private HashMap<String, ProductEntity> productEntityMap = null;
	private HashMap<String, ServiceProviderEntity> svcProviderEntityMap = null;
	
	// mapping: name --> entitylist
	private HashMap<String, Entity[]> entityListMap = null;
	
	// mapping: name --> search
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
	
	// TODO: please use the code from this method for other
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
	
	public Entity[] getEntityList(EntityListType type){
		String urlFormat = this.properties.getProperty("entitylist.url");
		String url = String.format(urlFormat, type.getPermalink(), this.apiKey);
		return (Entity[]) this.pullCrunchbaseApi(url, Entity[].class);
	}
	
	public Search getSearch(String keyword){
		return null;
	}
	
	// if strings.size = 2, it is person
	public Posts getPosts(PostsType postsType, String... strings){
		return null;
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
	
	public void clearCache(){
		
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

	public static void main(String[] args){
		Crunchbase4J c = new Crunchbase4J("232324244");
		String format = c.getProperties().getProperty("entity.company.url");
		String result = String.format(format, "facebook",c.getApiKey());
		System.out.println(result);
		System.out.println(EntityListType.COMPANIES.getPermalink());
	}
	
	
	
	
	
	
	
	
	

}
