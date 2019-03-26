package com.mkyong.core;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class Delete {
	
	
	
	
public static void main(String[] args) throws UnknownHostException {
		
		
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		
		
		DB dbNews = mongo.getDB("news");

		DBCollection table = dbNews.getCollection("user");
		
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("name", "mkyong-updated");

		table.remove(searchQuery);


	}

}
