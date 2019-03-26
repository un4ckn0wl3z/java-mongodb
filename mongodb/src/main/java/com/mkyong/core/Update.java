package com.mkyong.core;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class Update {

	public static void main(String[] args) throws UnknownHostException {
		
		
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		
		
		DB dbNews = mongo.getDB("news");

		DBCollection table = dbNews.getCollection("user");

		BasicDBObject query = new BasicDBObject();
		query.put("name", "mkyong");

		BasicDBObject newDocument = new BasicDBObject();
		newDocument.put("name", "mkyong-updated");

		BasicDBObject updateObj = new BasicDBObject();
		updateObj.put("$set", newDocument);

		table.update(query, updateObj);

	}

}
