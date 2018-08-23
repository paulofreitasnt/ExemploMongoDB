package com.ifpb.mongodb.dao;

import com.ifpb.mongodb.database.MongoConnectionPojo;
import com.ifpb.mongodb.model.Venda;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import java.util.ArrayList;
import java.util.List;

public class VendaDao {

    private MongoCollection collection;

    public VendaDao(){
        collection = new MongoConnectionPojo()
                .getCollection("Venda", Venda.class);
    }

    public void salvar(Venda venda){
        collection.insertOne(venda);
    }

    public List<Venda> listar(){
        MongoCursor cursor = collection.find().iterator();

        List<Venda> vendas = new ArrayList<>();

        while (cursor.hasNext()){
            vendas.add((Venda) cursor.next());
        }

        return vendas;
    }


}
