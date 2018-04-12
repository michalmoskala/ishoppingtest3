package com.example.myapp.AvailableProducts.Repository.Entity;

import java.util.Date;

public class ProductTemplateEntity {
    private final long id;
    private final long groupId;
    private final long categoryId;
    private final String name;
    private final String unit;
    private final double quantity;
    private final Boolean isDeleted;
    private final Date lastModified;

    public ProductTemplateEntity(long id, long groupId, long categoryId, String name, String unit, double quantity, Boolean isDeleted, Date lastModified) {
        this.id = id;
        this.groupId = groupId;
        this.categoryId = categoryId;
        this.name = name;
        this.unit = unit;
        this.quantity = quantity;
        this.isDeleted = isDeleted;
        this.lastModified = lastModified;
    }

    public long getId() {
        return id;
    }

    public long getGroupId() {
        return groupId;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public double getQuantity() {
        return quantity;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public Date getLastModified() {
        return lastModified;
    }
}
