package com.epam.es.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;

public class ProductRecord {
    @XmlElement
    public String sku;
    @XmlElement
    public String productId;
    @XmlElement
    public String name;
    @XmlElement
    public String type;
    @XmlElement
    public Date startDate;
    @XmlElement
    public Date activeUpdateDate;
    @XmlElement
    public Double regularPrice;
    @XmlElement
    public Double salePrice;
    @XmlElement
    public Boolean onSale;
    @XmlElement
    public Date priceUpdateDate;
    @XmlElement
    public Boolean digital;
    @XmlElement
    public String productTemplate;
    @XmlElementWrapper(name = "categoryPath")
    @XmlElement(name = "category")
    public List<ProductCategory> categories;
    @XmlElement
    public Long customerReviewCount;
    @XmlElement
    public Double customerReviewAverage;
    @XmlElement
    public Boolean customerTopRated;
    @XmlElement
    public Boolean freeShipping;
    @XmlElement
    public Boolean freeShippingEligible;
    @XmlElement
    public Boolean inStoreAvailability;
    @XmlElement
    public String inStoreAvailabilityText;
    @XmlElement
    public Date inStoreAvailabilityUpdateDate;
    @XmlElement
    public Date itemUpdateDate;
    @XmlElement
    public Double shippingCost;
    @XmlElement
    public Boolean specialOrder;
    @XmlElement
    public String shortDescription;
    @XmlElement(name = "class")
    public String productClass;
    @XmlElement(name = "subclass")
    public String productSubclass;
    @XmlElement
    public String department;
    @XmlElement
    public String manufacturer;
    @XmlElement
    public Double weight;
    @XmlElement
    public Double shippingWeight;
    @XmlElement
    public String longDescription;
    @XmlElementWrapper(name = "includedItemList")
    @XmlElement(name = "includedItem")
    public List<String> includedItemList;
    @XmlElementWrapper(name = "features")
    @XmlElement(name = "feature")
    public List<String> features;
    @XmlElement
    public Long quantityLimit;
    @XmlElementWrapper(name = "bundledIn")
    @XmlElement(name = "sku")
    public List<String> bundledIn;

    public Map<String, Object> toMap() {
        Map<String, Object> document = new LinkedHashMap<>();
        document.put("sku", sku);
        document.put("productId", productId);
        document.put("name", name);
        document.put("type", type);
        document.put("startDate", startDate);
        document.put("activeUpdateDate", activeUpdateDate);
        document.put("regularPrice", regularPrice);
        document.put("salePrice", salePrice);
        document.put("onSale", onSale);
        document.put("priceUpdateDate", priceUpdateDate);
        document.put("digital", digital);
        document.put("productTemplate", productTemplate);
        document.put("categories", categories.stream().map(elem -> elem.name).collect(toList()));
        document.put("customerReviewCount", customerReviewCount);
        document.put("customerReviewAverage", customerReviewAverage);
        document.put("customerTopRated", customerTopRated);
        document.put("freeShipping", freeShipping);
        document.put("freeShippingEligible", freeShippingEligible);
        document.put("inStoreAvailability", inStoreAvailability);
        document.put("inStoreAvailabilityText", inStoreAvailabilityText);
        document.put("inStoreAvailabilityUpdateDate", inStoreAvailabilityUpdateDate);
        document.put("itemUpdateDate", itemUpdateDate);
        document.put("shippingCost", shippingCost);
        document.put("specialOrder", specialOrder);
        document.put("shortDescription", shortDescription);
        document.put("productClass", productClass);
        document.put("productSubclass", productSubclass);
        document.put("department", department);
        document.put("manufacturer", manufacturer);
        document.put("weight", weight);
        document.put("shippingWeight", shippingWeight);
        document.put("longDescription", longDescription);
        document.put("includedItemList", includedItemList);
        document.put("features", features);
        document.put("quantityLimit", quantityLimit);
        document.put("bundledIn", bundledIn);
        return document;
    }

    public String getSku() {
        return sku;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getActiveUpdateDate() {
        return activeUpdateDate;
    }

    public Double getRegularPrice() {
        return regularPrice;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public Boolean getOnSale() {
        return onSale;
    }

    public Date getPriceUpdateDate() {
        return priceUpdateDate;
    }

    public Boolean getDigital() {
        return digital;
    }

    public String getProductTemplate() {
        return productTemplate;
    }

    public List<ProductCategory> getCategories() {
        return categories;
    }

    public Long getCustomerReviewCount() {
        return customerReviewCount;
    }

    public Double getCustomerReviewAverage() {
        return customerReviewAverage;
    }

    public Boolean getCustomerTopRated() {
        return customerTopRated;
    }

    public Boolean getFreeShipping() {
        return freeShipping;
    }

    public Boolean getFreeShippingEligible() {
        return freeShippingEligible;
    }

    public Boolean getInStoreAvailability() {
        return inStoreAvailability;
    }

    public String getInStoreAvailabilityText() {
        return inStoreAvailabilityText;
    }

    public Date getInStoreAvailabilityUpdateDate() {
        return inStoreAvailabilityUpdateDate;
    }

    public Date getItemUpdateDate() {
        return itemUpdateDate;
    }

    public Double getShippingCost() {
        return shippingCost;
    }

    public Boolean getSpecialOrder() {
        return specialOrder;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getProductClass() {
        return productClass;
    }

    public String getProductSubclass() {
        return productSubclass;
    }

    public String getDepartment() {
        return department;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getShippingWeight() {
        return shippingWeight;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public List<String> getIncludedItemList() {
        return includedItemList;
    }

    public List<String> getFeatures() {
        return features;
    }

    public Long getQuantityLimit() {
        return quantityLimit;
    }

    public List<String> getBundledIn() {
        return bundledIn;
    }

    private static class ProductCategory {
        @XmlElement
        String name;
    }
}

