package com.mkyong.core;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	
    	
    	// Since 2.10.0, uses MongoClient
    	try {
			MongoClient mongo = new MongoClient( "localhost" , 27017 );
			
			
			// If MongoDB in secure mode, authentication is required.
			
			/*
			 * 
			 * 	MongoClient mongoClient = new MongoClient();
				DB db = mongoClient.getDB("database name");
				boolean auth = db.authenticate("username", "password".toCharArray());
			 * 
			 * */
			
			
			// Get database. If the database doesn’t exist, MongoDB will create it for you.
			
			DB dbNews = mongo.getDB("news");
			
			// Display all databases.
			
			
			List<String> dbs = mongo.getDatabaseNames();
			for(String db : dbs){
				System.out.println(db);
			}
			
			
			// Get collection / table.
			
			DB db = mongo.getDB("testdb");
			DBCollection table = db.getCollection("user");
			
			
			
			DB dbTestDb = mongo.getDB("testdb");
			Set<String> tables = dbTestDb.getCollectionNames();
					
			for(String coll : tables){
				System.out.println(coll);
			}
			
			
			
			
			
			
			
		} catch (UnknownHostException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }
}
