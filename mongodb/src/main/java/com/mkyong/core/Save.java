package com.mkyong.core;

import java.net.UnknownHostException;
import java.util.Date;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class Save {
	
	public static void main(String[] args) throws UnknownHostException {
		
		
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		
		DB dbNews = mongo.getDB("news");
		
		DBCollection table = dbNews.getCollection("user");
		BasicDBObject document = new BasicDBObject();
		document.put("name", "Anwuat");
		document.put("age", 24);
		document.put("createdDate", new Date());
		table.insert(document);
		
		
	}

}
