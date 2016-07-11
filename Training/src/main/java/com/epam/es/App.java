package com.epam.es;


import com.epam.es.domain.ProductRecord;
import com.epam.es.domain.ProductRecords;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 */
public class App {
    public static void main(String[] args) {
        ProductRecords products = unmarshall();

        IndexerService service = new IndexerService("localhost", 9300, new IdGenerator());
        service.indexProducts(products);
//        Gson gson = new Gson();
//        products.getProductList().stream().forEach(pr -> System.out.println(gson.toJson(pr) + "\n\n\n\n"));

    }

    private static ProductRecords unmarshall() {
        Path path = Paths.get("products_0171_1313731193_to_9999256400050028.xml");
        try {
            JAXBContext context = JAXBContext.newInstance(ProductRecords.class, ProductRecord.class);
            final Unmarshaller unmarshaller = context.createUnmarshaller();

            return (ProductRecords) unmarshaller.unmarshal(path.toFile());
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

}
