package com.ifpb.mongodb.database;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoConnection {

    private MongoClient client;
    private MongoDatabase database;

    public MongoConnection(){
        client = MongoClients.create("mongodb://localhost:27017");
        database = client.getDatabase("aula");
    }

    public MongoCollection getCollection(String nome){
        return database.getCollection(nome);
    }

}
