Crunchbase4J
============
[[Download (JAR)](http://ashrafishak.com/crunchbase4j/dist/Crunchbase4J-1.0-SNAPSHOT.jar)]  [[Javadocs](http://ashrafishak.com/crunchbase4j/docs/)]

This is a simple Java library for Crunchbase API. 

##Usage
Download the binary distribution of this library from [here](http://ashrafishak.com/crunchbase4j/dist/Crunchbase4J-1.0-SNAPSHOT.jar), and the library's dependencies which are:
1. Hamcrest Core 1.3
2. Commons Lang 2.4
3. Jackson Databind 2.0.0
4. Jackson Annotations 2.0.0
5. Jackson Core 2.0.0
6. Commons IO 2.4

Put them into CLASSPATH, and you are good to go!

NOTE: I am planning to have the library in the Maven central repository down the road, so we'll see how it goes. 


##Library Guide
All of methods for processing are located in Crunchbase4J class. Those are:

1. ```public ____Entity getEntity____(String permalink)```

(For example: ```public CompanyEntity getEntityCompany(String companyPermalink)```)
This method retrieves Entity from Crunchbase API which can be either Company, Person, Financial Organization, Product and Service Provider. 

2. ```public Entity[] getEntityList(EntityListType type)```
This method retrieves the list of all Entity names and its permalink. EntityListType is an enum type of either COMPANIES, PEOPLE, FINANCIAL_ORGANIZATIONS, PRODUCTS, SERVICE_PROVIDERS.

3. ```public Search getSearch(String keyword)```
This method returns search from Crunchbase based on entered keyword. 
p/s: There are actually several other parameters available from the API but those will not be included for now. 

4. ```public Posts getPosts(PostsType postsType, String... strings)```
This method requests link of Post that is associated with Entity defined in the parameter string array. 

Refer to the [Javadocs](http://ashrafishak.com/crunchbase4j/docs/) for more info. 









