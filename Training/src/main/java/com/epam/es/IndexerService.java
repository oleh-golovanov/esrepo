package com.epam.es;

import com.epam.es.domain.ProductRecord;
import com.epam.es.domain.ProductRecords;
import com.google.gson.Gson;

import java.io.IOException;

/**
 * @author Oleh_Golovanov
 */
public class IndexerService {
    private final String host;
    private final int port;
    private final IdGenerator idGenerator;


    public IndexerService(final String host, final int port, final IdGenerator idGenerator) {
        this.host = host;
        this.port = port;
        this.idGenerator = idGenerator;
    }

    public void indexProducts(ProductRecords products) {
        Gson gson = new Gson();
        try (EsClient esClient = new EsClient(host, port)) {
            ProductIndexer indexer = new ProductIndexer(esClient.getClient());
            for (ProductRecord record : products.getProductList()) {
                indexer.index(gson.toJson(record), String.valueOf(idGenerator.genId()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
