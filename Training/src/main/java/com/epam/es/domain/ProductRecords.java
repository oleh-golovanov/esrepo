package com.epam.es.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;

/**
 * @author Oleh_Golovanov
 */
@XmlRootElement(name = "products")
public class ProductRecords {

    private Collection<ProductRecord> productList;

    @XmlElement(name = "product")
    public Collection<ProductRecord> getProductList() {
        return productList;
    }

    public void setProductList(final Collection<ProductRecord> productList) {
        this.productList = productList;
    }
}
