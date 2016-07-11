package com.epam.es;

import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;

/**
 * @author Oleh_Golovanov
 */
public class ProductIndexer {
    private Client client;
    public static final String INDEX_NAME = "products";
    public static final String TYPE_NAME = "defaultproduct";

    public ProductIndexer(final Client client) {
        this.client = client;
    }

    public void index(String source, final String id){
        final IndexResponse indexResponse = client.prepareIndex(INDEX_NAME, TYPE_NAME, id).setSource(source).get();
        final boolean created = indexResponse.isCreated();
        System.out.println("Document with id " + id + " has been " + (created ? "created" : "updated"));
    }
}
